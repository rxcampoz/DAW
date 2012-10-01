/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import BD.Helper;
import EntidadesBD.Articulo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ricardo <rxcampoz>
 */
public class WidgetsXML extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/xml;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            out.println("<data>");
            Helper h=new Helper();
            List<Articulo> lp=h.getArticulos();
            List<Articulo> w = new ArrayList<Articulo>();
            for(int i=lp.size();i>0;i--){
                Articulo a=lp.get(i-1);
                 System.out.println("tipo "+a.getTipo());
                if(a.getTipo().equals("Widget")){
                    w.add(a);
                }                                                      
            }
            System.out.println("tamaño "+w.size());
            int lim=w.size();
            if(lim>4)
                lim=4;
            for(int i=0;i<lim;i++){
                Articulo a=w.get(i);
                out.println("<noticia>");
                out.println("<titulo>"+a.getTitulo()+"</titulo>");
                out.println("<articulo>"+a.getContenido()+"</articulo>");
                out.println("</noticia>");                                                     
            }
            out.println("</data>");  
            
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
