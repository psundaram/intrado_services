package com.anpi.app.intrado.domain.response;

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

	@Override
	public String toString() {
		return "TYS [typ=" + typ + "]";
	}

	
}