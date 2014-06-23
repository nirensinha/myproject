package com.nirensinha.myproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirensinha.myproject.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public List<User> findByFullNameStartingWithIgnoreCase(String searchTerm) ;
	
	public User findByUserName(String username);

}
