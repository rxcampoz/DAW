<%-- 
    Document   : MenuVisitante
    Created on : 13/02/2011, 08:31:21 PM
    Author     : Xtratech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

 <div id="sidebar1" class="sidebar">
        <h2>Bienvenido: Visitante</h2><br/>
        <h3> *** Menu ***</h3><br/>
        <ul>
            <li><a href="visitante.jsp">Quienes Somos</a></li>
            <li><a href="<%=request.getContextPath()%>/secciones.jsp">Secciones</a></li>
            <li><a href="consultaYUI.jsp" >Consultas YUI</a></li>
            <li><a href="mapaVisitante.jsp" >Google Map</a></li>
            <li><a href="contactenos.jsp" >Contactos</a></li>

            <li><a href="${pageContext.request.contextPath}/Autenticar?op=cerrarSesion">Cerrar Sesi&oacute;n</a></li>
        </ul>
            <div style="clear: both;">&nbsp;</div>

</div>
