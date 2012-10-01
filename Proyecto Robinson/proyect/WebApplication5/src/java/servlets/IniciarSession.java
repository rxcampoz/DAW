/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DB.Modelo;
import DB.Sesion;
import hibernate.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Robinson
 */
public class IniciarSession extends HttpServlet {

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
       HttpSession session = request.getSession();
      // Sesion sesion = new Sesion(request.getParameter("usuario"),request.getParameter("clave"));
       Modelo m = new Modelo();
       Usuario usuario = m.getUsuarioByUsuarioClave(request.getParameter("usuario"),request.getParameter("clave") );
       session.setAttribute("usuario", usuario);
       
      
       
       /*Sesion d = ((Sesion)session.getAttribute("sesion"));
       out.println(d.getUsuario());
       out.println(d.getClave());*/
       
       
      response.sendRedirect("Principal.jsp");
            
    }

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

   
}
