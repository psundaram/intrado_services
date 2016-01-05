package com.anpi.app.broadSoft.domain.response.request;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

public class VuiBean {

	private String ver = "1.0";
	
	private String FOC;
	
	private String STA;

    private String ZIP;

    private String HNO;

    private String STN;

    private String MCN;

    private String LOC;
    
    private String POD;
    
    private String NAM;
    
    private String CLT;
    
    private String TYT;
    
    private String EXC;
    	
    private String ESN;
    
    private String ORD;
    
    private String CPD;
    
    private String COI;
    
    private String CPF;
    
    private String CUS;
    
    private String TAR;
    
    private String ExternalKey;
    
    private String ExternalKeyType;
    
    private String subscriberID;
    
    private String CPN;

    private CLS CLS;
    
    private TYS TYS;
    
	@XmlAttribute(name = "ver")
	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	@XmlAttribute(name="FOC")
	public String getFOC() {
		return FOC;
	}

	public void setFOC(String fOC) {
		FOC = fOC;
	}

	public String getSTA() {
		return STA;
	}

	public void setSTA(String sTA) {
		STA = sTA;
	}

	public String getZIP() {
		return ZIP;
	}

	public void setZIP(String zIP) {
		ZIP = zIP;
	}

	public String getHNO() {
		return HNO;
	}

	public void setHNO(String hNO) {
		HNO = hNO;
	}

	public String getSTN() {
		return STN;
	}

	public void setSTN(String sTN) {
		STN = sTN;
	}

	public String getMCN() {
		return MCN;
	}

	public void setMCN(String mCN) {
		MCN = mCN;
	}

	public String getLOC() {
		return LOC;
	}

	public void setLOC(String lOC) {
		LOC = lOC;
	}

	public String getPOD() {
		return POD;
	}

	public void setPOD(String pOD) {
		POD = pOD;
	}

	public String getNAM() {
		return NAM;
	}

	public void setNAM(String nAM) {
		NAM = nAM;
	}

	@XmlTransient
	public String getCLT() {
		return CLT;
	}

	public void setCLT(String cLT) {
		CLT = cLT;
	}

	@XmlTransient
	public String getTYT() {
		return TYT;
	}

	public void setTYT(String tYT) {
		TYT = tYT;
	}

	public String getEXC() {
		return EXC;
	}

	public void setEXC(String eXC) {
		EXC = eXC;
	}

	public String getESN() {
		return ESN;
	}

	public void setESN(String eSN) {
		ESN = eSN;
	}

	public String getORD() {
		return ORD;
	}

	public void setORD(String oRD) {
		ORD = oRD;
	}

	public String getCPD() {
		return CPD;
	}

	public void setCPD(String cPD) {
		CPD = cPD;
	}

	public String getCOI() {
		return COI;
	}

	public void setCOI(String cOI) {
		COI = cOI;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getCUS() {
		return CUS;
	}

	public void setCUS(String cUS) {
		CUS = cUS;
	}

	public String getTAR() {
		return TAR;
	}

	public void setTAR(String tAR) {
		TAR = tAR;
	}

	@XmlTransient
	public String getExternalKey() {
		return ExternalKey;
	}

	public void setExternalKey(String externalKey) {
		ExternalKey = externalKey;
	}

	@XmlTransient
	public String getExternalKeyType() {
		return ExternalKeyType;
	}

	public void setExternalKeyType(String externalKeyType) {
		ExternalKeyType = externalKeyType;
	}

	@XmlElement(name="SubscriberID")
	public String getSubscriberID() {
		return subscriberID;
	}

	public void setSubscriberID(String subscriberID) {
		this.subscriberID = subscriberID;
	}

	public String getCPN() {
		return CPN;
	}

	public void setCPN(String cPN) {
		CPN = cPN;
	}

	public CLS getCLS() {
		return CLS;
	}

	public void setCLS(CLS cLS) {
		CLS = cLS;
	}

	public TYS getTYS() {
		return TYS;
	}

	public void setTYS(TYS tYS) {
		TYS = tYS;
	}
	
}
