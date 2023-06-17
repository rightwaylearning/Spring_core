package right.way.learning.second.application.bean.scope;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class B  implements ApplicationContextAware{
	
	ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("**********************************");
		this.applicationContext = applicationContext;		
	}
	
	void getEmployeeInfo() {
		Employee e = (Employee)this.applicationContext.getBean("emp");
		System.out.println(e.getName());
		System.out.println(e.getId());
	}

}
