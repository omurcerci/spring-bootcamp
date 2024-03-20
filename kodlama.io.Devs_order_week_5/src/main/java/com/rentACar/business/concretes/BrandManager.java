package com.rentACar.business.concretes;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentACar.business.abstracts.BrandService;
import com.rentACar.business.request.CreateBrandRequest;
import com.rentACar.business.responses.GetAllBrandsResponse;
import com.rentACar.dataAccess.abstracts.BrandRepository;
import com.rentACar.entities.concretes.Brand;

@Service
public class BrandManager implements BrandService{
	
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public List<GetAllBrandsResponse> getAll() {
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();
		for(Brand brand : brands) {
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			brandsResponse.add(responseItem);
		}
		// İş kuralları
		return brandsResponse;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());
		this.brandRepository.save(brand);
		
	}

	

}
