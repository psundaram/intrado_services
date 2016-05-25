<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Result Page</title>
        <link rel="stylesheet" href="../css/style.css" type="text/css">
    </head>

    <body style="width: 100%;">
        <div style="width: 100%;">
            <div style="width: 100%;">
                <div class="body" style="width: 100%">
                    <div>
                        <h2>Delete Result!</h2>
                        <table width="80%">
                               <#if updateResponse.CPN?? || updateResponse.ExternalKey??>
                        
                            
                            <tr><td>External Key</td><td>= ${(updateResponse.externalKey)! "NIL"}</td></tr>
                            <tr><td>External Key Type</td><td>= ${(updateResponse.externalKeyType)! "NIL"}</td></tr>
                            <tr><td>Calling Party Number (CPN)</td><td>= ${(updateResponse.CPN)! "NIL"}</td></tr>
                            <tr><td>STATUS                     </td><td>= ${(updateResponse.message)! "NIL"}</td></tr>
                           <#else>
                            <tr><td>Error Message </td><td>= <%= request.getAttribute("message")%></td></tr>
                            </#if>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
