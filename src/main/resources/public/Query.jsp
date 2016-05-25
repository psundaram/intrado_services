<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <title>Query Data</title>
    </head>
    <body style="width: 100%;">
        <div style="width: 100%;">
            <div style="width: 100%;">
                <div class="body" style="width: 100%">
                    <div>
                        <h2>Query Data</h2>
                        <p>This transaction is used to request the E9-1-1 data that matches the specified Calling Party Number (CPN). The system processes transactions for U.S. service order records and Canadian service order records</p>
                        <form action="/intrado/process">

                            <input type="hidden" name="action" value="query">
                            <table width="80%">
                                <tr><td>External Key</td><td> : <input type="text" name="ExternalKey" value="9876543210"> </td></tr>
                                <tr><td>Calling Party Number (CPN)</td><td> : <input type="text" name="CPN" value="4048941490"></td></tr>
                                <tr><td>&nbsp;<br></td></tr>
                                <tr><td></td><td>
                                        <input class="button" type="submit" name="Query"></td></tr>
                            </table>
                            
                        </form>

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
