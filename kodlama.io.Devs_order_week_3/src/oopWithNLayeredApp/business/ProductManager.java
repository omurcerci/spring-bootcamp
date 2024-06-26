package oopWithNLayeredApp.business;


import java.util.List;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;


public class ProductManager {
	
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao,Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}
		
	

	public void add(Product product) throws Exception // Response request patern
	{
		// İş Kuralları yazılıyor...
		
		if(product.getUnitPrice() < 10)
		{
			// throw new Exception(); Hata fırlatmak.
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}	
		productDao.add(product);
		
		for(Logger logger : loggers)
		{
			 logger.log( product.getName());
		}
	}
		
	}

