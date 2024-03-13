package com.asetelecom.asetelecom.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cliente {
	
	private String nome_razaosocial;
	private String cpf_cnpj;
	private Long telefone_primario;
	private String genero;
	private String data_nascimento;

	private List<Servico> servicos = new ArrayList<>();

	public Cliente() {}
	
	

	public Cliente(String nome_razaosocial, String cpf_cnpj, Long telefone_primario, String genero, String data_nascmento,
			List<Servico> servicos) {
		this.nome_razaosocial = nome_razaosocial;
		this.cpf_cnpj = cpf_cnpj;
		this.telefone_primario = telefone_primario;
		this.genero = genero;
		this.data_nascimento = data_nascmento;
		this.servicos = servicos;
	}


	public String getNome_razaosocial() {
		return nome_razaosocial;
	}


	public void setNome_razaosocial(String nome_razaosocial) {
		this.nome_razaosocial = nome_razaosocial;
	}


	public String getCpf_cnpj() {
		return cpf_cnpj;
	}


	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}


	public Long getTelefone_primario() {
		return telefone_primario;
	}


	public void setTelefone_primario(Long telefone_primario) {
		this.telefone_primario = telefone_primario;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getData_nascmento() {
		return data_nascimento;
	}


	public void setData_nascmento(String data_nascmento) {
		this.data_nascimento = data_nascmento;
	}


	public List<Servico> getServicos() {
		return servicos;
	}


	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}



	@Override
	public String toString() {
		return "Cliente [nome_razaosocial=" + nome_razaosocial + ", cpf_cnpj=" + cpf_cnpj + ", telefone_primario="
				+ telefone_primario + ", genero=" + genero + ", data_nascimento=" + data_nascimento + ", servicos="
				+ servicos + "]";
	}
	
	
}
