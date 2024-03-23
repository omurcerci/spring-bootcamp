package com.rentACarMapping.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rentACarMapping.business.requests.CreateBrandRequest;
import com.rentACarMapping.business.requests.UpdateBrandRequest;
import com.rentACarMapping.business.responses.GetAllBrandsResponse;
import com.rentACarMapping.business.responses.GetByIdBrandResponse;

@Repository
public interface BrandService {

	
	List<GetAllBrandsResponse> getAll();
	
	GetByIdBrandResponse getById(int id);
	
	void add(CreateBrandRequest createBrandRequest);
	
	void update(UpdateBrandRequest updateBrandRequest);
	
	void delete(int id);
}
