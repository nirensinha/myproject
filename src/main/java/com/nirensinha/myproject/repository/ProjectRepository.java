package com.nirensinha.myproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nirensinha.myproject.model.Model;
import com.nirensinha.myproject.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{
	
	
	@Query("Select new ProjectList(p.id,p.name,p.ppm,p.user.fullName,p.investment.name,p.oRag.name)  from Project p left outer join  p.investment " +
			"left outer join  p.user left outer join  p.size left outer join  p.oRag left outer join  p.projectModel left outer join  p.tRag left outer join  p.iRag left outer join  p.rsRag " +
			"left outer join  p.phase where p.projectManager = :projectManager")
	public List<Model> getProjectListByProjectManager(@Param("projectManager") long projectManager);
	
	@Query("Select p from Project p left outer join fetch p.investment where p.id in :ids")
	public List<Project> findProjectByIds(@Param("ids") List<Long> Id);

}
