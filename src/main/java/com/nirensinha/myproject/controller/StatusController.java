package com.nirensinha.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nirensinha.myproject.model.Status;

@Controller
public class StatusController {
	
	private static String STATUS = "status";
	
	@RequestMapping(value = "/status/{projectName}/{projectId}", method = RequestMethod.GET)
	public String getStatus(ModelMap model, @PathVariable String projectName, @PathVariable long projectId) {
		Status status = new Status();
		status.setProjectId(projectId);
		status.setProjectName(projectName);
		model.addAttribute(STATUS,status);
		return  "createStatus";
	}
	
	@RequestMapping(value = "/status", method = RequestMethod.POST)
	public String saveStatus() {
		return  "createStatus";
	}

}
