package com.nirensinha.myproject.service;

import java.util.List;

import com.nirensinha.myproject.model.Status;

public interface StatusService {
	
	   public Status create(Status status);
		
		public Status delete(Long id);
		
		public List<Status> findAll();
		
	    public Status findById(Long id);

	    public Status save(Status status);
	    
	    public String checkStatus(long projectId, String reportDate);
	    
	    public Status findByProjectIdAndReportDate(long projectId, String reportDate);
}
