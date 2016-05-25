<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/style.css" type="text/css">
        <title>Queried Data</title>
    </head>

    <body style="width: 100%;">
        <div style="width: 100%;">
            <div style="width: 100%;">
                <div class="body" style="width: 100%">
                    <div>
                        <h2>Results of Queried Data!</h2>
                         <table width="80%">
                              <#if message??>
                            	<tr><td>Error Message</td><td>= ${message}</td></tr>
                            <#else>
                           	 	<tr><td>STATUS</td><td>= ${query.message}</td></tr>
                           	 </#if>
                            <br>
                            <br>
                            <#if query.message=="SUCCESS">
                            <tr><td>External Key</td><td>= ${(query.externalKey)! "NIL"}</td></tr>
                            <tr><td>External Key Type</td><td>= ${(query.externalKeyType)! "NIL"}</td></tr>
                            <tr><td>SubscriberID </td><td>= ${(query.subscriberID)! "NIL"}</td></tr>
                            <tr><td>Calling Party Number (CPN)</td><td>= ${(query.CPN)! "NIL"}</td></tr>
                            <tr><td>House Number (HNO)</td><td>= ${(query.HNO)! "NIL"}</td></tr>
                            <tr><td>Street Name (STN)</td><td>= ${(query.STN)! "NIL"}</td></tr>
                             <tr><td>Address (LOC)</td><td>= ${(query.LOC)! "NIL"}</td></tr>
                            <tr><td>MSAG Community Name (MCN)</td><td>= ${(query.MCN)! "NIL"} </td></tr>
                            <tr><td>State (STA)</td><td>= ${(query.STA)! "NIL"}</td></tr>
                            <tr><td>Customer Name (NAM)</td><td>= ${(query.NAM)! "NIL"}</td></tr>
                            <tr><td>Class of Service Type (CLT)</td><td>= ${(query.classOfService)! "NIL"}</td></tr>
                            <tr><td>Type of Service (TYS)</td><td>= ${(query.typeOfService)! "NIL"}</td></tr>
                            <tr><td>Emergency Service Number (ESN)</td><td>= ${(query.ESN)! "NIL"}</td></tr>
                            <tr><td>Main Telephone Number (MTN)</td><td>= ${(query.MTN)! "NIL"}</td></tr>
                            <tr><td>Order Number (ORD)</td><td>= ${(query.ORD)! "NIL"}</td></tr>
                            <tr><td>Completion Date (CPD)</td><td>=${(query.CPD)! "NIL"}</td></tr>
                            <tr><td>Dial Tone Company ID (CPF)</td><td>= ${(query.CPF)! "NIL"}</td></tr>
                            <tr><td>Postal zip code (ZIP)</td><td>= ${(query.ZIP)! "NIL"}</td></tr>
                            <tr><td>Customer Code (CUS)</td><td>= ${(query.CUS)! "NIL"}</td></tr>
                            <tr><td>TAR Code (TAR)</td><td>= ${(query.TAR)! "NIL"}</td></tr>
                            <tr><td>Alternate Phone Number (ALT)</td><td>= ${(query.ALT)! "NIL"}</td></tr> 
                            </#if>
                        </table>
                </div>
            </div>
        </div>
    </body>
    
    <script src="/js/jquery.js"></script>
<script src="/js/angular.js"></script>
<script src="/js/angular-route.js"></script>
<script src="/js/angular-cookies.js"></script>
<script src="/js/angular-sanitize.js"></script>
<script src="/js/angular-resource.js"></script>
 
<script src="/scripts/app.js"></script>
</html>
