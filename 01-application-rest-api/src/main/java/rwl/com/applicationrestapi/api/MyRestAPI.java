package rwl.com.applicationrestapi.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestAPI {

	// //http://localhost:8080/message
	@GetMapping("/message")
	public String getMessage() {
		return "Hello, good Morning India.";
	}
	
	
	// //http://localhost:8080/students
//	@GetMapping("/students")
	@GetMapping(value =  "/students", produces = "application/json")
	public List<Student> getStudentData(){
		
		Student s1= new Student("suhas","parik",24);
		Student s2= new Student("mahesh","shinde",23);
		
		List<Student> list = new ArrayList<>();
		list.add(s1); list.add(s2);
		
		return list;
	}
}
