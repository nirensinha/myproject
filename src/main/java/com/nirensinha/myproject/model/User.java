package com.nirensinha.myproject.model;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@NamedQuery(name = "User.findByUserName", query = "SELECT u FROM User u WHERE LOWER(u.userName) = LOWER(?1)")
@Table(name="USER")
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	 private long Id;
	
	@Column(name = "USER_NAME", nullable = false)
	 private String userName;
	
	@Column(name = "PASSWORD", nullable = false)
	 private String password;
	 
	@Column(name = "FIRST_NAME", nullable = false)
	 private String firstName;
	 
	@Column(name = "LAST_NAME", nullable = false)
	 private String lastName;
	 
	@Column(name = "FULL_NAME", nullable = false)
	private String fullName;
	 
	@Column(name = "EMAIL_ADDRESS", nullable = false)
	 private String emailAddress;
	 
	@Column(name = "PARENT_ID", nullable =true)
	 private long parentId;
	 
	@Column(name = "ROLE_ID", nullable = false)
	 private String  roleId;
	 
	@Column(name = "CREATED_BY", nullable = false)
	 private long createdBy;
	 
	@Column(name = "CREATED_DATE", nullable = false)
	 private Date createdDate;
	
	@Column(name = "LAST_UPDATED_BY", nullable = false)
	 private long lastUpdatedBy;

	@Column(name = "LAST_UPDATED_DATE", nullable = false)
	 private Date lastUpdatedDate;
	
	public User(){};
	
	public User(String userName, String password, String firstName, String lastName, String fullName, String emailAddress, long parentId, String roleId, long createdBy, long lastUpdatedBy){
		//this.Id= Id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.emailAddress = emailAddress;
		this.parentId = parentId;
		this.roleId = roleId;
		this.createdBy = createdBy;
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
