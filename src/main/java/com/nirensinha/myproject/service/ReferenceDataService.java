package com.nirensinha.myproject.service;

import java.util.Map;

import com.nirensinha.myproject.model.Investment;
import com.nirensinha.myproject.model.Phase;
import com.nirensinha.myproject.model.ProjectModel;
import com.nirensinha.myproject.model.ProjectSize;
import com.nirensinha.myproject.model.RAG;
import com.nirensinha.myproject.model.Role;

public interface ReferenceDataService {
	
   public Map<Long,Investment> getInvestment();
   
   public Map<Long,Phase> getPhase();
   
   public Map<Long,RAG> getRAG();
   
   public Map<Long,ProjectModel> getProjectModel();
   
   public Map<Long,Role> getRole();
   
   public Map<Long,ProjectSize> getProjectSize();


}
