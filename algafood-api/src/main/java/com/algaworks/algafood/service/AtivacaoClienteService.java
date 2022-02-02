package com.algaworks.algafood.service;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;

//@Component tira o componete para colocar no AlgaConfig
public class AtivacaoClienteService {
	
	private Notificador notificador;

	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		System.out.println("2 AtivacaoClienteService: " + notificador);
	}



	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente,  "Seu cadastro no sistema está ativo!");		
	}
}
