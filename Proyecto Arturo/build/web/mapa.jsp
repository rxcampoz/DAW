<%--
    Document   : mapa
    Created on : 11/02/2011, 05:54:08 PM
    Author     : Xtratech
--%>

<%--
    Document   : mapa
    Created on : 11/02/2011, 05:54:08 PM
    Author     : Xtratech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NotiESpol: Google Map</title>
        <link type="text/css" href="${pageContext.request.contextPath}/CSS/styleMenu.css" rel="stylesheet" />
        <link href="CSS/estiloFormulario.css" type="text/css" rel="stylesheet"  media="screen" />
        <script src="http://maps.google.com/maps?file=api&amp;v=2&amp;sensor=true_or_false&amp;key=ABQIAAAA28CBlxRlcN9q_81KcFzd5hS_AbjPT-xPDs6zEips3Nuedhd57xT31m0qdNzWqgz-gTceBqz8W2skog" type="text/javascript"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/Js/scripts.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/Js/markerclusterer.js"></script>
    </head>
    <body onload="initialize();" onunload="GUnload()">

        <div id="main1">
            <div id="banner">

            </div>
            <jsp:include page="Partes/Menu.jsp" />

            <div id="content" >
                <div id="menusito">
                    <a href="#" onclick="initialize();">Consulta Noticia</a><br/>
                    <a href="#" onclick="initialize2();">Consulta Palabra Clave</a>

                </div>
                <div id="mapita" class="curved">
                    
                         Mapa: <div id="mapa_Google"></div>
                </div>
            </div>

        </div>
        <div id="footer" >
            <jsp:include page="Partes/Footer.jsp" />
        </div>

    </body>
</html>


