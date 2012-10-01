<%-- 
    Document   : IngresarFacturaEgreso
    Created on : 03-sep-2011, 19:50:54
    Author     : Robinson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="modelo" class="DB.Modelo" scope="page" />
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar factura de egreso</title>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
       
         <style>
            #formulario{
                
                position: relative;
                top: 10em;
                left: 10em;
            }
            
            
        </style>
    </head>
    <body >
        
        <div id="formulario">
            <form action="Administrador_de_egresos_SERVLET" enctype="multipart/form-data" method="POST">
                <table border="3">
                    <tr><td>
                        Proveedor : </td><td><select name="proveedor" id="proveedor">
                    <c:forEach items="${modelo.proveedor}" var="row">
                        <option>${row.cedulaOruc}</option>
                   
            </c:forEach>
                    </select><a href="IngresarProveedor.jsp">ingresar preveedor</a></td>
                </tr>
                    <tr><td>
                            Numero de factura : </td><td><input type="text" name="numerofactura"/></td>
                </tr>
                <tr><td>
                        Fecha :</td><td> 
                Dia<input type="text" name="dia" />Mes<input type="text" name="mes" />Año<input type="text" name="anio" /></td>
                </tr>
                
                <tr><td>
                        Tipo de bien o servicio :</td><td><select name="tipoBienOServicio">
                    <option>Hotel</option>
                    <option>Gasolina</option>
                    <option>Educacion</option>
                    <option>Hogar</option>
                    <option>Salud</option>
                    <option>Servicion</option>
                    </select></td>
                </tr>
                <tr><td>
                        Subtotal 0% :</td><td><input type="text" name="subtotal0"/></td>
                </tr>    
                <tr><td>
                        Subtotal 12% </td><td><input type="text" name="subtotal" /></td>
                </tr>
                <tr><td>
                        derecho a crédito :</td><td><select name="derecho_credito">
                        <option>Si</option>
                        <option>No</option>
                    </select></td>
                </tr>
                <tr><td>
                        Tipo de gasto :</td><td><select name="Tipo_gasto">
                        <option>Vivienda</option>
                        <option>Educación</option>
                        <option>Salud</option>
                        <option>Alimentación</option>
                        <option>Vestimenta</option>
                        <option>Otro</option>
                    </select> </td>
                </tr>
                <tr><td>
                        Deducible: </td><td><select name="deducible">
                        <option>Si</option>
                        <option>No</option>
                    </select> </td>
                </tr>
                <tr><td>
                        Total: </td><td><input name="total" type="text"/></td>
                </tr>    
                <input type="hidden" value="guardar" name="opcion"/>
                <tr>
                    <td>
                    Subir Imagen :
                </td>
                    <td>
                        <input type="file" name="archivoFile" />
                    </td>
                    
                </tr>
                <tr>
                    <td>
                    <input type="submit" value="Guardar" /></td>
                    </tr>    
                </table>
            </form>
            
        </div>
    </body>
</html>
