package right.way.learning.third.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import right.way.learning.third.application.employee.Address;
import right.way.learning.third.application.employee.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // there are 2 types of IOC container
    	 // 1] BeanFactory   2] ApplicationContext
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("right/way/learning/third/application/config/configuration.xml");
    	
    	Employee e = (Employee)context.getBean("emp");
    	
    	System.out.println(e.getName());
    	System.out.println(e.getEmployeeId());
    	
    	Address adr = e.getAddress();
    	System.out.println(adr);
    	
    	System.out.println(e.getJoiningDate());
    	
    	Long[] numbers = e.getMobilesNumber();
    	
    	for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
    	
    }
}
