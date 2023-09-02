package rwl.user.information.userrestapiwithexceptionhandling.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rwl.user.information.userrestapiwithexceptionhandling.entity.User;
import rwl.user.information.userrestapiwithexceptionhandling.exception.handling.InvalidUserId;
import rwl.user.information.userrestapiwithexceptionhandling.services.UserService;

@RestController
@RequestMapping("/user")
public class UserRestControoler {

	@Autowired
	private UserService userService;
	
	//@RequestMapping(value = "/user/{userid}",method = RequestMethod.GET)
	@GetMapping(value = "/{userId}")
	public ResponseEntity<User> getUser(@PathVariable("userId") Integer userId){
		
		if(userId <= 0) {
			throw new InvalidUserId();
		}
		
		Optional<User> user = userService.findById(userId);
		//int a =10/0;
		if(user.isPresent()) {
			return new ResponseEntity<User>(user.get(),HttpStatus.OK);
		}
		return new ResponseEntity<User>(new User(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/users")
	public ResponseEntity<Iterable<User>> getAllUser(){
		Iterable<User> list = userService.findAll();
		//List<User> list1 =null;
		//list1.add(null);
		return new ResponseEntity<Iterable<User>>(list,HttpStatus.OK);
	}
	
	
	
}
