package rwl.com.spring_boot_example_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping(value = "/welcome")
	public ModelAndView getWelcomeMessage() {
		String message = "welcome into First Spring MVC using spring boot example";
				
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome");
		mav.addObject("key1", message);
		return mav;
	}
}
