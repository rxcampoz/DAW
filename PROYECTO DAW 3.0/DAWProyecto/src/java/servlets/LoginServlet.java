/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import BD.Helper;
import EntidadesBD.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;

/**
 *
 * @author Daco
 */
public class LoginServlet extends HttpServlet {

    protected int obtenerRolUsuario(long id_usuario){
        Helper helper = new Helper();
        
        
        return helper.getRol(id_usuario);
    }
    
    protected Usuario existeUsuario(String user, String password){
        boolean rep = false;
        Helper helper = new Helper();
        Usuario usuario = new Usuario();
        usuario = helper.getUsuario(user, password);
        
        return usuario;
    }
    
    protected String getRolUsuario(int id){
    Helper helper=new Helper();
    String rol=helper.obtenerRol(id);
    return rol;      
    }
    
    protected List<String> getListaRolesUsuario(int id){
    Helper helper=new Helper();
    List<String> roles=helper.obtenerListaRoles(id);
    return roles;      
    }
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String opcion=request.getParameter("action");
        if(opcion==null){
            String user = request.getParameter("user");
            String password = request.getParameter("clave");
            Usuario u = existeUsuario(user, password);
            if(u!=null){
                HttpSession session = request.getSession();
                String nombre = u.getNombre();
                String apellido = u.getApellido();
                String rol=getRolUsuario((int)u.getIdUsuario());
                List<String> roles=getListaRolesUsuario((int)u.getIdUsuario());
                System.out.println(nombre+apellido);
                System.out.println("rol: "+rol);

                session.setAttribute("usuario", u);
                session.setAttribute("rol", rol);
                session.setAttribute("listaRoles", roles);
                String uri=request.getParameter("uri");
                System.out.println("voy a "+uri);
                if(!(uri.equals(""))){
                   if(uri.equals("/administrar_Articulos.jsp")){
                       RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Controlador?action=admArt");
                        dispatcher.forward(request,response);
                   }
                   else if(uri.equals("/Administrar_usuario.jsp")){
                       RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Controlador?action=admUser");
                        dispatcher.forward(request,response);
                   }
                   else if(uri.equals("/administrar_Productos.jsp")){
                       RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Controlador?action=admPro");
                        dispatcher.forward(request,response);
                   }
                   else if(uri.equals("/administrar_Temas.jsp")){
                       RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Controlador?action=admThemes");
                        dispatcher.forward(request,response);
                   }
                   
                   else if(uri.equals("/registrarUsuario.jsp")){
                       RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Controlador?action=toUser");
                        dispatcher.forward(request,response);
                   }
                   else if(uri.equals("/registrarProducto.jsp")){
                       RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Controlador?action=toPro");
                        dispatcher.forward(request,response);
                   }
                   else if(uri.equals("/registrarTemas.jsp")){
                       RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Controlador?action=toThemes");
                        dispatcher.forward(request,response);
                   }
                   else if(uri.equals("/registrarArticulo.jsp")){
                       RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Controlador?action=toArt");
                        dispatcher.forward(request,response);
                   }
                   else{
                       request.getRequestDispatcher("inicio.jsp").forward(request, response);
                   }
                
                    
                    //request.getRequestDispatcher(uri).forward(request, response);
                }
                else{
                    request.getRequestDispatcher("inicio.jsp").forward(request, response);
                }
            }else{
                response.sendRedirect(request.getContextPath()+"/inicio.jsp");
            }
        }else if(opcion.equals("logout")){
            HttpSession session = request.getSession();
            session.invalidate();
            response.sendRedirect(request.getContextPath()+"/inicio.jsp");
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
