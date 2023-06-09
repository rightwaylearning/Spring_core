package right.way.learning.second.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import right.way.learning.second.application.beans.Travel;
import right.way.learning.second.application.beans.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring/config/applicationconfig.xml");
    	Travel travel =(Travel) context.getBean("t");
    		
    	
    	System.out.println(travel.getDestination());
    	System.out.println(travel.getSource());
    	
        Vehicle v=travel.getVehicle();
        v.go();
    	
        for (int i = 0; i < travel.getArr().length; i++) {
			System.out.println(travel.getArr()[i]);
		}
        
        
    }
}
