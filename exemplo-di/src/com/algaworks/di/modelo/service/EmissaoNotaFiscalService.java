package com.algaworks.di.modelo.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.modelo.notificacao.Notificador;

public class EmissaoNotaFiscalService {
	
	private Notificador notificador;
		
	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void emitir(Cliente cliente, Produto produto) {
		// TODO emite a nota fiscal aqui
		
		//NotificadorEmail notificador = new NotificadorEmail();
		//NotificadorSMS notificador = new NotificadorSMS();
		this.notificador.notificar(cliente, "Nota fiscal do produto "
				+ produto.getNome() + " foi emitida!");
	}
	
}
