<%-- 
    Document   : Barra
    Created on : 04-feb-2012, 17:49:32
    Author     : Edward Holguín
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="usuario" class="EntidadesBD.Usuario" scope="session" >
    <c:set var="usuario2" target="${usuario}"></c:set>
</jsp:useBean>
<nav>
    <ul class="menu">
        <li><a>Administrar</a>
            <ul class="subMenu">
                <c:if test='${(sessionScope.rol == "administrador") || (sessionScope.rol == "administrador de contenidos")}'>
                    <li><a href="${pageContext.servletContext.contextPath}/Controlador?action=admArt" >Contenidos</a></li>
                </c:if>
                <c:if test='${(sessionScope.rol == "administrador") || (sessionScope.rol == "administrador de contenidos")}'>
                    <li><a href="${pageContext.servletContext.contextPath}/Controlador?action=admPro">Productos</a></li>
                </c:if>
                <c:if test='${(sessionScope.rol == "administrador") || (sessionScope.rol == "administrador de presentacion")}'>
                    <li><a href="${pageContext.servletContext.contextPath}/Controlador?action=admThemes">Temas</a></li>
                </c:if>
                <c:if test='${(sessionScope.rol == "administrador")}'>
                    <li><a href="${pageContext.servletContext.contextPath}/Controlador?action=admUser">Usuarios</a></li>
                </c:if>

            </ul>
        </li>
        <li>
            <a href="${pageContext.servletContext.contextPath}/inicio.jsp">Inicio</a>
        </li>    
        <li>
            <form action="Controlador?action=cambiarRol" method="POST">
                <label id="lb">${sessionScope.rol}: ${usuario.nombre} ${usuario.apellido}</label>
                <select id="roles" name="roles" >
                    <c:forEach var="rol" items="${sessionScope.listaRoles}">
                <option value="${rol}">
                    <c:choose>
                        <c:when test='${rol=="1"}'>
                            Administrador
                        </c:when>
                        <c:when test='${rol=="2"}'>
                            Administrador de contenidos
                        </c:when>
                        <c:otherwise>
                           Administrador de presentacion
                        </c:otherwise>
                    </c:choose>
                </option>
                    </c:forEach>
                </select>
                
                
                <input id="cr" type="submit" value="Cambiar Rol" />
                <input id="lo" type="button" value="Logout" onclick="window.location='Controlador?action=logout'"/>
            </form>
        </li>
    </ul>
    <div id="likeFB" class="fb-like" data-href="http://www.facebook.com/pages/Cholo-Machine-Community/332506413454779" data-send="false" data-layout="button_count" data-width="450" data-show-faces="true" data-colorscheme="dark"></div>            
</nav>
