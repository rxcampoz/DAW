/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import BD.Helper;
import BD.Tupla;
import EntidadesBD.Tema;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
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
 * @author Ricardo
 */
public class administrarTemas extends HttpServlet {

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
        
        
        
        
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        String action=request.getParameter("action");
        if (isMultipart) {
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            try {
                List items = upload.parseRequest(request);
                Iterator iterator = items.iterator();
                LinkedList<Tupla> t = new LinkedList<Tupla>();
                FileItem archivo=null;
                
                //<editor-fold defaultstate="collapsed" desc="Iterando el form multipart">
                while (iterator.hasNext()) {
                    FileItem item = (FileItem) iterator.next();
                    
                    if (!item.isFormField()) {
                        archivo=item;
                    }
                    else{
                        Tupla f = new Tupla();
                        f.setNombre(item.getFieldName());
                        f.setValor(item.getString() );
                        t.add(f);  
                    }                                            
                }
                //</editor-fold>
                
                String accion=t.get(Tupla.getValue(t, "action")).getValor();
                if(accion.equals("regTheme")){                
                    registrarNuevo(request, response,t,archivo);
                }
                else if(accion.equals("updateTheme")){
                    updateTema(request, response,t,archivo);
                }
             
            } catch (FileUploadException e) {
                    e.printStackTrace();
              } catch (Exception e) {
                    e.printStackTrace();
              }           
        }
        else if(action==null){
            response.sendRedirect(request.getContextPath()+"/accesodenegado.jsp");
        }
        else if(request.getParameter("action").equals("deleteTheme")){
            eliminarTema(request, response);
        }
        else if(request.getParameter("action").equals("editTheme"))
                editarTema(request, response);
        
            
    }

    protected void registrarNuevo(HttpServletRequest request, HttpServletResponse response, LinkedList<Tupla> t, FileItem archivo) throws IOException, Exception{
                Helper m=new Helper();
                Tema tema =new Tema();
                
                //<editor-fold defaultstate="collapsed" desc="Grabando archido en el servidor">
                String fileName = archivo.getName();
                String root = getServletContext().getRealPath("/");
                String contentType = archivo.getContentType();
                System.out.println(contentType);
                if(contentType.equals("text/css")){
                        
                File path = new File(root + "/files_and_themes");
                if (!path.exists()) {
                    boolean status = path.mkdirs();
                }
                File uploadedFile = new File(path + "/" + fileName);

                System.out.println(uploadedFile.getAbsolutePath());
                archivo.write(uploadedFile);
                //</editor-fold>
                tema.setIdTema(m.obtenerMaxIDTema()+1);

                tema.setNombre(t.get(Tupla.getValue(t, "nombre")).getValor());
                tema.setDescripcion(t.get(Tupla.getValue(t, "descrpcion")).getValor());
                tema.setPath("files_and_themes/"+fileName);

                m.IniciarTransaccion();
                m.Insert(tema);
                m.ConfirmarTransaccion();
                
                response.sendRedirect(request.getContextPath()+"/administrar_Temas.jsp");
                }
                else{
                    response.sendRedirect(request.getContextPath()+"/errorPage2.jsp");
                }
        }
  
    protected void eliminarTema(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Tema obj;
        Helper m=new Helper();
                m.IniciarTransaccion();
                obj=m.getTemaById(Integer.parseInt(request.getParameter("id")));
                m.Delete(obj);
                m.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/administrar_Temas.jsp");
    }
    
    protected void editarTema(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Tema obj;
     Helper n=new Helper();
                obj=n.getTemaById(Integer.parseInt(request.getParameter("id")));
                request.getSession().setAttribute("editObjeto", obj);
                request.getSession().setAttribute("helper", n);
                response.sendRedirect(request.getContextPath()+"/modificarTema.jsp");
    }
    
    protected void updateTema(HttpServletRequest request, HttpServletResponse response, LinkedList<Tupla> t, FileItem archivo) throws IOException, Exception{
        Tema tema = (Tema)request.getSession().getAttribute("editObjeto");
        Helper mu=(Helper)request.getSession().getAttribute("helper");
               // p.setIdProducto(m.obtenerID()+1);
            //<editor-fold defaultstate="collapsed" desc="Grabando archido en el servidor">
                String fileName = archivo.getName();
                String root = getServletContext().getRealPath("/");
                String contentType = archivo.getContentType();
                System.out.println(contentType);
                if(contentType.equals("text/css")){        
                File path = new File(root + "/files_and_themes");
                if (!path.exists()) {
                    boolean status = path.mkdirs();
                }
                File uploadedFile = new File(path + "/" + fileName);

                System.out.println(uploadedFile.getAbsolutePath());
                archivo.write(uploadedFile);
                //</editor-fold>    
                tema.setNombre(t.get(Tupla.getValue(t, "nombre")).getValor());
                tema.setDescripcion(t.get(Tupla.getValue(t, "descripcion")).getValor());
                tema.setPath("files_and_themes/"+fileName);
            
                mu.IniciarTransaccion();
                mu.Update(tema);
                mu.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/administrar_Temas.jsp");
                }
                else{
                    response.sendRedirect(request.getContextPath()+"/errorPage2.jsp");
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
