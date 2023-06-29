package right.way.learning.product.info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import right.way.learning.product.info.model.Product;
import right.way.learning.product.info.services.ProductService;

@Controller(value = "productController")
public class ProductController {

	@Autowired
	@Qualifier(value = "productServiceImpl")
	private ProductService service;
	
	
	public Boolean saveProductObject(Product product) {
		return service.saveProduct(product);
	}
	
	public List<Product> getAllProductList(){
		return service.getAllProduct();
	}
	
}
