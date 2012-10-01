<%-- 
    Document   : modificarEmpleado
    Created on : 09/02/2011, 02:40:35 PM
    Author     : Xtratech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.1//EN"
   "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-us">
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <link href="CSS/estiloFormulario.css" type="text/css" rel="stylesheet"  media="screen" />
        <link href="CSS/styleMenu.css" rel="stylesheet" type="text/css" media="screen" />

        <title>Modificar Empleado</title>
    </head>
    <body>
        
        <div id="main1">
            <div id="banner" class="curved">

            </div>
            <jsp:include page="Partes/Menu.jsp" />

            <div id="content" class="curved">
                <div id="cajadatosformulario" class="curved">
                   <form name="form" action="${pageContext.request.contextPath}/ServletEmpleado" onSubmit="return chequearTextos(); " method="post">

                       <fieldset class="fieldset">
                            <legend>Datos personales</legend>
                           
                            <label>Nombres:</label>
                            <input type="text" name="nombres" value="${editObjeto.nombres}" onkeypress=" return validarletra(event)" />
                            <label>Apellidos:</label>
                            <input type="text" name="apellidos" value="${editObjeto.apellidos}" onkeypress=" return validarletra(event)" />

                            <br/><br/>
                            
                            <label>Telefono:</label>
                            <input type="text" name="telefono" value="${editObjeto.telefono}" onkeypress="return validarnumero(event)" maxlength="10" />
                            <label>Cedula:</label>
                            <input type="text" name="cedula" value="${editObjeto.cedula}" onkeypress="return validarnumero(event)" maxlength="10"/>
                            <br/><br/>
                            
                            <label>Direccion; </label>
                            <input type="text" name="direccion" size="20" value="${editObjeto.direccion}" onkeypress=" return validarletra(event)" />

                            <label>Estado: </label>
                            <select id="estado" name="estado">
                                <option value="${editObjeto.estado}"></option>
                                <option value="Activo" >Activo</option>
                                <option value="Inactivo" >Inactivo</option>
                            </select>
                           
                       </fieldset>
                       <fieldset class="fieldset">
                            <legend>Seguridad</legend>
                           
                            <label>User: </label>
                            <input type="text" name="user" value="${editObjeto.user}"/>
                            <label>Password: </label>
                            <input type="password" name="password" value="${editObjeto.password}"/><br/><br/>

                            <label>Rol:</label>
                            <select id="rol" name="rol">
                                    <option value="${editObjeto.rol}"></option>
                                    <option value="Administrador">Administrador</option>
                                    <option value="Editor" >Editor</option>
                            </select><br/><br/>
                            
                            <input type="submit" name="submit" value="Guardar"/>
                        </fieldset>
                        <input type="hidden" id="comando" name="comando" value="update"/>
                    </form>
                </div>
            </div>

        </div>
        <div id="footer">
            <jsp:include page="Partes/Footer.jsp" />
        </div>



    </body>
</html>

