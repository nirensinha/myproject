package com.nirensinha.myproject.service;

import java.util.List;

import com.nirensinha.myproject.exception.ProjectNotFoundException;
import com.nirensinha.myproject.model.Project;

public interface ProjectService {
	
   public Project create(Project project);
	
	public Project delete(Long id) throws ProjectNotFoundException;
	
	public List<Project> findAll();
	
    public Project findById(Long id);

    public List<Project> search(String searchTerm);
    
    public Project save(Project project) throws ProjectNotFoundException;


}
