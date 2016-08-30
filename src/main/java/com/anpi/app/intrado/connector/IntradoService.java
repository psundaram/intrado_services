package com.anpi.app.intrado.connector;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.beanutils.BeanUtils;

import com.anpi.app.intrado.constants.Constants;
import com.anpi.app.intrado.domain.request.CLS;
import com.anpi.app.intrado.domain.request.HDR;
import com.anpi.app.intrado.domain.request.Payload;
import com.anpi.app.intrado.domain.request.ReqObject;
import com.anpi.app.intrado.domain.request.TRL;
import com.anpi.app.intrado.domain.request.TYS;
import com.anpi.app.intrado.domain.request.VuiBean;
import com.anpi.app.intrado.domain.response.RequestObject;

public class IntradoService {

	private String processObject(Payload payLoad) throws JAXBException, MalformedURLException, IOException {

		ReqObject reqObject = new ReqObject();
		
		reqObject.setPayload(payLoad);

		reqObject.setHdr(new HDR("1", Constants.ACCOUNT_ID, "1.1"));
		reqObject.setTrl(new TRL("1"));

		StringWriter sw = new StringWriter();

		JAXBContext ctx = JAXBContext.newInstance(ReqObject.class);

		Marshaller m = ctx.createMarshaller();

		m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.intrado.com/namespaces/vui VUI.xsd");

		m.marshal(reqObject, sw);
		System.out.println("Request --> " + sw.toString());

		VuiConnection vuiConnection = new VuiConnection();
		String resp = vuiConnection.sendVuiRequest(sw.toString());
		
		System.out.println("Response -->" + resp);
		return resp;

	}

	public String queryData(String cpn, String externalKey) throws JAXBException, IOException {
		VuiBean vuiBean = new VuiBean();
		vuiBean.setCPN(cpn);
		if (cpn == null)
			vuiBean.setExternalKey(externalKey);

		Payload payLoad = new Payload();
		payLoad.setQueryData(vuiBean);

		String response = processObject(payLoad);

		return response;

	}

	public String doInsertOrDel(RequestObject req, String action) throws IllegalAccessException, InvocationTargetException, JAXBException, IOException {

		VuiBean vuiBean = new VuiBean();
		
		System.out.println("Action :" + action);

		BeanUtils.copyProperties(vuiBean, req);
		if (action.equals("insert"))
			vuiBean.setFOC("I");
		else
			vuiBean.setFOC("D");

		vuiBean.setTYS(new TYS(vuiBean.getTYT()));
		vuiBean.setCLS(new CLS(vuiBean.getCLT()));

		Payload payLoad = new Payload();
		payLoad.setUpdateRequest(vuiBean);

		String resp = processObject(payLoad);
		return resp;

	}

	public String doLos(RequestObject req) throws IllegalAccessException, InvocationTargetException, JAXBException, IOException {

		VuiBean vuiBean = new VuiBean();
		BeanUtils.copyProperties(vuiBean, req);

		Payload payLoad = new Payload();
		payLoad.setInfoCheckLevelOfService(vuiBean);

		String resp = processObject(payLoad);
		return resp;
	}
}
