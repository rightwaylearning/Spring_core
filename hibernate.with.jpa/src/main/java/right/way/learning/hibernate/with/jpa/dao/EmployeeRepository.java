package right.way.learning.hibernate.with.jpa.dao;

import right.way.learning.hibernate.with.jpa.entity.Employee;

public interface EmployeeRepository {

	public void save(Employee e);
	public Employee update(Employee e);
	public Employee search(Integer id);
	public void delete(Employee id);
}
