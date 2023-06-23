package right.way.learning.third.application.bean.life.cycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class FactroyWorker implements InitializingBean, DisposableBean{

	public FactroyWorker() {
		System.out.println("I am default constructor");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("***** log check-In time");
	}
	
	public void myInit() {
		System.out.println("**** I am also init method");
	}
	
	public void myExitLogic() {
		System.out.println("**** I am also destroy method");
	}
	
	
	public void myTodaysWork() {
		System.out.println("doing my work");
	}


	public void destroy() throws Exception {
		System.out.println("log check-out time");
	}
	
}
