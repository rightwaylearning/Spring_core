package rwl.springboot1sampleexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Sample {
	
	@Autowired
	Environment environment;


	public String getMessage() {
		System.out.println(environment.getClass().getName());
		System.out.println(">>>"+environment.getActiveProfiles());
		System.out.println(environment.getProperty("username1"));
		System.out.println(environment.getProperty("pwd"));
		System.out.println(environment.getProperty("db.server.ip.address"));
		
		return "This is my first Application";
	}
}
