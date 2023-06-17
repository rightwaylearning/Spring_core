package right.way.learning.second.application.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("right/way/learning/second/application/bean/scope/myconfig.xml");
	
	    Employee e1= (Employee)context.getBean("emp");
	 //   e1.setName("Sunil");
	    
	    
	    Employee e2= (Employee)context.getBean("emp");
	    
	    Employee e3= (Employee)context.getBean("emp1");
//	    
//	    System.out.println(e1.hashCode());
//	    
//	    System.out.println(e2.hashCode());
//	    
//	    System.out.println(e3.hashCode());
	    
	   // System.out.println(e3.getName());
	    
	    A a1= (A)context.getBean("id1");
	    A a2= (A)context.getBean("id1");
	    A a3= (A)context.getBean("id2");
	    
	    System.out.println(a1==a2);
	    System.out.println(a1==a3);
	    
	    
	    B obj1= (B)context.getBean("b1");
	    B obj2= (B)context.getBean("b1");
	    B obj3= (B)context.getBean("b2");
	    
	    
	    System.out.println(obj1==obj2);  
	    System.out.println(obj1==obj3); 
	    System.out.println(obj3==obj2); 
	    
	    
	    obj1.getEmployeeInfo();
	 
	}
}
