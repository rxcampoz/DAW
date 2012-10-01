/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Hibernate.Helper;
import Modelo.Seccion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Xtratech
 */
public class ServletSeccion extends HttpServlet {
   
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
            String comando=request.getParameter("comando");
            Helper helper=new Helper();

            if(comando==null){
                response.sendRedirect(request.getContextPath()+"/error.jsp");

            }
            else if (comando.compareTo("update")==0){
                Seccion obj = (Seccion)request.getSession().getAttribute("editObjeto");
                obj.setNombre(request.getParameter("nombre"));
                obj.setEstado("Activo");
                helper.IniciarTransaccion();
                helper.Update(obj);
                helper.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/consultarSeccion.jsp");
            }
            else if(comando.compareTo("delete")==0){
                Seccion obj;
                helper.IniciarTransaccion();
                obj=helper.getSeccionById(Integer.parseInt(request.getParameter("id")));
                helper.Delete(obj);
                helper.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/consultarSeccion.jsp");
            }
            else if(comando.compareTo("edit")==0){
                Seccion obj;
                obj=helper.getSeccionById(Integer.parseInt(request.getParameter("id")));
                request.getSession().setAttribute("editObjeto", obj);
                response.sendRedirect(request.getContextPath()+"/modificarSeccion.jsp");
            }
             else if(comando.compareTo("insert")==0){
                Seccion obj = new Seccion();
                obj.setNombre(request.getParameter("nombres"));
                obj.setEstado("Activo");
                helper.IniciarTransaccion();
                helper.Insert(obj);
                helper.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/formularioSeccion.jsp"); //para identificar cada mensaje del proceso

             }else{
                 response.sendRedirect(request.getContextPath()+"/error.jsp");

                //this.MostrarMensaje(out,"Uso incorecto del servlet");
            }
                /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletSeccion</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletSeccion at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
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
