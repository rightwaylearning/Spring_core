package rwl.user.information.userrestapiwithxmlrequestresponse.controoler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rwl.user.information.userrestapiwithxmlrequestresponse.model.User;

@RestController
@RequestMapping(value = "/user")
public class UserRestController {
   
	@GetMapping(value = "/{userId}", produces = "application/xml")
	public ResponseEntity<User> getUser(@PathVariable() Integer userId){
		User user = new User(userId, "Suraj Pande", "suraj.pande@ibmindia.com", 8976456789L);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@GetMapping(value = "/list", produces = "application/xml")
	public ResponseEntity<List<User>> getUsers(){
		User user = new User(1012, "Suraj Pande", "suraj.pande@ibmindia.com", 8976456789L);
		User user1 = new User(1123, "Suraj Pande", "suraj.pande@ibmindia.com", 8976456789L);
		User user2 = new User(1455, "Suraj Pande", "suraj.pande@ibmindia.com", 8976456789L);
		
		List<User> list = new ArrayList<>();
		list.add(user1);list.add(user);list.add(user2);
		
		return new ResponseEntity<List<User>>(list,HttpStatus.OK);
	}
	
	@PostMapping(value = "/save", consumes = "application/xml" , produces = "application/json")
    public ResponseEntity<User> saveUser(@RequestBody User user){
		   System.out.println(user);
			return new ResponseEntity<User>(user,HttpStatus.OK);
	}
}
