<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display LOS Page</title>
        <link rel="stylesheet" href="css/style.css" type="text/css">
    </head>

    <body style="width: 100%;">
        <div style="width: 100%;">
            <div style="width: 100%;">
                <div class="body" style="width: 100%">
                    <div>
                        <h2>Level of Service!</h2>
                        <table width="80%">
                        	 <#if losResponse.message??>
                            	<tr><td>Error Message</td><td>= ${losResponse.message}</td></tr>
                            <#else>
                           	 	<tr><td>Level of Service </td><td>= ${(losResponse.levelOfService)!"NIL"}</td></tr>
                           	 </#if>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
