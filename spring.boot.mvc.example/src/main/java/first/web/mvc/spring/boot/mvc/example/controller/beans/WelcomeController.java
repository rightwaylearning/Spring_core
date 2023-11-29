package first.web.mvc.spring.boot.mvc.example.controller.beans;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping(value = "/message")
	public ModelAndView getMessage() {
		
		String message = "This is my spring boot mvc first application";
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome");
		mav.addObject("key1", message);
		return mav;
	}
}

        //"welcome" >> logical name of view page
		// message :- object of data
		// "datakey" :- it is key while reading data required this key.