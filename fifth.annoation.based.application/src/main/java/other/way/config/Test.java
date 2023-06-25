package other.way.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "t")
public class Test {

	void printInfo() {
		System.out.println("I am test class");
	}
}
