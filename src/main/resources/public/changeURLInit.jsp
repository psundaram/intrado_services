<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Intermediate Page</title>
        <script>
            function submitPage()
            {
                document.forms[0].submit();
            }
            </script>
    </head>
    <body onload="javascript:submitPage();">
        <form action="/intrado/process">
            <input type="hidden" name="action" value="url_init">
        </form>
    </body>
</html>
