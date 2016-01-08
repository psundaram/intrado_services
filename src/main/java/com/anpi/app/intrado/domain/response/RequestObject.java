package com.anpi.app.intrado.domain.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="payload")
public class RequestObject {

		private String STA;

	    private String ZIP;

	    private String PRD;

	    private String HNO;

	    private String STN;

	    private String HNS;

	    private String MCN;

	    private String LOC;
	    
	    private String POD;
	    
	    private String NAM;
	    
	    private String CLT;
	    
	    private String TYT;
	    
	    private String EXC;
	    	
	    private String ESN;
	    
	    private String MTN;
	    
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
	    
	    /*@SerializedName("CPN")
	    private String cpn;
	    
//	    @XmlElement(name="CPN")
		public String getCpn() {
			return cpn;
		}

		public void setCpn(String cpn) {
			this.cpn = cpn;
		}*/

		public String getCPN() {
			return CPN;
		}

		public void setCPN(String cPN) {
			CPN = cPN;
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

		public String getPRD() {
			return PRD;
		}

		public void setPRD(String pRD) {
			PRD = pRD;
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

		public String getHNS() {
			return HNS;
		}

		public void setHNS(String hNS) {
			HNS = hNS;
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

		public String getCLT() {
			return CLT;
		}

		public void setCLT(String cLT) {
			CLT = cLT;
		}

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

		public String getMTN() {
			return MTN;
		}

		public void setMTN(String mTN) {
			MTN = mTN;
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

		@XmlElement(name="ExternalKey")
		public String getExternalKey() {
			return ExternalKey;
		}

		public void setExternalKey(String externalKey) {
			ExternalKey = externalKey;
		}

		@XmlElement(name="ExternalKeyType")
		public String getExternalKeyType() {
			return ExternalKeyType;
		}

		public void setExternalKeyType(String externalKeyType) {
			ExternalKeyType = externalKeyType;
		}

		public String getSubscriberID() {
			return subscriberID;
		}

		public void setSubscriberID(String subscriberID) {
			this.subscriberID = subscriberID;
		}

		@Override
		public String toString() {
			return "RequestObject [STA=" + STA + ", ZIP=" + ZIP + ", PRD=" + PRD + ", HNO=" + HNO + ", STN=" + STN + ", HNS=" + HNS + ", MCN=" + MCN + ", LOC=" + LOC + ", POD=" + POD + ", NAM=" + NAM + ", CLT=" + CLT + ", TYT=" + TYT + ", EXC=" + EXC
					+ ", ESN=" + ESN + ", MTN=" + MTN + ", ORD=" + ORD + ", CPD=" + CPD + ", COI=" + COI + ", CPF=" + CPF + ", CUS=" + CUS + ", TAR=" + TAR + ", ExternalKey=" + ExternalKey + ", ExternalKeyType=" + ExternalKeyType + ", subscriberID="
					+ subscriberID + "]";
		}

	    
}