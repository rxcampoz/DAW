<%--
    Document   : formularioRecursos
    Created on : 09/02/2011, 11:27:08 AM
    Author     : luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link href="CSS/estiloFormulario.css" type="text/css" rel="stylesheet"  media="screen" />
       <link href="CSS/styleMenu.css" rel="stylesheet" type="text/css" media="screen" />
       <script type="text/javascript" src="../Js/scriptvalidarformulario.js"></script>
       <title>Noticias: Noti-Espol</title>
       <jsp:include page="Partes/apariencia.jsp" />
         
    </head>
 <body>
     <div id="main1">
            <div id="banner" class="curved">
            </div>
            
            <jsp:include page="Partes/Menu.jsp" />

            <div id="content" class="curved">
                <div id="cajadatosformulario" class="curved">
                    <h1>Registro de Noticia</h1>
                    <div class="yui-g">
                        <form name="form" action="<%=request.getContextPath()%>/ServletRecursoMultimedio?comando=insert" onSubmit="return chequearTextos(); " method="post">
                            <div id=contenedorCentral class ="yui-u first" >
                                <fieldset class="estiloFieldset">
                                    <legend style="font-weight:bold;"> Datos del Recurso Multimedio </legend>
                                    
                                    <label>Tipo de Archivo:</label>
                                    <select id="tipo" name="tipo">
                                        <option value="Fotografia" >Fotograf&iacute;a</option>
                                        <option value="Texto" >Texto</option>
                                    </select><br/><br/><br/>

                                    
                                     <label>Archivo:</label>
                                     <input type="file" name="archivo" /><br/><br/>
                                     

                                     <label>Descripci&oacute;n: </label>
                                     <input type="text" id="descripcion" name="descripcion" size="60"/><br/><br/>
                                     
                                    <label>Estado </label>
                                    <select id="estado" name="estado">
                                            <option value="Activo" >Activo</option>
                                            <option value="Inactivo" >Inactivo</option>
                                    </select><br/><br/>
                                     
                                    <input type="submit" name="submit" value="Guardar"/>
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
