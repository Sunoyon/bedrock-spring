package com.dsi.bedrock.exception.apis;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ApiError {

	public HttpStatus status;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd hh:mm:ss")
	public LocalDateTime timestamp;
	public String message;
	public String debugMessage;


	public ApiError(HttpStatus status) {
		this.timestamp = LocalDateTime.now();
		this.status = status;
	}

	public ApiError(HttpStatus status, Throwable ex) {
		this.timestamp = LocalDateTime.now();
		this.status = status;
		this.message = "Unexpected error";
		this.debugMessage = ex.getLocalizedMessage();
	}

	public ApiError(HttpStatus status, String message, Throwable ex) {
		this.timestamp = LocalDateTime.now();
		this.status = status;
		this.message = message;
		this.debugMessage = ex.getLocalizedMessage();
	}
}