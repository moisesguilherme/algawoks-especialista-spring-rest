package com.algaworks.algafood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.TipoDoNotificador;
import com.algaworks.algafood.service.ClienteAtivadoEvent;
import com.algaworks.algafood.service.ClienteExcluidoEvent;


@Component
public class NotificacaoService {
	
	@Autowired
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	private Notificador notificador;	
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		//System.out.println("Cliente " + event.getCliente().getNome() + " agora está ativo.");
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
	}
	
	@EventListener
	public void clienteExcluidoListener(ClienteExcluidoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro foi removido do sistema");
	}
}
