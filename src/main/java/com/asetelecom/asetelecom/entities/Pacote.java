package com.asetelecom.asetelecom.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pacote {

	private String descricao;
	
	public Pacote() {}

	public Pacote(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return descricao;
	}

	public void setNome(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Pacote [nome=" + descricao + "]";
	}
		
}
