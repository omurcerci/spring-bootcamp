package order_week_3.dataAccess.concretes;

import order_week_3.dataAccess.abstracts.IProductDao;
import order_week_3.entities.Product;

public class JdbcProductDao implements IProductDao{

	@Override
	public void add(Product product) {
		System.out.println("Jdbc ile product eklendi");
		
	}

}
