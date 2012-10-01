<%-- 
    Document   : Tema
    Created on : 04-feb-2012, 11:03:43
    Author     : Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
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
        <script type="text/javascript"  src="js/paginadoTema.js"></script>  
    </head>
    <body class=" yui-skin-sam">
        <jsp:include page="Barra.jsp" flush="true" />
        <header><h2>TEMAS DISPONIBLES</h2></header>
           <div id="content">
             
        <div id="tabla">
            
            <div id="markup">
                <table id="accounts">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Descripcion</th>
                            <th>Path</th>
                            </tr>
                        </thead>
                    <tbody>

                    <jsp:useBean id="helper" class="BD.Helper" type="BD.Helper" scope="page"/>
                    <c:forEach var="tema" items="${helper.temas}">
                        <tr>
                            <td>${tema.idTema}</td>
                            <td>${tema.nombre}</td>
                            <td>${tema.descripcion}</td>
                            <td>${tema.path}</td>
                            
                            <td><a href="${pageContext.request.contextPath}/Controlador?action=editTheme&id=${tema.idTema}">Editar</a></td>
                            <td><a href="${pageContext.request.contextPath}/Controlador?action=deleteTheme&id=${tema.idTema}">Eliminar</a></td>
                        </tr>

                    </c:forEach>
                    </tbody>
                </table>
            </div>
            <div id="derecha">
            <div id="nuevo">
                 <button id="boton" onclick="window.location='registrarTema.jsp'" type="button">Nuevo Tema</button>
            </div></div>
        </div>
         </div> 
        <div id="footer"></div>
    </body>
</html>
