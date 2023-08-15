package com.profile.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class ProfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfilesApplication.class, args);
	}
	
	@Bean
	@Profile("dev")
	public Object getDataSourceDev() {
	//	DriverManagerDataSource driver = new DriverManagerDataSource();
		//---
		
		return null;
	}
	
	@Bean
	@Profile("qa")
	public Object getDataSourceQa() {
	//	DriverManagerDataSource driver = new DriverManagerDataSource();
		//---
		
		return null;
	}
	

	@Bean
	@Profile("prod")
	public Object getDataSourceProd() {
	//	DriverManagerDataSource driver = new DriverManagerDataSource();
		//---
		
		return null;
	}
	

}
