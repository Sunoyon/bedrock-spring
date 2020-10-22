package com.dsi.bedrock.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsi.bedrock.dto.response.PingResponseDto;
import com.dsi.bedrock.exception.exceptions.EntityNotFoundException;

import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
public class PingController {

	@GetMapping(value = "/ping", produces = "application/json")
	@ApiResponse(responseCode = "200", description = "Service is running")
	public PingResponseDto getPing() {
//		return new PingResponseDto("Pong!");
		throw new EntityNotFoundException("Pong object not found");
	}

}
