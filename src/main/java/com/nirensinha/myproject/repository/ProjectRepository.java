package com.nirensinha.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirensinha.myproject.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
