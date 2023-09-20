package spring.basic.security.aws.security.programs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestEnPointController {

	@GetMapping("/message")
	public String getMessage() {
		return "Good Morning India";
	}
}
