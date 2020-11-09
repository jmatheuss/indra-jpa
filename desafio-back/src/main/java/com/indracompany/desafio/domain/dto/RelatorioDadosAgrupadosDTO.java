package com.indracompany.desafio.domain.dto;

import java.util.List;

import com.indracompany.desafio.domain.HistoricoPreco;

public class RelatorioDadosAgrupadosDTO {
	
	private String descricao;
	
	private List<HistoricoPreco> historicos;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<HistoricoPreco> getHistoricos() {
		return historicos;
	}

	public void setHistoricos(List<HistoricoPreco> historicos) {
		this.historicos = historicos;
	}

	
}