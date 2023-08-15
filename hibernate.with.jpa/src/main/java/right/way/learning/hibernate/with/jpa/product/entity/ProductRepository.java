package right.way.learning.hibernate.with.jpa.product.entity;

import right.way.learning.hibernate.with.jpa.entity.Product;

public interface ProductRepository {

	public void save(Product product);
}
