package com.example.restservice.bin.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.restservice.bin.controller",
		"com.example.restservice.bin.services","com.example.restservice.bin.rest"})
		@EntityScan("com.example.restservice.bin.models")
@EnableJpaRepositories("com.example.restservice.bin.repo")
public class RestServiceApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
