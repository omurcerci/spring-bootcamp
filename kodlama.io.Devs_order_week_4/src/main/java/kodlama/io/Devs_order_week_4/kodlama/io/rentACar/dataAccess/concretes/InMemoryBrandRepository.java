package kodlama.io.Devs_order_week_4.kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs_order_week_4.kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.Devs_order_week_4.kodlama.io.rentACar.entities.concretes.Brand;

@Repository // Bu sınıf bir DataAccess nesnesidir.
public class InMemoryBrandRepository implements BrandRepository {
	
	List<Brand> brands;
	
	public InMemoryBrandRepository() {
		this.brands = new ArrayList<Brand>();
		brands.add(new Brand(1, "BMW"));
		brands.add(new Brand(2, "Mercedes"));
		brands.add(new Brand(3, "Audi"));
		brands.add(new Brand(4, "Renault"));
		brands.add(new Brand(5, "Fiat"));
	}

	@Override
	public List<Brand> getAll() {
		
		return brands;
	}

	
	
}
