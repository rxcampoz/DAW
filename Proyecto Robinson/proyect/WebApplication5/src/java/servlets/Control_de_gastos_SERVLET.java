/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

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
@WebServlet(name = "Control_de_gastos_SERVLET", urlPatterns = {"/Control_de_gastos_SERVLET"})
public class Control_de_gastos_SERVLET extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * 
     */
    public void init(ServletConfig config) throws ServletException {

            // Store the ServletConfig object and log the initialization
            super.init(config);

            // Open a database connection to prepare for requests
            try {
               int cont=0;
            } catch(Exception e) {
                System.out.print("noc pudo iniciar el servlet");
            }
        }
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /*genero xml para los meses*/
            DocumentBuilderFactory docFactory= DocumentBuilderFactory.newInstance();
       DocumentBuilder docBuilder= docFactory.newDocumentBuilder();
       Document doc= docBuilder.newDocument();
       
      
       
       Element raiz= doc.createElement("raiz");
       doc.appendChild(raiz);
       
       raiz.setAttribute("id", "1");
       
       Element tipo=doc.createElement("tipo");
       raiz.appendChild(tipo);
       
       
       Detalleegreso de=new Detalleegreso();
       Element aporte=doc.createElement("IESS");
       aporte.appendChild(doc.createTextNode("2"));
       tipo.appendChild(aporte);
       
        Element impuesto=doc.createElement("IR");
       impuesto.appendChild(doc.createTextNode("5"));
       tipo.appendChild(impuesto);
       
        
        Element otros=doc.createElement("otros");
       otros.appendChild(doc.createTextNode("10"));
       tipo.appendChild(otros);
       
       String mensual="enero";
       int i=2*2;
       String cadena=String.valueOf(i);
        Element mes=doc.createElement(mensual);
       mes.appendChild(doc.createTextNode(cadena));
       tipo.appendChild(mes);
       
       Element tipoGastos=doc.createElement("tipoGastos");
       raiz.appendChild(tipoGastos);
       
       Element vivienda=doc.createElement("vivienda");
       vivienda.appendChild(doc.createTextNode("5"));
       tipoGastos.appendChild(vivienda);
       
        Element educacion=doc.createElement("educacion");
       educacion.appendChild(doc.createTextNode("7"));
       tipoGastos.appendChild(educacion);
       
        Element salud=doc.createElement("salud");
       salud.appendChild(doc.createTextNode("6"));
       tipoGastos.appendChild(salud);
       
        Element alimentacion=doc.createElement("alimentacion");
       alimentacion.appendChild(doc.createTextNode("8"));
       tipoGastos.appendChild(alimentacion);
       
        Element vestimenta=doc.createElement("vestimenta");
       vestimenta.appendChild(doc.createTextNode("9"));
       tipoGastos.appendChild(vestimenta);
       
        Element otro=doc.createElement("otro");
       otro.appendChild(doc.createTextNode("10"));
       tipoGastos.appendChild(otro);
       
       
        
       Element establecimiento=doc.createElement("establecimiento");
       raiz.appendChild(establecimiento);
       
        Element tia=doc.createElement("tia");
       tia.appendChild(doc.createTextNode("10"));
       establecimiento.appendChild(tia);
       
        Element comisariato=doc.createElement("comisariato");
       comisariato.appendChild(doc.createTextNode("30"));
       establecimiento.appendChild(comisariato);
       
        Element megamaxi=doc.createElement("megamaxi");
       megamaxi.appendChild(doc.createTextNode("20"));
       establecimiento.appendChild(megamaxi);
       
       
       TransformerFactory transformerfactory= TransformerFactory.newInstance();
       Transformer transformer = transformerfactory.newTransformer();
       DOMSource source = new DOMSource(doc);
       StreamResult result= new StreamResult(new File("C:\\Users\\VICTOR SAA\\Downloads\\Desktop\\daw proyecto3\\WebApplication5\\web\\xml\\erick.xml"));     
       transformer.transform(source, result);
            request.getRequestDispatcher("Control_de_gastos.jsp").forward(request, response);
           // response.sendRedirect("trabajo_realizado.jsp");
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
