package com.rentACar.webApi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rentACar.business.abstracts.BrandService;
import com.rentACar.business.request.CreateBrandRequest;
import com.rentACar.business.responses.GetAllBrandsResponse;
import com.rentACar.entities.concretes.Brand;




@RestController
@RequestMapping("/api/brands")
public class BrandController {
	
	@Autowired
	private BrandService brandService;



	@GetMapping("/getAll") 
	public List<GetAllBrandsResponse> getAll()
	{
		return brandService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
	}
	
	

}
