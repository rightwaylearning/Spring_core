package right.way.learning.first.application;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
    
//    	
    	Resource resource = new ClassPathResource("config/file/springxmlconfig.xml");    	
    	
    	BeanFactory factroy = new XmlBeanFactory(resource);
    	
      
    	
    	Student s = (Student)factroy.getBean("std");  
    	System.out.println(s);
//    	
//    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	// 2] ApplicationContext (I) 
    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("config/file/springxmlconfig.xml");
//    	
//    	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//    	
//    	Student s = (Student)context.getBean("std");
    //	System.out.println(s.toString());
    	
    	
    	
    	 
    	
    	
    	
    	
    	
    	//option 1] here config file should be come under File system
    	
//    	Resource r = new FileSystemResource("C:/abc/yu/config.xml");
//    	
//    	BeanFactory factroy = new XmlBeanFactory(r);
//    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
