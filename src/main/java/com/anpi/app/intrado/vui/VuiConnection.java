/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anpi.app.intrado.vui;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

/**
 *
 * @author MouliDaren
 */
public class VuiConnection {
    
    public String VUI_URL_NAME;
    public String KEY_STORE_VALUE;
    public String KEY_STORE_PASSWORD_VALUE;
    
    public VuiConnection() throws IOException{
        Properties prop = new Properties();
        prop.load(new FileInputStream("C:/Users/sarulsekar/Desktop/Intrado/transient_intrado.properties"));
        VUI_URL_NAME = prop.getProperty("vui_url_name");
        KEY_STORE_VALUE = prop.getProperty("key_store_value");
        KEY_STORE_PASSWORD_VALUE = prop.getProperty("key_store_password");
    }
    
    /**
     * TO SEND ANY VUI REQUEST
     * @param request
     * @return
     * @throws MalformedURLException
     * @throws IOException 
     */
    public String sendVuiRequest(String request) throws MalformedURLException, IOException {
        
        HttpURLConnection servletConnection;
        String vuiURLName = VUI_URL_NAME;
        URL vuiURL;
        vuiURL = new URL(vuiURLName);
        
//      Set Properties.
        System.setProperty(Constants.KEY_STORE_PACK, KEY_STORE_VALUE);
        System.setProperty(Constants.KEY_STORE_PASSWORD_PACK, KEY_STORE_PASSWORD_VALUE);
        System.setProperty(Constants.KEY_STORE_TYPE_PACK, Constants.KEY_STORE_TYPE_VALUE);
        servletConnection = (HttpURLConnection) vuiURL.openConnection();
        
//      establish connection properties.
        servletConnection.setDoOutput(true);
        servletConnection.setDoInput(true);
        servletConnection.setRequestProperty(Constants.CONTENT_TYPE_KEY, Constants.CONTENT_TYPE_VALUE);
        servletConnection.setRequestProperty(Constants.CONNECTION_KEY, Constants.CONNECTION_VALUE);
        servletConnection.setRequestProperty(Constants.CONTENT_LENGTH_KEY, Integer.toString(request.length()));
        
//      send the request.
        DataOutputStream out = new DataOutputStream(servletConnection.getOutputStream());
        out.writeBytes(request);
        out.flush();
        out.close();
        
//      get the response.
        BufferedReader in = new BufferedReader(new InputStreamReader(servletConnection.getInputStream()));
        StringBuilder buf = new StringBuilder(1024);
        for (int c = -1; (c = in.read()) != -1;) {
            buf.append((char) c);
        }
        in.close();
        
        servletConnection.disconnect();
        
        return buf.toString();
    }
    
    
   
}
