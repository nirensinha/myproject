package com.nirensinha.myproject.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirensinha.myproject.model.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
	
	public Status findStatusByProjectIdAndReportDate(long projectId, Date reportDate);

}
