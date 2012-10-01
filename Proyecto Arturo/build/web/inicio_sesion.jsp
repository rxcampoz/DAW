<%-- 
    Document   : inicio_sesion
    Created on : 07/02/2011, 12:29:55 PM
    Author     : Xtratech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=request.getContextPath()%>/CSS/estilo.css" rel="stylesheet" type="text/css" media="screen" />

        <title>NOTI-ESPOL</title>

    </head>
    <body>
        <body id="body">
		<div id="wrapper">
                    <div id="header">
                        <div id="logo">
                            <h1><a>Noticiero</a> </h1>
                        </div>
                    </div>
                      <div id="page">
                        <div id="content">
                            <div class="post">
                                <h2 class="title"><a href="#">NOTI-ESPOL</a></h2>
                                <p class="meta"><span class="date">Febrero, 2011</span><span class="posted"> Proyecto DAW</span></p>
                                <div class="entry">
                                    <p> NOTI-ESPOL es un sitio web diseñado para reportar las &uacute;ltimas noticias que esten aconteciendo en el Ecuador, inform&aacute;ndote las 24 horas del d&iacute;a.
                                        En esta aplicaci&oacute;n los usuarios podr&aacute;n interactuar con sitos web  como twitter, facebook y GoogleMap para tomar ventajas de las nuevas tecnolog&iacute;a.
                                    </p>
                                    <h4>Desarrolladores:</h4>
                                    <p><span class="posted">-Narcisa C&eacute;lleri</span></p>
                                    <p><span class="posted">-Luis Pincay </span></p>
                                    <p><span class="posted">-Arturo Tumbaco</span></p>
                                    <p><span class="posted">-Gonzalo Fienco</span></p>
                                </div>
                            </div>
                            <div style="clear: both;">&nbsp;</div>
                        </div>
                        <div>
                            <span>
                                <div>
                                    <h1>Nota:</h1>
                                    <p>
                                        Si no eres miembro de nuestro noticiero
                                        ingresa como:
                                    <a href="visitante.jsp"> Visitante</a>
                                    </p>
                                </div>
                            </span>
                      </div>
                </div>
                <div id="bodyPan">
                    <c:if test="${empty usuario.user}"><jsp:include page="Partes/Login.jsp" /> </c:if>
                </div>
           </div>
    </body>
</html>
