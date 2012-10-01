<%-- 
    Document   : Login
    Created on : 07/02/2011, 12:35:03 PM
    Author     : Narcisa,Luis,Arturo,Gonzalo
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<div id="ingreso">  <h2><span>INGRESAR</span></h2>
    <form id="formUsuario" name="formUSuario" action="<%=request.getContextPath()%>/Autenticar?op=iniciarSesion" method="post">
        <label class="label01"><strong>User: </strong></label>
        <input type="text" name="usuario" />
        <label class="label02"><strong>Password: </strong></label>
        <input type="password" name="pwd" />
        <div id="leftPango">
            <p class="textposition">
            <a href="#">Al Sistema</a></p>
            <input type="hidden" name="uri" value="<c:out value="${param.uri}" />" />
            <input class="gobutton" type="submit" value="Entrar" />
        </div>
        
    </form>
</div>

