package right.way.learning.hibernate.with.jpa.product.entity;

import jakarta.persistence.EntityManager;
import right.way.learning.hibernate.with.jpa.entity.Product;
import right.way.learning.hibernate.with.utility.CreateEntityManager;

public class ProductRepositoryImpl  implements ProductRepository{

	private EntityManager manager;
	
	public ProductRepositoryImpl() {
		 this.manager = CreateEntityManager.getEntityMananger();
	}
	public void save(Product product) {
		this.manager.getTransaction().begin();
		this.manager.persist(product);
		this.manager.getTransaction().commit(); 
	}

}
