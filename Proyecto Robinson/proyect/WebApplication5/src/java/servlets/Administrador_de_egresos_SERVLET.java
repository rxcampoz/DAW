/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DB.Modelo;
import DB.Tupla;
import hibernate.Facturaegreso;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author Robinson
 */
public class Administrador_de_egresos_SERVLET extends HttpServlet {

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
        try {
            
             if (ServletFileUpload.isMultipartContent(request)){
             ServletFileUpload servletFileUpload = new ServletFileUpload(new DiskFileItemFactory());
            List fileItemsList = servletFileUpload.parseRequest(request);
            Iterator it = fileItemsList.iterator();
            FileItem fileItem = null;
            
            //creo una lista de par request : parametro
           LinkedList<Tupla> t = new LinkedList<Tupla>();
           //creo una lista de par request : parametro
              while(it.hasNext()){
               FileItem fileItemTemp = (FileItem)it.next();
                if (fileItemTemp.isFormField()){
                 // no archivo   
                //out.println(fileItemTemp.getFieldName());
                    Tupla f = new Tupla();
                    f.setNombre(fileItemTemp.getFieldName());
                    f.setValor(fileItemTemp.getString() );
                 t.add(f);                      
                    
                    
                }else{
                fileItem = fileItemTemp;
                
                    
                }
              
            }
             
                     
                             
                                     
                                             

        
                
                        
                                
                                        
                                               
               Facturaegreso f = new Facturaegreso(t.get(Tupla.getValue(t, "numerofactura")).getValor());
          
          f.setAnio(t.get(Tupla.getValue(t, "anio")).getValor());
          f.setDeducible(t.get(Tupla.getValue(t, "deducible")).getValor());
          f.setDerechoAcredito(t.get(Tupla.getValue(t, "derecho_credito")).getValor());
          f.setDia(t.get(Tupla.getValue(t, "dia")).getValor());
          f.setMes(t.get(Tupla.getValue(t, "mes")).getValor());
          f.setProveedor(t.get(Tupla.getValue(t, "proveedor")).getValor());
          f.setSubtotal0(t.get(Tupla.getValue(t, "subtotal0")).getValor());
          f.setSubtotalIva(t.get(Tupla.getValue(t, "subtotal")).getValor());
          f.setTipoBienOservicio( t.get(Tupla.getValue(t, "tipoBienOServicio")).getValor());
          f.setTipoDeGasto(t.get(Tupla.getValue(t, "Tipo_gasto")).getValor());
          f.setTotal(t.get(Tupla.getValue(t, "total")).getValor());
          
          Modelo.guardar(f);
          
          response.sendRedirect("guardadoConExito2.jsp");
            
             if(fileItem!=null){
                String fileName = fileItem.getName();
                //out.println(fileItem.getFieldName());
                
                
                if (fileItem.getSize() > 0){
                    fileName = FilenameUtils.getName(fileName);
                String dirName = "C:/Users/Robin/Desktop/FacturaEgreso/";
                File saveTo = new File(dirName + fileName);
                try {
                        //fileItem.write(saveTo);
                    fileItem.write(saveTo); 
                               // out.write(fileName);
                              out.write("\n");
                              out.write("<b>The uploaded file has been saved successfully.</b>\n");

                        }
                        catch (Exception e){

                              out.write("\n");
                              out.write("<b>An error occurred when we tried to save the uploaded file.</b>\n");

                        }
                }
            }
             
             
             
             
             
             
             
             
             }else{
                 
               String opcion = request.getParameter("opcion");
        
        if(opcion.equalsIgnoreCase("agregarFactura")){
           
            request.getRequestDispatcher("IngresarFacturaEgreso.jsp").forward(request, response);
        }
        
        if(opcion.equalsIgnoreCase("eliminar")){
           
           Facturaegreso f = new Facturaegreso();
           
           Modelo M = new Modelo();
           
           f = M.getFacturaegresoById(request.getParameter("id"));
           
           Modelo.eliminar(f);
           
           response.sendRedirect("Administracion_de_egresos.jsp");
         
       }
                 
             }
            
            
            
            
            
            
            
            
            
            
            
            
            
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
        try {
            processRequest(request, response);
        } catch (FileUploadException ex) {
            Logger.getLogger(Administrador_de_egresos_SERVLET.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Administrador_de_egresos_SERVLET.class.getName()).log(Level.SEVERE, null, ex);
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
