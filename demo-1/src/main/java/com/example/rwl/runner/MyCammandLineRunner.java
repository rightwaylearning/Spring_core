package com.example.rwl.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCammandLineRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("I am CommandLineRunner");
	}

}
