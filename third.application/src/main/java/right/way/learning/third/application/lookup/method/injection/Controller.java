package right.way.learning.third.application.lookup.method.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("right/way/learning/third/application/lookup/method/injection/config.xml");
		
		
		Teacher t = (Teacher)context.getBean("t");
		
		
		Student s1 = t.getStudentBeanObject();
		
		Student s2 = t.getStudentBeanObject();
		
		Student s3 = t.getStudentBeanObject();
		
		
		System.out.println(s1==s2); // false
		System.out.println(s1==s3); //false
	}
}
