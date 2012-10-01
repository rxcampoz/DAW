/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DB.Modelo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernate.*;
import java.util.Date;

/**
 *
 * @author Darius
 */
public class ContratoRelacionDependencia_SERVLET extends HttpServlet {

    
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String opcion = request.getParameter("opcion");
        
        if(opcion.equalsIgnoreCase("guardar")){
            PrintWriter out = response.getWriter();
            String numnumeroDetallesIngreso = request.getParameter("numeroDetallesIngreso");
             int numeroDetallesIngreso = Integer.parseInt(numnumeroDetallesIngreso);
          //out.println(numeroDetallesIngreso);
          
          String numnumeroDetallesEgreso = request.getParameter("numeroDetallesEgreso");
          int numeroDetallesEgreso = Integer.parseInt(numnumeroDetallesEgreso);
         // out.println(numeroDetallesEgreso);
          
          Date d = new Date();
          Contrato c = new Contrato(d.getDay()+d.getHours()+d.getMinutes()+d.getSeconds()+d.getYear()+d.getMonth()+"");
          
          c.setDia(request.getParameter("dia"));
         c.setMes(request.getParameter("mes"));
          c.setAnio(request.getParameter("anio"));
          c.setEmpresa(request.getParameter("empresa"));
          c.setLiquidoRecivido(request.getParameter("liquidoRecivido"));
        
          // que se ingresen todos los detalles, segun el numero de detalles que es un campo oculto
          for(int i = 1; i<= numeroDetallesIngreso ; i++){
           Detalleingreso DI = new Detalleingreso();
           
           DI.setIdDetalleIngreso("Ingreso"+c.getIdContrato()+Integer.toString(i));
           DI.setConcepto(request.getParameter("conceptoIngreso"+Integer.toString(i)));
          DI.setTipo(request.getParameter("tipoIngreso"+Integer.toString(i)));
          DI.setValor(request.getParameter("valorConceptoIngreso"+Integer.toString(i)));
          DI.setIdContrato(c.getIdContrato()); 
          
          out.println(DI.getIdDetalleIngreso());
          out.println(DI.getConcepto());
          out.println(DI.getTipo());
          out.println(DI.getValor());
          out.println(DI.getIdContrato());
          out.println();
          Modelo.guardar(DI);
          }
          
          
          
         // Modelo.guardar(DI);
          
            for(int i = 1; i<= numeroDetallesEgreso  ; i++){
                
          Detalleegreso DE = new Detalleegreso("Egreso"+c.getIdContrato()+Integer.toString(i));
           DE.setConcepto(request.getParameter("conceptoEgreso"+Integer.toString(i)));
           DE.setTipo(request.getParameter("tipoEgreso"+Integer.toString(i)));
           DE.setValor(request.getParameter("valorConceptoEgreso"+Integer.toString(i)));
            DE.setIdContrato(c.getIdContrato());
          Modelo.guardar(DE);
          
            }
           
           
             Modelo.guardar(c);
             
             //out.println("guardado");
            response.sendRedirect("contratoIngresado.jsp");
            
            
        }
    }

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       doGet(request, response);
    }

 
}
