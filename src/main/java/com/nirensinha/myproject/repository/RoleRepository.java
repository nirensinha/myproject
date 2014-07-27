package com.nirensinha.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirensinha.myproject.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
