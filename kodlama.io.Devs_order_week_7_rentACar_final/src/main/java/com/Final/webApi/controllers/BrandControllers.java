package com.Final.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Final.business.abstracts.BrandService;
import com.Final.business.requests.CreateBrandRequest;
import com.Final.business.requests.UpdateBrandRequest;
import com.Final.business.responses.GetAllBrandResponse;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandControllers {

	private BrandService brandService;
	
	@GetMapping()
	public List<GetAllBrandResponse> getAll(){
		return brandService.getAll();
	}
	
	@GetMapping("/{id}")
	public com.Final.business.responses.GetByIdBrandResponse getById(@PathVariable int id) {
		return brandService.getById(id);
	}
	
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
	}
	
	@PutMapping()
	public void update(@RequestBody UpdateBrandRequest updateBrandRequest) {
		this.brandService.update(updateBrandRequest);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.brandService.delete(id);
	}
	
}
