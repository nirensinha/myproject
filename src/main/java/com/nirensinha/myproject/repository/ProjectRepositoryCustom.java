package com.nirensinha.myproject.repository;

import java.util.List;

import com.nirensinha.myproject.model.Model;

public interface ProjectRepositoryCustom {
	
	public List<Model> getProjectListByProjectManager_(long projectManager);

}
