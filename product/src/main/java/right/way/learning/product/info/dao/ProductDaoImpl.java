package right.way.learning.product.info.dao;

import java.util.ArrayList;
import java.util.List;

import right.way.learning.product.info.model.Product;

public class ProductDaoImpl implements ProductDao {

	static private List<Product> productList = null;

	public ProductDaoImpl() {
		productList = new ArrayList<Product>();
	}

	public Boolean saveProduct(Product product) {

		if (product != null) {
			return productList.add(product);
		}

		return false;
	}

	public List<Product> getAllProduct() {
		return productList;
	}

}
