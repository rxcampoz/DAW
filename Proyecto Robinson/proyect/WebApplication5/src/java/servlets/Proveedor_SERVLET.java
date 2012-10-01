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
 * @author Robinson
 */
public class Proveedor_SERVLET extends HttpServlet {

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String opcion = request.getParameter("opcion");
        
        if(opcion.equalsIgnoreCase("guardar")){
        
            Proveedor p =  new Proveedor(request.getParameter("rucOCedula"));
            
            p.setCoorX(request.getParameter("coorX"));
            p.setCoorY(request.getParameter("coorY"));
            p.setDirecion(request.getParameter("direccion"));
            p.setRazonSocial(request.getParameter("razonSocial"));
            p.setTelefono(request.getParameter("telefono"));
            
            Modelo.guardar(p);
            
            response.sendRedirect("IngresarFacturaEgreso.jsp");
            
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

   
}
