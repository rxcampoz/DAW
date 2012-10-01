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
@WebServlet(name = "servlet_tipoGasto_2009", urlPatterns = {"/servlet_tipoGasto_2009"})
public class servlet_tipo_gasto_2009 extends HttpServlet {

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
       
       raiz.setAttribute("id", "2");
       
       Element tipo=doc.createElement("tipoDeGastos");
       raiz.appendChild(tipo);
       
       
       s=Modelo.totalTipoDeGastosAnual("vestimenta","2009");
       Element ves=doc.createElement("vestimenta");
       ves.appendChild(doc.createTextNode(s));
       tipo.appendChild(ves);
       
         s=Modelo.totalTipoDeGastosAnual("salud","2009");
       Element sal=doc.createElement("salud");
       sal.appendChild(doc.createTextNode(s));
       tipo.appendChild(sal);
       
         s=Modelo.totalTipoDeGastosAnual("vivenda","2009");
       Element viv=doc.createElement("vivienda");
       viv.appendChild(doc.createTextNode(s));
       tipo.appendChild(viv);
       
        s=Modelo.totalTipoDeGastosAnual("educacion","2009");
       Element edu=doc.createElement("vestimenta");
       edu.appendChild(doc.createTextNode(s));
       tipo.appendChild(edu);
       
        s=Modelo.totalTipoDeGastosAnual("alimentacion","2009");
       Element ali=doc.createElement("alimentacion");
       ali.appendChild(doc.createTextNode(s));
       tipo.appendChild(ali);
       
        s=Modelo.totalTipoDeGastosAnual("otros","2009");
       Element otr=doc.createElement("otros");
       otr.appendChild(doc.createTextNode(s));
       tipo.appendChild(otr);
         
       TransformerFactory transformerfactory= TransformerFactory.newInstance();
       Transformer transformer = transformerfactory.newTransformer();
       DOMSource source = new DOMSource(doc);
       StreamResult result= new StreamResult(new File("C:\\Users\\Robin\\Desktop\\proyect\\WebApplication5\\web\\xml\\erick.xml"));     
       transformer.transform(source, result);
        
            //request.getRequestDispatcher("grafica.jsp").forward(request, response);
            request.getRequestDispatcher("Control_de_gastos.jsp").forward(request, response);
           
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
