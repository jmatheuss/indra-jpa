package com.indracompany.desafio.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indracompany.desafio.domain.dto.RelatorioDadosAgrupadosDTO;
import com.indracompany.desafio.domain.dto.RelatorioMediaValorDTO;
import com.indracompany.desafio.repositories.HistoricoPrecoRepository;
import com.indracompany.desafio.services.RelatorioService;


@Service
public class RelatorioServiceImpl implements RelatorioService {

	@Autowired
	private HistoricoPrecoRepository historicoRepository;
	
	@Override
	public List<RelatorioMediaValorDTO> mediaPrecoMunicipio(String nomeMunicipio) {
		return historicoRepository.findByNomeMunicipio(nomeMunicipio);
	}

	@Override
	public List<RelatorioDadosAgrupadosDTO> relatorioPorSiglaDaRegiao() {
		return null;
	}

	@Override
	public List<RelatorioDadosAgrupadosDTO> relatorioPorDistribuidora() {
		return null;
	}

	@Override
	public List<RelatorioDadosAgrupadosDTO> relatorioPorDataDaColeta() {
		return null;
	}

	@Override
	public List<RelatorioMediaValorDTO> mediaValorCompraMunicipio() {
		return historicoRepository.findMediaValorCompraMunicipio();
	}

	@Override
	public List<RelatorioMediaValorDTO> mediaValorVendaMunicipio() {
		return historicoRepository.findMediaValorVendaMunicipio();
	}

	@Override
	public List<RelatorioMediaValorDTO> mediaValorCompraBandeira() {
		return historicoRepository.findMediaValorCompraBandeira();
	}

	@Override
	public List<RelatorioMediaValorDTO> mediaValorVendaBandeira() {
		return historicoRepository.findMediaValorVendaBandeira();
	}

	public void setHistoricoRepository(HistoricoPrecoRepository historicoRepository) {
		this.historicoRepository = historicoRepository;
	}
	
}
