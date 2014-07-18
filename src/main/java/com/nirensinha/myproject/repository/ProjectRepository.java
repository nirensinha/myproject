package com.nirensinha.myproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nirensinha.myproject.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{
	
	@Query("Select p from Project p left outer join fetch p.investment " +
			"left outer join fetch p.user left outer join fetch p.size left outer join fetch p.oRag left outer join fetch p.projectModel left outer join fetch p.tRag left outer join fetch p.iRag left outer join fetch p.rsRag " +
			"left outer join fetch p.phase where p.projectManager = :projectManager")
	public List<Project> findProjectIDByProjectManager(@Param("projectManager") long projectManager);
	
	@Query("Select p from Project p left outer join fetch p.investment where p.id in :ids")
	public List<Project> findProjectByIds(@Param("ids") List<Long> Id);

}
