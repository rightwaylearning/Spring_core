package other.way.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Controller {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigurationClass.class);

		Test t = (Test) context.getBean("t");

		t.printInfo();

		StringBuffer br = context.getBean(StringBuffer.class);
		
		System.out.println(br);
	}
}
