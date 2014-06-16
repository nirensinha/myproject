package com.nirensinha.myproject.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nirensinha.myproject.model.User;
import com.nirensinha.myproject.service.UserService;

@Controller
public class UserController {
	
	@Resource
	UserService service;
	
	private static final String USER_NAME = "xbbkrhl";
    private static final String FIRST_NAME = "Niren";
    private static final String LAST_NAME = "Sinha";
    private static final String FULL_NAME = "Niren Sinha";
    private static final String EMAIL_ADDRESS = "niren.sinha@gmail.com";
    private static final Long PARENT_ID = Long.valueOf(3);
    private static final int ROLE_ID = 2;
	private static final Long CREATED_BY = Long.valueOf(5);
	private static final Long LAST_UPDATED_BY = Long.valueOf(5);
	
	@RequestMapping(value = "/create/user", method = RequestMethod.GET)
	public String index(ModelMap model) {
    	User user = new User(USER_NAME,FIRST_NAME,LAST_NAME,FULL_NAME,EMAIL_ADDRESS,PARENT_ID,ROLE_ID,CREATED_BY,LAST_UPDATED_BY);
    	service.create(user);
		return "dashboard";
	}
	
	@RequestMapping(value = "/user/byFullName/{searchTerm}", method = RequestMethod.GET)
	public @ResponseBody List<User> index(@PathVariable String searchTerm) {
		return service.searchByFullName(searchTerm.toLowerCase());
	}

}
