package com.rentACarMapping.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentACarMapping.business.abstracts.BrandService;
import com.rentACarMapping.business.requests.CreateBrandRequest;
import com.rentACarMapping.business.requests.UpdateBrandRequest;
import com.rentACarMapping.business.responses.GetAllBrandsResponse;
import com.rentACarMapping.business.responses.GetByIdBrandResponse;
import com.rentACarMapping.core.utilities.mappers.ModelMapperService;
import com.rentACarMapping.dataAccess.abstracts.BrandRepository;
import com.rentACarMapping.entities.concretes.Brand;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService{

	@Autowired
	private BrandRepository brandRepository;
	private ModelMapperService modelMapperService;
	
	@Override
	public List<GetAllBrandsResponse> getAll() {
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse> brandsResponse = brands.stream().map(brand -> this.modelMapperService.forResponse().map(brand,GetAllBrandsResponse.class)).collect(Collectors.toList());
		return brandsResponse;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		Brand brand = this.modelMapperService.forRequest().map(createBrandRequest,Brand.class); 
		this.brandRepository.save(brand);
		
	}

	@Override
	public GetByIdBrandResponse getById(int id) {
		Brand brand = this.brandRepository.findById(id).orElseThrow();
		
		GetByIdBrandResponse response = this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);
		
		return response;
	}

	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {
		
		Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest,Brand.class); 
		this.brandRepository.save(brand);
		
	}

	@Override
	public void delete(int id) {
		this.brandRepository.deleteById(id);
		
	}

}
