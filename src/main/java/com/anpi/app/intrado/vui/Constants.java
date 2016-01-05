/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anpi.app.intrado.vui;


/**
 *
 * @author MouliDaren
 */
public class Constants {
    
//    KEYSTORES PROPERTIES
//    public static final String VUI_URL_NAME = "https://ilabvui2.intrado.com/vui/VuiServlet";
    public static final String KEY_STORE_PACK = "javax.net.ssl.keyStore";
    public static final String KEY_STORE_TYPE_PACK = "javax.net.ssl.keyStoreType";
    public static final String KEY_STORE_PASSWORD_PACK = "javax.net.ssl.keyStorePassword";
//    public static final String KEY_STORE_VALUE = "E:/ANPI/project-dossier/Intrado/ANPI-ILAB.p12"; //Location of digital certificate
    public static final String KEY_STORE_TYPE_VALUE = "pkcs12";
//    public static final String KEY_STORE_PASSWORD_VALUE = "Billa123";
    
//    REQUEST PROPERTIES
    public static final String CONTENT_TYPE_KEY = "Content-Type";
    public static final String CONNECTION_KEY = "Connection";
    public static final String CONTENT_LENGTH_KEY = "Content-Length";
    public static final String CONTENT_TYPE_VALUE = "text/plain";
    public static final String CONNECTION_VALUE = "Keep-Alive";
            
//    ACCOUNT INFORMATION
//    public static final String ACCOUNT_ID = "VUI-101658";
    
//    XML ELEMENTS, ATTRIBUTES , NAMESPACE
    public static final String NAMESPACE = "http://www.intrado.com/namespaces/vui";
    
//    PRODUCTION ENVIRONMENT VARIABLES
//    public static final String VUI_URL_NAME_PROD = "https://ivui.intrado.com/vui/VuiServlet";  //End points for the production environment
//    public static final String KEY_STORE_VALUE_PROD = "E:/ANPI/project-dossier/Intrado/Intrado.p12";  //Location of the production digital certificate
//    public static final String KEY_STORE_PASSWORD_VALUE_PROD = "Intrado";  //Certificate password for Production environment
//    public static final String ACCOUNT_ID_PROD = "VUI-103191";  //Production environment Account ID for ANPI

}
