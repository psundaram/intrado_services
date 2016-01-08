package com.anpi.app.intrado.domain.request;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="VUI")
public class ReqObject {
	
	private HDR hdr;

    private Payload Payload;

    private TRL trl;

    private String ver = "1.0";

    @XmlElement(name="HDR")
    public HDR getHdr ()
    {
        return hdr;
    }

    public void setHdr (HDR hdr)
    {
        this.hdr = hdr;
    }

	@XmlElement(name="Payload")
    public Payload getPayload ()
    {
        return Payload;
    }

    public void setPayload (Payload Payload)
    {
        this.Payload = Payload;
    }

    @XmlElement(name="TRL")
    public TRL getTrl ()
    {
        return trl;
    }

    public void setTrl (TRL trl)
    {
        this.trl = trl;
    }

    @XmlAttribute(name="ver")
    public String getVer ()
    {
        return ver;
    }

    public void setVer (String ver)
    {
        this.ver = ver;
    }
	
}
