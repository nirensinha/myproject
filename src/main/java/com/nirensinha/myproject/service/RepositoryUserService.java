package com.nirensinha.myproject.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.nirensinha.myproject.exception.UserNotFoundException;
import com.nirensinha.myproject.model.User;
import com.nirensinha.myproject.repository.UserRepository;

@Service
public class RepositoryUserService implements UserService{
	
	@Resource
	private UserRepository userRepository;

	@Override
	@Transactional
	public User create(User user) {
		return userRepository.save(user);
	}

	@Override
	public User delete(Long id) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> search(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User user) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	 protected void setUserRepository(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

}
