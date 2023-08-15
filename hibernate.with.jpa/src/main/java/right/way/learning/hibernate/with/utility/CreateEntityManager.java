package right.way.learning.hibernate.with.utility;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CreateEntityManager {

	public static EntityManager getEntityMananger() {
		
		EntityManagerFactory fatory = Persistence.createEntityManagerFactory("myconfig");
		EntityManager manager = fatory.createEntityManager();
		return manager;
		
	}
}
