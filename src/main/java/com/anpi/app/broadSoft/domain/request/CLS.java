package com.anpi.app.broadSoft.domain.request;

import javax.xml.bind.annotation.XmlElement;

public class CLS
{
    private String typ;

    @XmlElement(name="TYP")
	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public CLS(String typ) {
		super();
		this.typ = typ;
	}
}
	