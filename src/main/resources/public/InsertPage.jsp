<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <title>Insert Data</title>
    </head>
    <body style="width: 100%;">
        <div style="width: 100%;">
            <div style="width: 100%;">
                <div class="body" style="width: 100%">
                    <div>
                        <h2>Insert Data</h2>
                        <p>This transaction is used to insert or change records in the databases. The system processes transactions for U.S. service order records and Canadian service order records.</p>
 	                         <form action="/intrado/process">
                            <input type="hidden" name="action" value="insert">
                            <table width="80%">
                                <tr><td>External Key</td><td> : <input type="text" name="ExternalKey" value="9876543210"> </td></tr>
                                <tr><td>External Key Type</td><td> : <input type="text" name="ExternalKeyType" value="OTHER"> </td></tr>
                                <tr><td>Subscriber ID</td><td> : <input type="text" name="subscriberID"> </td></tr>
                                <tr><td>Calling Party Number (CPN)</td><td> : <input type="text" name="CPN" value="4048941490"> </td></tr>
                                <tr><td>House Number (HNO)</td><td> : <input type="text" name="HNO" value="555"> </td></tr>
                                <tr><td>Street Name (STN)</td><td> : <input type="text" name="STN" value="NORTH AV"> </td></tr>
                                <tr><td>Address (LOC)</td><td> : <input type="text" name="LOC" value=""> </td></tr>
                                <tr><td>Post Directional (POD)</td><td> : <input type="text" name="POD"> </td></tr>
                                <tr><td>MSAG Community Name (MCN)</td><td> : <input type="text" name="MCN" value="HAPEVILLE"> </td></tr>
                                <tr><td>State (STA)</td><td> : <input type="text" name="STA" value="GA"> </td></tr>
                                <tr><td>Customer Name (NAM)</td><td> : <input type="text" name="NAM" value="Georgia Institute"> </td></tr>
                                <tr><td>Class of Service Type (CLT)</td><td> : <input type="text" name="CLT" value="2"> </td></tr>
                                <tr><td>Type of Service (TYT)</td><td> : <input type="text" name="TYT" value="0"> </td></tr>
                                <tr><td>Exchange (EXC)</td><td> : <input type="text" name="EXC" value="VIL"> </td></tr>
                                <tr><td>Emergency Service Number (ESN)</td><td> : <input type="text" name="ESN" value="36"> </td></tr>
                                <tr><td>Main Telephone Number (MTN)</td><td> : <input type="text" name="MTN" value="4048941420"> </td></tr>
                                <tr><td>Order Number (ORD)</td><td> : <input type="text" name="ORD" value="916290"> </td></tr>
                                <tr><td>Completion Date (CPD)</td><td> : <input type="text" name="CPD" value="2004-03-23"> </td></tr>
                                <tr><td>County ID (COI)</td><td> : <input type="text" name="COI" value="QNM"> </td></tr>
                                <tr><td>Dial Tone Company ID (CPF)</td><td> : <input type="text" name="CPF" value="ANPI" readonly="readonly"> </td></tr>
                                <tr><td>Postal zip code (ZIP)</td><td> : <input type="text" name="ZIP" value="30332"> </td></tr>
                                <tr><td>Customer Code (CUS)</td><td> : <input type="text" name="CUS" value="999"> </td></tr>
                                <tr><td>TAR Code (TAR)</td><td> : <input type="text" name="TAR" value="020714"> </td></tr>

                                <tr><td>&nbsp;<br></td></tr>
                                <tr><td></td><td>
                                    <input class="button" type="submit" value="Insert Data"><td></tr>

                            </table>
                        </form>
                     </div>
                </div>
            </div>
        </div>
    </body>
</html>
