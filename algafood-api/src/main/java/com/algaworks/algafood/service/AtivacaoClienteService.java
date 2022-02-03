package com.algaworks.algafood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Component 
public class AtivacaoClienteService {
	
	
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		// dizer pra o container que o cliente está ativo neste momento
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
	}
	
	public void excluir(Cliente cliente) {
		eventPublisher.publishEvent(new ClienteExcluidoEvent(cliente));
	}
	
}
