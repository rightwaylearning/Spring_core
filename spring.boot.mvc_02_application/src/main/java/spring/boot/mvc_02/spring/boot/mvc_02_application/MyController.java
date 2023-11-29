package spring.boot.mvc_02.spring.boot.mvc_02_application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collector;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@GetMapping("/home")
	public ModelAndView getMessage() {
		
		ModelAndView v = new ModelAndView("home","key1","Good Morning First time");
	    return v;
	}
}
