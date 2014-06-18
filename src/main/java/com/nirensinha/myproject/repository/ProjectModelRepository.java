package com.nirensinha.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirensinha.myproject.model.ProjectModel;

public interface ProjectModelRepository extends JpaRepository<ProjectModel, Long> {

}
