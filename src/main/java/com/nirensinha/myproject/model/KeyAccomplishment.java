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
import javax.persistence.Transient;

import com.nirensinha.myproject.config.DateFormatter;

@Entity
@Table(name="PROJECT_ACCOMPLISHMENTS")
public class KeyAccomplishment extends BaseModel implements Model {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	private long id;

	@Column(name = "PROJECT_ID", nullable = false)
	private long projectId;

	@Column(name = "DATE", nullable = true)
	private Date date;

	@Column(name = "DISPLAY_IN_REPORTS", nullable = true)
	private String displayInReports;

	@Column(name = "DISPLAY_IN_SUMMARY", nullable = true)
	private String displayInSummary;
	
	@Column(name = "ACCOMPLISHMENTS", nullable = true)
	private String accomplishments;
	
	@Column(name = "CREATED_BY" , nullable = false)
	protected String createdBy;
	
	@Column(name = "CREATED_DATE" , nullable = false)
	protected Date createdDate;
	
	@Column(name = "LAST_UPDATED_BY" , nullable = false)
	protected String lastUpdatedBy;
	
	@Column(name = "LAST_UPDATED_DATE" , nullable = false)
	protected Date lastUpdatedDate;
	
	@Transient
	private String accomplishmentDate;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDisplayInReports() {
		return displayInReports;
	}

	public void setDisplayInReports(String displayInReports) {
		this.displayInReports = displayInReports;
	}

	public String getDisplayInSummary() {
		return displayInSummary;
	}

	public void setDisplayInSummary(String displayInSummary) {
		this.displayInSummary = displayInSummary;
	}

	public String getAccomplishments() {
		return accomplishments;
	}

	public void setAccomplishments(String accomplishments) {
		this.accomplishments = accomplishments;
	}

	public String getAccomplishmentDate() {
		accomplishmentDate = new DateFormatter().print(this.date);
		return accomplishmentDate;
	}

	public void setAccomplishmentDate(String accomplishmentDate) {
		this.accomplishmentDate = accomplishmentDate;
	}

	@PreUpdate
	  public void preUpdate() {
	        lastUpdatedDate = new Date();
	        lastUpdatedBy = user;
	    }
	 
	  @PrePersist
	    public void prePersist() {
	        Date now = new Date();
	        createdDate = now;
	        lastUpdatedDate = now;
	        lastUpdatedBy = user;
	        createdBy = user;
	    }

}
