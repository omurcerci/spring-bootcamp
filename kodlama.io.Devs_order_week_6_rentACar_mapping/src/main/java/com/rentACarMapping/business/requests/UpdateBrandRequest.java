package com.rentACarMapping.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UpdateBrandRequest {
	
	private int id;
	private int name;
	
}
