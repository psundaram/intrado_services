<!DOCTYPE html>
<%@page import="java.util.Properties"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <title>Change Target Server</title>
    </head>
    <body style="width: 100%;">
        <div style="width: 100%;">
            <div style="width: 100%;">
                <div class="body" style="width: 100%">
                    <div>
                        <h2>Change Target Server - Intrado</h2>
                        <form action="intrado">
                            <input type="hidden" name="action" value="url_update">
                           <p><b><u>Current Target Server</u> : </b>${updated_url}</p>
                        <%Properties prop = (Properties) request.getAttribute("URLS");%>
                        <table width="80%"><tr><td> Select the Environment </td><td>:<select name="URL">
                                    <%for (Object o : prop.keySet()) {%>
                                        <option value="<%=o.toString()%>"><%=o.toString()%></option>
                                        <%}%>
                                    </select></td></tr>
                            <tr><td>&nbsp;<br></td></tr>
                                <tr><td></td><td>
                                    <input class="button" type="submit" value="Update"><td></tr>
                        </table>

                        <h1><u>Available Servers' Details</u> : </h1>
                        <table>
                            <%int i=1;%>
                            <%for (Object o : prop.keySet()) {%>
                            <tr><td class="server"><b><%=i++%> . <%=o.toString()%> </td><td class="server"> : <%=prop.get(o.toString())%></td></tr>
                            <%}%>
                        </table>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
