package order_week_3.business;

import java.util.ArrayList;

import order_week_3.coreLogging.abstracts.Ilogger;
import order_week_3.dataAccess.abstracts.IProductDao;
import order_week_3.entities.Product;

public class ProductManager {
	private IProductDao ıproductDao;
	private Ilogger[] loggers;
	ArrayList<String> productNames = new ArrayList<String>();
	ArrayList<String> productCategories = new ArrayList<String>();

	public ProductManager(IProductDao iproductDao, Ilogger[] loggers) {
		ıproductDao = iproductDao;
		this.loggers = loggers;
	}
	
	public void add(Product product) throws Exception {
		if(product.getCoursePrice() < 0) {
			throw new Exception("Kurs ücreti negatif olamaz");
		}
		if(product.getName().equals(product.getName())) {
			throw new Exception("Kurs isimleri tekrar edemez.");
		}
		if(product.getCategory().equals(product.getCategory())) {
			throw new Exception("Kurs kategori ismi tekrar edemez");
		}
		ıproductDao.add(product);
		
		for(Ilogger logger : loggers) {
			logger.log(product.getName());
		}
	}
	
	
}
