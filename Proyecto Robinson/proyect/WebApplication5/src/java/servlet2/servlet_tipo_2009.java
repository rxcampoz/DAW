/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet2;

import DB.Modelo;
import hibernate.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.*;
import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author VICTOR SAA
 */
@WebServlet(name = "servlet_tipo_2009", urlPatterns = {"/servlet_tipo_2009"})
public class servlet_tipo_2009 extends HttpServlet {

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
        String s;
        try {
               DocumentBuilderFactory docFactory= DocumentBuilderFactory.newInstance();
       DocumentBuilder docBuilder= docFactory.newDocumentBuilder();
       Document doc= docBuilder.newDocument();
       
       Element raiz= doc.createElement("raiz");
       doc.appendChild(raiz);
       
       raiz.setAttribute("id", "1");
       
       Element tipo=doc.createElement("tipo");
       raiz.appendChild(tipo);
       
       
       s=Modelo.totalTipoAnual("iess","2009");
       Element aporte=doc.createElement("IESS");
       aporte.appendChild(doc.createTextNode(s));
       tipo.appendChild(aporte);
       
        s=Modelo.totalTipoAnual("ir", "2009");
        Element impuesto=doc.createElement("IR");
       impuesto.appendChild(doc.createTextNode(s));
       tipo.appendChild(impuesto);
       
        s=Modelo.totalTipoAnual("otros", "2009");
        Element otros=doc.createElement("otros");
       otros.appendChild(doc.createTextNode(s));
       tipo.appendChild(otros);
         
       TransformerFactory transformerfactory= TransformerFactory.newInstance();
       Transformer transformer = transformerfactory.newTransformer();
       DOMSource source = new DOMSource(doc);
       StreamResult result= new StreamResult(new File("C:\\Users\\Robin\\Desktop\\proyect\\WebApplication5\\web\\xml\\erick.xml"));     
       transformer.transform(source, result);
        
            request.getRequestDispatcher("Control_de_gastos.jsp").forward(request, response);
            //response.sendRedirect("grafica.jsp");
           
              System.out.println("guardado exitoso");
                
             
         
            
            
        }
        catch (ParserConfigurationException pce) {
		pce.printStackTrace();
                System.out.println("entro a la excepcion de parse");
	  } catch (TransformerException tfe) {
		tfe.printStackTrace();
                System.out.println("entro a la excepcion de transformer");
	  }
        finally {            
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
