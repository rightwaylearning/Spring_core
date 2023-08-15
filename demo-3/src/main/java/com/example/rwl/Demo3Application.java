package com.example.rwl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo3Application implements ApplicationRunner {
	
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		Student s = new Student();
		s.setSrudentId(113); s.setName("kumar");
		
		Student save = studentRepository.save(s);
		System.out.println(">>>>>>"+save);
		
	}

}
