<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,Hibernate.Helper"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="<%=request.getContextPath()%>/CSS/stylevisitante.css" rel="stylesheet" type="text/css" media="screen" />
        
        <link href="CSS/estiloFormulario.css" type="text/css" rel="stylesheet"  media="screen" />
        <script language="javascript" type ="text/javascript" src="${pageContext.request.contextPath}/Js/scripts.js"></script>
        <link rel="stylesheet" type="text/css"  href="http://yui.yahooapis.com/2.7.0/build/fonts/fonts-min.css"  />
        <link rel="stylesheet" type="text/css"  href="http://yui.yahooapis.com/2.7.0/build/datatable/assets/skins/sam/datatable.css"  />
        <link rel="stylesheet" type="text/css"  href="http://yui.yahooapis.com/2.7.0/build/paginator/assets/skins/sam/paginator.css"/>
        <script type="text/javascript"  src="http://yui.yahooapis.com/2.7.0/build/yahoo-dom-event/yahoo-dom-event.js"></script>
        <script type="text/javascript"  src="http://yui.yahooapis.com/2.7.0/build/element/element-min.js"></script>
        <script type="text/javascript"  src="http://yui.yahooapis.com/2.7.0/build/datasource/datasource-min.js"></script>
        <script type="text/javascript"  src="http://yui.yahooapis.com/2.7.0/build/datatable/datatable-min.js"></script>
        <script type="text/javascript"  src="http://yui.yahooapis.com/2.7.0/build/paginator/paginator-min.js"></script>
        <script type="text/javascript" src="Js/yui.js"></script>
        <script type="text/javascript" src="yui.js"></script>
        <script language="JavaScript" src="Js/funcion.js"></script>
        <script type="text/javascript" src="Js/jquery-1.3.2.min.js"></script>
        <script type="text/javascript" src="Js/core.js"></script>
        <script type="text/javascript" src="pngFix/jquery.pngFix.js"></script>
        <script type="text/javascript" src="prettyphoto/js/jquery.prettyPhoto.js"></script>
        <title>Consultar Empleados</title>
    </head>
    <body class="yui-skin-sam">
         <div id="main">
            <div id="banner">

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


            <div id="content">
                <table id="tab" class="tabla">
                            <thead>
                                <th>Codigo</th>
                                <th>Nombres</th>
                                 <th>Apellidos</th>
                                <th>Cedula</th>
                                <th>Rol</th>
                                <th>User</th>
                                <th>Telefono</th>
                                <th>Direccion</th>
                                <th>Estado</th>

                            </thead>
                            <jsp:useBean id="helper" class="Hibernate.Helper" type="Hibernate.Helper" scope="page"/>
                            <tbody>
                                <c:forEach var="empleado" items="${helper.empleado}">
                                    <tr>
                                        <td>${empleado.idempleado}</td>
                                        <td>${empleado.nombres}</td>
                                        <td>${empleado.apellidos}</td>
                                        <td>${empleado.cedula}</td>
                                        <td>${empleado.rol}</td>
                                        <td>${empleado.user}</td>
                                        <td>${empleado.telefono}</td>
                                        <td>${empleado.direccion}</td>
                                        <td>${empleado.estado}</td>

                                        <td><a href="${pageContext.request.contextPath}/ServletEmpleado?comando=edit&id=${empleado.idempleado}">Editar</a></td>
                                        <td><a href="${pageContext.request.contextPath}/ServletEmpleado?comando=delete&id=${empleado.idempleado}">Eliminar</a></td>




                                    </tr>

                                </c:forEach>
                             </tbody>
                        </table>
                            
            </div>
            <div>
                <a href="visitante.jsp">Atras</a>
            </div>
        </div>
        <div id="footer">
            <jsp:include page="Partes/Footer.jsp" />
        </div>
        <script type="text/javascript">
		jGallery('pitch');
	</script>
    </body>
</html>
