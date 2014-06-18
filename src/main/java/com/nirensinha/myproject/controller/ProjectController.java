package com.nirensinha.myproject.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nirensinha.myproject.model.Project;
import com.nirensinha.myproject.service.ProjectService;
import com.nirensinha.myproject.service.ReferenceDataService;

@Controller
public class ProjectController {
	
	private static String VIEW = "view";
	private static String LIST = "list";
	private static String CREATE = "create";
	private static String EDIT = "edit";
	private static String VIEW_NAME = "viewName";
	private static String CREATE_PROJECT = "Create Project";
	private static String PROJECT = "project";
	
	@Resource
	ProjectService service;
	
	@Resource
	ReferenceDataService referenceDataService;

	
	@RequestMapping(value = "/projects/", method = RequestMethod.GET)
	public String list(ModelMap model) {
		model.addAttribute(VIEW,LIST);
		return "myproject";
	}
	
	@RequestMapping(value = "/projects/create", method = RequestMethod.GET)
	public String create(ModelMap model) {
		model.addAttribute(PROJECT, new Project());
		referenceDataService.getInvestment();
		return "createProject";
	}
	
	@RequestMapping(value = "/projects/create", method = RequestMethod.POST)
	public String post(@Valid Project project, BindingResult bindingResult, ModelMap model) {
		model.addAttribute(VIEW,CREATE);
		model.addAttribute(VIEW_NAME,CREATE_PROJECT);
		if (bindingResult.hasErrors()) {
			return "createProject";
		}
		service.create(project);
		return "createProject";
	}
	
	@RequestMapping(value = "/projects/edit", method = RequestMethod.GET)
	public String edit(ModelMap model) {
		model.addAttribute(VIEW,EDIT);
		return "myproject";
	}
	
	@RequestMapping(value = "/projects/all", method = RequestMethod.GET)
	public String listAll(ModelMap model) {
		return "allproject";
	}

}
