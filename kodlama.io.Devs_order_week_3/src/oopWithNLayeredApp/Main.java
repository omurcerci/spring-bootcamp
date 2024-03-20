package oopWithNLayeredApp;

import java.util.ArrayList;
import java.util.List;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {
	public static void main(String[] args) throws Exception {
		
		Product product1 = new Product(1,"Iphone XE",10.000);
		
		// Arayüz iş-birimi ile iş yapar
//		List<Logger> loggers = new ArrayList<>();
//		loggers.add(new DatabaseLogger());
		Logger[] loggers = {new DatabaseLogger(),new MailLogger(), new FileLogger()};
		ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(product1);
	}
}
