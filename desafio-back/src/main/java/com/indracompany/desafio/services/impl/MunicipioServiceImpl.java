package com.indracompany.desafio.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indracompany.desafio.domain.EnumRegiao;
import com.indracompany.desafio.domain.Estado;
import com.indracompany.desafio.domain.Municipio;
import com.indracompany.desafio.domain.dto.HistoricoPrecoDTO;
import com.indracompany.desafio.repositories.MunicipioRepository;
import com.indracompany.desafio.services.AbstractService;
import com.indracompany.desafio.services.MunicipioService;

@Service
public class MunicipioServiceImpl extends AbstractService implements MunicipioService {
	
	@Autowired
	private MunicipioRepository municipioRepository;

	@Override
	public Municipio createMunicipioFromHistoricoDTO(HistoricoPrecoDTO historico) {
		Municipio municipio = municipioRepository.findByNome(historico.getMunicipio());
		if(municipio != null) 
			return municipio;
		
		municipio = this.buildMunicipioFromHistoricoDTO(historico);
		this.municipioRepository.save(municipio);
		return municipio;
	}
	
	private Municipio buildMunicipioFromHistoricoDTO (HistoricoPrecoDTO historico) {
		Estado estado = new Estado();
		estado.setSigla(historico.getSiglaEstado());
		estado.setRegiao(EnumRegiao.getRegiaoFromSigla(historico.getRegiao()));
		
		Municipio municipio = new Municipio();
		municipio.setNome(historico.getMunicipio());
		municipio.setEstado(estado);
		return municipio;
	}
	
	public void setMunicipioRepository(MunicipioRepository municipioRepository) {
		this.municipioRepository = municipioRepository;
	}
}