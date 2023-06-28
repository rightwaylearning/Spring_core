package read.property.file.values;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedConfigClass.class);
	
		
		Employee e = (Employee)context.getBean("employee");
		System.out.println(e);
		
	
	}
}
