<%-- 
    Document   : Menu
    Created on : 08/02/2011, 08:55:23 PM
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<div id="header1" class="curved">
    <div id="menu"><a href=""><img src="" title="Bienvenido: NotiEspol"  border="0"/></a>
        <ul>
            <li><a href="index.jsp">Inicio</a></li>
            <li><a href="ingresosDatos.jsp" >Ingresar</a></li>
            <li><a href="modificar.jsp" >Modificar y Eliminar</a></li>
            <li><a href="mapa.jsp">Google Map</a></li>
            <li><a href="${pageContext.request.contextPath}/Autenticar?op=cerrarSesion">Cerrar Sesi&oacute;n</a></li>
            
        </ul>
    </div>
</div>
