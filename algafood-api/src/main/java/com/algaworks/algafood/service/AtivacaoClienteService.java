package com.algaworks.algafood.service;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {
	
	private NotificadorEmail notificador;

	
	public AtivacaoClienteService(NotificadorEmail notificador) {
		this.notificador = notificador;
		System.out.println("2 AtivacaoClienteService: " + notificador);
	}



	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente,  "Seu cadastro no sistema está ativo!");		
	}
}
