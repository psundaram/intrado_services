package com.anpi.app.intrado.init;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.staticFileLocation;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;

import com.anpi.app.intrado.connector.QueryDataManager;
import com.anpi.app.intrado.domain.response.SystemResponse;
import com.anpi.app.intrado.domain.response.VuiBeanResponse;
import com.anpi.app.intrado.utils.FreeMarkerEngine;

public class Main {

	private static final Logger	logger	= Logger.getLogger(Main.class);

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
			logger.info("Intrado --> Enter " + request.body());
			
			SystemResponse responseObject =  processIntrado(request,response);
			
			logger.info("Intrado --> Exit " );

			return new ModelAndView(responseObject.getAttributeMap(), responseObject.getRedirectPage());
		}, new FreeMarkerEngine());

		get("/query", (request, response) -> {
			logger.info("Query request -->" + request.body());

			String resString = new QueryDataManager().queryDetails(request.queryParams("cpn"), request.queryParams("stExternalKey"));
			response.type("application/xml");
			
			logger.info("Query response  -->" + resString);

			return resString;
		});

		post("/add", (request, response) -> {
			logger.info("Insert request -->" + request.body());

			String resString = new QueryDataManager().doInsertOrDeleteProcessing("insert",request.body());
			response.type("application/xml");
			
			logger.info("Insert response  -->" + resString);

			return resString;
		});

		post("/del", (request, response) -> {
			logger.info("Delete request -->" + request.body());

			String resString = new QueryDataManager().doInsertOrDeleteProcessing("delete", request.body());
			response.type("application/xml");
			
			logger.info("Delete response  -->" + resString);

			return resString;
		});

		post("/los", (request, response) -> {
			logger.info("Level of Service request -->" + request.body());

			String resString = new QueryDataManager().doLosProcessing(request.body());
			response.type("application/xml");
			
			logger.info("Level of Service response  -->" + resString);

			return resString;
		});
	}

	private static SystemResponse processIntrado(Request request, Response response)  {
		
		SystemResponse responseObject = new SystemResponse();
		Map<String, Object> attributes = new HashMap<>();
		
		String vuiURLName = "http://localhost:4569";
		String stAction = request.queryParams("action");
		
		logger.info("Intrado Action: " + stAction);
		
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
		
		logger.info("Response Object " + attributes) ;
		responseObject.setAttributeMap(attributes);
		return responseObject;
	}

}
