package com.nirensinha.myproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NEXT_STEPS")
public class NextSteps implements Model {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	public long id;
	
	public long projectId;
	
	public Date date;
	
	public String nextStepDate;
	
	public String clientImpact;
	
	public String displayInSummary;
	
	public String displayInReports;
	
	public String nextSteps;
	
	public String status;
}
