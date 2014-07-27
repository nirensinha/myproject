package com.nirensinha.myproject.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nirensinha.myproject.model.Model;
import com.nirensinha.myproject.model.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
	
	public Status findStatusByProjectIdAndReportDate(long projectId, Date reportDate);
	
	@Query("Select new StatusList(s.projectId, s.reportDate, p.oRag.name, s.include) from Status s, Project p where s.projectId = p.id and s.projectId = :projectId")
	public List<Model> getStatusListByProjectId(@Param("projectId") long projectId);

}
