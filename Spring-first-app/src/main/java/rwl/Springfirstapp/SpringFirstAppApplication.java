package rwl.Springfirstapp;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFirstAppApplication {

	public static void main(String[] args) {
		
		SpringApplication application = new SpringApplication(SpringFirstAppApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
		
	}

}
