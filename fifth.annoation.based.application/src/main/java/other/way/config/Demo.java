package other.way.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component(value = "id1")
public class Demo {

	@P
	public void m1() {
		System.out.println("I am init method");
	}
	
	 @PreDestroy
	public void m2() {
		System.out.println("I am destroy method method");
	}
}
