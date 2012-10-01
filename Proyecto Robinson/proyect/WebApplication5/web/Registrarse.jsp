<%-- 
    Document   : Registrarse
    Created on : 05-sep-2011, 2:08:53
    Author     : Robinson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        <div id="">
            <form action="Usuario_SERVLET" method="get">
            Nombre <input type="text" name="nombre"/></br></br>
            Apellido <input type="text" name="apellido"/></br></br>
		Tipo de identificacion <select name="Tipo_de_identificacion_del_usuario">
                    <option>cedula</option>
                    <option>ruc</option>
                </select></br></br>
                
		Numero de identificacion del usuario <input type="text" name="numero_de_identificacion_del_usuario"/></br></br>
		Numero de identificacion del Representante <select name="numero_de_identificacion_del_contribuyente">
                    <option>042601558</option>
                </select> <a href="IngresarRepresentante.jsp">Ingresar un nuevo Representante</a></br></br>
		Clave <input type="text" name="clave"/></br></br>
		Razon social</br><textarea name="razon_social">

                </textarea></br></br>
		Periodo de declaracion de IVA  <select name="periodo_de_declaracion_de_IVA">
                    <option>mensual</option>
                    <option>semestral</option>
                </select></br></br>
		correo_electronico <input type="text" name="correo_electronico"/></br></br>
		provincia <input type="text" name="provincia"/></br></br>
		ciudad <input type="text" name="ciudad"/></br></br>
                <input type="hidden" name="opcion" value="guardar"/>
                <input type="submit" value="Guardar"/></br></br>
		
            </form>
        </div>
    </body>
</html>
