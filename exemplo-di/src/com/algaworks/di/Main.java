
package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.notificacao.Notificador;
import com.algaworks.di.modelo.notificacao.NotificadorSMS;
import com.algaworks.di.modelo.service.AtivacaoClienteService;

public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente("João", "joao@xyz.com", "349888888");
		Cliente maria = new Cliente("Maria", "maria@xyz.com", "1177778888872");
		
		//Notificador notificarEmail = new NotificadorEmail();
		Notificador notificarEmail = new NotificadorSMS();
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificarEmail);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
		
	}

}
