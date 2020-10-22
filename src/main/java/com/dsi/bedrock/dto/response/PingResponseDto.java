package com.dsi.bedrock.dto.response;

public class PingResponseDto {

	private String message;

	public PingResponseDto(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
