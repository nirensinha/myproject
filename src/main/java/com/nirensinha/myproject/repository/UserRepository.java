package com.nirensinha.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirensinha.myproject.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
