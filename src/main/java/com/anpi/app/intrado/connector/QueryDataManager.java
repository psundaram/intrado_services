package com.anpi.app.intrado.connector;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

import javax.servlet.ServletException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import spark.Request;
import spark.Response;

import com.anpi.app.intrado.domain.response.RequestObject;
import com.anpi.app.intrado.domain.response.ResObject;
import com.anpi.app.intrado.domain.response.VuiBeanResponse;
import com.anpi.app.intrado.utils.ObjectTransformer;

public class QueryDataManager {
	
	private static String vuiURLName = "http://localhost:4569";

	public VuiBeanResponse doQueryService(Request request, Response response)  {
		
		VuiBeanResponse queryDataResponse = new VuiBeanResponse();
		System.out.println("doQueryService : Enters");
		
		try {
			String stCPN = request.queryParams("CPN");
			String stExternalKey = request.queryParams("ExternalKey");
			
			String resp = new IntradoService().queryData(stCPN,stExternalKey);
		        
			ResObject queryResponse = unmarshall(resp);
	
			queryDataResponse = queryResponse.getPayload().getQueryResponse();
	
			System.out.println("OnePointServlet : doQueryService : Exits");
		}catch(Exception e){
			e.printStackTrace();
		}
		return queryDataResponse;
	}


	public VuiBeanResponse doInsertOrDel(Request request, Response response, String action) {
		VuiBeanResponse updateResponse = new VuiBeanResponse();
		try {
			System.out.println("OnePointServlet : doInsert : Enters");

			RequestObject req = ObjectTransformer.convert(request.queryString(), RequestObject.class);
			
	        String resp = new IntradoService().doInsertOrDel(req, action);

			ResObject queryResponse = unmarshall(resp);

			updateResponse = queryResponse.getPayload().getUpdateResponse();

			System.out.println("OnePointServlet : doInsert : Exits");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return updateResponse;
	}
	
	
	public VuiBeanResponse doLosQueryService(Request request, Response response)  {
		VuiBeanResponse losResponse = new VuiBeanResponse();
		try {
			System.out.println("OnePointServlet : doLOSQuery : Enters");
			
			RequestObject req = ObjectTransformer.convert(request.queryString(), RequestObject.class);
			
	        String resp = new IntradoService().doLos(req);

			ResObject queryResponse = unmarshall(resp);
			
			losResponse = queryResponse.getPayload().getLosResponse();
			
			if(null==losResponse || null==losResponse.getLevelOfService()){
				String message = queryResponse.getPayload().getErrorResponse().getMessage();
				System.out.println("Message ---> :" + message);
				losResponse = new VuiBeanResponse();
				losResponse.setMessage(message);
			}
			
			System.out.println("OnePointServlet : doLOSQuery : Exits");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return losResponse;
	}
	
	public String queryDetails(String stCPN, String stExternalKey) throws JAXBException, MalformedURLException, IOException {
		String resp = new IntradoService().queryData(stCPN, stExternalKey);
		return resp;
	}

	public String doLosProcessing(String content) throws ServletException, IOException, JAXBException, IllegalAccessException, InvocationTargetException {
		RequestObject req = unmarshallReq(content);
        String resp = new IntradoService().doLos(req);
		return resp;
	}

	public String doInsertOrDeleteProcessing(String action, String content) throws ServletException, IOException, JAXBException, IllegalAccessException, InvocationTargetException {
		RequestObject req = unmarshallReq(content);
        String resp = new IntradoService().doInsertOrDel(req, action);
		return resp;
	}
	
	public RequestObject unmarshallReq(String stContent) throws ServletException, IOException, JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(RequestObject.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		StringReader reader = new StringReader(stContent);
		RequestObject req = (RequestObject) jaxbUnmarshaller.unmarshal(reader);
		return req;
	}

	
	public ResObject unmarshall(String stContent) throws ServletException, IOException, JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(ResObject.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		StringReader reader = new StringReader(stContent);
		ResObject queryResponse = (ResObject) jaxbUnmarshaller.unmarshal(reader);
		return queryResponse;
	}

}
