<%-- 
    Document   : noticias
    Created on : 12/02/2011, 01:29:10 PM
    Author     : Luis Pincay - Narcisa Celleri
                 Arturo Tumbaco - Gonzalo Fienco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,Hibernate.Helper"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
        <title>Noti-Espol: Visitante</title>
    </head>
    <body>
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
                    <jsp:include page="Partes/MenuVisitante.jsp" />
                </div>
              
                <div id="content-informacion" class="curved">
                    <div id="barraNoticia">
                        <c:forEach items="${data}" var="row">
                        <ul>
                            <li><p>Titulo: ${row.titulo}</p></li>
                            <li><p>Fecha: ${row.fechaNoticia}</p></li>
                            <li><p>Direccion: ${row.canton} : ${row.direccion} </p></li>
                            <li><p>Introduccion: ${row.noticiaCorta}</p></li>
                            <li><p>Redaccion: ${row.noticiaCompleta}</p><br/><br/></li>
                        </ul>

                    </c:forEach>
                    </div>

                    <div id="social">
                        <a name="fb_share" type="button" share_url="http://localhost:8080/NotiEspol/noticias.jsp" href="http://www.facebook.com/sharer.php">Compartir</a><script src="http://static.ak.fbcdn.net/connect.php/js/FB.Share" type="text/javascript"></script>
                    </div>

                    <div id="tw">
                                <a  onclick="window.open('', 'v', 'width=600,height=500');" target="v" type="button" href="http://twitter.com/share?url=http%3A%2F%2Fbit.ly%2F8Yqclt&via=deswebcom&text= Botón de compartir en Twitter ">Compartir</a><script type="text/javascript"></script>
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
