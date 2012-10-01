/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DB.Modelo;
import DB.Tupla;
import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.Part;
import hibernate.Comprobanteretencion;
import hibernate.Facturaingreso;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.FilenameUtils;
import java.util.List;
/**
 *
 * @author Robinson
 */
public class Administrador_de_ingresos_SERVLET extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, FileUploadException{
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
            //nuevo
            
            if(t.get(Tupla.getValue(t, "opcion")).getValor().equalsIgnoreCase("guardar")){
                
           
            
           Facturaingreso f = new Facturaingreso(t.get(Tupla.getValue(t, "numerofactura")).getValor());












           f.setDia(t.get(Tupla.getValue(t, "dia")).getValor());
           f.setMes( t.get(Tupla.getValue(t, "mes")).getValor());
           f.setAnio(t.get(Tupla.getValue(t, "anio")).getValor());
           f.setCliente(t.get(Tupla.getValue(t, "cliente")).getValor());
           f.setComprobanteDeRetencion(t.get(Tupla.getValue(t, "numeroComprobante")).getValor());
           f.setSubtotalValor0(t.get(Tupla.getValue(t, "subtotalValor0")).getValor());
           f.setSubtotalValorIva(t.get(Tupla.getValue(t, "subtotalValorIva")).getValor());
           f.setTipoFactura(t.get(Tupla.getValue(t, "tipo")).getValor());
           f.setTotal(t.get(Tupla.getValue(t, "total")).getValor());
           f.setCoorX(t.get(Tupla.getValue(t, "coorX")).getValor());
           f.setCoorY(t.get(Tupla.getValue(t, "coory")).getValor());
           
           Modelo.guardar(f);
           
           if(!(t.get(Tupla.getValue(t, "numeroComprobante")).getValor().isEmpty())){


           Comprobanteretencion c = new Comprobanteretencion(t.get(Tupla.getValue(t, "numeroComprobante")).getValor());
           
           c.setAnio(t.get(Tupla.getValue(t, "retencionanio")).getValor());
           c.setBaseImponible(t.get(Tupla.getValue(t, "baseImponible")).getValor());
           c.setImpuesto(t.get(Tupla.getValue(t, "impuesto")).getValor());
           c.setMes(t.get(Tupla.getValue(t, "retencionmes")).getValor());
           c.setPorcentaje(t.get(Tupla.getValue(t, "porcentjeRetencion")).getValor());
           c.setTotalRetenio(t.get(Tupla.getValue(t, "totalRetenido")).getValor());
           
           Modelo.guardar(c);
           }
           
           response.sendRedirect("FacturaIngresada.jsp");
           
           
            }
            
            //if(t.get(Tupla.getValue(t, "opcion")).getValor().equalsIgnoreCase("agregarContratoDependencia")){
            
           // }
            
            
            //nuevo
            if(fileItem!=null){
                String fileName = fileItem.getName();
                //out.println(fileItem.getFieldName());
                
                
                if (fileItem.getSize() > 0){
                    fileName = FilenameUtils.getName(fileName);
                String dirName = "C:/Users/Robin/Desktop/FacturaIngresos/";
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
             
              if(opcion.equalsIgnoreCase("agregarContratoDependencia")){
            
           request.getRequestDispatcher("AgregarContratoRelacionDependencia.jsp").forward(request, response);
        
        }
              if(opcion.equalsIgnoreCase("agregarFactura")){
        
            request.getRequestDispatcher("IngresarFacturaIngreso.jsp").forward(request, response);
            
            
        }
              
               if(opcion.equalsIgnoreCase("eliminar")){
              
               Facturaingreso f = new Facturaingreso();
           
           Modelo M = new Modelo();
           //out.println(request.getParameter("id"));
           f = M.getFacturaingresoById(request.getParameter("id"));
           // out.println(f.getNumeroFactura());
           Modelo.eliminar(f);
           
           response.sendRedirect("Administracion_de_ingresos.jsp");
             
             }
             }
             
             
        }finally {            
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
            Logger.getLogger(Administrador_de_ingresos_SERVLET.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Administrador_de_ingresos_SERVLET.class.getName()).log(Level.SEVERE, null, ex);
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
