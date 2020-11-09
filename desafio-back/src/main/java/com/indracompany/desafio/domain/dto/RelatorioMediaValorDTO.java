package com.indracompany.desafio.domain.dto;

import java.io.Serializable;

public class RelatorioMediaValorDTO implements Serializable {
	private static final long serialVersionUID = 1534380140872072684L;
	
	private String descricao;
	private Double valor;
	
	public RelatorioMediaValorDTO () {
		super();
	}
	
	public RelatorioMediaValorDTO(String descricao, Double valor) {
		this();
		this.descricao = descricao;
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
}