package right.way.learning.third.application.bean.life.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("right/way/learning/third/application/bean/life/cycle/springconfig.xml");
	
		FactroyWorker worker = context.getBean(FactroyWorker.class); 
		
		
		worker.myTodaysWork();
	
		
	}
}
