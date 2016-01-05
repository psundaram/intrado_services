package com.anpi.app.broadSoft.domain.request;

import javax.xml.bind.annotation.XmlElement;

public class Payload {
	
	private VuiBean queryData;
	private VuiBean infoCheckLevelOfService;
	private VuiBean updateRequest;
	
	
	@XmlElement(name="ALIQueryRequest")
	public VuiBean getQueryData() {
		return queryData;
	}

	public void setQueryData(VuiBean queryData) {
		this.queryData = queryData;
	}

	@XmlElement(name="InfoCheckLevelOfServiceRequest")
	public VuiBean getInfoCheckLevelOfService() {
		return infoCheckLevelOfService;
	}

	public void setInfoCheckLevelOfService(VuiBean infoCheckLevelOfService) {
		this.infoCheckLevelOfService = infoCheckLevelOfService;
	}

	@XmlElement(name="ALIUpdateRequest")
	public VuiBean getUpdateRequest() {
		return updateRequest;
	}

	public void setUpdateRequest(VuiBean updateRequest) {
		this.updateRequest = updateRequest;
	}

	
}
