package right.way.learning.product.info.services;

import java.util.List;

import right.way.learning.product.info.dao.ProductDao;
import right.way.learning.product.info.dao.ProductDaoImpl;
import right.way.learning.product.info.model.Product;

public class ProductServiceImpl implements ProductService{
	
	private ProductDao dao = null;
	
	public ProductServiceImpl() {
		this.dao = new ProductDaoImpl();
	}

	public Boolean saveProduct(Product product) {
		
		if(product != null && product.getProductId() != null && product.getProductName() != null && product.getProductPrice() != null) {
		   return this.dao.saveProduct(product);
		}
		
		return false;
	}

	public List<Product> getAllProduct() {
		
		List<Product> list=this.dao.getAllProduct();
		
		if(list.size() == 0) {
			return null;
		}else {
			return list;
		}
        		 
	}

}
