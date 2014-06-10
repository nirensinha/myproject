package com.nirensinha.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProjectController {
	
	private static String VIEW = "view";
	private static String LIST = "list";
	private static String CREATE = "create";
	private static String EDIT = "edit";
	private static String VIEW_NAME = "viewName";
	private static String CREATE_PROJECT = "Create Project";

	
	@RequestMapping(value = "/projects/", method = RequestMethod.GET)
	public String list(ModelMap model) {
		model.addAttribute(VIEW,LIST);
		return "myproject";
	}
	
	@RequestMapping(value = "/projects/create", method = RequestMethod.GET)
	public String create(ModelMap model) {
		model.addAttribute(VIEW,CREATE);
		model.addAttribute(VIEW_NAME,CREATE_PROJECT);
		return "myproject";
	}
	
	@RequestMapping(value = "/projects/create", method = RequestMethod.POST)
	public String post(ModelMap model) {
		model.addAttribute(VIEW,CREATE);
		model.addAttribute(VIEW_NAME,CREATE_PROJECT);
		return "myproject";
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
