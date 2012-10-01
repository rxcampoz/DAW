<%-- 
    Document   : modificarSeccion
    Created on : 09/02/2011, 11:12:31 PM
    Author     : Xtratech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/estiloFormulario.css" type="text/css" rel="stylesheet"  media="screen" />
        <link href="CSS/styleMenu.css" rel="stylesheet" type="text/css" media="screen" />

        <title>Modificar Secci&oacute;n</title>
    </head>
    <body>
        <h1>Modificar de Secci&oacute;n</h1>
        <div id="main1">
            <div id="banner" class="curved">

            </div>
            <jsp:include page="Partes/Menu.jsp" />

            <div id="content" class="curved">
                <div id="cajadatosformulario" class="curved">
                   <form name="form" action="${pageContext.request.contextPath}/ServletSeccion" onSubmit="return chequearTextos(); " method="post">
                        <fieldset class="fieldset">
                            <legend>Secciones de NOTI-ESPOL</legend>
                            <br/><br/>
                            <label>Nombre:</label>
                           <input type="text" name="nombre" value="${editObjeto.nombre}" onkeypress=" return validarletra(event)" />
                            <br/><br/>
                             <label>Estado </label>
                                    <select id="comboEstado" name="comboEstado">
                                        <option value="${editObjeto.estado}" name="estado">Activo</option>
                                        <option value="${editObjeto.estado}" name="estado">Inactivo</option>
                                    </select>   <br/><br/>
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

