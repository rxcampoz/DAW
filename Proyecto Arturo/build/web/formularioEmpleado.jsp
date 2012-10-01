<%-- 
    Document   : formularioEmpleado
    Created on : 09/02/2011, 01:52:16 AM
    Author     : COMANDATO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/estiloFormulario.css" type="text/css" rel="stylesheet"  media="screen" />
        <link href="CSS/styleMenu.css" rel="stylesheet" type="text/css" media="screen" />
        <script type="text/javascript" src="Js/scriptvalidarEmpleado.js"></script>
        <title>Ingreso Empleado</title>
    </head>
    <body>      
        <div id="main1">
            <div id="banner" class="curved">
            </div>
            <jsp:include page="Partes/Menu.jsp" />
           
            <div id="content" class="curved">
                <div id="cajadatosformulario" class="curved">
                    <div id="barraEmpleado">
                        <h1>Registro de Empleado</h1>
                   <form name="form" action="<%=request.getContextPath()%>/ServletEmpleado?comando=insert" onSubmit="return chequearTextos(); " method="post">

                       <fieldset class="fieldset">
                            <legend>Datos personales</legend>

                            <label>Nombres:</label>
                            <input type="text" name="nombres" value="" onkeypress=" return validarletra(event)" />

                            <label>Apellidos:</label>
                            <input type="text" name="apellidos" value="" onkeypress=" return validarletra(event)" />

                            <br/><br/>
                            <label>Telefono:</label>
                            <input type="text" name="telefono" value=""onkeypress="return validarnumero(event)" maxlength="10" />

                            <label>Cedula:</label>
                            <input type="text" name="cedula" value=""onkeypress="return validarnumero(event)" maxlength="10"/>

                            <br/><br/>
                            <label>Direccion:</label>
                            <input type="text" name="direccion" size="20" value="" onkeypress=" return validarletra(event)" />

                            <label>Estado:</label>
                            <select id="comboEstado" name="comboEstado">
                                    <option value="" name="uno">Activo</option>
                            </select>
                       </fieldset>
                       <fieldset class="fieldset">
                            <legend>Seguridad</legend>

                            <label>User:</label>
                            <input type="text" name="user"/>
                            <label>Password:</label>
                            <input type="password" name="password"/><br/><br/>

                            <label>Rol:</label>
                            <select id="rol" name="rol">
                                    <option value="Administrador">Administrador</option>
                                    <option value="Editor" >Editor</option>
                            </select><br/><br/>
                            <input type="submit" name="submit" value="Guardar"/>
                        </fieldset>

                    </form>
                    </div>
                   
                </div>
            </div>

        </div>
        <div id="footer">
            <jsp:include page="Partes/Footer.jsp" />
        </div>
    
    </body>
</html>
