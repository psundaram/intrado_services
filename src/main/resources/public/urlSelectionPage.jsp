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
	                      <table width="80%"><tr><td> Select the Environment </td><td>:<select name="URL">
                                    </select></td></tr>
                            <tr><td>&nbsp;<br></td></tr>
                                <tr><td></td><td>
                                    <input class="button" type="button" value="Update"><td></tr>
                        </table>

                        <h1><u>Available Servers' Details</u> : </h1>
                        <table>
                        </table>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
