package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	
	@Override
	public void add(Product product) {
		/* Sadece data base erişim kodları buraya yazılır
		   SQL  lazım.
		*/
		System.out.println("Hibernate ile veritabanına eklendi.");
	}
}
