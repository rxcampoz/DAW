<%-- 
    Document   : administrarProductos
    Created on : 31-ene-2012, 22:18:13
    Author     : Ricardo <rxcampoz>
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
        <script type="text/javascript"  src="js/paginado.js"></script>  
 
    </head>
    <body class=" yui-skin-sam">
        <jsp:include page="Barra.jsp" flush="true" />
        <header class="otro"><h2>PRODUCTOS DISPONIBLES</h2></header>
             <div id="centro">
        <div id="tabla">  
            <div id="markup">
                <table id="accounts">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Marca</th>
                        <th>Modelo</th>
                        <th>Categoria</th>
                        <th>Tipo</th>
                        <th>Precio</th>
                        <th>Path</th>
                    </tr>
                    </thead>
                    <tbody>

                    <jsp:useBean id="helper" class="BD.Helper" type="BD.Helper" scope="page"/>
                    <c:forEach var="producto" items="${helper.productos}">
                        <tr>
                            <td>${producto.idProducto}</td>
                            <td>${producto.marca}</td>
                            <td>${producto.modelo}</td>
                            <td>${producto.categoria}</td>
                            <td>${producto.tipo}</td>
                            <td>${producto.precio}</td>
                            <td>${producto.path}</td>


                            <td><a href="${pageContext.request.contextPath}/Controlador?action=editPro&id=${producto.idProducto}">Editar</a></td>
                            <td><a href="${pageContext.request.contextPath}/Controlador?action=deletePro&id=${producto.idProducto}">Eliminar</a></td>
                        </tr>

                    </c:forEach>
                    </tbody>
                </table>
            </div>
            <div id="derecha">
            <div id="nuevo">
                 <button id="boton" onclick="window.location='registrarProducto.jsp'" type="button">Nuevo Producto</button>
            </div></div>
        </div>
    </div>
        <div id="footer"></div>
    </body>
</html>