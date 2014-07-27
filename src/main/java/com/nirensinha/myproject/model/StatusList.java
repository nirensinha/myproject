package com.nirensinha.myproject.model;

import java.util.Date;
import java.util.Locale;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.nirensinha.myproject.config.DateFormatter;

@Entity
public class StatusList implements Model{
	
	@Id
	private long id;
	
	private String reportDateString;
	
	@JsonIgnore
	private Date reportDate;
	
	private String oRag;
	
	private String include;
	

	public StatusList(){};
	
	public StatusList(long id, Date reportDate, String oRag, String include){
		this.id = id;
		this.reportDate = reportDate;
		this.oRag = oRag;
		this.include = include;
		this.reportDateString = new DateFormatter().print(this.reportDate);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getReportDateString() {
		return reportDateString;
	}

	public void setReportDateString(String reportDateString) {
		this.reportDateString = reportDateString;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getoRag() {
		return oRag;
	}

	public void setoRag(String oRag) {
		this.oRag = oRag;
	}

	public String getInclude() {
		return include;
	}

	public void setInclude(String include) {
		this.include = include;
	}

}
