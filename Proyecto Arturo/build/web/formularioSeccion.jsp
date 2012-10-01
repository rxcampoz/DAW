<%--
    Document   : formularioSeccion
    Created on : 09/02/2011, 10:45:02 AM
    Author     : temporal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/estiloFormulario.css" type="text/css" rel="stylesheet"  media="screen" />
        <link href="CSS/styleMenu.css" rel="stylesheet" type="text/css" media="screen" />
        <jsp:include page="Partes/apariencia.jsp" />
        <script type="text/javascript" src="Js/scriptvalidarseccion.js"></script>
        <title>Secciones de Noticia</title>
    </head>
    <body>
        <div id="main1">
            <div id="banner" class="curved">
            </div>

            <jsp:include page="Partes/Menu.jsp" />

            <div id="content" class="curved">
                <div id="cajadatosformulario" class="curved">
                    <h1>Registro de Secci&oacute;n</h1>
                    <div class="yui-g">
                       <form name="form" action="<%=request.getContextPath()%>/ServletSeccion?comando=insert" onSubmit="return chequearTextos(); " method="post">
                           <div id=contenedorCentral class ="yui-u first" >
                               <fieldset class="fieldset">
                                    <legend>Secciones de NOTI-ESPOL</legend>
                                    <br/><br/>
                                    <label>Nombre:</label>
                                    <input type="text" name="nombres" value="" onkeypress=" return validarletra(event)" />
                                    <br/><br/>

                                    <label>Estado </label>
                                    <select id="comboEstado" name="comboEstado">
                                            <option value="" name="estado">Activo</option>

                                    </select>
                                      <br/><br/>
                                     <button class="yui-button"><a> Guardar</a></button>
                               </fieldset>
                            </div>
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
