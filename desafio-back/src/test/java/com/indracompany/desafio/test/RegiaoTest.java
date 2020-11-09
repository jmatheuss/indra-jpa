package com.indracompany.desafio.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.indracompany.desafio.domain.EnumRegiao;


@SpringBootTest
public class RegiaoTest {

	@Test
	public void deveRetornarNordeste () {
		assertEquals("NORDESTE", EnumRegiao.getRegiaoFromSigla("NE").getNome());
	}
	
	@Test
	public void deveLancarExcessaoPorNaoEncontrar () {
		assertThrows(EnumConstantNotPresentException.class, () -> EnumRegiao.getRegiaoFromSigla("NEA"));
	}
}
