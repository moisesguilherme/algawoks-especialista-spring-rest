package com.algaworks.algafood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;

@Component 
public class AtivacaoClienteService {
	
	@Autowired
	private List<Notificador> notificadores;
	
//	@Autowired
//	public AtivacaoClienteService(Notificador notificador) {
//		this.notificador = notificador;
//	}
	
//	public AtivacaoClienteService(String qualquer) {
//		
//	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		for(Notificador notificador : notificadores) {
			notificador.notificar(cliente,  "Seu cadastro no sistema está ativo!");
		}
				
	}

//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}
	
	
}
