package com.asetelecom.asetelecom.entities;

import java.util.Date;

public class Assegurado {

	private String cpf;
	private String nome;
	private String endereco;
	private Integer numero;
	private String cidade;
	private String uf;
	private Long cep;
	private Date data_nascimento;
	private String sexo;
	private Long celular;
	private Long premio;
	
	public Assegurado() {}
	
	public Assegurado(Cliente cliente) {
		
		this.nome = cliente.getNome_razaosocial();
		this.cpf = cliente.getCpf_cnpj();
		
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
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

	public Long getCep() {
		return cep;
	}

	public void setCep(Long cep) {
		this.cep = cep;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Long getCelular() {
		return celular;
	}

	public void setCelular(Long celular) {
		this.celular = celular;
	}

	public Long getPremio() {
		return premio;
	}

	public void setPremio(Long premio) {
		this.premio = premio;
	}
	
	
	
}
