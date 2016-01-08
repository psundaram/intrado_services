package com.anpi.app.intrado.domain.response;

import java.util.Map;

public class SystemResponse {
	
	private Map<String, Object> attributeMap;
	
	private String redirectPage;

	public Map<String, Object> getAttributeMap() {
		return attributeMap;
	}

	public void setAttributeMap(Map<String, Object> attributeMap) {
		this.attributeMap = attributeMap;
	}

	public String getRedirectPage() {
		return redirectPage;
	}

	public void setRedirectPage(String redirectPage) {
		this.redirectPage = redirectPage;
	}
	

}
