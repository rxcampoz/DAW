<%--
    Document   : noticias
    Created on : 12/02/2011, 01:29:10 PM
    Author     : Luis Pincay - Narcisa Celleri
                 Arturo Tumbaco - Gonzalo Fienco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,Hibernate.Helper"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=request.getContextPath()%>/CSS/stylevisitante.css" rel="stylesheet" type="text/css" media="screen" />
         <link href="<%=request.getContextPath()%>/CSS/estilo_sidebar.css" rel="stylesheet" type="text/css" media="screen" />
                <script language="JavaScript" src="Js/funcion.js"></script>
		<script type="text/javascript" src="Js/jquery-1.3.2.min.js"></script>
		<script type="text/javascript" src="Js/core.js"></script>
		<script type="text/javascript" src="pngFix/jquery.pngFix.js"></script>
		<script type="text/javascript" src="prettyphoto/js/jquery.prettyPhoto.js"></script>
         <link type="text/css" href="${pageContext.request.contextPath}/CSS/estiloBR.css" rel="stylesheet" />
         <script src="http://maps.google.com/maps?file=api&amp;v=2&amp;sensor=true_or_false&amp;key=ABQIAAAA28CBlxRlcN9q_81KcFzd5hS_AbjPT-xPDs6zEips3Nuedhd57xT31m0qdNzWqgz-gTceBqz8W2skog" type="text/javascript"></script>
         <script type="text/javascript" src="${pageContext.request.contextPath}/Js/markerclusterer.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/Js/scripts.js"></script>

        <title>Noti-Espol: Visitante Google Map</title>
    </head>
    <body  onunload="GUnload()">
        <div id="main">
            <div id="banner" class="curved">
            </div>
           <div id="header" class="curved">
               <div id="pitch">
                    <div class="pitch-gallery">
                            <div class="pitch-gallery-holder" id="gallery-pitch-holder">
                                    <div class="pitch-gallery-div">
                                            <img src="imagenes/famosos.png" alt="famosos" />
                                            <div class="infoline"> <strong> Enterate</strong>- Siempre al d&iacute;a con nuestros famosos</div>
                                    </div>
                                    <div class="pitch-gallery-div">
                                            <img src="imagenes/DEPORTES.png" alt="deportes" />
                                            <div class="infoline"><strong> Informate</strong>  - Sobre los diversos Deportes de nuestros pa&iacute;s .</div>
                                    </div>
                                    <div class="pitch-gallery-div">
                                            <img src="imagenes/DESASTRES.jpg" alt="desastres" />
                                            <div class="infoline">Conoce de los &uacute;ltimos acontecimientos de nuestro pa&iacute;s.</div>
                                    </div>
                                    <div class="pitch-gallery-div">
                                            <img src="imagenes/iglesias.png" alt="iglesias" />
                                            <div class="infoline">Conoce  los lugares tur&iacute;sticos del Ecuador</div>
                                    </div>

                            </div>
                    </div>
                </div>
           </div>


            <div id="content" class="curved">
                <div id="izq" class="curved">
                    <div id="sidebar1" class="sidebar">
                        <br/><br/><h2>** Menu Vistas **</h2><br/><br/>
                        <ul>
                            <li><a href="#" onclick="initialize();">Noticias Detalladas</a></li>
                            <li><a href="#" onclick="initialize2();">Noticias por Palabras Claves</a></li>
                            <li><a href="visitante.jsp">Inicio</a></li>
                        </ul>
                    </div>
                    
                </div>
                
                <div id="content-informacion" class="curved">
                    <div id="barraNoticia">
                        Mapa: <div id="mapa_Google"></div>
                    </div>
                </div>

             </div>

       </div>
            <div id="footer" class="curved">
                    <jsp:include page="Partes/Footer.jsp" />
            </div>

        <script type="text/javascript">
		jGallery('pitch');
	</script>
    </body>
</html>