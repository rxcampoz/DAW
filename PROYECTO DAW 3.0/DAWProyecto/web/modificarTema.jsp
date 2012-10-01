<%-- 
    Document   : modificar
    Created on : 04-feb-2012, 11:59:44
    Author     : Ricardo
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
        <header><h2>MODIFICAR TEMA</h2></header>
        <div id="content">
        <form action="administrarTemas" method="post" enctype="multipart/form-data" name="formularioProducto">
            <div id="separacion"><label id="lnombre">Nombre: </label>
            <input id="nombre" type="text" name="marca" size="68" maxlength="80" value="${editObjeto.nombre}" required="required" /></div>
            <div id="separacion"><label id="ldescripcion">Descripcion: </label>
            <input id="descripcion" type="text" name="modelo" size="68" maxlength="80" value="${editObjeto.descripcion}" required="required" /></div>
            <div id="separacion"><label id="lpath">Ruta del archivo actual: </label>
            <input id="path" type="text" name="path" size="68" maxlength="80" value="${editObjeto.path}" required="required"/></div>
            <div id="separacion"><label for="filename_1">Seleccionar un archivo css: </label>
                <input id="filename_1" type="file" name="filename_1" size="50" required="required" /></div>
            <div id="derecha">
             <input type="submit" name="Submit" value="Guardar" /> 
             <input type="hidden" id="comando" name="action" value="updateTheme"/>
            </div>
        </form>
    </div>
    </body>
</html>
