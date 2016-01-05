package com.anpi.app.broadSoft.domain.response.request;

import javax.xml.bind.annotation.XmlElement;

public class HDR
{
    private String rec;
    
    private String acct;
    
    private String clientVersion;

    @XmlElement(name="REC")
    public String getRec ()
    {
        return rec;
    }

    public void setRec (String rec)
    {
        this.rec = rec;
    }

    @XmlElement(name="ClientVersion")
	public String getClientVersion() {
		return clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}

	@XmlElement(name="Acct")
	public String getAcct() {
		return acct;
	}

	public void setAcct(String acct) {
		this.acct = acct;
	}

	public HDR(String rec, String acct, String clientVersion) {
		super();
		this.rec = rec;
		this.acct = acct;
		this.clientVersion = clientVersion;
	}
	
	
}