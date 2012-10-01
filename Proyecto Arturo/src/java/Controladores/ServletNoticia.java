/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Hibernate.Helper;
import Modelo.Noticia;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import org.apache.commons.fileupload.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Xtratech
 */
public class ServletNoticia extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/xml");
        PrintWriter out = response.getWriter();
        try {
            String comando=request.getParameter("comando");
            Helper helper=new Helper();
            
            if(comando==null){
                //this.MostrarMensaje(out,"Uso Incorrecto del Servlet");

            }if(comando.compareTo("queryall")==0){
                request.getSession().setAttribute("data", helper.getNoticia());
                //this.MostrarMensaje(out,request.getParameter("id"));
                response.sendRedirect("noticias.jsp"); //redireciono a la pag consulta
            }
            else if(comando.compareTo("informacion")==0){
                Integer id =Integer.valueOf(request.getParameter("id"));
                HttpSession s=request.getSession();
                s.setAttribute("listaNoticias",helper.generarNoticasXid(id));
                request.getRequestDispatcher("presentarNoticia.jsp").forward(request, response);
            }else if(comando.compareTo("porseccion")==0){
                request.getSession().setAttribute("data", helper.getNoticiaBySeccion(Integer.parseInt(request.getParameter("id"))));
                //this.MostrarMensaje(out,request.getParameter("id"));
                response.sendRedirect("noticias.jsp"); //redireciono a la pag consulta
            }            
            else if(comando.compareTo("cargarMarcador")==0){
                    String xml=helper.generaXML_ListaNoticias();
                    out.println(xml);
            }else if (comando.compareTo("update")==0){
                SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
                 String dia,mes,annio;
                Calendar fecha =  Calendar.getInstance();
                 dia = Integer.toString(fecha.get(Calendar.DATE));
                 mes = Integer.toString(fecha.get(Calendar.MONTH));
                annio = Integer.toString(fecha.get(Calendar.YEAR));
                String f = (annio+"-"+mes+"-"+dia);
                Date fec = null;
                try {

                    fec = formatoDelTexto.parse(f);

                } catch (ParseException ex) {

                    ex.printStackTrace();

                }
                Noticia obj = (Noticia)request.getSession().getAttribute("editObjeto");
                //obj.setFechaNoticia(request.getParameter("txFecha"));
                int codseccion = helper.getSeccionByNombre(request.getParameter("seccionombre")).getIdseccion();
                obj.setIdseccion(codseccion);
                int codrecurso = helper.getRecursoByDescrip(request.getParameter("recursoNombre")).getIdrecursoMultimedio();
                obj.setIdrecursoMultimedio(codrecurso);
                obj.setFechaNoticia(fec);
                obj.setProvincia(request.getParameter("provincia"));
                obj.setCanton(request.getParameter("canton"));
                obj.setDireccion(request.getParameter("direccion"));
                obj.setTitulo(request.getParameter("titulo"));
                obj.setNoticiaCorta(request.getParameter("noticorta"));
                obj.setNoticiaCompleta(request.getParameter("noticompleta"));
                obj.setPalabraClave(request.getParameter("palabra"));
                obj.setEstado(request.getParameter("estado"));
                obj.setLongitud(Double.valueOf(request.getParameter("longitud")));
                obj.setLatitud(Double.valueOf(request.getParameter("latitud")));
                helper.IniciarTransaccion();
                helper.Insert(obj);
                helper.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/modificarNoticia.jsp"); //para identificar cada mensaje del proceso

            }
            else if(comando.compareTo("delete")==0){
                Noticia obj;
                helper.IniciarTransaccion();
                obj=helper.getNoticiaById(Integer.parseInt(request.getParameter("id")));
                helper.Delete(obj);
                helper.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/consultarNoticia.jsp");
            }
            else if(comando.compareTo("edit")==0){
                Noticia obj;
                obj=helper.getNoticiaById(Integer.parseInt(request.getParameter("id")));
                request.getSession().setAttribute("editObjeto", obj);
                response.sendRedirect(request.getContextPath()+"/modificarNoticia.jsp");
            }
            else if(comando.compareTo("insert")==0){
                SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
                 String dia,mes,annio;
                Calendar fecha =  Calendar.getInstance();
                 dia = Integer.toString(fecha.get(Calendar.DATE));
                 mes = Integer.toString(fecha.get(Calendar.MONTH));
                annio = Integer.toString(fecha.get(Calendar.YEAR));
                String f = (annio+"-"+mes+"-"+dia);
                Date fec = null;
                try {

                    fec = formatoDelTexto.parse(f);

                } catch (ParseException ex) {

                    ex.printStackTrace();
                }

                Noticia obj = new Noticia();
                obj.setIdempleado(1);
                int codseccion = helper.getSeccionByNombre(request.getParameter("seccionombre")).getIdseccion();
                obj.setIdseccion(codseccion);
                int codrecurso = helper.getRecursoByDescrip(request.getParameter("recursoNombre")).getIdrecursoMultimedio();
                obj.setIdrecursoMultimedio(codrecurso);
                obj.setFechaNoticia(fec);
                obj.setProvincia(request.getParameter("provincia"));
                obj.setCanton(request.getParameter("canton"));
                obj.setDireccion(request.getParameter("direccion"));
                obj.setTitulo(request.getParameter("titulo"));
                obj.setNoticiaCorta(request.getParameter("noticorta"));
                obj.setNoticiaCompleta(request.getParameter("noticompleta"));
                obj.setPalabraClave(request.getParameter("palabra"));
                obj.setEstado("Activo");
                obj.setLongitud(Double.valueOf(request.getParameter("longitud")));
                obj.setLatitud(Double.valueOf(request.getParameter("latitud")));
                helper.IniciarTransaccion();
                helper.Insert(obj);
                helper.ConfirmarTransaccion();
                
                String com=request.getParameter("com");
                if(com.compareTo("editor")==0){
                    response.sendRedirect(request.getContextPath()+"/ingresoNoticia.jsp"); //para identificar cada mensaje del proceso
                }
                else{
                    response.sendRedirect(request.getContextPath()+"/formularioNoticia.jsp"); //para identificar cada mensaje del proceso
                }


            }else if(comando.compareTo("palabraClave")==0){
                String key =request.getParameter("key");
                HttpSession s=request.getSession();
                s.setAttribute("listaNoticias",helper.generarNoticasXKey(key));
                request.getRequestDispatcher("informacionNoticia.jsp").forward(request, response);
            }

            else{
                response.sendRedirect(request.getContextPath()+"/error.jsp");
                //this.MostrarMensaje(out,"Uso incorecto del servlet");
            }/* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletNoticia</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletNoticia at " + request.getContextPath () + "</h1>");
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
