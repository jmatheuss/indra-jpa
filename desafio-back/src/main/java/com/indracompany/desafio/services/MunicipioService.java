package com.indracompany.desafio.services;

import com.indracompany.desafio.domain.Municipio;
import com.indracompany.desafio.domain.dto.HistoricoPrecoDTO;

public interface MunicipioService {
	public abstract Municipio createMunicipioFromHistoricoDTO(HistoricoPrecoDTO historico);
}
