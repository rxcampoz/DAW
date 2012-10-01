/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DB.Modelo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernate.*;

/**
 *
 * @author Darius
 */
public class Cliente_SERVLET extends HttpServlet {

    
    

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out =  response.getWriter();
        String opcion = request.getParameter("opcion");
        
        if(opcion.equalsIgnoreCase("guardar")){
           
        Cliente c = new Cliente();
        
        c.setRucOcedula(request.getParameter("cedulaOruc"));
        c.setDireccion(request.getParameter("direccion"));
        c.setTelefono(request.getParameter("telefono"));
        c.setNombre(request.getParameter("nombre"));
        
        Modelo.guardar(c);
       
        response.sendRedirect("IngresarFacturaIngreso.jsp");
     
     
        }
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    
}
