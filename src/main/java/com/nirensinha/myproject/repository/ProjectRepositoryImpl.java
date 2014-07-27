package com.nirensinha.myproject.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.nirensinha.myproject.model.Model;

public class ProjectRepositoryImpl implements ProjectRepositoryCustom{
	
	@Autowired
	EntityManager em;
	
	String sql ="Select new ProjectList(p.id,p.name,p.ppm,p.user.fullName,p.investment.name,p.oRag.name)  from Project p left outer join  p.investment " +
			"left outer join  p.user left outer join  p.size left outer join  p.oRag left outer join  p.projectModel left outer join  p.tRag left outer join  p.iRag left outer join  p.rsRag " +
			"left outer join  p.phase where p.projectManager = :projectManager" ;

	@SuppressWarnings("unchecked")
	@Override
	public List<Model> getProjectListByProjectManager_(long projectManager) {
		  Query query = em.createQuery(sql);
		  query.setParameter("projectManager", projectManager);
		  List<Model> list  =query.getResultList();
		  return list;
	}

}
