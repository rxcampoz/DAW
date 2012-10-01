<%-- 
    Document   : ModificarUsuario
    Created on : 05/02/2012, 11:18:42 AM
    Author     : Antenas
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
    <jsp:include page="Barra.jsp" flush="true" />
    <header><h2>MODIFICAR USUARIOS</h2></header>
    <div id="content">
        <form action="Controlador" method="post" name="formularioUsuario">
            <div id="separacion"><label id="lnombre">Nombre: </label>
                <input id="nombre" type="text" name="nombre" size="68" maxlength="80" value="${editObjeto.nombre}" required="required"/></div >
            <div id="separacion"><label id="lapellido">Apellido: </label>
            <input id="apellido" type="text" name="apellido" size="68" maxlength="80" value="${editObjeto.apellido}" required="required"/></div>
            <div id="separacion"><label id="lnick">Nick: </label>
            <input id="nick" type="text" name="nick" size="68" maxlength="80" value="${editObjeto.nick}" required="required"/></div>
            <div id="separacion"><label id="lclave">Clave: </label>
            <input id="clave" type="password" name="clave" size="68" maxlength="80" value="${editObjeto.clave}" required="required" /></div>
            <div id="separacion"><p>ROLES: <br/></p> 
            <input type="checkbox" name="roles" value="Administrador"> Administrador<br/>
            <input type="checkbox" name="roles" value="Administrador de contenidos"> Administrador de contenidos<br/>
            <input type="checkbox" name="roles" value="Administrador de presentacion" checked> Administrador de presentacion<br/>
            </div>
             <div id="derecha">
             <input type="submit" name="Submit" value="Guardar" /> 
             <input type="hidden" id="comando" name="action" value="updateUser"/>
             </div>
        </form>
    </div>
    </body>
</html>
