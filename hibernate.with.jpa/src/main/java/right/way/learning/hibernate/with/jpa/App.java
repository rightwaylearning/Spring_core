package right.way.learning.hibernate.with.jpa;

import java.util.List;

import right.way.learning.hibernate.with.jpa.dao.EmployeeRepository;
import right.way.learning.hibernate.with.jpa.dao.EmployeeRepositoryImpl;
import right.way.learning.hibernate.with.jpa.entity.Employee;
import right.way.learning.hibernate.with.jpa.entity.Product;
import right.way.learning.hibernate.with.jpa.product.entity.ProductRepository;
import right.way.learning.hibernate.with.jpa.product.entity.ProductRepositoryImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EmployeeRepository repository = new EmployeeRepositoryImpl();
//		ProductRepository productRRepo = new ProductRepositoryImpl();
//    	
//    	Employee e = new Employee(9999, "Bhagat", "singh", "india@gmail.com", "male", 378465.90);
//    	repository.save(e);

//      Employee e =	repository.search(9999);
//      if(e != null) {
//    	  repository.delete(e);
//      }

		// Employee e = repository.search(9999);
//      if(e != null) {
//    	  
//    	  e.setFirstName("Bhagat");
//    	  repository.update(e);
//      }
//    	productRRepo.save(new Product(1234,"Mobile",78906.00));

//    	List<Employee> list =   repository.getAllEmployeeList();
//    	
//    	for(Employee e :list) {
//    		System.out.println(e);
//    	}

//    	
//    	List<Employee> list =   repository.getHigestEmployeeSalaryList(90.00);
//    	
//    	for(Employee e :list) {
//    		System.out.println(e);
//    	}

//    	List<Object[]> list =   repository.getNameOfEmployee(90.00);
//    	
//    	for(Object[] e :list) {
//    		System.out.println(e[0]+" , "+e[1]+", "+e[2]);
//    	}

//		List<String> list = repository.getFirstNameEmployee(90.00);
//
//		for (String name : list) {
//			System.out.println(name);
//		}
		
//		int updatedRows  = repository.updateEmployeesalary(10.00);
//		System.out.println(updatedRows);
		
//		int updatedRows  = repository.removeEmployee(5.00);
//		System.out.println(updatedRows);
	}
}
