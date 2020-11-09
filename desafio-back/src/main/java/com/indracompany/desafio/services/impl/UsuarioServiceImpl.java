package com.indracompany.desafio.services.impl;

import java.util.Collection;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indracompany.desafio.domain.Usuario;
import com.indracompany.desafio.exceptions.ValidationException;
import com.indracompany.desafio.repositories.UsuarioRepository;
import com.indracompany.desafio.services.AbstractService;
import com.indracompany.desafio.services.UsuarioService;

@Service
public class UsuarioServiceImpl extends AbstractService implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void createUsuario(Usuario usuario) throws ValidationException {
		validate(usuario);
		this.usuarioRepository.save(usuario);
	}
	
	@Override
	public void updateUsuario(Long id, Usuario usuario) throws ValidationException, EntityNotFoundException {
		validate(usuario);
		usuario.setId(id);
		this.usuarioRepository.save(usuario);
	}

	@Override
	public Collection<Usuario> findAllUsuarios() {
		return usuarioRepository.findAll();
	}

	@Override
	public void deleteUsuario(Long id) throws EntityNotFoundException {
		usuarioRepository.deleteById(id);
	}
	
	public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	


}
