package com.rentACar.business.responses;

import com.rentACar.business.request.CreateBrandRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBrandsResponse {
	
	private int id;
	private String name;
}
