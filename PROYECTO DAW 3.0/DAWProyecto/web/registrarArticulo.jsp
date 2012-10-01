<%-- 
    Document   : RegistrarArticulo
    Created on : 04-feb-2012, 12:40:06
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
        <header><h2>REGISTRAR ARTICULO</h2></header>
        <div id="content">
        <form action="Controlador" method="post" name="formularioTema">
            <div id="separacion"><label id="ltitulo">Titulo:</label>
            <input id="titulo" type="text" name="titulo" size="26" maxlength="80" value="" required="required"/></div>
            <div id="separacion"><label id="lcontenido">Contenido:</label>
            <textArea id="contenido" type="text" name="contenido" required="required" maxlength="200"></textArea></div>
            <div id="separacion"><label id="lopciones">Opciones:</label>
                <select id="tipo" name="tipo">
                    <option value="Widget">Widget</option>
                    <option value="Articulo">Nosotros</option>          
                </select>
            </div>
				<div id="derecha">
                 <input type="submit" name="Submit" value="Enviar" /> 
                 <input type="hidden" id="comando" name="action" value="regArt"/>
              </div>
        </form>
              
        </div>
    </body>
</html>