package com.anpi.app.intrado.domain.request;

import javax.xml.bind.annotation.XmlElement;

public class TRL
{
    private String rec;

    @XmlElement(name="REC")
	public String getRec() {
		return rec;
	}

	public void setRec(String rec) {
		this.rec = rec;
	}

	public TRL(String rec) {
		super();
		this.rec = rec;
	}

}
			
	