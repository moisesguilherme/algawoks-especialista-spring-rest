package com.algaworks.algafood.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_cozinhas")
public class Cozinha {
	
	@Id
	private Long id;
	
	@Column(name = "nom_cozinha")
	private String nome;
	
}
