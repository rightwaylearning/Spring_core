package right.way.learning.fifth.annoation.based.application.simple.annoations.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClassRoom {

	public Teacher teacher;
	
	
	@Autowired
	@Qualifier(value = "t1")
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}



	public void classRoomUse() {
		this.teacher.myJob();		
	}
	
}



