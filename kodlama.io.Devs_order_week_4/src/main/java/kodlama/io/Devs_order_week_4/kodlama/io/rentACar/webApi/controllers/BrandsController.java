package kodlama.io.Devs_order_week_4.kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlama.io.Devs_order_week_4.kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.Devs_order_week_4.kodlama.io.rentACar.entities.concretes.Brand;

@RestController // annotation
@RequestMapping("/api/brands")
public class BrandsController {
	
	private BrandService brandService;

	@Autowired  
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}
	
	@GetMapping("/getAll")
	public List<Brand> getAll()
	{
		return brandService.getAll();
	}
	
	
	
	
}
