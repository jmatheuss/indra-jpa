package com.indracompany.desafio.services;

import java.util.List;

import com.indracompany.desafio.domain.dto.RelatorioDadosAgrupadosDTO;
import com.indracompany.desafio.domain.dto.RelatorioMediaValorDTO;

public interface RelatorioService {
	public abstract List<RelatorioMediaValorDTO> mediaPrecoMunicipio(String nomeMunicipio);
	public abstract List<RelatorioDadosAgrupadosDTO> relatorioPorSiglaDaRegiao ();
	public abstract List<RelatorioDadosAgrupadosDTO> relatorioPorDistribuidora ();
	public abstract List<RelatorioDadosAgrupadosDTO> relatorioPorDataDaColeta ();
	public abstract List<RelatorioMediaValorDTO> mediaValorCompraMunicipio();
	public abstract List<RelatorioMediaValorDTO> mediaValorVendaMunicipio();
	public abstract List<RelatorioMediaValorDTO> mediaValorCompraBandeira();
	public abstract List<RelatorioMediaValorDTO> mediaValorVendaBandeira();
}
