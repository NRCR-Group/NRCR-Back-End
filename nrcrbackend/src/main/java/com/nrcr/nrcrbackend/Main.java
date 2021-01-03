package com.nrcr.nrcrbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.nrcr.nrcrbackend.model.raceresults.RaceResultsEntity")
@ComponentScan("com.nrcr.nrcrbackend.service.RaceResultsService")
@ComponentScan("com.nrcr.nrcrbackend.dao.RaceResultsDAO")
@ComponentScan("com.nrcr.nrcrbackend.exception.ApiRequestException")
@ComponentScan("com.nrcr.nrcrbackend.exception.ApiExceptionHandler")
@ComponentScan("com.nrcr.nrcrbackend.exception.ApiException")



@ComponentScan(basePackages={"com.nrcr.nrcrbackend.controller.RaceResultsController"})

public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}

