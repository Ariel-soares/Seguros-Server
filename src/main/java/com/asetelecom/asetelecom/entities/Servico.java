package com.asetelecom.asetelecom.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Servico {

	private String nome;
	private Endereco_cadastral endereco_cadastral;
	private List<Pacote> pacotes = new ArrayList<>();
	
	public Servico(){
	}

	public Servico(String nome, Endereco_cadastral endereco_fiscal, List<Pacote> pacotes) {
		this.nome = nome;
		this.endereco_cadastral = endereco_fiscal;
		this.pacotes = pacotes;
	}

	public Endereco_cadastral getEndereco_cadastral() {
		return endereco_cadastral;
	}

	public void setEndereco_fiscal(Endereco_cadastral endereco_cadastral) {
		this.endereco_cadastral = endereco_cadastral;
	}

	public List<Pacote> getPacotes() {
		return pacotes;
	}

	public void setPacotes(List<Pacote> pacotes) {
		this.pacotes = pacotes;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Servico [nome=" + nome + ", endereco_cadastral=" + endereco_cadastral + ", pacotes=" + pacotes + "]";
	}

}
