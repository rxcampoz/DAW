/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DB.Modelo;
import hibernate.Usuario;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;


import java.util.List;


/**
 *
 * @author VICTOR SAA
 */
public class generarFormularios_SERVLET extends HttpServlet {


    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        String opcion = request.getParameter("opcion");
        
        if(opcion.equalsIgnoreCase("104A")){
            try {
                //out.println("104");
                    String numero ="" ;
                    SAXBuilder builder = new SAXBuilder(false);
                    Document doc = builder.build("C:/Users/Robin/Desktop/plantilla/104A.xml");
                    
                    Element raiz = doc.getRootElement();
                    
                    Element detalle = raiz.getChild("detalle");
                    
                    List<Element> lista = detalle.getChildren();
                    
                   Iterator i = lista.iterator();
                    while(i.hasNext()){
                        
                        Element e = (Element)i.next();
                    e.setText("0.00");
                    
                    String numeroAtributo = e.getAttributeValue("numero");
                    if(numeroAtributo.equalsIgnoreCase("401") || numeroAtributo.equalsIgnoreCase("411") || numeroAtributo.equalsIgnoreCase("421") || numeroAtributo.equalsIgnoreCase("480")){
                    
                        e.setText(Modelo.totaGastos());
                        
                    }
                    
                    if(numeroAtributo.equalsIgnoreCase("409") || numeroAtributo.equalsIgnoreCase("419")){
                    
                        e.setText(Modelo.totaGastos());
                    }
                    
                    if(numeroAtributo.equalsIgnoreCase("429") || numeroAtributo.equalsIgnoreCase("482")){
                    float j = (float) (0.12 *  Float.parseFloat(Modelo.totaGastos()));
                        e.setText(j + "");
                    }
                    
                    if(numeroAtributo.equalsIgnoreCase("484")){
                        
                        e.setText((Float.parseFloat(Modelo.totaGastos()) * 0.12)+"");
                    }
                    
                    if(numeroAtributo.equalsIgnoreCase("499")){
                        
                        e.setText(Modelo.totaGastos());
                    }
                    
                    if(numeroAtributo.equalsIgnoreCase("601")){
                        
                        e.setText((Float.parseFloat(Modelo.totaGastos())*0.8) + "" );
                    }
                    
                   
                    
                    }
                    
                    
                    XMLOutputter outFile=new XMLOutputter();
            FileOutputStream file=new FileOutputStream("C:/Users/Robin/Desktop/104A.xml");
            outFile.output(doc,file);
            file.flush();
            file.close();
            outFile.output(doc,System.out);
            
            
           // out.println(Modelo.totalVivienda());
                    
                    
                    
                    
            } catch (JDOMException ex) {
                Logger.getLogger(generarFormularios_SERVLET.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            response.sendRedirect("FormularioGenerado.jsp");
        }
        
        if(opcion.equalsIgnoreCase("102A")){
        
        //out.println("102");
            
              try {
                
                    String numero ="" ;
                    SAXBuilder builder = new SAXBuilder(false);
                    Document doc = builder.build("C:/Users/Robin/Desktop/plantilla/107.xml");
                    
                    Element raiz = doc.getRootElement();
                    
                    Element detalle = raiz.getChild("detalle");
                    
                    List<Element> lista = detalle.getChildren();
                    
                    
                    
                   Iterator i = lista.iterator();
                    while(i.hasNext()){
                        
                        Element e = (Element)i.next();
                    e.setText("0.00");
                    
                    String numeroAtributo = e.getAttributeValue("numero");
                    if(numeroAtributo.equalsIgnoreCase("105")){
                        
                      e.setText("0987654565");
                    }
                    
                    if(numeroAtributo.equalsIgnoreCase("107")){
                        
                      e.setText("ESPOL");
                    }
                    if(numeroAtributo.equalsIgnoreCase("108")){
                        e.setText("0987654565");
                      
                    }
                    
                    if(numeroAtributo.equalsIgnoreCase("201")){
                        
                        
                        e.setText(((Usuario)request.getSession(false).getAttribute("usuario")).getNumeroDeIdentificacionDelUsuario());
                      
                    }
                    if(numeroAtributo.equalsIgnoreCase("202")){
                    
                         e.setText(((Usuario)request.getSession(false).getAttribute("usuario")).getApellido() +((Usuario)request.getSession(false).getAttribute("usuario")).getNombre() );
                      
                    }
                    if(numeroAtributo.equalsIgnoreCase("204")){
                        
                      e.setText(((Usuario)request.getSession(false).getAttribute("usuario")).getProvincia());
                    }
                    if(numeroAtributo.equalsIgnoreCase("206")){
                        
                      e.setText(((Usuario)request.getSession(false).getAttribute("usuario")).getCiudad());
                    }
                    if(numeroAtributo.equalsIgnoreCase("208")){
                        
                  e.setText(((Usuario)request.getSession(false).getAttribute("usuario")).getNumeroDeIdentificacionDelContribuyente());    
                    }
                    if(numeroAtributo.equalsIgnoreCase("301")){
                        
                      e.setText("100");
                    }
                    if(numeroAtributo.equalsIgnoreCase("302")){
                        
                      e.setText("100");
                    }
                    if(numeroAtributo.equalsIgnoreCase("303")){
                        
                      e.setText("100");
                    }
                    if(numeroAtributo.equalsIgnoreCase("304")){
                        
                      e.setText("100");
                    }
                    if(numeroAtributo.equalsIgnoreCase("307")){
                      e.setText("100");  
                      
                    }
                    
                    
                    
                    
                    
                    }
                    
                    
                    XMLOutputter outFile=new XMLOutputter();
            FileOutputStream file=new FileOutputStream("C:/Users/Robin/Desktop/107.xml");
            outFile.output(doc,file);
            file.flush();
            file.close();
            outFile.output(doc,System.out);
            
            
          
                    
                    
                    
                    
            } catch (JDOMException ex) {
                Logger.getLogger(generarFormularios_SERVLET.class.getName()).log(Level.SEVERE, null, ex);
            }
              
              try {
                
                    String numero ="" ;
                    SAXBuilder builder = new SAXBuilder(false);
                    Document doc = builder.build("C:/Users/Robin/Desktop/plantilla/102.xml");
                    
                    Element raiz = doc.getRootElement();
                    
                    Element detalle = raiz.getChild("detalle");
                    
                    List<Element> lista = detalle.getChildren();
                    
                   Iterator i = lista.iterator();
                    while(i.hasNext()){
                        
                        Element e = (Element)i.next();
                     e.setText("0.00");
                    
                    String numeroAtributo = e.getAttributeValue("numero");
                    if(numeroAtributo.equalsIgnoreCase("401") || numeroAtributo.equalsIgnoreCase("411") || numeroAtributo.equalsIgnoreCase("421") || numeroAtributo.equalsIgnoreCase("480")){
                    
                        e.setText(Modelo.totaGastos());
                        
                    }
                    
                    if(numeroAtributo.equalsIgnoreCase("409") || numeroAtributo.equalsIgnoreCase("419")){
                    
                        e.setText(Modelo.totaGastos());
                    }
                    
                    if(numeroAtributo.equalsIgnoreCase("429") || numeroAtributo.equalsIgnoreCase("482")){
                    float j = (float) (0.12 *  Float.parseFloat(Modelo.totaGastos()));
                        e.setText(j + "");
                    }
                    
                    if(numeroAtributo.equalsIgnoreCase("484")){
                        
                        e.setText((Float.parseFloat(Modelo.totaGastos()) * 0.12)+"");
                    }
                    
                    if(numeroAtributo.equalsIgnoreCase("499")){
                        
                        e.setText(Modelo.totaGastos());
                    }
                    
                    if(numeroAtributo.equalsIgnoreCase("601")){
                        
                        e.setText((Float.parseFloat(Modelo.totaGastos())*0.8) + "" );
                    }
                    
                    
                    
                    }
                    
                    
                    XMLOutputter outFile=new XMLOutputter();
            FileOutputStream file=new FileOutputStream("C:/Users/Robin/Desktop/102.xml");
            outFile.output(doc,file);
            file.flush();
            file.close();
            outFile.output(doc,System.out);
            
            
          
                    
                    
                    
                    
            } catch (JDOMException ex) {
                Logger.getLogger(generarFormularios_SERVLET.class.getName()).log(Level.SEVERE, null, ex);
            }
              
              response.sendRedirect("FormularioGenerado.jsp");
        }
       
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       doGet(request, response);
    }

}
