package com.profile.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerClass implements CommandLineRunner {
	
	@Autowired
	Environment environment;
	

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(environment.getProperty("datasource.username"));
		System.out.println(environment.getProperty("datasource.password"));
	}

}
