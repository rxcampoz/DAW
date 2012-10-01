/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import BD.Helper;
import EntidadesBD.Articulo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ricardo
 */
public class administrarArticulos extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            String accion=request.getParameter("action");
            if(accion==null){
                response.sendRedirect(request.getContextPath()+"/accesodenegado.jsp");
            }
            else if(request.getParameter("action").equals("regArt")){
                registrarNuevo(request, response);
            }
            else if(request.getParameter("action").equals("editArt"))
                editarArticulo(request, response);
            else if(request.getParameter("action").equals("updateArt"))
                updateArticulo(request, response);
            else if(request.getParameter("action").equals("deleteArt")){
                eliminarArticulo(request, response);
            }
            else{
                response.sendRedirect(request.getContextPath()+"/accesodenegado.jsp");
            }
                
            
        } finally {            
            out.close();
        }
    }
    
    protected void registrarNuevo(HttpServletRequest request, HttpServletResponse response) throws IOException{
            Helper m=new Helper();
            Articulo articulo =new Articulo();
           
            articulo.setIdArticulo(m.obtenerMaxIDArticulo()+1);
            
            articulo.setTitulo(request.getParameter("titulo"));
            articulo.setContenido(request.getParameter("contenido"));
            articulo.setTipo(request.getParameter("tipo"));
                      
           m.IniciarTransaccion();
             m.Insert(articulo);
            m.ConfirmarTransaccion();
            response.sendRedirect(request.getContextPath()+"/administrar_Articulos.jsp");
    }
    
    protected void eliminarArticulo(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Articulo obj;
        Helper m=new Helper();
                m.IniciarTransaccion();
                obj=m.getArticuloById(Integer.parseInt(request.getParameter("id")));
                m.Delete(obj);
                m.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/administrar_Articulos.jsp");
    }
    
    protected void editarArticulo(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Articulo obj;
     Helper m=new Helper();
                obj=m.getArticuloById(Integer.parseInt(request.getParameter("id")));
                request.getSession().setAttribute("editObjeto", obj);
                request.getSession().setAttribute("helper", m);
                response.sendRedirect(request.getContextPath()+"/modificarArticulo.jsp");
    }
    
    protected void updateArticulo(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Articulo articulo = (Articulo)request.getSession().getAttribute("editObjeto");
        Helper mu=(Helper)request.getSession().getAttribute("helper");
               // p.setIdProducto(m.obtenerID()+1);
            
            articulo.setTitulo(request.getParameter("titulo"));
            articulo.setContenido(request.getParameter("contenido"));
            articulo.setTipo(request.getParameter("tipo"));
            
                mu.IniciarTransaccion();
                
                mu.Update(articulo);
                
                mu.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/administrar_Articulos.jsp");
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
