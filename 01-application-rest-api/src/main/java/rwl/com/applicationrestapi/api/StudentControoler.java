package rwl.com.applicationrestapi.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControoler {

	// url: http://localhost:8080/create , method post
	//@PostMapping("/create")
	
	@PostMapping(value ="/create", consumes = "application/json", produces = "application/json")
		public List<Student> createStudent( @RequestBody Student student){
		
		List<Student> list = new ArrayList<>();
		
		student.setFirstname(student.getFirstname().toUpperCase());
		student.setLastName(student.getLastName().toUpperCase());
		list.add(student);
		
    	return list;
	}
	
}
