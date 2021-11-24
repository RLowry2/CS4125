<html>
    <head>
        <title>Servlet Test</title>
    </head>
    <body>
        <a href="/loginServlet">Click here to send GET request</a>

        <br/><br/>

        <form action="loginServlet" method="post">
            Width: <input type="text" size="5" name="width"/>
            &nbsp;&nbsp;
            Height <input type="text" size="5" name="height"/>
            &nbsp;&nbsp;
            <input type="submit" value="Calculate" />
        </form>
    </body>
</html>