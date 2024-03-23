package com.Final.business.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModelRequest {
	@NotBlank
	@NotNull
	private String name;
	
	@NotNull // Validation constraints list araştırabilirsin.
	@NotBlank
	@Size(min = 2 , max = 20)
	private int brandId;
}
