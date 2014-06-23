package com.nirensinha.myproject.service;

import java.util.List;

import com.nirensinha.myproject.exception.UserNotFoundException;
import com.nirensinha.myproject.model.User;

public interface UserService {

	public User create(User user);
	
	public User delete(Long id) throws UserNotFoundException;
	
	public List<User> findAll();
	
    public User findById(Long id);

    public List<User> searchByFullName(String searchTerm);
    
    public User update(User user) throws UserNotFoundException;


}
