package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	@Override
	public void add(Product product) {
		/* Sadece data base erişim kodları buraya yazılır
		   SQL  lazım.
		*/
		System.out.println("JDBC ile veritabanına eklendi.");
	}
}
