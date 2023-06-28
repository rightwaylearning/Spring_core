package right.way.learning.product.info.dao;

import java.util.List;

import right.way.learning.product.info.model.Product;

public interface ProductDao {

	public Boolean saveProduct(Product product);
	public List<Product> getAllProduct();
}
