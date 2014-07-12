package com.nirensinha.myproject.controller;

import java.security.Principal;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nirensinha.myproject.exception.ProjectNotFoundException;
import com.nirensinha.myproject.model.Project;
import com.nirensinha.myproject.model.ProjectList;
import com.nirensinha.myproject.service.ProjectService;
import com.nirensinha.myproject.service.ReferenceDataService;
import com.nirensinha.myproject.service.UserService;

@Controller
public class ProjectController {
	
	private static String VIEW = "view";
	private static String LIST = "list";
	private static String CREATE = "create";
	private static String EDIT = "edit";
	private static String PROJECT = "project";
	private static String INVESTMENT = "investment";
	private static String PHASE = "phase";
	private static String PROJECTMODEL = "projectModel";
	private static String PROJECTSIZE = "projectSize";
	private static String RAG = "rag";
	
	
	@Resource
	ProjectService service;
	
	@Resource
	ReferenceDataService referenceDataService;
	
	@Resource
	UserService userService;

	
	@RequestMapping(value = "/project/", method = RequestMethod.GET)
	public String list(ModelMap model) {
		model.addAttribute(VIEW,LIST);
		return "myproject";
	}
	
	@RequestMapping(value = "/project/create", method = RequestMethod.GET)
	public String create(ModelMap model) {
		model.addAttribute(PROJECT, new Project());
		model.addAttribute(VIEW,CREATE);
		loadReferenceData(model);
		return "createProject";
	}
	
	@RequestMapping(value = "/project/create", method = RequestMethod.POST)
	public String post(@Valid Project project, BindingResult bindingResult, ModelMap model) {
		if (bindingResult.hasErrors()) {
			return "createProject";
		}
		service.create(project);
		return "redirect:/project/edit/"+project.getId();
	}
	
	@RequestMapping(value = "/project/edit/{id}", method = RequestMethod.GET)
	public String edit(ModelMap model, @PathVariable long id) {
		model.addAttribute(VIEW,EDIT);
		Project project = service.findById(id);
		model.addAttribute(PROJECT,project);
		loadReferenceData(model);
		return "editProject";
	}
	
	@RequestMapping(value = "/project/save", method = RequestMethod.POST)
	public String save(@Valid Project project, BindingResult bindingResult, ModelMap model) {
		if (!bindingResult.hasErrors()) {
			try {
				service.save(project);
			} catch (ProjectNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		model.addAttribute(VIEW,EDIT);
		loadReferenceData(model);
		return "editProject";
	}
	
	@RequestMapping(value = "/project/all", method = RequestMethod.GET)
	public String listAll(ModelMap model) {
		return "allproject";
	}
	
	@RequestMapping(value = "/project/my", method = RequestMethod.GET)
	public @ResponseBody ProjectList listMy(Principal principal) {
		long projectManager = (userService.findByUsername(principal.getName())).getId();
		ProjectList list = new ProjectList();
		list.setData(service.findMy(projectManager));
		return list;
	}

	private ModelMap loadReferenceData(ModelMap model){
		model.addAttribute(INVESTMENT,referenceDataService.getInvestment());
		model.addAttribute(PHASE,referenceDataService.getPhase());
		model.addAttribute(PROJECTMODEL,referenceDataService.getProjectModel());
		model.addAttribute(PROJECTSIZE,referenceDataService.getProjectSize());
		model.addAttribute(RAG,referenceDataService.getRAG());
		
	
		return model;
	}
}
