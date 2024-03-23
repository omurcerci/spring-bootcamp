package com.Final.business.rules;

import org.springframework.stereotype.Service;

import com.Final.core.utilities.exceptions.BusinessException;
import com.Final.dataAccess.abstracts.BrandRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BrandBusinessRules {
	
	//Data da kontrol edeceğimiz için repository lazım
	private BrandRepository brandRepository;
	
	//Bütün iş kuralları temiz yazılmalı.
	public void checkIfBrandNameExists(String name) {
		
		if(this.brandRepository.existsByName(name)) {
			throw new BusinessException("Brand already exists"); // Java exception types
		}
		
	}
	
}
