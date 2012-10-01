<%-- 
    Document   : Administrar_usuario
    Created on : 04/02/2012, 03:26:48 PM
    Author     : Antenas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,BD.Helper"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<link rel="stylesheet" type="text/css" href="css/Administracion.css" />        
<link rel="stylesheet" type="text/css" href="js/yui/build/fonts/fonts-min.css"  />  
<link rel="stylesheet" type="text/css"  href="js/yui/build/datatable/assets/skins/sam/datatable.css"  />  
<link rel="stylesheet" type="text/css" href="js/yui/build/paginator/assets/skins/sam/paginator.css" />
<link rel="stylesheet" type="text/css" href="css/barra.css" />

<script type="text/javascript"  src="js/yui/build/yahoo-dom-event/yahoo-dom-event.js"></script>  
<script type="text/javascript"  src="js/yui/build/element/element-min.js"></script>  
<script type="text/javascript"  src="js/yui/build/datasource/datasource-min.js"></script>  
<script type="text/javascript"  src="js/yui/build/datatable/datatable-min.js"></script>  
<script type="text/javascript"  src="js/yui/build/paginator/paginator-min.js"></script>  
<script type="text/javascript"  src="js/paginadoUsuarios.js"></script>
        
    </head>
    <body class=" yui-skin-sam">
        <jsp:include page="Barra.jsp" flush="true" />
        <header><h2>USUARIOS REGISTRADOS</h2></header>
       <div id="content">
        
        <div id="tabla">
            <div id="markup">
                <table id="accounts" >
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Nick</th>
                        <th>Clave</th>
                    </tr>
                    </thead>
                    <tbody>

                    <jsp:useBean id="helper" class="BD.Helper" type="BD.Helper" scope="page"/>
                    <c:forEach var="usuario" items="${helper.usuarios}">
                        <tr>
                            <td>${usuario.idUsuario}</td>
                            <td>${usuario.nombre}</td>
                            <td>${usuario.apellido}</td>
                            <td>${usuario.nick}</td>
                            <td>${usuario.clave}</td>

                            <td><a href="${pageContext.request.contextPath}/administrar_usuarios?action=editUser&id=${usuario.idUsuario}">Editar</a></td>
                            
                            <c:choose>
                                <c:when test='${sessionScope.usuario.nick != usuario.nick}'>
                                    <td><a href="${pageContext.request.contextPath}/administrar_usuarios?action=deleteUser&id=${usuario.idUsuario}">Eliminar</a></td>
                                </c:when>
                                <c:otherwise><td>Actual</td></c:otherwise>
                            </c:choose>
                        </tr>

                    </c:forEach>
                    </tbody>
                </table>
               </div>
            </div>
            <div id="derecha">
            <div id="nuevo">
                 <button id="boton" onclick="window.location='registrarUsuario.jsp'" type="button">Nuevo Usuario</button>
            </div></div>
       </div>
    <footer></footer>
    </body>
</html>
