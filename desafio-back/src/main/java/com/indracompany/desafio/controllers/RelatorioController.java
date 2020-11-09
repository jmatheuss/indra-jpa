package com.indracompany.desafio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.indracompany.desafio.domain.dto.RelatorioMediaValorDTO;
import com.indracompany.desafio.services.RelatorioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@RestController
@RequestMapping("/relatorio")
public class RelatorioController {
	
	@Autowired
	RelatorioService relatorioService;
	
	@ApiOperation(value = "Média de preço de Combustível por nome do município.")
	@GetMapping("/media/municipio")
	public List<RelatorioMediaValorDTO> mediaPrecoVendaByMunicipio (@RequestParam(required = true) String nomeMunicipio) {
		return relatorioService.mediaPrecoMunicipio(nomeMunicipio);
	}

	@ApiOperation(value = "Valor médio de compra por município.")
	@GetMapping("/media/venda/municipio")
	public List<RelatorioMediaValorDTO> mediaPrecoVendaByMunicipio () {
		return relatorioService.mediaValorVendaMunicipio();
	}
	
	@ApiOperation(value = "Valor médio de compra por município.")
	@GetMapping("/media/compra/municipio")
	public List<RelatorioMediaValorDTO> mediaPrecoCompraByMunicipio () {
		return relatorioService.mediaValorCompraMunicipio();
	}
	
	@ApiOperation(value = "Valor médio de compra por bandeira.")
	@GetMapping("/media/venda/bandeira")
	public List<RelatorioMediaValorDTO> mediaPrecoVendaByBandeira () {
		return relatorioService.mediaValorVendaBandeira();
	}
	
	@ApiOperation(value = "Valor médio de compra por bandeira.")
	@GetMapping("/media/compra/bandeira")
	public List<RelatorioMediaValorDTO> mediaPrecoCompraByBandeira () {
		return relatorioService.mediaValorCompraBandeira();
	}
	

}
