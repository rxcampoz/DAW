<%-- 
    Document   : modificar
    Created on : 14/02/2011, 02:59:19 PM
    Author     : Luis PIncay - Narcisa celleri
                 Arturo Tumbaco - Gonzalo Fienco
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=request.getContextPath()%>/CSS/styleMenu.css" rel="stylesheet" type="text/css" media="screen" />
        <link href="<%=request.getContextPath()%>/CSS/estilo_sidebar.css" rel="stylesheet" type="text/css" media="screen" />
       <script type="text/javascript" src="Js/scriptimagenes.js"></script>
        <title>Noti-Espol: Administrador</title>

    </head>
    <body>
        <div id="main1">

            <div id="banner" class="curved">
            </div>
            <jsp:include page="Partes/Menu.jsp" />
            <div id="content">
                <div id="izquierda">
                </div>
                <div id="feature-contentI" class="curved">
                    <div id="feature">
                        <jsp:include page="Partes/MenuModificar.jsp" />
                    </div>

                </div>

                
            </div>
            
        </div>
        <div id="footer" class="curved">
             <jsp:include page="Partes/Footer.jsp" />
        </div>
    </body>
</html>
