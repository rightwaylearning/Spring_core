package right.way.learning.product.info.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import right.way.learning.product.info.dao.ProductDao;
import right.way.learning.product.info.model.Product;

@Service(value = "productServiceImpl")
@Scope(value = "singleton")
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	@Qualifier(value = "productDaoImpl")
	private ProductDao dao;
	
	
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
