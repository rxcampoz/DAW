<%-- 
    Document   : modificarRecurso
    Created on : 10/02/2011, 02:22:01 PM
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

        <title>Modificar Recurso Multimedio</title>
    </head>
    <body>
        
        <div id="main1">
            <div id="banner" class="curved">

            </div>
            <jsp:include page="Partes/Menu.jsp" />

            <div id="content" class="curved">
                <div id="cajadatosformulario" class="curved">
                   <form name="form" action="${pageContext.request.contextPath}/ServletRecursoMultimedio" onSubmit="return chequearTextos(); " method="post">

                       <fieldset class="estiloFieldset">
                                    <legend style="font-weight:bold;"> Datos del Recurso Multimedio </legend>

                                    <label>Tipo de Archivo:</label>
                                    <select id="tipo" name="tipo">
                                        <option value="Fotografia" >Fotograf&iacute;a</option>
                                        <option value="Texto" >Texto</option>
                                    </select><br/><br/><br/>


                                     <label>Archivo:</label>
                                     <input type="file" name="archivo" value="${editObjeto.archivo}"/><br/><br/>


                                     <label>Descripci&oacute;n: </label>
                                     <input type="text" id="descripcion" name="descripcion" value="${editObjeto.descripcion}" size="60"/><br/><br/>

                                    <label>Estado </label>
                                    <select id="estado" name="estado">
                                            <option value="Activo">Activo</option>
                                            <option value="Inactivo">Inactivo</option>
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
