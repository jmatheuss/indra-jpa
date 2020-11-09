package com.indracompany.desafio.services;

import java.io.InputStream;
import java.util.Collection;

import javax.persistence.EntityNotFoundException;
import javax.validation.ValidationException;

import com.indracompany.desafio.domain.HistoricoPreco;
import com.indracompany.desafio.domain.dto.HistoricoPrecoDTO;

public interface HistoricoPrecoService {
	public abstract HistoricoPreco fromDtoToHistoricoPreco (HistoricoPrecoDTO historicoPreco);
	public abstract void createHistoricoPreco(HistoricoPreco historico) throws ValidationException;
	public abstract void createHistoricoPrecoFromCsv(InputStream inputStream) throws ValidationException;
	public abstract void updateHistoricoPreco(Long id, HistoricoPreco historico) throws ValidationException, EntityNotFoundException;
	public abstract void deleteHistoricoPreco(Long id) throws EntityNotFoundException;
	public abstract Collection<HistoricoPreco> findAllHistoricos();
	public abstract Collection<HistoricoPreco> findAllBySiglaRegiao(String siglaRegiao);
}
