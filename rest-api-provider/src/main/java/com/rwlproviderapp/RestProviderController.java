package com.rwlproviderapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class RestProviderController {

	private static List<User> users = new ArrayList<>();
	
	@GetMapping("/welcome")
	public String getMessage() {
		return "Welcome on Provider server..........";
	}
	
	@GetMapping("/users")
	public List<User> getUserList() {
		users.add(new User("A", 101));
		users.add(new User("B", 102));
		return users;
	}
	
	@PostMapping( value = "/save" , consumes = "application/json")
	public String saveUser(@RequestBody User user) {
		boolean flag = users.add(user);
		
		if(flag) {
			return "Successfully user add in List";
		}
		return "Sorry some thing is wrong on server";
	}
	
	
}
