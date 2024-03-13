package com.asetelecom.asetelecom.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Servico {

	
	private Endereco_cadastral endereco_cadastral;
	private List<Pacote> pacotes = new ArrayList<>();
	
	public Servico(){
	}

	public Servico(Endereco_cadastral endereco_fiscal, List<Pacote> pacotes) {
		this.endereco_cadastral = endereco_fiscal;
		this.pacotes = pacotes;
	}

	public Endereco_cadastral getEndereco_fiscal() {
		return endereco_cadastral;
	}

	public void setEndereco_fiscal(Endereco_cadastral endereco_fiscal) {
		this.endereco_cadastral = endereco_fiscal;
	}

	public List<Pacote> getPacotes() {
		return pacotes;
	}

	public void setPacotes(List<Pacote> pacotes) {
		this.pacotes = pacotes;
	}

	@Override
	public String toString() {
		return "Servico [endereco_cadastral=" + endereco_cadastral + ", pacotes=" + pacotes + "]";
	}
	
}
