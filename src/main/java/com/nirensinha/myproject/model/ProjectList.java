package com.nirensinha.myproject.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProjectList implements Model{
	
	@Id
	private long id;
	
	private String name;
	
	private String ppm;
	
	private String projectManager;
		
	private String investment;
	
	private String RAG;
	
	public ProjectList(){};
	
	public ProjectList(long id, String name, String ppm, String projectManager, String investment, String RAG){
		this.id = id;
		this.name = name;
		this.ppm = ppm;
		this.projectManager = projectManager;
		this.investment = investment;
		this.RAG = RAG;
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	public String getInvestment() {
		return investment;
	}

	public void setInvestment(String investment) {
		this.investment = investment;
	}

	public String getRAG() {
		return RAG;
	}

	public void setRAG(String rAG) {
		RAG = rAG;
	}

	public String getPpm() {
		return ppm;
	}

	public void setPpm(String ppm) {
		this.ppm = ppm;
	}

}
