package com.indracompany.desafio.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class HistoricoPreco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private EnumRegiao regiao;

	@ManyToOne
	private Municipio municipio;
	
	@ManyToOne
	private Distribuidora distribuidora;
	
	@ManyToOne
	private Produto produto;
	
	@ManyToOne
	private UnidadeMedida unidadeMedida;
	
	@ManyToOne
	private Bandeira bandeira;
	
	private String dataDaColeta;
	
	private Double valorVenda;
	
	private Double valorCompra;
	
	
	public HistoricoPreco() {
		super();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EnumRegiao getRegiao() {
		return regiao;
	}

	public void setRegiao(EnumRegiao regiao) {
		this.regiao = regiao;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public Distribuidora getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(Distribuidora distribuidora) {
		this.distribuidora = distribuidora;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getDataDaColeta() {
		return dataDaColeta;
	}

	public void setDataDaColeta(String dataDaColeta) {
		this.dataDaColeta = dataDaColeta;
	}

	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public Bandeira getBandeira() {
		return bandeira;
	}

	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}

}