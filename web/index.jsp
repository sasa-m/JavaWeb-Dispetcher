<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <h1>Welcome to the Index page</h1>
        <p>This is a small application that shows how the servlet Dispatcher works.</p>
        <p>The parameters are entered in the browser URL and the corresponding JSP page is opened based on that.</p>
        <p>The desired page and controller are entered in the URL as follows:</p>
        <p>http://localhost:8080/dispecer/mydispetcher?page=help&cont=User</p>
        <p>http://localhost:8080/dispecer/mydispetcher?page=details&cont=Admin</p>
        <p>http://localhost:8080/dispecer/mydispetcher?page=help&cont=Admin</p>
    </body>
</html>
