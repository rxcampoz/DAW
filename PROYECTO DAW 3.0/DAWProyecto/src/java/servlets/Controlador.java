/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import BD.Tupla;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Ricardo <rxcampoz>
 */
public class Controlador extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, FileUploadException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
            String accion=request.getParameter("action");
                        
            //Desde la OmniBarra
            if(accion.equals("admUser")){                
                response.sendRedirect(request.getContextPath()+"/Administrar_usuario.jsp");
                }
            else if(accion.equals("admThemes")){
                response.sendRedirect(request.getContextPath()+"/administrar_Temas.jsp");
            }
            else if(accion.equals("admPro")){
                response.sendRedirect(request.getContextPath()+"/administrar_Productos.jsp");
            }
            else if(accion.equals("admArt")){
                response.sendRedirect(request.getContextPath()+"/administrar_Articulos.jsp");
            }
            
            else if(accion.equals("cambiarRol")){
                String next = "/CambiarRol";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(next);
                dispatcher.forward(request,response);
            }
            
            //Para redireccionado
            else if(accion.equals("toThemes")){
                response.sendRedirect(request.getContextPath()+"/registrarTemas.jsp");
            }
            else if(accion.equals("toPro")){
                response.sendRedirect(request.getContextPath()+"/registrarProducto.jsp");
            }
            else if(accion.equals("toArt")){
                response.sendRedirect(request.getContextPath()+"/registrarArticulo.jsp");
            }
            else if(accion.equals("toUser")){
                response.sendRedirect(request.getContextPath()+"/registrarUsuario.jsp");
            }
                        
            //** Desde Registros
            
            else if(accion.equals("deletePro")){
                String next = "/administrarProductos";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(next);
                dispatcher.forward(request,response);
            }
            
            else if(accion.equals("editPro")){
                String next = "/administrarProductos";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(next);
                dispatcher.forward(request,response);
            }
            
            //Temas
            else if(accion.equals("deleteTheme")){
                String next = "/administrarTemas";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(next);
                dispatcher.forward(request,response);
            }
            
            else if(accion.equals("editTheme")){
                String next = "/administrarTemas";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(next);
                dispatcher.forward(request,response);
            }
            
            //Articulos
            else if(accion.equals("deleteArt")){
                String next = "/administrarArticulos";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(next);
                dispatcher.forward(request,response);
            }
            
            else if(accion.equals("editArt")){
                String next = "/administrarArticulos";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(next);
                dispatcher.forward(request,response);
            }
            
            else if(accion.equals("updateArt")){
                String next = "/administrarArticulos";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(next);
                dispatcher.forward(request,response);
            }
            
            else if(accion.equals("regArt")){
                String next = "/administrarArticulos";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(next);
                dispatcher.forward(request,response);
            }
            //** Para Usuarios
            
            else if(accion.equals("regUser")){
                String next = "/administrar_usuarios";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(next);
                dispatcher.forward(request,response);
            }
            
             else if(accion.equals("editUser")){
                String next = "/administrar_usuarios";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(next);
                dispatcher.forward(request,response);
            }
            
            else if(accion.equals("updateUser")){
                String next = "/administrar_usuarios";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(next);
                dispatcher.forward(request,response);
            }
            
            else if(accion.equals("deleteUser")){
                String next = "/administrar_usuarios";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(next);
                dispatcher.forward(request,response);
            }
            
            //** Para logout
            else if(accion.equals("logout")){
                String next = "/LoginServlet";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(next);
                dispatcher.forward(request,response);
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
        try {
            processRequest(request, response);
        } catch (FileUploadException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (FileUploadException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
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