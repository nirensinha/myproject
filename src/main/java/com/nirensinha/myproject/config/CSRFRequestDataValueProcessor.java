package com.nirensinha.myproject.config;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.RequestDataValueProcessor;

@Component
public class CSRFRequestDataValueProcessor implements RequestDataValueProcessor{

	@Override
	public String processAction(HttpServletRequest request, String action,
			String httpMethod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String processFormFieldValue(HttpServletRequest request,
			String name, String value, String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getExtraHiddenFields(HttpServletRequest request) {
		 Map<String,String> hiddenFields = new HashMap<String,String>();
		  hiddenFields.put(CSRFTokenManager.CSRF_PARAM_NAME,  CSRFTokenManager.getTokenForSession(request.getSession()));
		return null;
	}

	@Override
	public String processUrl(HttpServletRequest request, String url) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
