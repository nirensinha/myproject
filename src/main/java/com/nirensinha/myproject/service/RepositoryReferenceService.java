package com.nirensinha.myproject.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


import com.nirensinha.myproject.model.Investment;
import com.nirensinha.myproject.model.Phase;
import com.nirensinha.myproject.model.ProjectModel;
import com.nirensinha.myproject.model.ProjectSize;
import com.nirensinha.myproject.model.RAG;
import com.nirensinha.myproject.model.Role;
import com.nirensinha.myproject.repository.InvestmentRepository;
import com.nirensinha.myproject.repository.PhaseRepository;
import com.nirensinha.myproject.repository.ProjectModelRepository;
import com.nirensinha.myproject.repository.ProjectSizeRepository;
import com.nirensinha.myproject.repository.RAGRepository;
import com.nirensinha.myproject.repository.RoleRepository;

@Service
public class RepositoryReferenceService implements ReferenceDataService {
	
	@Resource
	private InvestmentRepository investmentRepository;
	
	@Resource
	private PhaseRepository phaseRepository;
	
	@Resource
	private ProjectModelRepository projectModelRepository;
	
	@Resource
	private RoleRepository roleRepository;
	
	@Resource
	private RAGRepository ragRepository;
	
	@Resource
	private ProjectSizeRepository projectSizeRepository;

	@Override
	@Cacheable(value="investmentCache")
	public List<Investment> getInvestment() {
		return investmentRepository.findAll();
	}

	@Override
	@Cacheable(value="phaseCache")
	public List<Phase> getPhase() {
		return phaseRepository.findAll();
	}

	@Override
	@Cacheable(value="ragCache")
	public List<RAG> getRAG() {
		return ragRepository.findAll();
	}

	@Override
	@Cacheable(value="projectModelCache")
	public List<ProjectModel> getProjectModel() {
		return projectModelRepository.findAll();
	}

	@Override
	@Cacheable(value="roleCache")
	public List<Role> getRole() {
		return roleRepository.findAll();
	}

	@Override
	@Cacheable(value="projectSizeCache")
	public List<ProjectSize> getProjectSize() {
		return projectSizeRepository.findAll();
	}

}
