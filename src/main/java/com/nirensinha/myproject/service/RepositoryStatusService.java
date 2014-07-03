package com.nirensinha.myproject.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.nirensinha.myproject.model.Status;
import com.nirensinha.myproject.repository.StatusRepository;

@Service
public class RepositoryStatusService implements StatusService{
	
	@Resource
	private StatusRepository statusRepository;

	@Override
	@Transactional
	public Status create(Status status) {
		return statusRepository.save(status);
	}

	@Override
	public Status delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Status> findAll() {
		return statusRepository.findAll();
	}

	@Override
	public Status findById(Long id) {
		return statusRepository.findOne(id);
	}

	@Override
	public Status save(Status status) {
		return statusRepository.save(status);
	}

}
