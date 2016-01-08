package com.anpi.app.intrado.domain.response;

import javax.xml.bind.annotation.XmlElement;

public class Payload {
	
	private VuiBeanResponse queryResponse;

	private VuiBeanResponse losResponse;

	private VuiBeanResponse updateResponse;
	
	private ErrorResponse errorResponse; 

	@XmlElement(name = "ALIQueryResponse")
	public VuiBeanResponse getQueryResponse() {
		return queryResponse;
	}

	public void setQueryResponse(VuiBeanResponse queryResponse) {
		this.queryResponse = queryResponse;
	}

	@XmlElement(name = "InfoCheckLevelOfServiceResponse")
	public VuiBeanResponse getLosResponse() {
		return losResponse;
	}

	public void setLosResponse(VuiBeanResponse losResponse) {
		this.losResponse = losResponse;
	}

	@XmlElement(name = "ALIUpdateResponse")
	public VuiBeanResponse getUpdateResponse() {
		return updateResponse;
	}

	public void setUpdateResponse(VuiBeanResponse updateResponse) {
		this.updateResponse = updateResponse;
	}

	@XmlElement(name="ErrorResponse")
	public ErrorResponse getErrorResponse() {
		return errorResponse;
	}

	public void setErrorResponse(ErrorResponse errorResponse) {
		this.errorResponse = errorResponse;
	}
	
	
}
