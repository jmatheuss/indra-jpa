package com.indracompany.desafio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indracompany.desafio.domain.Usuario;
import com.indracompany.desafio.services.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;

	@ApiOperation(value = "Lista todos os usuários.")
	@GetMapping(value = { "/list/all", "/list" })
	public List<Usuario> listAll () {
		return (List<Usuario>) usuarioService.findAllUsuarios();
	}

	@ApiOperation(value = "Cria um usuário.")
	@PutMapping("/create")
	public Usuario create(@RequestBody(required = false) Usuario usuario) {
		usuarioService.createUsuario(usuario);
		return usuario;
	}
	
	@ApiOperation(value = "Atualiza um usuário.")
	@PutMapping("/update/{id}")
	public Usuario update(@PathVariable Long id, @RequestBody(required = true) Usuario usuario) {
		usuarioService.updateUsuario(id, usuario);
		return usuario;
	}
	
	@ApiOperation(value = "Exclui um usuário.")
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		usuarioService.deleteUsuario(id);
	}
}
