<%-- 
    Document   : ingresoNoticia
    Created on : 16/02/2011, 12:51:45 PM
    Author     : Xtratech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,Hibernate.Helper"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
       <link href="CSS/estiloFormulario.css" type="text/css" rel="stylesheet"  media="screen" />
       <link href="CSS/styleMenu.css" rel="stylesheet" type="text/css" media="screen" />
       <link href="CSS/estiloBR.css" rel="stylesheet" type="text/css" media="screen" />

       <script type="text/javascript" src="Js/scriptvalidarformulario.js"></script>
       <title>Ingreso de Noticia</title>
       <jsp:include page="Partes/apariencia.jsp" />
    </head>
     <body>
          <div id="main1">
            <div id="banner" class="curved">
            </div>

            <jsp:include page="Partes/menuEditor.jsp" />

            <div id="content" class="curved">
                <div id="cajadatosformulario" class="curved">
                    <div id="barraEmpleado">
                    <h1>Registro de Noticia</h1>
                    <div class="yui-g">
                         <form name="form" action="<%=request.getContextPath()%>/ServletNoticia?comando=insert" method="post" onSubmit="return chequearTextos();">
                            <div id=contenedorCentral class ="yui-u first" >
                                <fieldset class="estiloFieldset">
                                    <legend style="font-weight:bold;"> Datos de la Noticia </legend>
                                        <label>Fecha Noticia:</label>
                                        <input type="text" id="fecha" name="fecha"/>

                                        <jsp:useBean id="helper" class="Hibernate.Helper" type="Hibernate.Helper" scope="page"/>

                                        <label>Seccion:</label>
                                        <select id="seccionombre" name="seccionombre">
                                            <c:forEach var="seccion" items="${helper.seccion}">
                                                    <option value="${seccion.nombre}">${seccion.nombre}</option>
                                            </c:forEach>
                                         </select><br/><br/><br/>

                                        <label>Titulo</label>
                                        <input type="text" id="titulo" name="titulo" onkeypress=" return validarletra(event)"/>
                                        <label> Noticia Corta </label>
                                        <input type="text" name="noticorta"/><br/><br/><br/>
                                        <label> Noticia Completa </label>
                                        <input type="text" name="noticompleta"/>

                                </fieldset>

                              <fieldset class="estiloFieldset">
                                  <legend style="font-weight:bold;"> Ubicacion </legend>
                                  <label>Provincia</label>
                                  <input type="text" id="provincia" name="provincia" onkeypress=" return validarletra(event)"/>

                                  <label>Canton</label>
                                  <input type="text" id="canton" name="canton" onkeypress=" return validarletra(event)"/><br/><br/>

                                  <label>Latitud</label>
                                  <input type="text" id="latitud" name="latitud" onkeypress="return validarnumero(event)" maxlength="10"/>

                                  <label>Longitud</label>
                                  <input type="text" id="longitud" name="longitud" onkeypress="return validarnumero(event)" maxlength="10"/><br/><br/>
                                  <label>Direccion:</label>
                                  <input type="text" id="direccion" name="direccion"/><br/><br/>
                              </fieldset>

                               <fieldset class="estiloFieldset">
                                  <legend style="font-weight:bold;"> Recurso Multimedio </legend>
                                        <label>Palabra Clave:</label>
                                        <input type="text" id="palabra" name="palabra"/>
                                        <label>Archivo:</label>
                                        <select id="recursoNombre" name="recursoNombre">
                                        <c:forEach var="recurso" items="${helper.recurso}">
                                                <option value="${recurso.archivo}">${recurso.archivo}</option>
                                        </c:forEach>
                                        </select><br/><br/><br/>


                                        <label>Estado:</label>
                                        <select id="estado" name="estado">
                                           <option value="Activo">Activo</option>
                                           <option value="Inactivo">Inactivo</option>
                                        </select>
                                        <button class="yui-button"><a> Guardar</a></button>
                               </fieldset>
                           </div>
                        </form>
                      </div>
                </div>
             </div>
           </div>
        </div>
        <div id="footer">
            <jsp:include page="Partes/Footer.jsp" />
        </div>
      </body>
</html>