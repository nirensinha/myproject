package com.nirensinha.myproject.model;

import java.security.Principal;
import java.util.Date;

public class BaseModel {
	
	protected String user;
	
	protected String createdBy;
	
	protected Date createdDate;
	
	protected String lastUpdatedBy;
	
	protected Date lastUpdatedDate;
	
	
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	
	
	public String getUser() {
		return user;
	}

	public void setUser(Principal principal) {
		this.user = principal.getName();
	}
	


}
