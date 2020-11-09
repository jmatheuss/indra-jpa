package com.indracompany.desafio.exceptions;

import java.util.HashSet;
import java.util.Set;

import javax.validation.ConstraintViolation;

public class ValidationException extends javax.validation.ValidationException {
	private static final long serialVersionUID = -7513985106610667907L;
	private Set<String> messages;
	
	public ValidationException() {
		this.messages = new HashSet<>();
	}
	
	public ValidationException (Set<ConstraintViolation<Object>> contraintValidationErrors) {
		this();
		addMessages(contraintValidationErrors);
	}
	
	public Set<String> getMessages() {
		return messages;
	}
	
	public void addMessages(Set<ConstraintViolation<Object>> contraintValidationErrors) {
		for (ConstraintViolation<Object> constraintViolation : contraintValidationErrors) {
			messages.add(constraintViolation.getMessage());
		}
	}
	
	@Override
	public String getMessage() {
		StringBuilder builder = new StringBuilder();
		for (String message : messages) {
			builder.append(message);
		}
		return builder.toString();
	}
	
	
}
