package com.nirensinha.myproject.service;

import java.util.Collections;

import javax.annotation.Resource;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nirensinha.myproject.model.User;
import com.nirensinha.myproject.repository.UserRepository;

@Service
public class RepositoryAuthenticationService implements AuthenticationService{
	
	@Resource
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		User user = userRepository.findByUserName(username);
		if(user == null) {
			throw new UsernameNotFoundException("User does not exists");
		}
		return createUser(user);
	}

	private org.springframework.security.core.userdetails.User createUser(User user) {
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), Collections.singleton(createAuthority(user)));
	}
	
	private GrantedAuthority createAuthority(User user) {
		return new SimpleGrantedAuthority(user.getRoleId());
	}
}
