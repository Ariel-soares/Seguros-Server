package com.asetelecom.asetelecom;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.asetelecom.asetelecom.db.DB;
import com.asetelecom.asetelecom.db.DbException;
import com.asetelecom.asetelecom.db.DbServicos;
import com.asetelecom.asetelecom.entities.Cliente;
import com.asetelecom.asetelecom.entities.Resposta;
import com.asetelecom.asetelecom.entities.Segurado;
import com.asetelecom.asetelecom.entities.Servico;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Seguros {

	public static void cadastrarSeguros() throws IOException, InterruptedException {

		Connection conn = DB.getConnection();
		ResultSet rs = DbServicos.consultarServicos(conn);
		ResultSet rsp = DbServicos.consultarPacotes(conn);

		conn = DB.getConnection();

		List<String> servicos = new ArrayList<>();
		List<String> pacotes = new ArrayList<>();
		
		try {
			while (rs.next()) {
				System.out.println(rs.getString("nome_servico"));
				servicos.add(rs.getString("nome_servico"));
			}
			while (rsp.next()) {
				System.out.println(rsp.getString("descricao"));
				pacotes.add(rsp.getString("descricao"));
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

		String token_original = "";

		LocalDate horario = LocalDate.now().minusDays(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String horario_atual = horario.format(formatter);

		HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(
				"https://api.asetelecom.hubsoft.com.br/api/v1/integracao/cliente/todos?pagina=0&itens_por_pagina=500&data_inicio="
						+ horario_atual + "&relacoes=endereco_cadastral,pacotes"))
				.header("Content-Type", "application/json").header("Authorization", "Bearer " + token_original).build();

		HttpClient httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(3)).build();

		HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

		System.out.println(response.body());
		System.out.println(response.statusCode());
		System.out.println(response.headers());

		Resposta resposta;
		
		List<Cliente> clientes = new ArrayList<>();

		if (response.statusCode() == 200) {
			ObjectMapper mapper = new ObjectMapper();
			resposta = mapper.readValue(response.body(), Resposta.class);

			System.out.println(resposta);

			System.out.println(resposta.getClientes());
			for(Cliente x : resposta.getClientes()) {
				clientes.add(x);
			}

		} else {
			System.out.println("Error in sending a GET request");
		}
		
		List<Segurado> segurados = new ArrayList<>();
		
		for(Cliente x : clientes) {
			for(Servico y : x.getServicos()) {
				for(String z : servicos) {
					if(y.getNome().equals(z) && x.getCpf_cnpj().length() == 11) {
						System.out.println("Matching info: " + y.getNome());
						segurados.add(new Segurado(x, y));
					}
					
				}
			}
		}
		for(Segurado x : segurados) {
			System.out.println(x);
		}

		DB.closeResultSet(rs);
		DB.closeConnection();
	}
}
