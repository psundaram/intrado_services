
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <title>LOS Query</title>
    </head>
    <body style="width: 100%;">
        <div style="width: 100%;">
            <div style="width: 100%;">
                <div class="body" style="width: 100%">
                    <div>
                        <h2>Level Of Service(LOS)</h2>
                        <p>Retrieves the available Level of Service for a given address.</p>
                        <form action="/intrado">
                            <input type="hidden" name="action" value="los">
                            <table width="80%">
                                <tr><td>House Number (HNO)</td><td> : <input type="text" name="HNO" value="7460"> </td></tr>
                                <tr><td>House Number Suffix (HNS)</td><td> : <input type="text" name="HNS" > </td></tr>
                                <tr><td>Location (LOC)</td><td> : <input type="text" name="LOC"> </td></tr>
                                <tr><td>Prefix Directional (PRD)</td><td> : <input type="text" name="PRD"> </td></tr>
                                <tr><td>Street Name (STN)</td><td> : <input type="text" name="STN" value="Warren Parkway"> </td></tr>
                                <tr><td>MSAG Community Name (MCN)</td><td> : <input type="text" name="MCN" value="Frisco"> </td></tr>
                                <tr><td>State (STA)</td><td> : <input type="text" name="STA" value="TX"> </td></tr>
                                <tr><td>Postal zip code (ZIP)</td><td> : <input type="text" name="ZIP" value="75034"> </td></tr>
                                <tr><td>&nbsp;<br></td></tr>
                                <tr><td></td><td>
                                    <input class="button" type="submit" value="Check LOS"><td></tr>

                            </table>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
