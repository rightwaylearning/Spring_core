package com.example.rwl.runner;

import org.springframework.beans.BeansException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.example.rwl.model.Employee;

@Component
public class ApplicationRunnerStart implements ApplicationRunner,ApplicationContextAware{

	private ApplicationContext applicationContext;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Employee e = this.applicationContext.getBean(Employee.class);
		System.out.println(e);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		
	}

}
