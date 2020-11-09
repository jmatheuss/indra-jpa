package com.indracompany.desafio.services;

import java.util.Collection;

import javax.persistence.EntityNotFoundException;
import javax.validation.ValidationException;

import com.indracompany.desafio.domain.Usuario;

public interface UsuarioService {
	public abstract void createUsuario(Usuario usuario) throws ValidationException;
	public abstract void updateUsuario(Long id, Usuario usuario) throws ValidationException, EntityNotFoundException;
	public abstract void deleteUsuario(Long id) throws EntityNotFoundException;
	public abstract Collection<Usuario> findAllUsuarios();
}
