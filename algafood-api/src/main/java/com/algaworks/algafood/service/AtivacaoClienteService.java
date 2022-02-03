package com.algaworks.algafood.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.TipoDoNotificador;

//@Component 
public class AtivacaoClienteService implements InitializingBean, DisposableBean {
	
	//@Qualifier("sms") //sugestão de colocar mais genêrico, exemplo "urgente", "normal"
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
//	@Autowired
//	public AtivacaoClienteService(Notificador notificador) {
//		this.notificador = notificador;
//	}
	
//	public AtivacaoClienteService(String qualquer) {
//		
//	}

//	@PostConstruct
	public void init() {
		System.out.println("INIT " + notificador);
	}
	
//	@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}
	
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente,  "Seu cadastro no sistema está ativo!");
				
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}
	
	
}
