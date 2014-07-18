package com.nirensinha.myproject.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nirensinha.myproject.exception.ProjectNotFoundException;
import com.nirensinha.myproject.model.Project;
import com.nirensinha.myproject.repository.ProjectRepository;

@Service
public class RepositoryProjectService implements ProjectService {
	
	@Resource
	private ProjectRepository projectRepository;

	@Override
	public Project create(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public Project delete(Long id) throws ProjectNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project findById(Long id) {
		return projectRepository.findOne(id);
	}

	@Override
	public List<Project> search(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project save(Project project) throws ProjectNotFoundException {
		return projectRepository.save(project);
	}

	@Override
	public List<Project> findMy(long projectManager) {
		 return projectRepository.findProjectIDByProjectManager(projectManager);
		// return projectRepository.findProjectByIds(ids);
	}

}
