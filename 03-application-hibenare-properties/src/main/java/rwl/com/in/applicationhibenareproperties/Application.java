package rwl.com.in.applicationhibenareproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import rwl.com.in.applicationhibenareproperties.entity.Movie;
import rwl.com.in.applicationhibenareproperties.repository.MovieDao;

@SpringBootApplication
public class Application implements ApplicationRunner {

	@Autowired
	MovieDao movieDao;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
	    System.out.println(">>>>>>>>>>>>> start");
		Movie m = new Movie(121,"LunchBox","Ritesh Batra","Anurag Kashyap","Irrfan Khan",980.00);
		movieDao.save(m);
		System.out.println("I am in sleeping mode for 10 second");
	//	Thread.sleep(20000);
		System.out.println(">>>>>>>>>>>>>end");
	}
	
	
	

}
