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

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="ROLE")
public class Role{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	private long id;
	
	@NotEmpty
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "CREATED_BY")
	private long createdBy;
	
	@Column(name = "CREATED_DATE")
	private Date createdDate;
	
	@Column(name = "LAST_UPDATED_BY")
	private long lastUpdatedBy;
	
	@Column(name = "LAST_UPDATED_DATE")
	private Date lastUpdatedDate;

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
	}
	
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
