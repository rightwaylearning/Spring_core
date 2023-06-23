package right.way.learning.third.application.bean.post.processor;

import org.springframework.beans.factory.InitializingBean;

public class Teacher implements InitializingBean {

	public void afterPropertiesSet() throws Exception {
		System.out.println("I am Teacher init method");		
	}
}
