package com.anpi.app.intrado.domain.response;

import javax.xml.bind.annotation.XmlTransient;

public class ErrorResponse {

	private RC1 rc1;

	 @XmlTransient
	 private String message;

	 
	public RC1 getRc1() {
		return rc1;
	}

	public void setRc1(RC1 rc1) {
		this.rc1 = rc1;
	}

	public String getMessage() {
		this.message = this.rc1.getMessage();
		System.out.println("message:"+message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
