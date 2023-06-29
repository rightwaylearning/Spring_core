package right.way.learning.product.info.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import right.way.learning.product.info.model.Product;

@Repository(value = "productDaoImpl")
@Scope(value = "singleton")
public class ProductDaoImpl implements ProductDao {

	private List<Product> productList;
	
	public ProductDaoImpl() {
		this.productList = new ArrayList<Product>();
	}
	
	public Boolean saveProduct(Product product) {
		if (product != null) {
			return this.productList.add(product);
		}
		return false;
	}

	public List<Product> getAllProduct() {
		return this.productList;
	}

}
