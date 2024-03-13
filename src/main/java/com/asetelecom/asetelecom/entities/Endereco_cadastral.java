package com.asetelecom.asetelecom.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Endereco_cadastral {

	private String cidade;
	private String uf;
	private String cep;
	private String endereco;
	private String numero;
	
	public Endereco_cadastral() {}
	
	public Endereco_cadastral(String cidade, String uf, String cep, String endereco, String numero) {
		super();
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.endereco = endereco;
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Endereco_cadastral [cidade=" + cidade + ", uf=" + uf + ", cep=" + cep + ", endereco=" + endereco
				+ ", numero=" + numero + "]";
	}
	
}
