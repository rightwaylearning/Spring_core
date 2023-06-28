package right.way.learning.product.info;

import java.util.List;

import right.way.learning.product.info.controller.ProductController;
import right.way.learning.product.info.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ProductController controller = new ProductController();
    	
    	Product p= new Product(123, "A", 67.90);
    	
    	Product p1= new Product(124, "B", null);
    	
    	System.out.println(controller.saveProductObject(p));
    	
    	System.out.println(controller.saveProductObject(p1));
    	
    	List<Product> list = controller.getAllProductList();
    	
    	System.out.println(list);
    }
}
