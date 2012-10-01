<%-- 
    Document   : consultarSeccion
    Created on : 09/02/2011, 10:49:19 PM
    Author     : Xtratech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,Hibernate.Helper"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=request.getContextPath()%>/CSS/styleMenu.css" rel="stylesheet" type="text/css" media="screen" />
        <link href="CSS/estiloFormulario.css" type="text/css" rel="stylesheet"  media="screen" />
        <link type="text/css" href="${pageContext.request.contextPath}/CSS/estiloBR.css" rel="stylesheet" />
        <title>NotiEspol: Secciones de Noticias</title>
    </head>
    <body>
       <div id="main1">
            <div id="banner" class="curved">

            </div>
            <jsp:include page="Partes/Menu.jsp" />

            <div id="content" class="curved">
                <div id="cajaTablas" class="curved">
                    <div id="subCajaTablas" >
                        <div id="parr1">
                            <table border="0.5" cellpadding="0.5" cellspacing="0.5" class="tabla">
                            <tr>
                                <td>Codigo</td>
                                <td>Nombre</td>
                                <td>Estado</td>
                            </tr>
                            <jsp:useBean id="helper" class="Hibernate.Helper" type="Hibernate.Helper" scope="page"/>
                            <c:forEach var="seccion" items="${helper.seccion}">
                                <tr>
                                    <td>${seccion.idseccion}</td>
                                    <td>${seccion.nombre}</td>
                                    <td>${seccion.estado}</td>

                                    <td><a href="${pageContext.request.contextPath}/ServletSeccion?comando=edit&id=${seccion.idseccion}">Editar</a></td>
                                    <td><a href="${pageContext.request.contextPath}/ServletSeccion?comando=delete&id=${seccion.idseccion}">Eliminar</a></td>
                                </tr>

                            </c:forEach>
                        </table>
                      </div>
                    </div>
                </div>
            </div>
       </div>
       <div id="footer" class="curved">
            <jsp:include page="Partes/Footer.jsp" />
       </div>
    </body>
</html>
