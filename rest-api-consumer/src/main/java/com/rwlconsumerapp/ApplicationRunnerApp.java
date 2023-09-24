package com.rwlconsumerapp;

import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class ApplicationRunnerApp implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		RestTemplate template  = new RestTemplate();
		
		// get method which get String as response
//	    String getUrl = "http://localhost:8082/provider/welcome";
//	    
//		
//		ResponseEntity<String> response = template.getForEntity(getUrl, String.class);
//	
//		if(response.getStatusCodeValue() ==200) {
//			System.out.println(response.getBody());
//		}
		
		// get method which get List of user 
		
//		
		String getUrl = "http://localhost:8083/provider/users";
		
		ResponseEntity<List> response = template.getForEntity(getUrl, List.class);
		
		if(response.getStatusCodeValue() ==200) {
			System.out.println(response.getBody());
		}
		
//		String getUrl = "http://localhost:8083/provider/save";
//		User user = new User("C", 103);
//		ResponseEntity<String> response   = template.postForEntity(getUrl, user, String.class);
//		if(response.getStatusCodeValue() ==200) {
//		System.out.println(response.getBody());
	//   }
	}

}
