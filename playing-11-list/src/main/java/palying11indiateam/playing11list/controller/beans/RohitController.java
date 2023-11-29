package palying11indiateam.playing11list.controller.beans;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RohitController {

	@GetMapping("/rohit")
	public ModelAndView getRohitDetails() {
		ModelAndView m = new ModelAndView("rohit");
		return m;
	}
}
