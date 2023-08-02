package com.bharatgas.www.BharatBasServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BharatBasServicesApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BharatBasServicesApplication.class, args);

		Hello h = context.getBean(Hello.class);

		h.welcome();

	}

}
