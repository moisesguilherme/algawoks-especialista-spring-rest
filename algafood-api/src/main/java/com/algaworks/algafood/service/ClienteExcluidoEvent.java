package com.algaworks.algafood.service;

import com.algaworks.algafood.di.modelo.Cliente;

public class ClienteExcluidoEvent {

	private Cliente cliente;

	public ClienteExcluidoEvent(Cliente cliente) {	
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
}
