package com.boot.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.boot.rest.repo")
@EnableJpaAuditing
public class AppChallenge {

	public static void main(String[] args) {
		SpringApplication.run(AppChallenge.class, args);
	}

}
