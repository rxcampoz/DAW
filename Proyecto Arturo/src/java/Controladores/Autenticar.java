/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Hibernate.Helper;
import Modelo.Empleado;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Xtratech
 */
public class Autenticar extends HttpServlet {
   
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
            String user = request.getParameter("usuario");
            String pass = request.getParameter("pwd");
            String uri = request.getParameter("uri");
            Helper uh = new Helper();

            String opcion = request.getParameter("op");
            Empleado us =(Empleado) uh.getEmpleadoByUser(user);

            if(opcion.equals("iniciarSesion")){
                if(uri.equals("")){
                   uri = getInitParameter("uri");
                }
                if(us!=null){
                    if(pass.equals(us.getPassword()) && (us.getRol().equals("Administrador") || us.getRol().equals("administrador"))){
                        HttpSession sesion= request.getSession();
                        sesion.setAttribute("usuario", us);
                         RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                            rd.forward(request, response);
    
                    }else{
                        if(pass.equals(us.getPassword()) && (us.getRol().equals("Editor") || us.getRol().equals("editor"))){
                            HttpSession sesion= request.getSession();
                            sesion.setAttribute("usuario", us);
                            RequestDispatcher rd = request.getRequestDispatcher("editor.jsp");
                            rd.forward(request, response);
                        }else{
                            //alert();
                            RequestDispatcher rd = request.getRequestDispatcher("inicio_sesion.jsp?uri="+uri+"&op=iniciarSesion");
                            rd.forward(request, response);
                        }
                    }
                }else{
                    RequestDispatcher rd = request.getRequestDispatcher("inicio_sesion.jsp?uri="+uri+"&op=iniciarSesion");
                    rd.forward(request, response);
                }
            }else  if(opcion.equals("cerrarSesion")){
                    request.getSession().invalidate();
                    RequestDispatcher rd = request.getRequestDispatcher("inicio_sesion.jsp?uri="+uri+"&op=iniciarSesion");
                    rd.forward(request, response);

            }
        } catch (Throwable t) {
	    // If an exception is thrown somewhere down the filter chain,
	    // we still want to execute our after processing, and then
	    // rethrow the problem after that.
	    RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
//
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
