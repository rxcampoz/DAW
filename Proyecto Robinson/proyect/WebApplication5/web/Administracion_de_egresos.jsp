<%-- 
    Document   : Administracion_de_egresos
    Created on : 03-sep-2011, 19:38:29
    Author     : Robinson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
        <style>
            
             #tabla{
                
                position: absolute;
                top: 20em;
                left: 20em;
            }
        </style>
    </head>
    <body>
      <div id="logo">
            <div>
                <h1>Nuevo egreso</h1>
                <div id="entrada">
            <form action="Administrador_de_egresos_SERVLET"  method="POST">
                <input name="opcion" type="hidden" value="agregarFactura"/>
                <input type="submit" value="Agregar Factura" />
            </form>
                    </div>
                    
                
           
            </div>
            
        </div>
        
        <div id="tabla">
            <jsp:include page="/tablas2.jsp" />
        </div>
    </body>
</html>
