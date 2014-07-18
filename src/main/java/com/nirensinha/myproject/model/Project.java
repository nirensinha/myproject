package com.nirensinha.myproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="PROJECT")
public class Project {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	 private long id;
	
	@NotEmpty
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "MODEL", nullable = true)
	private int model;
	
	@OneToOne
	@JoinColumn(name="MODEL",referencedColumnName="ID", insertable=false, updatable=false)
	private ProjectModel projectModel;
	
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
	
	@OneToOne
	@JoinColumn(name="PROJECT_MANAGER",referencedColumnName="ID", insertable=false, updatable=false)
	private User user;
	
	@Column(name = "PROJECT_SIZE", nullable = true)
	private String projectSize;
	
	@OneToOne
	@JoinColumn(name="PROJECT_SIZE",referencedColumnName="ID", insertable=false, updatable=false)
	private ProjectSize size;
	
	@Column(name = "INVESTMENT_THEME", nullable = true)
	private long investmentTheme;
	
	@OneToOne
	@JoinColumn(name="INVESTMENT_THEME",referencedColumnName="ID", insertable=false, updatable=false)
	private Investment investment;
	
	@Column(name = "OVERALL_RAG", nullable = true)
	private int overallRag;
	
	@OneToOne
	@JoinColumn(name="OVERALL_RAG",referencedColumnName="ID", insertable=false, updatable=false)
	private RAG oRag;
	
	@Column(name = "TIME_RAG", nullable = true)
	private int timeRag;
	
	@OneToOne
	@JoinColumn(name="TIME_RAG",referencedColumnName="ID", insertable=false, updatable=false)
	private RAG tRag;
	
	@Column(name = "BUDGET_RAG", nullable = true)
	private int budgetRag;
	
	@OneToOne
	@JoinColumn(name="BUDGET_RAG",referencedColumnName="ID", insertable=false, updatable=false)
	private RAG bRag;
	
	@Column(name = "IMPACT_RISK_RAG", nullable = true)
	private int impactRiskRag;
	
	@OneToOne
	@JoinColumn(name="IMPACT_RISK_RAG",referencedColumnName="ID", insertable=false, updatable=false)
	private RAG iRag;
	
	@Column(name = "RESOURCE_RAG", nullable = true)
	private int resourceRag;
	
	@OneToOne
	@JoinColumn(name="RESOURCE_RAG",referencedColumnName="ID", insertable=false, updatable=false)
	private RAG rsRag;
	
	@Column(name = "CURRENT_PHASE", nullable = true)
	private int currentPhase;
	
	@OneToOne
	@JoinColumn(name="CURRENT_PHASE",referencedColumnName="ID", insertable=false, updatable=false)
	private Phase phase;
	
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

	public long getInvestmentTheme() {
		return investmentTheme;
	}

	public void setInvestmentTheme(long investmentTheme) {
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

	public Investment getInvestment() {
		return investment;
	}

	public void setInvestment(Investment investment) {
		this.investment = investment;
	}
}
