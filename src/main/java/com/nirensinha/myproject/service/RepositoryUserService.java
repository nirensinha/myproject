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
		return userRepository.findAll();
	}

	@Override
	public User findById(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public List<User> searchByFullName(String searchTerm) {
		return userRepository.findByFullNameStartingWithIgnoreCase(searchTerm);
	}

	@Override
	public User update(User user) throws UserNotFoundException {
		return userRepository.save(user);
	}
	
	 protected void setUserRepository(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

}
