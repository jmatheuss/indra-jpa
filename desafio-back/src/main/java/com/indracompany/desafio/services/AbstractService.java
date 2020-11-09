package com.indracompany.desafio.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.indracompany.desafio.exceptions.ValidationException;

public class AbstractService {
	private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	
	protected Validator getDefaultValidator () {
		return factory != null ? factory.getValidator() : null;
	}
	
	protected void validate (Object entity) throws ValidationException {
		Set<ConstraintViolation<Object>> errors = getDefaultValidator().validate(entity);
		if(errors != null && !errors.isEmpty()) {
			throw new ValidationException(errors);
		}
	}
}
