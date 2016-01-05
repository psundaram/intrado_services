package com.anpi.app.broadSoft.domain.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

public class VuiBeanResponse {
	
	private String queryID;
	
    private String levelOfService;
	
	private CLS CLS;

	private String CPN;

	private String ALT;

	private RC1 RC1;

	private String HNO;

	private String ver;

	private String MCN;

	private String TAR;

	private String STA;

	private TYS TYS;

	private String ZIP;

	private String CPF;

	private String ORD;

	private String MTN;

	private String CPD;

	private String STN;

	private String ESN;

	private String CUS;

	private String NAM;
	
	private String externalKey;

	private String externalKeyType;
	    
	@XmlTransient
	private String classOfService;
	
	@XmlTransient
	private String typeOfService;
	
	@XmlTransient
	private String message;
	
	@XmlTransient
	private String content;

	public CLS getCLS() {
		return CLS;
	}

	public void setCLS(CLS CLS) {
		this.CLS = CLS;
	}

	public String getCPN() {
		return CPN;
	}

	public void setCPN(String CPN) {
		this.CPN = CPN;
	}

	public String getALT() {
		return ALT;
	}

	public void setALT(String ALT) {
		this.ALT = ALT;
	}

	public RC1 getRC1() {
		return RC1;
	}

	public void setRC1(RC1 RC1) {
		this.RC1 = RC1;
	}

	public String getHNO() {
		return HNO;
	}

	public void setHNO(String HNO) {
		this.HNO = HNO;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public String getMCN() {
		return MCN;
	}

	public void setMCN(String MCN) {
		this.MCN = MCN;
	}

	public String getTAR() {
		return TAR;
	}

	public void setTAR(String TAR) {
		this.TAR = TAR;
	}

	public String getSTA() {
		return STA;
	}

	public void setSTA(String STA) {
		this.STA = STA;
	}

	public TYS getTYS() {
		return TYS;
	}

	public void setTYS(TYS TYS) {
		this.TYS = TYS;
	}

	public String getZIP() {
		return ZIP;
	}

	public void setZIP(String ZIP) {
		this.ZIP = ZIP;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getORD() {
		return ORD;
	}

	public void setORD(String ORD) {
		this.ORD = ORD;
	}

	public String getMTN() {
		return MTN;
	}

	public void setMTN(String MTN) {
		this.MTN = MTN;
	}

	public String getCPD() {
		return CPD;
	}

	public void setCPD(String CPD) {
		this.CPD = CPD;
	}

	public String getSTN() {
		return STN;
	}

	public void setSTN(String STN) {
		this.STN = STN;
	}

	public String getESN() {
		return ESN;
	}

	public void setESN(String ESN) {
		this.ESN = ESN;
	}

	public String getCUS() {
		return CUS;
	}

	public void setCUS(String CUS) {
		this.CUS = CUS;
	}

	public String getNAM() {
		return NAM;
	}

	public void setNAM(String NAM) {
		this.NAM = NAM;
	}

	public String getMessage() {
		if(null!=this.RC1 && null!=this.RC1.getMessage())
		this.message = this.RC1.getMessage();
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = this.RC1.getContent();
	}

	public String getClassOfService() {
		this.classOfService = this.CLS.getTyp();
		return classOfService;
	}

	public void setClassOfService(String classOfService) {
		this.classOfService = classOfService;
	}

	public String getTypeOfService() {
		this.typeOfService = this.TYS.getTyp();
		return typeOfService;
	}

	public void setTypeOfService(String typeOfService) {
		this.typeOfService = typeOfService;
	}
	
	@XmlElement(name="ExternalKey")
	public String getExternalKey() {
		return externalKey;
	}

	public void setExternalKey(String externalKey) {
		this.externalKey = externalKey;
	}

	@XmlElement(name="ExternalKeyType")
	public String getExternalKeyType() {
		return externalKeyType;
	}

	public void setExternalKeyType(String externalKeyType) {
		this.externalKeyType = externalKeyType;
	}

	@XmlElement(name = "QueryID")
	public String getQueryID() {
		return queryID;
	}

	public void setQueryID(String queryID) {
		this.queryID = queryID;
	}

	@XmlElement(name = "LevelOfService")
	public String getLevelOfService() {
		return levelOfService;
	}

	public void setLevelOfService(String levelOfService) {
		this.levelOfService = levelOfService;
	}
}
