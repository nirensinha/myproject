package com.nirensinha.myproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirensinha.myproject.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
	
	public List<Project> findProjectByProjectManager(long projectManager); 

}
