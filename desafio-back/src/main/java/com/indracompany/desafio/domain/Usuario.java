package com.indracompany.desafio.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = -1973149368656526826L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank(message = "{usuario.nome.notempty}")
	private String nome;
	
	@NotBlank(message = "{usuario.sobrenome.notempty}")
	private String sobrenome;
	
	@NotBlank(message = "{usuario.email.notempty}")
	@Email
	private String email;
	
	public Usuario () {
		super();
	}
	
	public Usuario(@NotBlank(message = "{usuario.nome.notempty}") String nome,
			@NotBlank(message = "{usuario.sobrenome.notempty}") String sobrenome,
			@NotBlank(message = "{usuario.email.notempty}") String email) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
