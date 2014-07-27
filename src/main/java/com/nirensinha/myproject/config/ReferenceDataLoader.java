package com.nirensinha.myproject.config;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import com.nirensinha.myproject.service.ReferenceDataService;

@Component
public class ReferenceDataLoader {
	
	@Resource
	ReferenceDataService referenceDataService;
	
	private static String INVESTMENT = "investment";
	private static String PHASE = "phase";
	private static String PROJECTMODEL = "projectModel";
	private static String PROJECTSIZE = "projectSize";
	private static String RAG = "rag";

	public ModelMap load(ModelMap model){
		model.addAttribute(INVESTMENT,referenceDataService.getInvestment());
		model.addAttribute(PHASE,referenceDataService.getPhase());
		model.addAttribute(PROJECTMODEL,referenceDataService.getProjectModel());
		model.addAttribute(PROJECTSIZE,referenceDataService.getProjectSize());
		model.addAttribute(RAG,referenceDataService.getRAG());
		return model;
	}
}
