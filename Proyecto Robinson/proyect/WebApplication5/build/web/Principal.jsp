<%-- 
    Document   : Principal
    Created on : 05-sep-2011, 2:02:47
    Author     : Robinson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Principal</title>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body><div id="footer">
            <p>Bienvebido ${sessionScope.usuario.numeroDeIdentificacionDelUsuario}</p>
            
        </div>
        <div id ="menu">
        <ul id="header">
            <li><a href="Editar_Configuraciones_Usuario.jsp">Editar configuracion de Usuario</a></li>
            <li><a href="Administracion_de_ingresos.jsp">Administración de ingresos</a></li>
            <li><a href="Administracion_de_egresos.jsp">Administración de egresos</a></li>
         </ul>
          <ul id="header">  
            <li><a href="PagoDeImpuestos.jsp">Pago de impuestos</a></li>
            <li><a href="Control_de_gastos.jsp">Control de gastos</a></li>
            <li><a href="ConfiguracionesDelUsuario.jsp">Configuraciones de usuario</a></li>
            <li><a href="Configuracion_del_Sistema_SERVLET">Configuración del sistema (administrador)</a></li>

           </ul>
        
        </div>
    </body>
</html>
