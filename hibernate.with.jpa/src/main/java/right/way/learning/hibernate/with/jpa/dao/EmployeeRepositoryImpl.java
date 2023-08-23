package right.way.learning.hibernate.with.jpa.dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import right.way.learning.hibernate.with.jpa.entity.Employee;
import right.way.learning.hibernate.with.utility.CreateEntityManager;

public class EmployeeRepositoryImpl implements EmployeeRepository {

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
		Employee obj = this.manager.merge(e);
		this.manager.getTransaction().commit();
		return obj;
	}

	public Employee search(Integer id) {
		return this.manager.find(Employee.class, id);
	}

	public void delete(Employee obj) {
		this.manager.getTransaction().begin();
		this.manager.remove(obj);
		this.manager.getTransaction().commit();
	}

	public List<Employee> getAllEmployeeList() {
		// JPQL >> select * from employee >>> select e from Emplyeee e;
		this.manager.getTransaction().begin();
		Query query = this.manager.createQuery("select e from Employee e");
		List<Employee> employee = query.getResultList();
		this.manager.getTransaction().commit();
		return employee;
	}

	public List<Employee> getHigestEmployeeSalaryList(double salary) {
		// JPQL >> select * from employee >>> select e from Emplyeee e;
		this.manager.getTransaction().begin();
		Query query = this.manager.createQuery("select e from Employee e where e.salary >= :p ");
		query.setParameter("p", salary);
		List<Employee> employee = query.getResultList();
		this.manager.getTransaction().commit();
		return employee;
	}

	public List<Object[]> getNameOfEmployee(double salary) {
		// JPQL >> select * from employee >>> select e from Emplyeee e;
		this.manager.getTransaction().begin();
		Query query = this.manager
				.createQuery("select e.firstName,e.lastName, e.email from Employee e where e.salary >= :p ");
		query.setParameter("p", salary);
		List<Object[]> list = query.getResultList();
		this.manager.getTransaction().commit();
		return list;
	}

	public List<String> getFirstNameEmployee(double salary) {
		// JPQL >> select * from employee >>> select e from Emplyeee e;
		this.manager.getTransaction().begin();
		Query query = this.manager.createQuery("select e.firstName from Employee e where e.salary >= :p ");
		query.setParameter("p", salary);
		List<String> list = query.getResultList();
		this.manager.getTransaction().commit();
		return list;
	}

	public int updateEmployeesalary(double salary) {
		// update employee e set e.salary = e.salary * 2 where e.salary <= 10;
		this.manager.getTransaction().begin();
		Query query = this.manager.createQuery("update Employee e set e.salary = e.salary * 2 where e.salary <= :p ");
		query.setParameter("p", salary);
		int updatedRows = query.executeUpdate();
		this.manager.getTransaction().commit();
		return updatedRows;
	}

	public int removeEmployee(double salary) {
		this.manager.getTransaction().begin();
		Query query = this.manager.createQuery("delete from Employee e where e.salary <= :p ");
		query.setParameter("p", salary);
		int updatedRows = query.executeUpdate();
		this.manager.getTransaction().commit();
		return updatedRows;
	}
}
