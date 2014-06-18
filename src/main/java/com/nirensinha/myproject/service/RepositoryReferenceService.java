package com.nirensinha.myproject.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.nirensinha.myproject.model.Investment;
import com.nirensinha.myproject.model.Phase;
import com.nirensinha.myproject.model.ProjectModel;
import com.nirensinha.myproject.model.RAG;
import com.nirensinha.myproject.model.Role;
import com.nirensinha.myproject.repository.InvestmentRepository;
import com.nirensinha.myproject.repository.PhaseRepository;
import com.nirensinha.myproject.repository.ProjectModelRepository;
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

	@Override
	public List<Investment> getInvestment() {
		return investmentRepository.findAll();
	}

	@Override
	public List<Phase> getPhase() {
		return phaseRepository.findAll();
	}

	@Override
	public List<RAG> getRAG() {
		return ragRepository.findAll();
	}

	@Override
	public List<ProjectModel> getProjectModel() {
		return projectModelRepository.findAll();
	}

	@Override
	public List<Role> getRole() {
		return roleRepository.findAll();
	}

}
