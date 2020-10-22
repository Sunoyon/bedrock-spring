package com.dsi.bedrock.exception.exceptions;

public class EntityNotFoundException extends RuntimeException {

	private String reason;

	public EntityNotFoundException(String reason) {
		super(reason);
		this.reason = reason;
	}

	public String getReason() {
		return reason;
	}
}
