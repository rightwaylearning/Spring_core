package right.way.learning.hibernate.with.jpa.dao;

import java.util.List;

import right.way.learning.hibernate.with.jpa.entity.Employee;

public interface EmployeeRepository {

	public void save(Employee e);
	public Employee update(Employee e);
	public Employee search(Integer id);
	public void delete(Employee id);
	public List<Employee> getAllEmployeeList();
	public List<Employee> getHigestEmployeeSalaryList(double salary);
	public List<Object[]> getNameOfEmployee(double salary);
	public List<String> getFirstNameEmployee(double salary);	
	public int updateEmployeesalary(double salary);
	public int removeEmployee(double salary);
}
