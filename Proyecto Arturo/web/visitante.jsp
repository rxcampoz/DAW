<%-- 
    Document   : visitante
    Created on : 10-feb-2011, 11:45:30
    Author     : Gonzalo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,Hibernate.Helper"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=request.getContextPath()%>/CSS/stylevisitante.css" rel="stylesheet" type="text/css" media="screen" />
        <link href="<%=request.getContextPath()%>/CSS/estilo_sidebar.css" rel="stylesheet" type="text/css" media="screen" />
        <script type="text/javascript" src="Js/scriptimagenes.js"></script>
        <title>Noti-Espol: Visitante</title>
    <html>
   
    <body>
        <div id="main">
            <div id="banner" class="curved">

            </div>

            <div id="content" class="curved">
                <div id="izq" class="curved">
                    <jsp:include page="Partes/MenuVisitante.jsp" />
                </div>
                <div id="content-centro_ini" class="curved">
                     <div class="entry">
                                    <p> NOTI-ESPOL es un sitio web diseñado para reportar las &uacute;ltimas noticias que esten aconteciendo en el Ecuador, inform&aacute;ndote las 24 horas del d&iacute;a.
                                        En esta aplicaci&oacute;n los usuarios podr&aacute;n interactuar con sitos web  como twitter, facebook y GoogleMap para tomar ventajas de las nuevas tecnolog&iacute;a.
                                    </p>
                     </div>
                    
                    <div id="contenedorfoto" class="curved">
                        <img alt=""  border="1" src="imagenes/ImagenesLightbox/logotipo.png" width="271" height="240" id="fotos">
                    </div>

                    <script language="JavaScript">
                         ImagenesAutomaticas("fotos","imagenes/ImagenesLightbox/CANDIDATAS.png;imagenes/ImagenesLightbox/laboratorio.png;imagenes/ImagenesLightbox/DENUNCIAS.png;imagenes/ImagenesLightbox/carros.png;" + "imagenes/ImagenesLightbox/ballet.png",5);
                    </script>
                </div>
                <div id="der" class="curved">

                </div>
                
            </div>
        </div>
        <div id="footer" class="curved">
             <jsp:include page="Partes/Footer.jsp" />
        </div>
    </body>
</html>
