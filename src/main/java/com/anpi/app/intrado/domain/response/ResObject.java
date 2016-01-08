package com.anpi.app.intrado.domain.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="VUI")
public class ResObject {
	
    private Payload payload;

	@XmlElement(name="Payload")
	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}

}

