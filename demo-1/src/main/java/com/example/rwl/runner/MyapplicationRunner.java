package com.example.rwl.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.rwl.model.Student;
import com.example.rwl.service.IStudentService;

@Component
public class MyapplicationRunner implements ApplicationRunner {

	@Autowired
	IStudentService iStudentService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("I am ApplicationRunner");
		
	    List<Student> list = iStudentService.getList();
	    
	    System.out.println(list);
	}

}
