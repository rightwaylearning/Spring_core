package right.way.learning.hibernate.with.jpa.dao;

import jakarta.persistence.EntityManager;
import right.way.learning.hibernate.with.jpa.entity.Employee;
import right.way.learning.hibernate.with.utility.CreateEntityManager;

public class EmployeeRepositoryImpl  implements EmployeeRepository{
	
	private EntityManager manager;
	
	public EmployeeRepositoryImpl() {
		this.manager = CreateEntityManager.getEntityMananger();
	}

	public void save(Employee e) {
		this.manager.getTransaction().begin();
		this.manager.persist(e);
		this.manager.getTransaction().commit();
	}

	public Employee update(Employee e) {
		this.manager.getTransaction().begin();
		Employee obj= this.manager.merge(e);
		this.manager.getTransaction().commit();
		return obj;
	}

	public Employee search(Integer id) {
		return this.manager.find(Employee.class,id);
	}

	public void delete(Employee obj) {
		this.manager.getTransaction().begin();
		this.manager.remove(obj);
		this.manager.getTransaction().commit();
	}

}
