<%-- 
    Document   : consultarNoticia
    Created on : 12/02/2011, 09:13:55 PM
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
        <title>Consultar Noticias</title>
    </head>
    <body>
         <div id="main1">
            <div id="banner" class="curved">

            </div>
            <jsp:include page="Partes/Menu.jsp" />

            <div id="content" class="curved">
                <div id="cajaTablas" class="curved">
                    <div id="subCajaTablas" >
                        <div id="parr1" >
                       <table border="0.5" cellpadding="0.5" cellspacing="0.5" class="tabla">
                            <tr>
                                <td>Codigo</td>
                                <td>Seccion</td>
                                <td>Fecha de Noticia</td>
                                <td>Titulo</td>
                                <td>Provincia</td>
                                <td>Canton</td>
                                <td>Direccion</td>
                                <td>Latitud</td>
                                <td>Longitud</td>
                                <td>Noticia Corta</td>
                                <td>Noticia Completa</td>
                                <td>Recurso</td>
                                <td>Palabra Clave</td>
                                <td>Estado</td>
                                
                            </tr>
                            <jsp:useBean id="helper" class="Hibernate.Helper" type="Hibernate.Helper" scope="page"/>
                            <c:forEach var="noticia" items="${helper.noticia}">
                                <tr>
                                    <td>${noticia.idnoticia}</td>
                                    <td>${noticia.idseccion}</td>
                                    <td>${noticia.fechaNoticia}</td>
                                    <td>${noticia.titulo}</td>
                                    <td>${noticia.provincia}</td>
                                    <td>${noticia.canton}</td>
                                    <td>${noticia.direccion}</td>
                                    <td>${noticia.latitud}</td>
                                    <td>${noticia.longitud}</td>
                                    <td>${noticia.noticiaCorta}</td>
                                    <td>${noticia.noticiaCompleta}</td>
                                    <td>${noticia.idrecursoMultimedio}</td>
                                     <td>${noticia.palabraClave}</td>
                                     <td>${noticia.estado}</td>
                                    <td><a href="${pageContext.request.contextPath}/ServletNoticia?comando=edit&id=${noticia.idnoticia}">Editar</a></td>
                                    <td><a href="${pageContext.request.contextPath}/ServletNoticia?comando=delete&id=${noticia.idnoticia}">Eliminar</a></td>
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

