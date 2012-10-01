<%-- 
    Document   : IngresarFacturaIngreso
    Created on : 03-sep-2011, 2:42:01
    Author     : Darius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="modelo" class="DB.Modelo" scope="page" />
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar Factura de Ingreso</title>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
        
        <style>
            
            #formulario{
                
                position: absolute;
                top: 10em;
                left: 9.5em;
                font-weight:bold;
                
            }
            #retencion{
                width: 100%;
                background: #97080D url(images/nuevo1.gif) repeat-x left top;
                color:black; 
               display: block;
                
            }
            
        </style>
       
    </head>
    <body>
        <script>
         function muestra_oculta(id){
if (document.getElementById){ //se obtiene el id
var el = document.getElementById(id); //se define la variable "el" igual a nuestro div
el.style.display = (el.style.display == 'none') ? 'block' : 'none'; //damos un atributo display:none que oculta el div
}
}
window.onload = function(){/*hace que se cargue la función lo que predetermina que div estará oculto hasta llamar a la función nuevamente*/
muestra_oculta('retencion');/* "contenido_a_mostrar" es el nombre que le dimos al DIV */
AgregarRetencion();
}
          
          </script>
        <div id="formulario">
            
            <form method="POST" action="Administrador_de_ingresos_SERVLET" enctype="multipart/form-data">
                <table border="2" >
                    
                    <tr><td>Cliente : </td><td><select name="cliente">
                
             <c:forEach items="${modelo.cliente}" var="row">
                 <option>${row.rucOcedula}</option>
            </c:forEach>
                   
            </select><a href="IngresarCliente.jsp">Ingresar Cliente Nuevo</a> </td>
            </tr>
            <tr>
                <td>Tipo de factura :</td><td><select name="tipo">
            <option>Reembolso
            <option SELECTED>Normal
            </select></td>
            </tr> 
            
            <tr>
                <td>Fecha : </td>
                <td>Dia<input type="text" name="dia" />Mes<input type="text" name="mes" />Año<input type="text" name="anio" /></td>
            </tr>
            <tr>
                
                <td>Numero de factura :</td><td><input type="text" name="numerofactura"/></td>
            </tr>
            <tr>
                
                <td>Subtotal Valor 0%: </td><td><input type="text" name="subtotalValor0"/></td>
                </tr>
                <tr>
                
                    <td>Subtotal Valor IVA: </td><td><input type="text" name="subtotalValorIva" /></td>
            </tr>
            <tr><td>
                    Subir Imagen :
                </td>
                <td>
                    <input type="file" name="archivoFile" />
                </td>
            </tr>
            <%-- Latitud :--%><input type="hidden" name="coorX" id="coorX"/>
            <%--Longitu :--%><input type="hidden" name="coorY" id="coorY"/>
            <tr>
                
                <td>Total : </td><td><input type="text" name="total" /></td>
            </tr>
            
            <tr>
                <td>
            <input type="submit" value="Guardar"/></td>
            </tr>
                </table><br /><br />
            Retencion : <a href="#" onclick="muestra_oculta('retencion')" >Agregar retencion</a><br/><br/>
            
            <br /><br />
            <div id="retencion">
                <table border="3">
                    <tr> 
                        <td>Número de comprobante de retención :</td><td><input type="text" name="numeroComprobante"/></td>
                    </tr>
                    <tr>  
                        <td>Ejercicio Fiscal  </td><td>Mes<input type="text" name="retencionmes" />Año<input type="text" name="retencionanio" /></td>
                </tr>
                <tr>
                    
                    <td>Base imponible </td><td><input type="text" name="baseImponible"/></td>
                
                </tr>
                <tr>
                
                    <td>Impuesto :</td><td><select name="impuesto">
                            <option>Iva
                            <option>IR
                            </select></td>
                </tr>
                <tr>
                    <td>
                        %Retencion : </td><td><input type="text" name="porcentjeRetencion"/> </td>
                
                </tr>
                
                <tr>    
                    <td>Total Retenido : </td><td><input type="text" name="totalRetenido" value =""/></td>
            </tr>
            
            <input type="hidden" name="opcion" value="guardar"/>
            
            
            </table>
            </div>
            
            
            
        </form>
        
           
        </div>
    </body>
</html>

