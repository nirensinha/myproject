package com.nirensinha.myproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "STATUS" ,uniqueConstraints = {
		@UniqueConstraint(columnNames = "PROJECT_ID"),
		@UniqueConstraint(columnNames = "REPORT_DATE")
		})
public class Status {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	private long id;
	
	@Column(name = "PROJECT_ID", nullable = false)
	private long projectId;
	
	@Transient
	private String projectName;
	
	@Column(name = "REPORT_DATE", nullable = false)
	private Date reportDate;

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

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
}
