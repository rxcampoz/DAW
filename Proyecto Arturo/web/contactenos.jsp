<%-- 
    Document   : contactenos
    Created on : 13/02/2011, 11:00:18 PM
    Author     : Xtratech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=request.getContextPath()%>/CSS/stylevisitante.css" rel="stylesheet" type="text/css" media="screen" />
        <link href="<%=request.getContextPath()%>/CSS/estilo_sidebar.css" rel="stylesheet" type="text/css" media="screen" />
        <script type="text/javascript" src="Js/scriptimagenes.js"></script>
        <link href="CSS/estilocontactos.css" type="text/css" rel="stylesheet"  media="screen" />
        <script type="text/javascript" src="JavaScript/scriptcontactos.js"></script>

        <title>Noti-Espol: Visitante</title>
    <html>

    <body onload="cargarCon();">
        <div id="main">
            <div id="banner" class="curved">

            </div>

            <div id="content" class="curved">
                <div id="izq" class="curved">
                    <jsp:include page="Partes/MenuVisitante.jsp" />
                </div>
            <div id="content" class="curved">
                <div id="izq" class="curved">
                    <jsp:include page="Partes/MenuVisitante.jsp" />
                </div>

                <div id="content-central" class = "curved">
                    <div id="caja-retrato" class ="curved">
                        <div id ="feature-content1" class ="curved">
                            <div class="photo" class ="curved">
                                    <ul class="topic" class="curved">
                                            <li class="active" class="curved"><a class="set">Contactos</a>
                                                    <ul>
                                                            <li><a id="im0" class="tooltip"><span class="critical"></span></a></li>
                                                            <li><a id="im1" class="tooltip"><span class="critical"></span></a></li>
                                                            <li><a id="im2" class="tooltip"><span class="critical"></span></a></li>
                                                            <li><a id="im3" class="tooltip"><span class="critical"></span></a></li>
                                                  </ul>
                                            </li>
                                   </ul>
                                </div>
                            </div>
                     </div>
                     <div id="cajadetalles" class ="curved"></div>

                  </div>

           </div>
              </div>
             </div>
            <div id="footer" class="curved">
                    <jsp:include page="Partes/Footer.jsp" />
            </div>

  
    </body>
</html>
