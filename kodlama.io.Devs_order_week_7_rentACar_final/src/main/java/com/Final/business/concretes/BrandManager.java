package com.Final.business.concretes;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Final.business.abstracts.BrandService;
import com.Final.business.requests.CreateBrandRequest;
import com.Final.business.requests.UpdateBrandRequest;
import com.Final.business.responses.GetAllBrandResponse;
import com.Final.business.responses.GetByIdBrandResponse;
import com.Final.business.rules.BrandBusinessRules;
import com.Final.core.utilities.mappers.ModelMapperService;
import com.Final.dataAccess.abstracts.BrandRepository;
import com.Final.entity.concretes.Brand;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService{
	
	@Autowired
	private BrandRepository brandRepository;
	@Autowired
	private ModelMapperService modelMapperService;
	@Autowired
	private BrandBusinessRules brandBusinessRules;
	
	@Override
	public List<GetAllBrandResponse> getAll() {
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandResponse> brandsResponse = brands.stream().map(brand -> this.modelMapperService.forResponse().map(brand,GetAllBrandResponse.class)).collect(Collectors.toList());
		return brandsResponse;
	}


	@Override
	public GetByIdBrandResponse getById(int id) {
		Brand brand = this.brandRepository.findById(id).orElseThrow();
		
		GetByIdBrandResponse response = this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);
		
		return response;
		
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		
		this.brandBusinessRules.checkIfBrandNameExists(createBrandRequest.getName());
		
		Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
		this.brandRepository.save(brand);
		
	}

	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {
		
		Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
		this.brandRepository.save(brand);
	}

	@Override
	public void delete(int id) {
		this.brandRepository.deleteById(id);
		
	}

}
