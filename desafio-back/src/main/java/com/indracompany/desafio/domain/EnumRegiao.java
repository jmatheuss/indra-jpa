package com.indracompany.desafio.domain;

public enum EnumRegiao {
	CENTRO_OESTE("CO", "CENTRO-OESTE"),
	NORDESTE("NE", "NORDESTE"),
	NORTE("N", "NORTE"),
	SUL("S", "SUL"),
	SUDESTE("SE", "SUDESTE");
	
	String sigla;
	String nome;
	
	private EnumRegiao(String sigla, String nome) {
		this.nome = nome;
		this.sigla = sigla;
	}
	
	public static EnumRegiao getRegiaoFromSigla (String sigla) throws EnumConstantNotPresentException {
		for(EnumRegiao regiao : EnumRegiao.values())
			if(regiao.sigla.equals(sigla))
				return regiao;
		
		throw new EnumConstantNotPresentException(EnumRegiao.class, sigla);
	}

	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}
}