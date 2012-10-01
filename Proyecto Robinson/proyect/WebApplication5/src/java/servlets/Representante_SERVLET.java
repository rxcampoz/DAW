/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernate.*;
import DB.*;
/**
 *
 * @author Robinson
 */
public class Representante_SERVLET extends HttpServlet {

    

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String opcion = request.getParameter("opcion");
        
        if(opcion.equalsIgnoreCase("guardar")){
            Representante r = new Representante() ;
            
            r.setNumeroDeIdentificacionDelContribuyente(request.getParameter("numeroIdentificacion"));
            r.setApellido(request.getParameter("apellido"));
            r.setCorreoElectronico(request.getParameter("correo"));
            r.setNombre(request.getParameter("nombre"));
            r.setTipoDeIdentificacionDelContribuyenteORepresentanteLegal(request.getParameter("tipoIdentificacion"));
           
            Modelo.guardar(r);
            
            response.sendRedirect("Registrarse.jsp");
            
            
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       doGet(request, response);
    }

}
