package com.nirensinha.myproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nirensinha.myproject.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query("SELECT u FROM User u WHERE LOWER(u.fullName) like  %:searchTerm%")
	public List<User> searchByFullName(String searchTerm) ;

}
