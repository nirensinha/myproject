package com.nirensinha.myproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nirensinha.myproject.model.KeyAccomplishment;
import com.nirensinha.myproject.model.Model;

public interface KeyAccomplishmentRepository extends JpaRepository<KeyAccomplishment,Long>{
	
	@Query("Select k from KeyAccomplishment k where k.projectId = :projectId")
	public List<Model> findAll(@Param("projectId") long projectId);

}
