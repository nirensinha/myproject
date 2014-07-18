package com.nirensinha.myproject.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public Map<Long,Investment> getInvestment() {
		List<Investment> list = investmentRepository.findAll();
		Map<Long,Investment> map = new HashMap<Long,Investment>();
		for(Investment i : list){
			map.put(i.getId(), i);
		}
		return map;
	}

	@Override
	@Cacheable(value="phaseCache")
	public Map<Long,Phase> getPhase() {
		List<Phase> list = phaseRepository.findAll();
		Map<Long,Phase> map = new HashMap<Long,Phase>();
		for(Phase p : list){
			map.put(p.getId(), p);
		}
		return map;
	}

	@Override
	@Cacheable(value="ragCache")
	public Map<Long,RAG> getRAG() {
		List<RAG> list = ragRepository.findAll();
		Map<Long,RAG> map = new HashMap<Long,RAG>();
		for(RAG r : list){
			map.put(r.getId(), r);
		}
		return map;
	}

	@Override
	@Cacheable(value="projectModelCache")
	public Map<Long,ProjectModel> getProjectModel() {
		List<ProjectModel> list = projectModelRepository.findAll();
		Map<Long,ProjectModel> map = new HashMap<Long,ProjectModel>();
		for(ProjectModel p : list){
			map.put(p.getId(), p);
		}
		return map;
	}

	@Override
	@Cacheable(value="roleCache")
	public Map<Long,Role> getRole() {
		List<Role> list = roleRepository.findAll();
		Map<Long,Role> map = new HashMap<Long,Role>();
		for(Role r : list){
			map.put(r.getId(), r);
		}
		return map;
	}

	@Override
	@Cacheable(value="projectSizeCache")
	public Map<Long,ProjectSize> getProjectSize() {
		List<ProjectSize> list = projectSizeRepository.findAll();
		Map<Long,ProjectSize> map = new HashMap<Long,ProjectSize>();
		for(ProjectSize p: list){
			map.put(p.getId(), p);
		}
		return map;
	}

}
