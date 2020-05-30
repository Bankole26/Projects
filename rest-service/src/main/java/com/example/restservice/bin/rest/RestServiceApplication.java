package com.example.restservice.bin.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"bin.controller", "bin.models","bin.repo","bin.rest","bin.services" })
public class RestServiceApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
