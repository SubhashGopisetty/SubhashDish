package com.dish.es.employeeservices2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class EmployeeServices2Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServices2Application.class, args);}

	@Bean
	public RestTemplate getRestTmplate(){
		return new RestTemplate();



	}

}
