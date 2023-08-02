package other.way.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"other.way.config"})
public class SpringConfigurationClass {

	
	@Bean
	public StringBuffer getSBObject() {
		return new StringBuffer("Hello I am java based configuration");
	}
}
