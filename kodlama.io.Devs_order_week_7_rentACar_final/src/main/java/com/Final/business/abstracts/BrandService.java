package com.Final.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Final.business.requests.CreateBrandRequest;
import com.Final.business.requests.UpdateBrandRequest;
import com.Final.business.responses.GetAllBrandResponse;
import com.Final.business.responses.GetByIdBrandResponse;

@Repository
public interface BrandService {

	List<GetAllBrandResponse> getAll();
	
	GetByIdBrandResponse getById(int id);
	
	void add(CreateBrandRequest createBrandRequest);
	
	void update(UpdateBrandRequest updateBrandRequest);
	
	void delete(int id);
}
