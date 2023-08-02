package rwl.springboot1sampleexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot1SampleExampleApplication {

	public static void main(String[] args) {


	 ApplicationContext c =   SpringApplication.run(SpringBoot1SampleExampleApplication.class, args);

	  
	  Sample s = c.getBean(Sample.class);
	  
	  s.getMessage();
	  
	  
	  System.out.println(c.getClass().getName());
	 

	}
}
