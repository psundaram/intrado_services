<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>ANPI Web Services</title>
        <link rel="stylesheet" href="css/style.css" type="text/css">
    </head>
    <body>
        <div class="border">
            <div id="bg">
                background
            </div>
            <div class="page">
                <div class="sidebar">
                    <!--<a href="index.html" id="logo"><img src="images/logo.png" alt="logo"></a>-->
                    <ul>
                        <li class="selected">
                            <a href="#">Intrado &nbsp;&nbsp;&nbsp;</a>
                        </li>
                        <li>
                            <a href="index.jsp">Home</a>
                        </li>
                        <li>
                            <a href="InsertPage.jsp" target="displayFrame">Insert Data</a>
                        </li>
                        <li>
                            <a href="Query.jsp" target="displayFrame">Query Data</a>
                        </li>
                        <li>
                            <a href="DeletePage.jsp" target="displayFrame">Delete Data</a>
                        </li>
                        <li>
                            <a href="LOSPage.jsp" target="displayFrame">Level Of Service</a>
                        </li>
                        <li>
                            <a href="changeURLInit.jsp" target="displayFrame">Change Target Server</a>
                        </li>
                        <li>
                            <a href="http://fabric01api01.anpinetwork.com:8080/WSUiTool">Back</a>
                        </li>
                    </ul>
                   
                </div>
                <div class="body">
                    <div>
                        <iframe name="displayFrame" style="width:100%" height="700" scrolling="yes" src="introPage.jsp">
                                            
                        </iframe>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>