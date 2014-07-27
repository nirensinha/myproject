package com.nirensinha.myproject.service;

import java.util.List;

import com.nirensinha.myproject.model.KeyAccomplishment;
import com.nirensinha.myproject.model.Model;

public interface KeyAccomplishmentService {
	
	public String delete(Long id);
	
	public List<Model> findAll(Long projectId);
	
	public KeyAccomplishment findOne(Long id);
	
	public KeyAccomplishment save(KeyAccomplishment keyAccomplishment);

}
