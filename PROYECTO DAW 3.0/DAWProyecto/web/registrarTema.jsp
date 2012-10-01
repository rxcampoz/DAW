<%-- 
    Document   : registrarTema
    Created on : 04-feb-2012, 11:59:13
    Author     : Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/barra.css" />
        <link rel="stylesheet" type="text/css" href="css/Registros.css" />
    </head>
    <body>
        <jsp:include page="Barra.jsp" flush="true" />
        <header><h2>REGISTRAR TEMA</h2></header>
         <div id="content">
        <form action="administrarTemas" method="post" enctype="multipart/form-data" name="formularioTema">
            <div id="separacion"><label id="lnombre">Nombre: </label>
            <input id="nombre" type="text" name="nombre" size="68" maxlength="80" value="" required="required"/></div>
            <div id="separacion"><label id="ldescripcion">Descripcion: </label>
            <input id="descripcion" type="text" name="descripcion" size="68" maxlength="80" value="" required="required"/></div>
            <div id="separacion"><label for="filename_1">File: </label>
            <input id="filename_1" type="file" name="filename_1" size="50" required="required" /></div>
              <div id="derecha">
             <input type="submit" name="Submit" value="Enviar" /> 
             <input type="hidden" id="comando" name="action" value="regTheme"/>
             </div>
        </form>

         </div>
    </body>
</html>
