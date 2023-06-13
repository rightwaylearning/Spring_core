package right.way.learning.second.application.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("right/way/learning/second/application/constructor/config.xml");
		
		Student s=(Student)context.getBean("id1");
		
		System.out.println(s);
		
		for(Integer m : s.getMobiles()) {
			System.out.println(m);
		}
		
		System.out.println(s.getNumbers());
		
		System.out.println(s.getMap());
		
		System.out.println(s.getSetValues());
		
		System.out.println(s.getP());
	}
}
