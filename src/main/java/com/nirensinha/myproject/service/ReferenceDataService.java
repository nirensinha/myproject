package com.nirensinha.myproject.service;

import java.util.List;

import com.nirensinha.myproject.model.Investment;
import com.nirensinha.myproject.model.Phase;
import com.nirensinha.myproject.model.ProjectModel;
import com.nirensinha.myproject.model.RAG;
import com.nirensinha.myproject.model.Role;

public interface ReferenceDataService {
	
   public List<Investment> getInvestment();
   
   public List<Phase> getPhase();
   
   public List<RAG> getRAG();
   
   public List<ProjectModel> getProjectModel();
   
   public List<Role> getRole();


}
