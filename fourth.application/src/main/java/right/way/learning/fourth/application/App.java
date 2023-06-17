package right.way.learning.fourth.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
       ApplicationContext context = new ClassPathXmlApplicationContext("right/way/learning/fourth/application/config/springconfig.xml");	
  
       School school = (School)context.getBean("sc");
       
       Student s = school.getStudent();
       Building b =school.getBuilding();
       
       System.out.println(s);
       System.out.println(b);
       
//       System.out.println(s.getMessage());
//       System.out.println(b.getMessage());
    	
    }
}
