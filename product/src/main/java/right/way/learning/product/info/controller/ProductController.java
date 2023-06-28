package right.way.learning.product.info.controller;

import java.util.List;

import right.way.learning.product.info.model.Product;
import right.way.learning.product.info.services.ProductService;
import right.way.learning.product.info.services.ProductServiceImpl;

public class ProductController {

	private ProductService service = null;
	
	public ProductController() {
		this.service =  new ProductServiceImpl();
	}
	
	public Boolean saveProductObject(Product product) {
		return service.saveProduct(product);
	}
	
	public List<Product> getAllProductList(){
		return service.getAllProduct();
	}
	
}
