package com.algaworks.di.modelo.notificacao;

import com.algaworks.di.modelo.Cliente;

public class NotificadorEmail implements Notificador  {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %S\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
