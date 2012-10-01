<%-- 
    Document   : errorPage
    Created on : 05-feb-2012, 20:57:04
    Author     : Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/barra.css" />
    </head>
    <body>
        <jsp:include page="Barra.jsp" flush="true" />
        <div id="ad">
        <h1>Lo has hecho muy mal </h1>
        <h2>Solo soporta imagenes JPG o GIF</h2>
        </div>
    </body>
</html>
