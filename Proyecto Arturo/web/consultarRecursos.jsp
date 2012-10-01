<%-- 
    Document   : consultarRecursos
    Created on : 10/02/2011, 02:14:11 PM
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
        <title>NotiEspol: Recursos Multimedios</title>
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
                                <td>Tipo de Archivo</td>
                                <td>Descripcion</td>
                                <td>Estado</td>

                            </tr>
                            <jsp:useBean id="helper" class="Hibernate.Helper" type="Hibernate.Helper" scope="page"/>
                            <c:forEach var="recurso" items="${helper.recurso}">
                                <tr>
                                    <td>${recurso.idrecursoMultimedio}</td>
                                    <td>${recurso.tipo}</td>
                                    <td>${recurso.archivo}</td>
                                    <td>${recurso.descripcion}</td>
                                    <td>${recurso.estado}</td>

                                    <td><a href="${pageContext.request.contextPath}/ServletRecursoMultimedio?comando=edit&id=${recurso.idrecursoMultimedio}">Editar</a></td>
                                    <td><a href="${pageContext.request.contextPath}/ServletRecursoMultimedio?comando=delete&id=${recurso.idrecursoMultimedio}">Eliminar</a></td>
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
