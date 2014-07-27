package com.nirensinha.myproject.controller;

import java.security.Principal;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nirensinha.myproject.model.Data;
import com.nirensinha.myproject.model.KeyAccomplishment;
import com.nirensinha.myproject.service.KeyAccomplishmentService;

@Controller
public class KeyAccomplishmentController {
	
	@Resource
	KeyAccomplishmentService service;
	
	final String ACCOMPLISHMENTS = "accomplishments";
	
	
	@RequestMapping(value="/keyaccomplishment/list/{projectId}", method=RequestMethod.GET)
	public @ResponseBody Data get(@PathVariable("projectId") long projectId){
		Data data = new Data();
		data.setData(service.findAll(projectId));
		return data;
	}
	
	@RequestMapping(value="/keyaccomplishment/edit/{id}", method=RequestMethod.GET)
	public String edit(ModelMap map, @PathVariable("id") long id){
		KeyAccomplishment keyAccomplishment = service.findOne(id);
		map.addAttribute(ACCOMPLISHMENTS, keyAccomplishment);
		return "accomplishments";
	}
	
	@RequestMapping(value="/keyaccomplishment/delete/{id}", method=RequestMethod.POST)
	public String delete(@PathVariable("id") long id){
		return service.delete(id);
	}

	@RequestMapping(value="/keyaccomplishment/{projectId}", method=RequestMethod.GET)
	public String create(ModelMap map, @PathVariable("projectId") long projectId){
		KeyAccomplishment keyAccomplishment = new KeyAccomplishment();
		keyAccomplishment.setProjectId(projectId);
		map.addAttribute(ACCOMPLISHMENTS, keyAccomplishment);
		return "accomplishments";
	}
	
	@RequestMapping(value="/keyaccomplishment/save", method=RequestMethod.POST)
	public @ResponseBody KeyAccomplishment save(@Valid KeyAccomplishment keyAccomplishment,Principal principal){
		keyAccomplishment.setUser(principal);
		 return service.save(keyAccomplishment);
	}
}
