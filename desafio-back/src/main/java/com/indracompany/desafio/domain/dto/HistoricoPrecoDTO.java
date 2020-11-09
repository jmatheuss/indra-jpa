package com.indracompany.desafio.domain.dto;

import java.io.Serializable;

public class HistoricoPrecoDTO implements Serializable{
	private static final long serialVersionUID = -1146668457992056517L;

	private String regiao;
	
	private String siglaEstado;
	
	private String municipio;
	
	private String revenda;
	
	private String cnpjRevenda;
	
	private String produto;
	
	private String dataDaColeta;
	
	private String valorVenda;
	
	private String valorCompra;
	
	private String unidadeMedida;
	
	private String bandeira;

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getRevenda() {
		return revenda;
	}

	public void setRevenda(String revenda) {
		this.revenda = revenda;
	}

	public String getCnpjRevenda() {
		return cnpjRevenda;
	}

	public void setCnpjRevenda(String cnpjRevenda) {
		this.cnpjRevenda = cnpjRevenda;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getDataDaColeta() {
		return dataDaColeta;
	}

	public void setDataDaColeta(String dataDaColeta) {
		this.dataDaColeta = dataDaColeta;
	}

	public String getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(String valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(String valorCompra) {
		this.valorCompra = valorCompra;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bandeira == null) ? 0 : bandeira.hashCode());
		result = prime * result + ((cnpjRevenda == null) ? 0 : cnpjRevenda.hashCode());
		result = prime * result + ((dataDaColeta == null) ? 0 : dataDaColeta.hashCode());
		result = prime * result + ((municipio == null) ? 0 : municipio.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		result = prime * result + ((regiao == null) ? 0 : regiao.hashCode());
		result = prime * result + ((revenda == null) ? 0 : revenda.hashCode());
		result = prime * result + ((siglaEstado == null) ? 0 : siglaEstado.hashCode());
		result = prime * result + ((unidadeMedida == null) ? 0 : unidadeMedida.hashCode());
		result = prime * result + ((valorCompra == null) ? 0 : valorCompra.hashCode());
		result = prime * result + ((valorVenda == null) ? 0 : valorVenda.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HistoricoPrecoDTO other = (HistoricoPrecoDTO) obj;
		if (bandeira == null) {
			if (other.bandeira != null)
				return false;
		} else if (!bandeira.equals(other.bandeira))
			return false;
		if (cnpjRevenda == null) {
			if (other.cnpjRevenda != null)
				return false;
		} else if (!cnpjRevenda.equals(other.cnpjRevenda))
			return false;
		if (dataDaColeta == null) {
			if (other.dataDaColeta != null)
				return false;
		} else if (!dataDaColeta.equals(other.dataDaColeta))
			return false;
		if (municipio == null) {
			if (other.municipio != null)
				return false;
		} else if (!municipio.equals(other.municipio))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		if (regiao == null) {
			if (other.regiao != null)
				return false;
		} else if (!regiao.equals(other.regiao))
			return false;
		if (revenda == null) {
			if (other.revenda != null)
				return false;
		} else if (!revenda.equals(other.revenda))
			return false;
		if (siglaEstado == null) {
			if (other.siglaEstado != null)
				return false;
		} else if (!siglaEstado.equals(other.siglaEstado))
			return false;
		if (unidadeMedida == null) {
			if (other.unidadeMedida != null)
				return false;
		} else if (!unidadeMedida.equals(other.unidadeMedida))
			return false;
		if (valorCompra == null) {
			if (other.valorCompra != null)
				return false;
		} else if (!valorCompra.equals(other.valorCompra))
			return false;
		if (valorVenda == null) {
			if (other.valorVenda != null)
				return false;
		} else if (!valorVenda.equals(other.valorVenda))
			return false;
		return true;
	}
}