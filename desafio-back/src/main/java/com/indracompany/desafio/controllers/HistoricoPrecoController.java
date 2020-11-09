package com.indracompany.desafio.controllers;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.indracompany.desafio.domain.HistoricoPreco;
import com.indracompany.desafio.domain.dto.HistoricoPrecoDTO;
import com.indracompany.desafio.helpers.HistoricoPrecoHelper;
import com.indracompany.desafio.services.HistoricoPrecoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Histórico de Preço")
@RestController
@RequestMapping("/historico")
public class HistoricoPrecoController {
	
	@Autowired
	HistoricoPrecoService historicoService;
	
	@ApiOperation(value = "Lista todos os Históricos.")
	@GetMapping(value = { "/list/all", "/list" })
	public List<HistoricoPreco> listAll () {
		return (List<HistoricoPreco>) historicoService.findAllHistoricos();
	}

	@ApiOperation(value = "Cria um Histórico de Preço.")
	@PutMapping("/create")
	public HistoricoPreco create(@RequestBody(required = false) HistoricoPreco historico) {
		historicoService.createHistoricoPreco(historico);
		return historico;
	}
	
	@ApiOperation(value = "Importa um histórico à partir de um arquivo CSV.")
	@PutMapping("/create/csv")
	public void create(@RequestParam("file") MultipartFile file) {
		
	}
	
	
	@ApiOperation(value = "Atualiza um Histórico de Preço.")
	@PutMapping("/update/{id}")
	public HistoricoPreco update(@PathVariable Long id, @RequestBody(required = true) HistoricoPreco historico) {
		historicoService.updateHistoricoPreco(id, historico);
		return historico;
	}
	
	@ApiOperation(value = "Exclui um Histórico de Preço.")
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		historicoService.deleteHistoricoPreco(id);
	}
}
