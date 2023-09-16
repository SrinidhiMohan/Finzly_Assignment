package com.finzly.fxtradingmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class FxtradingmicroserviceApplication {

	// @Author:Srinidhi Mohan (Assessment 2) Springboot application to externalize
	// the Currencies supported and the exchange rate.
	public static void main(String[] args) {
		SpringApplication.run(FxtradingmicroserviceApplication.class, args);

	}

}
