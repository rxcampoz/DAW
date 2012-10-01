/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import BD.Helper;
import BD.Tupla;
import EntidadesBD.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ricardo <rxcampoz>
 */

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;

 

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.File;
import java.math.BigDecimal;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
import javax.servlet.RequestDispatcher;

public class administrarProductos extends HttpServlet {



protected void processRequest(HttpServletRequest request, HttpServletResponse response)

    throws ServletException, IOException {

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
                if(accion.equals("regPro")){                
                    registrarNuevo(request, response,t,archivo);
                }
                else if(accion.equals("updatePro")){
                    updateProducto(request, response,t,archivo);
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
        else if(request.getParameter("action").equals("deletePro")){
            eliminarProducto(request, response);
        }
        else if(request.getParameter("action").equals("editPro"))
                editarProducto(request, response);
           
    }

    protected void registrarNuevo(HttpServletRequest request, HttpServletResponse response, LinkedList<Tupla> t, FileItem archivo) throws IOException, Exception{
                Helper m=new Helper();
                Producto p =new Producto();
                String carpeta=getInitParameter("carpeta");
                System.out.println(carpeta);
                //<editor-fold defaultstate="collapsed" desc="Grabando archido en el servidor">
                String fileName = archivo.getName();
                String root = getServletContext().getRealPath("/");
                String contentType = archivo.getContentType();
                System.out.println("soy una imagen: "+ contentType);
                if(contentType.equals("image/gif") ||contentType.equals("image/jpeg")){
                
                File path = new File(root + "/"+carpeta);
                if (!path.exists()) {
                    boolean status = path.mkdirs();
                }
                File uploadedFile = new File(path + "/" + fileName);

                System.out.println(uploadedFile.getAbsolutePath());
                archivo.write(uploadedFile);
                //</editor-fold>
                p.setIdProducto(m.obtenerMaxIDProductos()+1);

                p.setMarca(t.get(Tupla.getValue(t, "marca")).getValor());
                p.setModelo(t.get(Tupla.getValue(t, "modelo")).getValor());
                p.setCategoria(t.get(Tupla.getValue(t, "categoria")).getValor());
                p.setTipo(t.get(Tupla.getValue(t, "tipo")).getValor());
                p.setPrecio(new BigDecimal(t.get(Tupla.getValue(t, "precio")).getValor()));
                p.setPath(carpeta+"/"+fileName);

                m.IniciarTransaccion();
                m.Insert(p);
                m.ConfirmarTransaccion();
                
                response.sendRedirect(request.getContextPath()+"/administrar_Productos.jsp");
                }else{
                    response.sendRedirect(request.getContextPath()+"/errorPage.jsp");
                }
                    
        }
  
    protected void eliminarProducto(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Producto obj;
        Helper m=new Helper();
                m.IniciarTransaccion();
                obj=m.getProductoById(Integer.parseInt(request.getParameter("id")));
                m.Delete(obj);
                m.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/administrar_Productos.jsp");
    }
    
    protected void editarProducto(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Producto obj;
     Helper n=new Helper();
                obj=n.getProductoById(Integer.parseInt(request.getParameter("id")));
                request.getSession().setAttribute("editObjeto", obj);
                request.getSession().setAttribute("helper", n);
                response.sendRedirect(request.getContextPath()+"/modificarProducto.jsp");
                //n.cerrarSession();
    }
    
    protected void updateProducto(HttpServletRequest request, HttpServletResponse response, LinkedList<Tupla> t, FileItem archivo) throws IOException, Exception{
        Producto p = (Producto)request.getSession().getAttribute("editObjeto");
        Helper mu=(Helper)request.getSession().getAttribute("helper");
               // p.setIdProducto(m.obtenerID()+1);
            //<editor-fold defaultstate="collapsed" desc="Grabando archido en el servidor">
                String fileName = archivo.getName();
                String root = getServletContext().getRealPath("/");
                String contentType = archivo.getContentType();
                System.out.println(contentType);
                if(contentType.equals("image/gif") ||contentType.equals("image/jpeg")){
                        
                File path = new File(root + "/uploads");
                if (!path.exists()) {
                    boolean status = path.mkdirs();
                }
                File uploadedFile = new File(path + "/" + fileName);

                System.out.println(uploadedFile.getAbsolutePath());
                archivo.write(uploadedFile);
                //</editor-fold>    
                p.setMarca(t.get(Tupla.getValue(t, "marca")).getValor());
                p.setModelo(t.get(Tupla.getValue(t, "modelo")).getValor());
                p.setCategoria(t.get(Tupla.getValue(t, "categoria")).getValor());
                p.setTipo(t.get(Tupla.getValue(t, "tipo")).getValor());
                p.setPrecio(new BigDecimal(t.get(Tupla.getValue(t, "precio")).getValor()));
                p.setPath("uploads/"+fileName);
            
                mu.IniciarTransaccion();
                mu.Update(p);
                mu.ConfirmarTransaccion();
                response.sendRedirect(request.getContextPath()+"/administrar_Productos.jsp");
                }
                else{
                    response.sendRedirect(request.getContextPath()+"/errorPage.jsp");
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