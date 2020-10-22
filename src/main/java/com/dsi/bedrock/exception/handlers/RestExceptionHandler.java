package com.dsi.bedrock.exception.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.dsi.bedrock.exception.apis.ApiError;
import com.dsi.bedrock.exception.exceptions.EntityNotFoundException;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(EntityNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ApiError handle(EntityNotFoundException ex) {
		return new ApiError(HttpStatus.NOT_FOUND, "Entity not found", ex);
	}
}
