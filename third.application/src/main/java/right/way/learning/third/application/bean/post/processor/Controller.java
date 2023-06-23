package right.way.learning.third.application.bean.post.processor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("right/way/learning/third/application/bean/post/processor/configuration.xml");

		
		Student s =context.getBean(Student.class);
		Teacher t = context.getBean(Teacher.class);
		Security s1= context.getBean(Security.class);
		
		
		
	}
}
