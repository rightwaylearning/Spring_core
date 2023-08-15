package right.way.learning.hibernate.with.jpa;

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
public class App 
{
    public static void main( String[] args )
    {
    	EmployeeRepository repository = new EmployeeRepositoryImpl();
    	ProductRepository productRRepo = new ProductRepositoryImpl();
//    	
//    	Employee e = new Employee(9999, "Bhagat", "singh", "india@gmail.com", "male", 378465.90);
//    	repository.save(e);
    	
//      Employee e =	repository.search(9999);
//      if(e != null) {
//    	  repository.delete(e);
//      }
    	
  //    Employee e =	repository.search(9999);
//      if(e != null) {
//    	  
//    	  e.setFirstName("Bhagat");
//    	  repository.update(e);
//      }
    	productRRepo.save(new Product(1234,"Mobile",78906.00));
    	
    	
    }
}
