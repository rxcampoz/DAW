<%-- 
    Document   : secciones
    Created on : 13/02/2011, 09:45:18 PM
    Author     : luis Pincay - Narcisa Celleri
                 Arturo Tumbaco - Gonzalo Fienco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,Hibernate.Helper"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=request.getContextPath()%>/CSS/stylevisitante.css" rel="stylesheet" type="text/css" media="screen" />
        <link href="<%=request.getContextPath()%>/CSS/estilo_sidebar.css" rel="stylesheet" type="text/css" media="screen" />
        <script type="text/javascript" src="Js/scriptimagenes.js"></script>
        <link type="text/css" href="${pageContext.request.contextPath}/CSS/estiloBR.css" rel="stylesheet" />
        <title>Noti-Espol: Visitante</title>
    <html>

    <body>
        <div id="main">
            <div id="banner" class="curved">

            </div>

            <div id="content" class="curved">
                <div id="izq" class="curved">
                    <jsp:include page="Partes/MenuVisitante.jsp" />
                </div>
                <div id="content-centro" class="curved">
                     <div id="cajaformularioseccion" class="curved">
                         <div id="barraSeccion">
                             <h1>Secciones</h1>
                            <table>
                                <jsp:useBean id="helper" class="Hibernate.Helper" type="Hibernate.Helper" scope="page"/>
                                <c:forEach var="seccion" items="${helper.seccion}">
                                    <div>
                                        <ul id ="noticias">
                                            <li><a href="ServletNoticia?comando=porseccion&id=${seccion.idseccion}">${seccion.nombre}</a></li>
                                        </ul>
                                   </div>

                                </c:forEach>
                            </table>
                         </div>
                    </div>

                </div>
                <div id="der" class="curved">

                </div>

            </div>
        </div>
        <div id="footer" class="curved">
             <jsp:include page="Partes/Footer.jsp" />
        </div>
    </body>
</html>
