<%-- 
    Document   : editor
    Created on : 16/02/2011, 12:49:44 PM
    Author     : Luis Pincay - Narcisa Celleri
                 Arturo Tumbaco - Gonzalo Fienco
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=request.getContextPath()%>/CSS/styleMenu.css" rel="stylesheet" type="text/css" media="screen" />
        <link href="<%=request.getContextPath()%>/CSS/styleMenu.css" rel="stylesheet" type="text/css" media="screen" />
        <script type="text/javascript" src="Js/scriptimagenes.js"></script>
        <title>Noti-Espol: Editor</title>
    </head>
    <body>
        <input type="hidden" id="com" name="com" value="editor" />

        <div id="main1">

            <div id="banner" class="curved">
            </div>
            <jsp:include page="Partes/menuEditor.jsp" />

            <div id="content">

                     <div id="feature-contentA" class="curved">
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


                <div id="derecha" class="curved">

                </div>
            </div>

        </div>
        <div id="footer" class="curved">
             <jsp:include page="Partes/Footer.jsp" />
        </div>
    </body>
</html>

