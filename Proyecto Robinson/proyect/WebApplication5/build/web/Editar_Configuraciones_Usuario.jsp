<%-- 
    Document   : Editar_Configuraciones_Usuario
    Created on : 20-sep-2011, 22:19:41
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
        <h1>Hello World!</h1>
         <div id="">
            <form action="Usuario_SERVLET" method="get">
                <table border="3">
                    <tr>
                        <td>Nombre </td><td><input type="text" name="nombre" value="${sessionScope.usuario.nombre}"/></td>
                  </tr>
                  <tr>
                      <td>Apellido </td><td><input type="text" name="apellido" value="${sessionScope.usuario.apellido}"/></td>
		</tr>
                <tr>
                    <td>Numero de identificacion del usuario</td><td> <input value="${sessionScope.usuario.numeroDeIdentificacionDelUsuario}" type="text" disabled="false" name="numero_de_identificacion_del_usuario"/></td>
		</tr>
                <tr>
                    <td>
                        Numero de identificacion del Representante </td><td><select name="numero_de_identificacion_del_contribuyente">
                    <option>042601558</option>
               </select> <a href="IngresarRepresentante.jsp">Ingresar Nuevo Representante</a></td>
		</tr>
                <tr>
                    <td>
                        Clave </td><td><input type="text" name="clave" value="${sessionScope.usuario.clave}"/></td>
                </tr>
                <tr>
                    <td>
		Razon social</td><td><textarea name="razon_social">
                    ${sessionScope.usuario.razonSocial}
                </textarea></td>
                </tr>
                <tr>
                    <td>
		Periodo de declaracion de IVA </td><td><select name="periodo_de_declaracion_de_IVA">
                    <option>mensual</option>
                    <option>semestral</option>
                </select></td></tr>
                <tr>
                    <td>
		correo_electronico </td><td><input type="text" value="${sessionScope.usuario.correoElectronico}" name="correo_electronico"/></td>
		</tr>
                <tr>
                    <td>
                        provincia </td><td><input type="text" name="provincia" value="${sessionScope.usuario.provincia}"/></td>
		</tr>
                <tr><td>
                        ciudad </td><td><input type="text" name="ciudad" value="${sessionScope.usuario.ciudad}"/></td>
                </tr>
                <tr><td>
                Enviar un correo para avisar el próximo pago (<input value="${sessionScope.usuario.alertaCorreoIva}" type="text" name="correoIVA" value=""/> días antes) de impuesto al valor agregado.</td>
                </tr>
                <tr><td>
                Enviar un correo para avisar el próximo pago ((<input value="${sessionScope.usuario.alertaCorreoIr}" type="text" name="correoIR" value=""/> días antes) del impuesto a la renta.</td>
                   </tr>
                <input type="hidden" name="opcion" value="actualizar"/>
                <tr><td>
                <input type="submit" value="Guardar"/></td>
                </tr>
		</table>
            </form>
        </div>
    </body>
</html>
