package com.indracompany.desafio.controllers.advicers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.google.gson.Gson;
import com.indracompany.desafio.exceptions.ValidationException;

@ControllerAdvice
public class ValidationExceptionController {
	
	@ExceptionHandler(value = ValidationException.class)
	public ResponseEntity<Object> exception(ValidationException validationException) {
		Map <String, Set<String>> errors = new HashMap<>();
		errors.put("errors", validationException.getMessages());
		return new ResponseEntity<>(new Gson().toJson(errors), HttpStatus.OK);
	}
}
