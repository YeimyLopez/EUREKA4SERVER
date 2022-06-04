package com.idat.EUREKA4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eureka4Application {

	public static void main(String[] args) {
		SpringApplication.run(Eureka4Application.class, args);
	}

}
