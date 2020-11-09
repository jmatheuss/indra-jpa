package com.indracompany.desafio.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String sigla;
	
	private EnumRegiao regiao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public EnumRegiao getRegiao() {
		return regiao;
	}

	public void setRegiao(EnumRegiao regiao) {
		this.regiao = regiao;
	}
	
	
}
