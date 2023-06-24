package right.way.learning.fifth.annoation.based.application.simple.annoations.classes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "t1")
public class Teacher {

   public void myJob() {
	   System.out.println("to teach students every day");
   }
}
