package com.alura.forum.config.validation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.alura.forum.controller.validation.FormError;

@RestControllerAdvice
public class ApplicationErrorHandler {
	
	@Autowired
	private MessageSource messageSource;
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<FormError> handleValidation(MethodArgumentNotValidException exception) {
		List<FormError> errores = new ArrayList<FormError>();
		
		List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
		
		fieldErrors.forEach(error -> {
			String mensaje = messageSource.getMessage(error, LocaleContextHolder.getLocale());
			
			FormError formError = new FormError(error.getField(), mensaje);
			
			errores.add(formError);
		});
		
		return errores;
	}

}
