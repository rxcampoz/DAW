/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import BD.Helper;
import EntidadesBD.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Antenas
 */
public class administrar_usuarios extends HttpServlet {

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
            String action=request.getParameter("action");
            if(action==null){
            response.sendRedirect(request.getContextPath()+"/accesodenegado.jsp");
            }
            else if(request.getParameter("action").equals("regUser")){
                registrarNuevo(request, response);
            }
            else if(request.getParameter("action").equals("editUser"))
                editarUsuario(request, response);
            else if(request.getParameter("action").equals("updateUser"))
                updateUsuario(request, response);
            else if(request.getParameter("action").equals("deleteUser")){
                eliminarUsuario(request, response);
            }
            else{
                out.println("<h1>Error</h1>");
            }
                
         
        } finally {            
            out.close();
        }
    }
        protected void registrarNuevo(HttpServletRequest request, HttpServletResponse response) throws IOException{
            Helper m=new Helper();
            Usuario u =new Usuario();
           
            u.setIdUsuario(m.obtenerMaxIDUsuario()+1);
            
            u.setNombre(request.getParameter("nombre"));
            u.setApellido(request.getParameter("apellido"));
            u.setNick(request.getParameter("nick"));
            u.setClave(request.getParameter("clave"));
            String[] roles=request.getParameterValues("roles");
            if (roles != null){
                    
                m.IniciarTransaccion();
                m.Insert(u);
                
                for (int i = 0; i < roles.length; i++) 
                  {
                      String rol=roles[i];
                     if(rol.equals("Administrador")){
                         m.asignarRoles(1,(int)m.obtenerMaxIDUsuario()+1);
                     }
                     else if(rol.equals("Administrador de contenidos")){
                         m.asignarRoles(2,(int)m.obtenerMaxIDUsuario()+1);
                     }
                     else if(rol.equals("Administrador de presentacion")){
                         m.asignarRoles(3,(int)m.obtenerMaxIDUsuario()+1);
                     }
                  }
                
            
            
            m.ConfirmarTransaccion();
            response.sendRedirect(request.getContextPath()+"/Administrar_usuario.jsp");
            }
            else{
                m.IniciarTransaccion();
                m.Insert(u);
                m.asignarRoles(3,(int)m.obtenerMaxIDUsuario()+1);
                m.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/Administrar_usuario.jsp");
            }
    }
     protected void eliminarUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Usuario obj;
        Helper m=new Helper();
                m.IniciarTransaccion();
                obj=m.getUsuarioById(Integer.parseInt(request.getParameter("id")));
                m.Delete(obj);
                m.eliminarRol(Integer.parseInt(request.getParameter("id")));
                m.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/Administrar_usuario.jsp");
    }
     protected void editarUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Usuario obj;
     Helper m=new Helper();
                obj=m.getUsuarioById(Integer.parseInt(request.getParameter("id")));
                request.getSession().setAttribute("editObjeto", obj);
                request.getSession().setAttribute("helper", m);
                response.sendRedirect(request.getContextPath()+"/ModificarUsuario.jsp");
    }
     
     protected void updateUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Usuario u = (Usuario)request.getSession().getAttribute("editObjeto");
        Helper mu = (Helper)request.getSession().getAttribute("helper");
               // p.setIdProducto(m.obtenerID()+1);
            
            u.setNombre(request.getParameter("nombre"));
            u.setApellido(request.getParameter("apellido"));
            u.setNick(request.getParameter("nick"));
            u.setClave(request.getParameter("clave"));
            String[] roles=request.getParameterValues("roles");
            if (roles != null){
                    
                mu.IniciarTransaccion();
                mu.Update(u);
                mu.eliminarRol((int)u.getIdUsuario());
                
                for (int i = 0; i < roles.length; i++) 
                  {
                      String rol=roles[i];
                     if(rol.equals("Administrador")){
                         mu.asignarRoles(1,(int)u.getIdUsuario());
                     }
                     else if(rol.equals("Administrador de contenidos")){
                         mu.asignarRoles(2,(int)u.getIdUsuario());
                     }
                     else if(rol.equals("Administrador de presentacion")){
                         mu.asignarRoles(3,(int)u.getIdUsuario());
                     }
                  }
            
            
                mu.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/Administrar_usuario.jsp");
            }
            else{
                 mu.IniciarTransaccion();
                mu.Update(u);
                mu.eliminarRol((int)u.getIdUsuario());
                mu.asignarRoles(3,(int)u.getIdUsuario());
                 mu.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/Administrar_usuario.jsp");
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
