package right.way.learning.product.info;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import right.way.learning.product.info.config.ProductConfiguration;
import right.way.learning.product.info.controller.ProductController;
import right.way.learning.product.info.model.Product;

/**
 * Hello world!
 *
 */
public class ClientApp 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(ProductConfiguration.class);
    	
    	Product p1 = context.getBean(Product.class);
    	p1.setProductId(101);
    	p1.setProductName("TV");
    	p1.setProductPrice(35000.00);
    	
    	Product p2 = context.getBean(Product.class);
      	p2.setProductId(102);
    	p2.setProductName("Laptop");
    	p2.setProductPrice(55000.00);
    	
    	
    	ProductController controller = context.getBean(ProductController.class);
    	
    	Boolean s1= controller.saveProductObject(p1);
    	Boolean s2= controller.saveProductObject(p2);
    	
    	System.out.println(s1);
    	System.out.println(s2);
    	
    	
       List<Product> list=controller.getAllProductList();
       
       System.out.println(list);
    	
    	
    	
    	
    }
}
