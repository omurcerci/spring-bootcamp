package kodlama.io.Devs_order_week_4.kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs_order_week_4.kodlama.io.rentACar.entities.concretes.Brand;

@Repository
public interface BrandRepository {
	
	List<Brand> getAll();
	
}
