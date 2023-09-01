package rwl.com.in.applicationhibenareproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import rwl.com.in.applicationhibenareproperties.entity.Actor;
import rwl.com.in.applicationhibenareproperties.entity.Movie;
import rwl.com.in.applicationhibenareproperties.repository.ActorDao;
import rwl.com.in.applicationhibenareproperties.repository.MovieDao;

@SpringBootApplication
public class Application implements ApplicationRunner {

	@Autowired
	MovieDao movieDao;
	
	@Autowired
	ActorDao actorDao;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Movie m = new Movie("LunchBox","Ritesh Batra","Anurag Kashyap","Irrfan Khan",980.00);
		movieDao.save(m);
		Movie m1 = new Movie("LunchBox","Ritesh Batra","Anurag Kashyap","Irrfan Khan",980.00);
		movieDao.save(m1);
		Movie m2 = new Movie("LunchBox","Ritesh Batra","Anurag Kashyap","Irrfan Khan",980.00);
		movieDao.save(m2);
		Movie m3 = new Movie("LunchBox","Ritesh Batra","Anurag Kashyap","Irrfan Khan",980.00);
		movieDao.save(m3);
		Actor a = new Actor(151, "Amir", "Kayam se kayamat tak-1988");
		actorDao.save(a);
	}
	
	
	

}
