<%-- 
    Document   : BarraLogin
    Created on : Feb 5, 2012, 11:09:52 AM
    Author     : Daco
--%>

<nav>
    <ul class="menu">
        <li>
            <form action="LoginServlet" method="POST">
                <label>Usuario</label>
                <input type="text" name="user" required="required" />
                <label>Password</label>
                <input type="password" name="clave" required="required" />
                <input type="hidden" id="uri" name="uri" value="${param.uri}"/>
                <input type="submit" value="Sign Up" />
            </form>
        </li>
    </ul>
    <div id="likeFB" class="fb-like" data-href="http://www.facebook.com/pages/Cholo-Machine-Community/332506413454779" data-send="true" data-width="450" data-show-faces="false" data-colorscheme="dark"></div>
    
</nav>