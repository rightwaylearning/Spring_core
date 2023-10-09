package first.web.mvc.spring.boot.mvc.example.controller.beans;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WelcomeController {

	
	public ModelAndView getMessage() {
		
		String message = "This is my spring boot mvc --- first application";
		
		ModelAndView mav = new ModelAndView("welcome", "dataKey", message);
		return mav;
	}
}

        //"welcome" >> logical name of view page
		// message :- object of data
		// "datakey" :- it is key while reading data required this key.