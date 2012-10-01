<%-- 
    Document   : modificarProducto
    Created on : 01-feb-2012, 2:19:05
    Author     : Ricardo <rxcampoz>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/barra.css" />
        <link rel="stylesheet" type="text/css" href="css/Modificar.css" />
    </head>
    <body>
        <jsp:include page="Barra.jsp" flush="true" />
        <header><h2>MODIFICAR PRODUCTO</h2></header>
         <div id="content">
        <form action="administrarProductos" method="post" enctype="multipart/form-data" name="formularioProducto">
            <div id="separacion"><label id="lmarca">Marca: </label>
            <input id="marca" type="text" name="marca" size="68" maxlength="80" value="${editObjeto.marca}" required="required"/></div>
            <div id="separacion"><label id="lmodelo">Modelo: </label>
            <input id="modelo" type="text" name="modelo" size="68" maxlength="80" value="${editObjeto.modelo}" required="required" /></div>
            <div id="separacion"><label id="lcategoria">Categoria: </label>
            <input id="categoria" type="text" name="categoria" size="68" maxlength="80" value="${editObjeto.categoria}" required="required" /></div>
            <div id="separacion"><label id="ltipo">Tipo: </label>
            <input id="tipo" type="text" name="tipo" size="68" maxlength="80" value="${editObjeto.tipo}" required="required"/></div>
            <div id="separacion"><label id="lprecio">Precio: </label>
            <input id="precio" type="text" name="precio" size="68" maxlength="80" value="${editObjeto.precio}" required="required"/></div>
            <div id="separacion"><label id="lpath">Ruta del archivo actual: </label>
            <input id="path" type="text" name="path" size="68" maxlength="80" value="${editObjeto.path}" /></div>
            <div id="separacion"><label for="filename_1">Seleccionar nueva imagen: </label>
            <input id="filename_1" type="file" name="filename_1" size="50" required="required"/></div>
            <div id="derecha">
             <input type="submit" name="Submit" value="Guardar" /> 
             <input type="hidden" id="action" name="action" value="updatePro"/>
            </div>
        </form>
         </div>
    </body>
</html>
