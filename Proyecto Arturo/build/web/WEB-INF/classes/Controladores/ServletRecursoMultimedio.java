/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Hibernate.Helper;
import Modelo.RecursoMultimedio;
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
public class ServletRecursoMultimedio extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
            String comando=request.getParameter("comando");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Helper helper=new Helper();

            if(comando==null){
                //this.MostrarMensaje(out,"Uso Incorrecto del Servlet");

            }else if(comando.compareTo("queryall")==0){
                request.getSession().setAttribute("data", helper.getSeccion());
                response.sendRedirect(request.getContextPath()+"/admin/consultaDos.jsp"); //redireciono a la pag consulta
            }
            else if (comando.compareTo("update")==0){
                RecursoMultimedio obj = (RecursoMultimedio)request.getSession().getAttribute("editObjeto");
                obj.setArchivo(request.getParameter("archivo"));
                obj.setDescripcion(request.getParameter("descripcion"));
                obj.setTipo(request.getParameter("tipo"));
                obj.setEstado(request.getParameter("estado"));
                helper.IniciarTransaccion();
                helper.Update(obj);
                helper.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/consultarRecursos.jsp");
            }
            else if(comando.compareTo("delete")==0){
                RecursoMultimedio obj;
                helper.IniciarTransaccion();
                obj=helper.getRecursoById(Integer.parseInt(request.getParameter("id")));
                helper.Delete(obj);
                helper.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/consultarRecursos.jsp");
            }
            else if(comando.compareTo("edit")==0){
                RecursoMultimedio obj=new RecursoMultimedio();
                obj=helper.getRecursoById(Integer.parseInt(request.getParameter("id")));
                request.getSession().setAttribute("editObjeto", obj);
                response.sendRedirect(request.getContextPath()+"/modificarRecurso.jsp");
            }
           else if(comando.compareTo("insert")==0){
                RecursoMultimedio obj = new RecursoMultimedio();
                obj.setArchivo(request.getParameter("archivo"));
                obj.setDescripcion(request.getParameter("descripcion"));
//              obj.setTipo(request.getParameter("tipo"));
                obj.setTipo(request.getParameter("tipo"));
                obj.setEstado("Activo");
                helper.IniciarTransaccion();
                helper.Insert(obj);
                helper.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/formularioRecursos.jsp"); //para identificar cada mensaje del proceso

            }else{
                    response.sendRedirect(request.getContextPath()+"/error.jsp");
                //this.MostrarMensaje(out,"Uso incorecto del servlet");
            }/* TODO output your page here

                //this.MostrarMensaje(out,"Uso incorecto del servlet");
            }/* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletRecursoMultimedio</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletRecursoMultimedio at " + request.getContextPath () + "</h1>");
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
