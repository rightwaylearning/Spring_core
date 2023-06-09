package right.way.learning.first.application;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
        // Note : here we are going to store config.xml file on class path
    	
    	// 1] BeanFactroy (I)>> spring 6.X >> this container is removed 
    
    	
//    	
//    	Resource resource = new ClassPathResource("config/file/springxmlconfig.xml");    	
//    	BeanFactory factroy = new XmlBeanFactory(resource);
//    	Student  s= (Student)factroy.getBean("std");
//    	System.out.println(s.toString());
    	
    	
    	// 2] ApplicationContext (I) 
    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("config/file/springxmlconfig.xml");
//    	Student s = (Student)context.getBean("std");
//    	System.out.println(s.toString());
    	
    	
    	
    	
    }
}
