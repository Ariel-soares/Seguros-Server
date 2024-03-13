package com.asetelecom.asetelecom.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Resposta {
	
	private String status;
	private String msg;
	
	private List<Cliente> clientes= new ArrayList<Cliente>();

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Resposta(String status, String msg, List<Cliente> clientes) {
		this.status = status;
		this.msg = msg;
		this.clientes = clientes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Resposta() {
	}

	@Override
	public String toString() {
		return "Resposta [status=" + status + ", msg=" + msg + ", clientes=" + clientes + "]";
	}

}
