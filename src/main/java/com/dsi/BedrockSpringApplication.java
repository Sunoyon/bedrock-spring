package com.dsi;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Bedrock Spring", version = "v1", description = "Spring REST Bedrock Service"))
public class BedrockSpringApplication {

	private static Logger log = org.slf4j.LoggerFactory.getLogger(BedrockSpringApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BedrockSpringApplication.class, args);
		log.info("Application is started!!!");
	}

}
