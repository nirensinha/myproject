package com.nirensinha.myproject.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nirensinha.myproject.model.KeyAccomplishment;
import com.nirensinha.myproject.model.Model;
import com.nirensinha.myproject.repository.KeyAccomplishmentRepository;

@Service
public class RepositoryKeyAccomplishmentService implements KeyAccomplishmentService{
	
	final String SUCCESS="success";
	
	final String FAILURE="failure";
	
	@Resource
	KeyAccomplishmentRepository repository;

	@Override
	public String delete(Long id) {
		try{
			repository.delete(id);
			return SUCCESS;
		}catch(Exception e){
			return FAILURE;
		}
	}

	@Override
	public List<Model> findAll(Long projectId) {
		return repository.findAll(projectId);
	}

	@Override
	public KeyAccomplishment save(KeyAccomplishment keyAccomplishment) {
		return	repository.save(keyAccomplishment);
	}

	@Override
	public KeyAccomplishment findOne(Long id) {
		return repository.findOne(id);
	}

}
