<%-- 
    Document   : a
    Created on : 28-ago-2011, 12:07:45
    Author     : Darius
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
                
                position: relative;
                top: 10em;
                left: 10em;
            }
            
            #formulario{
                 position: relative;
                top: 10em;
                left: 10em;
                
            }
            
        </style>
        
        
    </head>
    <body>
        <div id="cabecera">
            
            
        </div>
        <div id="formulario">
            <div>
                <h1>Nuevo ingreso</h1>
            <form action="Administrador_de_ingresos_SERVLET"  method="post">
                <input name="opcion" type="hidden" value="agregarFactura"/>
                <input type="submit" value="Ingresar Factura" />
            </form>
                <form action="Administrador_de_ingresos_SERVLET" method="post">
                <input name="opcion" type="hidden" value="agregarContratoDependencia"/>
                <input type="submit" value="Ingresar Contrato" />
            </form>
                
           
            </div>
            
            
        
        </div>
        
        <div id="tabla" class="curved">
            <jsp:include page="/tablas.jsp" />
            </div>
       
        <div id="pie">
            
            
        </div>
    </body>
</html>
