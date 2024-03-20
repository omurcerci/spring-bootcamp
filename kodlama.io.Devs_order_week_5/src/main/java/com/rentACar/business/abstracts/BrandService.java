package com.rentACar.business.abstracts;
import java.util.List;
import org.springframework.stereotype.Service;

import com.rentACar.business.request.CreateBrandRequest;
import com.rentACar.business.responses.GetAllBrandsResponse;
import com.rentACar.entities.concretes.Brand;



public interface BrandService {
	
	List<GetAllBrandsResponse> getAll();
	
	void add(CreateBrandRequest createBrandRequest);

	
}
