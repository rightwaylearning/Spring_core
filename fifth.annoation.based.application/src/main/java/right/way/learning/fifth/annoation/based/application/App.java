package right.way.learning.fifth.annoation.based.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import right.way.learning.fifth.annoation.based.application.simple.annoations.classes.ClassRoom;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context =new ClassPathXmlApplicationContext("right/way/learning/fifth/annoation/based/application/springconfig.xml");
        
    	ClassRoom room = (ClassRoom)context.getBean("classRoom");
    	room.classRoomUse();
    }
}
