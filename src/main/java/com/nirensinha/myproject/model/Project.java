package com.nirensinha.myproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.*;

import org.apache.commons.lang.builder.ToStringBuilder;

@Entity
@Table(name="PROJECT")
public class Project {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	 private long Id;
	
	@NotEmpty
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "MODEL", nullable = true)
	private int model;
	
	@NotEmpty
	@Column(name = "PPM", nullable = false)
	private String ppm;
	
	@Column(name = "MER", nullable = true)
	private String mer;
	
	@Column(name = "MER_NAME", nullable = true)
	private String merName;
	
	@Column(name = "BUSINESS_SPONSOR", nullable = true)
	private String businessSponsor;
	
	@Min(1)
	@Column(name = "PROJECT_MANAGER", nullable = false)
	private long projectManager;
	
	@Column(name = "PROJECT_SIZE", nullable = true)
	private String projectSize;
	
	@Column(name = "INVESTMENT_THEME", nullable = true)
	private int investmentTheme;
	
	@Column(name = "OVERALL_RAG", nullable = true)
	private int overallRag;
	
	@Column(name = "TIME_RAG", nullable = true)
	private int timeRag;
	
	@Column(name = "BUDGET_RAG", nullable = true)
	private int budgetRag;
	
	@Column(name = "IMPACT_RISK_RAG", nullable = true)
	private int impactRiskRag;
	
	@Column(name = "RESOURCE_RAG", nullable = true)
	private int resourceRag;
	
	@Column(name = "CURRENT_PHASE", nullable = true)
	private int currentPhase;
	
	@Column(name = "PRIVACY", nullable = true)
	private char privacy;
	
	@Column(name = "OBJECTIVE", nullable = true)
	private String objective;
	
	@Column(name = "ARTIFACT_LINK", nullable = true)
	private String artifactLink;
	
	@Column(name = "FORECAST_AMOUNT", nullable = true)
	private double forecastAmount;
	
	@Column(name = "CREATED_BY", nullable = false)
	 private long createdBy;
	 
	@Column(name = "CREATED_DATE", nullable = false)
	 private Date createdDate;
	
	@Column(name = "LAST_UPDATED_BY", nullable = false)
	 private long lastUpdatedBy;

	@Column(name = "LAST_UPDATED_DATE", nullable = false)
	 private Date lastUpdatedDate;
	
	
	public Project(){}

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

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
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

	public String getBusinessSponsor() {
		return businessSponsor;
	}

	public void setBusinessSponsor(String businessSponsor) {
		this.businessSponsor = businessSponsor;
	}

	public long getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(long projectManager) {
		this.projectManager = projectManager;
	}

	public String getProjectSize() {
		return projectSize;
	}

	public void setProjectSize(String projectSize) {
		this.projectSize = projectSize;
	}

	public int getInvestmentTheme() {
		return investmentTheme;
	}

	public void setInvestmentTheme(int investmentTheme) {
		this.investmentTheme = investmentTheme;
	}

	public int getOverallRag() {
		return overallRag;
	}

	public void setOverallRag(int overallRag) {
		this.overallRag = overallRag;
	}

	public int getTimeRag() {
		return timeRag;
	}

	public void setTimeRag(int timeRag) {
		this.timeRag = timeRag;
	}

	public int getBudgetRag() {
		return budgetRag;
	}

	public void setBudgetRag(int budgetRag) {
		this.budgetRag = budgetRag;
	}

	public int getImpactRiskRag() {
		return impactRiskRag;
	}

	public void setImpactRiskRag(int impactRiskRag) {
		this.impactRiskRag = impactRiskRag;
	}

	public int getResourceRag() {
		return resourceRag;
	}

	public void setResourceRag(int resourceRag) {
		this.resourceRag = resourceRag;
	}

	public int getCurrentPhase() {
		return currentPhase;
	}

	public void setCurrentPhase(int currentPhase) {
		this.currentPhase = currentPhase;
	}

	public char getPrivacy() {
		return privacy;
	}

	public void setPrivacy(char privacy) {
		this.privacy = privacy;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getArtifactLink() {
		return artifactLink;
	}

	public void setArtifactLink(String artifactLink) {
		this.artifactLink = artifactLink;
	}

	public double getForecastAmount() {
		return forecastAmount;
	}

	public void setForecastAmount(double forecastAmount) {
		this.forecastAmount = forecastAmount;
	}

	public long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public long getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(long lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	};
	
	@PreUpdate
	  public void preUpdate() {
	        lastUpdatedDate = new Date();
	        lastUpdatedBy=0;
	    }
	 
	  @PrePersist
	    public void prePersist() {
	        Date now = new Date();
	        createdDate = now;
	        lastUpdatedDate = now;
	        createdBy = 0;
	        lastUpdatedBy =0;
	    }

	  @Override
	    public String toString() {
	        return ToStringBuilder.reflectionToString(this);
	    }


}
