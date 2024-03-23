package com.Final.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.Final.business.abstracts.ModelService;
import com.Final.business.requests.CreateModelRequest;
import com.Final.business.responses.GetAllModelsResponse;
import com.Final.core.utilities.mappers.ModelMapperService;
import com.Final.dataAccess.abstracts.ModelRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService{

	@Autowired
	private ModelRepository modelRepository;
	@Autowired
	private ModelMapperService modelMapperService;
	
	@Override
	public List<GetAllModelsResponse> getAll() {
		List<Model> models = modelRepository.findAll();
		List<GetAllModelsResponse> modelsResponse = models.stream().map(model -> this.modelMapperService.forResponse().map(model, GetAllModelsResponse.class)).collect(Collectors.toList());
		return modelsResponse;
	}

	@Override
	public void add(CreateModelRequest createModelRequest) {
		Model model = this.modelMapperService.forRequest().map(createModelRequest, Model.class);
		this.modelRepository.save(model);
	} 

}
