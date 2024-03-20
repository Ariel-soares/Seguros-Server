package com.asetelecom.asetelecom.entities;

import java.io.Serializable;

public class Segurado implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String cpf;
	private String nome;
	private String data_nascimento;
	private Integer sexo;
	private Long celular;
	private Long premio;
	private Endereco_cadastral endereco;
	
	public Segurado() {}
	
	public Segurado(Cliente cliente, Servico service) {
		
		this.nome = cliente.getNome_razaosocial();
		this.cpf = cliente.getCpf_cnpj();
		this.data_nascimento = cliente.getData_nascmento();
		if(cliente.getGenero().equals("masculino")) {
			this.sexo = 1;
		}else if(cliente.getGenero().equals("feminino")) {
			this.sexo = 2;
		}else
			this.sexo = 0;
		
		this.celular = cliente.getTelefone_primario();
		this.endereco = service.getEndereco_cadastral();
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


	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
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

	public Endereco_cadastral getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco_cadastral endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Segurado [cpf=" + cpf + ", nome=" + nome + ", data_nascimento=" + data_nascimento + ", sexo=" + sexo
				+ ", celular=" + celular + ", premio=" + premio + ", endereco=" + endereco + "]";
	}
	
	
	
}
