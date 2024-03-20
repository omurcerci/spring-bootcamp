package order_week_3;

import order_week_3.business.ProductManager;
import order_week_3.coreLogging.abstracts.Ilogger;
import order_week_3.coreLogging.concretes.DatabaseLogger;
import order_week_3.coreLogging.concretes.FileLogger;
import order_week_3.coreLogging.concretes.MailLogger;
import order_week_3.dataAccess.concretes.JdbcProductDao;
import order_week_3.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"Java Kursu","Java","Engin Demiroğ",500);
		Ilogger[] loggers = {new DatabaseLogger(), new MailLogger()};
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
		productManager.add(product1);
	}

}
