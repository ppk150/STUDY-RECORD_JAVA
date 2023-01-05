package com.codestates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Section4Week4TemplateWebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(Section4Week4TemplateWebfluxApplication.class, args);
	}


	@Bean
	public RestTemplateBuilder restTemplateBuilder() {
		return new RestTemplateBuilder();
	}
}
