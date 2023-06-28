package right.way.learning.product.info.services;

import java.util.List;

import right.way.learning.product.info.model.Product;

public interface ProductService {
	public Boolean saveProduct(Product product);
	public List<Product> getAllProduct();
}
