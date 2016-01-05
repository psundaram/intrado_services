package com.anpi.app.broadSoft.connector;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

import javax.servlet.ServletException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.anpi.app.broadSoft.domain.response.RequestObject;
import com.anpi.app.broadSoft.domain.response.request.VuiBean;

public class EdataService {

	public String queryDetails(String stCPN, String stExternalKey) throws JAXBException, MalformedURLException, IOException {
		String resp = new IntradoService().queryData(stCPN, stExternalKey);
		return resp;
	}

	public String doLosProcessing(String content) throws ServletException, IOException, JAXBException, IllegalAccessException, InvocationTargetException {
		RequestObject req = unmarshall(content);
        String resp = new IntradoService().doLos(req);
		return resp;
	}

	public String doInsertOrDeleteProcessing(String action, String content) throws ServletException, IOException, JAXBException, IllegalAccessException, InvocationTargetException {
		RequestObject req = unmarshall(content);
        String resp = new IntradoService().doInsertOrDel(req, action);
		return resp;
	}
	
	public RequestObject unmarshall(String stContent) throws ServletException, IOException, JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(RequestObject.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		StringReader reader = new StringReader(stContent);
		RequestObject req = (RequestObject) jaxbUnmarshaller.unmarshal(reader);
		return req;
	}


}
