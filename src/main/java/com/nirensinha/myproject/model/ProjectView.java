package com.nirensinha.myproject.model;

public class ProjectView{
	
	 private long Id;
	
	 private String name;
	 
	 private String model;
	 
	 private String ppm;
	 
	 private String mer;
	 
	 private String merName;
	 
	 private String projectManager;
	 
	 private String projectSize;
	 
	 private String investmentTheme;
	 
	 private String overallRag;
	 
	 public ProjectView(){};
	 
	 public ProjectView(long Id, String name, String model, String ppm, String mer, String merName, String projectManager, String projectSize, String investmentTheme, String overallRag){
		 this.Id = Id;
		 this.name = name;
		 this.model = model;
		 this.ppm = ppm;
		 this.mer = mer;
		 this.merName = merName;
		 this.projectManager = projectManager;
		 
	 }

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPpm() {
		return ppm;
	}

	public void setPpm(String ppm) {
		this.ppm = ppm;
	}

	public String getMer() {
		return mer;
	}

	public void setMer(String mer) {
		this.mer = mer;
	}

	public String getMerName() {
		return merName;
	}

	public void setMerName(String merName) {
		this.merName = merName;
	}

	public String getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	public String getProjectSize() {
		return projectSize;
	}

	public void setProjectSize(String projectSize) {
		this.projectSize = projectSize;
	}

	public String getInvestmentTheme() {
		return investmentTheme;
	}

	public void setInvestmentTheme(String investmentTheme) {
		this.investmentTheme = investmentTheme;
	}

	public String getOverallRag() {
		return overallRag;
	}

	public void setOverallRag(String overallRag) {
		this.overallRag = overallRag;
	}
	 

}
