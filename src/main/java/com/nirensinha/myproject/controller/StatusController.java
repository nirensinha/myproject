package com.nirensinha.myproject.controller;

import java.text.SimpleDateFormat;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nirensinha.myproject.model.Data;
import com.nirensinha.myproject.model.Project;
import com.nirensinha.myproject.model.Status;
import com.nirensinha.myproject.service.ProjectService;
import com.nirensinha.myproject.service.ReferenceDataService;
import com.nirensinha.myproject.service.StatusService;

@Controller
public class StatusController {
	
	private static String STATUS = "status";
	private static String PROJECT = "project";
	private static String PROJECT_ID = "projectId";

	SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyy");
	SimpleDateFormat sdf_ = new SimpleDateFormat("MM/dd/yyyy");

	
	@Resource
	StatusService service;
	
	@Resource
	ProjectService projectService;
	
	@Resource
	ReferenceDataService referenceDataService;
	
	
	@RequestMapping(value = "/status/{projectName}/{projectId}", method = RequestMethod.GET)
	public String getStatus(ModelMap model, @PathVariable String projectName, @PathVariable long projectId) {
		Status status = new Status();
		status.setProjectId(projectId);
		status.setProjectName(projectName);
		model.addAttribute(STATUS,status);
		return  "createStatus";
	}
	
	@RequestMapping(value = "/status/edit", method = RequestMethod.POST)
	public String saveStatus(Status status) {
		service.save(status);
		String reportDate = sdf.format(status.getReportDate());
		return  "redirect:/status/edit/"+status.getProjectId()+"/"+reportDate;
	}
	
	@RequestMapping(value="/status/view/{projectId}", method=RequestMethod.GET)
	public String viewStatus(@PathVariable long projectId,ModelMap model){
		model.addAttribute(PROJECT_ID, projectId);
		return "viewStatus";		
	}
	
	@RequestMapping(value="/status/list/{projectId}", method=RequestMethod.GET)
	public @ResponseBody Data listStatus(@PathVariable long projectId){
		Data data = new Data();
		data.setData(service.getStatusByProject(projectId));
		return data;
	}
	
	@RequestMapping(value = "/status/edit/{projectId}/{reportDate}", method = RequestMethod.GET)
	public String saveStatus(@PathVariable long projectId, @PathVariable String reportDate,ModelMap model) {
		if(!model.containsAttribute(STATUS)){
			Status status =  service.findByProjectIdAndReportDate(projectId, reportDate);
			status.setReportDateString(sdf_.format(status.getReportDate()));
			model.addAttribute(STATUS,status);
		}
		Project project = projectService.findById(projectId);
		model.addAttribute(PROJECT,project);
		return  "editStatus";
	}
	
	
	@RequestMapping(value = "/findStatus/{projectId}/{reportDate}", method = RequestMethod.GET)
	public @ResponseBody String findStatus(@PathVariable long projectId, @PathVariable String reportDate) {
		return service.checkStatus(projectId, reportDate);
	}

}
