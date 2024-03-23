package com.Final.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Final.business.abstracts.ModelService;
import com.Final.business.requests.CreateModelRequest;
import com.Final.business.responses.GetAllModelsResponse;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor

public class ModelsController {
	private ModelService modelService;
	
	@GetMapping()
	public List<GetAllModelsResponse> getall() {
		return modelService.getAll();
	}
	
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody() CreateModelRequest createModelRequest) {
		this.modelService.add(createModelRequest);
	}
}

