package com.anpi.app.init;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.staticFileLocation;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;

import com.anpi.app.broadSoft.connector.EdataService;
import com.anpi.app.broadSoft.connector.QueryDataManager;
import com.anpi.app.broadSoft.connector.SystemResponse;
import com.anpi.app.broadSoft.domain.response.VuiBeanResponse;
import com.anpi.app.utils.FreeMarkerEngine;

public class Main {

	public static void main(String[] args) {
		
		port(4569);
		staticFileLocation("/public");

		get("/", new Route() {
			public Object handle(Request request, Response response) {
				response.redirect("index.jsp");
				return "";
			}
		});

		get("/intrado", (request, response) -> {
			SystemResponse responseObject =  processIntrado(request,response);
			return new ModelAndView(responseObject.getAttributeMap(), responseObject.getRedirectPage());
		}, new FreeMarkerEngine());

		get("/query", (request, response) -> {
			String resString = new EdataService().queryDetails(request.queryParams("cpn"), request.queryParams("stExternalKey"));
			response.type("application/xml");
			return resString;
		});

		post("/add", (request, response) -> {
			String resString = new EdataService().doInsertOrDeleteProcessing("insert",request.body());
			response.type("application/xml");
			return resString;
		});

		post("/del", (request, response) -> {
			String resString = new EdataService().doInsertOrDeleteProcessing("delete", request.body());
			response.type("application/xml");
			return resString;
		});

		post("/los", (request, response) -> {
			String resString = new EdataService().doLosProcessing(request.body());
			response.type("application/xml");
			return resString;
		});
	}

	private static SystemResponse processIntrado(Request request, Response response)  {
		
		SystemResponse responseObject = new SystemResponse();
		Map<String, Object> attributes = new HashMap<>();
		
		String vuiURLName = "http://localhost:4569";
		String stAction = request.queryParams("action");
		
		if (stAction.equals("query")) {
			VuiBeanResponse queryDataResponse = new QueryDataManager().doQueryService(request, response);
			attributes.put("query", queryDataResponse);
			responseObject.setRedirectPage("DisplayQueryData.jsp");
		} 
		else if (stAction.equals("insert")) {
			VuiBeanResponse updateResponse = new QueryDataManager().doInsertOrDel(request, response, "insert");
			attributes.put("updateResponse", updateResponse);
			responseObject.setRedirectPage("DisplayInsertData.jsp");
		} 
		else if (stAction.equals("del")) {
			VuiBeanResponse updateResponse = new QueryDataManager().doInsertOrDel(request, response, "delete");
			attributes.put("updateResponse", updateResponse);
			responseObject.setRedirectPage("DisplayDeleteData.jsp");
		}
		else if (stAction.equals("los")) {
			VuiBeanResponse losResponse = new QueryDataManager().doLosQueryService(request, response);
			attributes.put("losResponse", losResponse);
			responseObject.setRedirectPage("DisplayLOSData.jsp");
		} 
		else if (stAction.equals("url_init")) {
			attributes.put("updated_url", vuiURLName);
			responseObject.setRedirectPage("urlSelectionPage.jsp");
		}
		
		responseObject.setAttributeMap(attributes);
		return responseObject;
	}

}
