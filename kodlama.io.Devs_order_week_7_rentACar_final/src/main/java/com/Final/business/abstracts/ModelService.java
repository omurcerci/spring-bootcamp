package com.Final.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Final.business.requests.CreateModelRequest;
import com.Final.business.responses.GetAllModelsResponse;

@Repository
public interface ModelService {

	List<GetAllModelsResponse> getAll();
	
	void add(CreateModelRequest createModelRequest);
}
