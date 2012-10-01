<%-- 
    Document   : menuEditor
    Created on : 16/02/2011, 01:20:22 PM
    Author     : Luis Pincay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<div id="header1" class="curved">
    <div id="menu"><a href=""><img src="" title="Bienvenido: NotiEspol"  border="0"/></a>
        <ul>
            <li><a href="#">Inicio</a></li>
            <li><a href="ingresoNoticia.jsp" >Ingresar</a></li>

            <li><a href="mapa.jsp">Google Map</a></li>
            <li><a href="${pageContext.request.contextPath}/Autenticar?op=cerrarSesion">Cerrar Sesi&oacute;n</a></li>

        </ul>
    </div>
</div>