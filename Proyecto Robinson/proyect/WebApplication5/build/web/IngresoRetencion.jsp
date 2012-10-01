<%-- 
    Document   : IngresoRetencion
    Created on : 03-sep-2011, 3:42:46
    Author     : Darius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso Retencion</title>
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
            <form action="Retencion_SERVLET" method="get">
                Número de comprobante de retención <input type="text" name="numeroComprobante"/><br/><br/>
                Ejercicio Fiscal  </br></br>Mes<input type="text" name="mes" />Año<input type="text" name="anio" /><br/><br/>
                Base imponible <input type="text" name="baseImponible"/><br/><br/>
                Impuesto <select name="">
                            <option>Iva
                            <option>IR
                            </select><br/><br/>
                %Retencion : <input type="text" name="porcentjeRetencion"/><br/><br/>
                
                Total Retenido : <input type="text" name="totalRetenido"/><br/><br/>
                
                <input type="hidden" name="opcion" value="guardar"/><br/><br/>
                
                <input type="submit" value="Guardar"/>
                
                    
            </form>
            
        </div>
    </body>
</html>
