package com.anpi.app.broadSoft.domain.response.request;

import javax.xml.bind.annotation.XmlElement;

public class TYS
{
    private String typ;

    @XmlElement(name="TYP")
	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public TYS(String typ) {
		super();
		this.typ = typ;
	}
    
}