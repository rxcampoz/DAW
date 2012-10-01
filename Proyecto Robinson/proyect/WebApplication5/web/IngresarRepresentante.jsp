<%-- 
    Document   : IngresarRepresentante
    Created on : 07-sep-2011, 7:51:58
    Author     : Robinson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar nuevo representante</title>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
        <style>
            #formulario{
                
                position: relative;
                top: 10em;
                left: 10em;
            }
            
            
        </style>
    </head>
    <body>
        <div id="formulario">
            <form method="get" action="Representante_SERVLET">
                Nombre del Representante <input type="text" name="nombre"/></br></br>
                Apellido del Representante <input type="text" name="apellido"/></br></br>
                Tipo de identificacion: <select name="tipoIdentificacion">
                    <option>Cedula</option>
                    <option>Pasaporte</option>
                </select>
             	Numero de identificacion <input type="text" name="numeroIdentificacion"/></br></br>
            	Correo Electronico <input name="correo" type="text"/></br></br>
                
                <input type="hidden" value="guardar" name="opcion"/>
                <input type="submit" value="Guardar"/>
                
            </form>
            
        </div>
    </body>
</html>
