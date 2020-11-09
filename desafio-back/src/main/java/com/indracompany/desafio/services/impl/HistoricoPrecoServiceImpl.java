package com.indracompany.desafio.services.impl;

import java.io.InputStream;
import java.util.Collection;
import java.util.Set;

import javax.persistence.EntityNotFoundException;
import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indracompany.desafio.domain.Bandeira;
import com.indracompany.desafio.domain.HistoricoPreco;
import com.indracompany.desafio.domain.Municipio;
import com.indracompany.desafio.domain.Produto;
import com.indracompany.desafio.domain.UnidadeMedida;
import com.indracompany.desafio.domain.dto.HistoricoPrecoDTO;
import com.indracompany.desafio.helpers.HistoricoPrecoHelper;
import com.indracompany.desafio.repositories.BandeiraRepository;
import com.indracompany.desafio.repositories.HistoricoPrecoRepository;
import com.indracompany.desafio.repositories.ProdutoRepository;
import com.indracompany.desafio.repositories.UnidadeMedidaRepository;
import com.indracompany.desafio.services.AbstractService;
import com.indracompany.desafio.services.HistoricoPrecoService;
import com.indracompany.desafio.services.MunicipioService;

@Service
public class HistoricoPrecoServiceImpl extends AbstractService implements HistoricoPrecoService {
	
	@Autowired
	private HistoricoPrecoRepository historicoRepository;
	
	@Autowired
	private MunicipioService municipioService;
	
	@Autowired
	private UnidadeMedidaRepository unidadeMedidaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private BandeiraRepository bandeiraRepository;
	
	

	@Override
	public void createHistoricoPreco(HistoricoPreco historico) throws ValidationException {
		validate(historico);
		historicoRepository.save(historico);
	}
	
	@Override
	public void createHistoricoPrecoFromCsv(InputStream inputStream) throws ValidationException {
		Set<HistoricoPrecoDTO> historicos = HistoricoPrecoHelper.getFromCSV(inputStream);
		for (HistoricoPrecoDTO historicoPrecoDTO : historicos) {
			HistoricoPreco historico = fromDtoToHistoricoPreco(historicoPrecoDTO);
			this.createHistoricoPreco(historico);
		}
	}

	@Override
	public void updateHistoricoPreco(Long id, HistoricoPreco historico)
			throws ValidationException, EntityNotFoundException {
		validate(historico);
		historicoRepository.save(historico);
	}

	@Override
	public void deleteHistoricoPreco(Long id) throws EntityNotFoundException {
		historicoRepository.deleteById(id);
	}

	@Override
	public Collection<HistoricoPreco> findAllHistoricos() {
		return historicoRepository.findAll();
	}
	
	@Override
	public Collection<HistoricoPreco> findAllBySiglaRegiao(String siglaRegiao) {
		return null;
	}

	public void setHistoricoRepository(HistoricoPrecoRepository historicoRepository) {
		this.historicoRepository = historicoRepository;
	}

	@Override
	public HistoricoPreco fromDtoToHistoricoPreco(HistoricoPrecoDTO historicoPreco) {
		HistoricoPreco historico = new HistoricoPreco();
		Municipio municipio = municipioService.createMunicipioFromHistoricoDTO(historicoPreco);
		historico.setMunicipio(municipio);
		historico.setUnidadeMedida(salvaUnidadeMedida(historicoPreco));
		historico.setProduto(salvaProduto(historicoPreco));
		historico.setBandeira(salvaBandeira(historicoPreco));
		return historico;
	}
	
	private UnidadeMedida salvaUnidadeMedida (HistoricoPrecoDTO historicoPreco) {
		UnidadeMedida unidade = unidadeMedidaRepository.findByNome(historicoPreco.getUnidadeMedida());
		if(unidade == null) {
			unidade = new UnidadeMedida(historicoPreco.getUnidadeMedida());
		}
		return unidade;
	}
	
	private Produto salvaProduto (HistoricoPrecoDTO historicoPreco) {
		Produto produto = produtoRepository.findByNome(historicoPreco.getProduto());
		if(produto == null) {
			produto = new Produto(historicoPreco.getProduto());
		}
		return produto;
	}
	
	private Bandeira salvaBandeira (HistoricoPrecoDTO historicoPreco) {
		Bandeira bandeira = bandeiraRepository.findByNome(historicoPreco.getBandeira());
		if(bandeira == null) {
			bandeira = new Bandeira(historicoPreco.getBandeira());
		}
		return bandeira;
	}

	public void setMunicipioService(MunicipioService municipioService) {
		this.municipioService = municipioService;
	}

	
	

}