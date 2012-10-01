/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernate.*;
import DB.Modelo;

/**
 *
 * @author Robinson
 */
public class Usuario_SERVLET extends HttpServlet {


    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String opcion = request.getParameter("opcion");
        
        if(opcion.equalsIgnoreCase("actualizar")){
        
            Usuario u = new Usuario();
            Modelo m  =  new Modelo();
            u = m.getUsuarioByUsuarioClave(((Usuario)request.getSession(false).getAttribute("usuario")).getNumeroDeIdentificacionDelUsuario(),((Usuario)request.getSession(false).getAttribute("usuario")).getClave() ) ;
         // u.setNumeroDeIdentificacionDelUsuario(((Usuario)request.getSession(false).getAttribute("usuario")).getNumeroDeIdentificacionDelUsuario());
          u.setNombre(request.getParameter("nombre"));
          u.setApellido(request.getParameter("apellido"));
          u.setNumeroDeIdentificacionDelContribuyente(request.getParameter("numero_de_identificacion_del_contribuyente"));
          u.setClave(request.getParameter("clave"));
          u.setRazonSocial(request.getParameter("razon_social"));
          u.setPeriodoDeDeclaracionDeIva(request.getParameter("periodo_de_declaracion_de_IVA"));
          u.setCorreoElectronico(request.getParameter("correo_electronico"));
          u.setProvincia(request.getParameter("provincia"));
          u.setCiudad(request.getParameter("ciudad"));
          u.setAlertaCorreoIr(request.getParameter("correoIR"));
          u.setAlertaCorreoIva(request.getParameter("correoIVA"));
          /*out.println(u.getNumeroDeIdentificacionDelUsuario());
          out.println(u.getNombre());
          out.println(u.getApellido());
          out.println(u.getNumeroDeIdentificacionDelContribuyente());
          out.println(u.getClave());
          out.println(u.getRazonSocial());
          out.println(u.getPeriodoDeDeclaracionDeIva());
          out.println(u.getCorreoElectronico());
          out.println(u.getCiudad());
          out.println(u.getProvincia());
          out.println(u.getAlertaCorreoIr());
          out.println(u.getAlertaCorreoIva());*/
          
          
          Modelo.actualizar(u);
          
          response.sendRedirect("Editar_Configuraciones_Usuario.jsp");
            
        
        }
        
        
        
        
        
        if(opcion.equalsIgnoreCase("guardar")){
        
          Usuario u = new Usuario(request.getParameter("numero_de_identificacion_del_usuario"));
          
          u.setNombre(request.getParameter("nombre"));
          u.setApellido(request.getParameter("apellido"));
          u.setTipoDeIdentificacionDelUsuario(request.getParameter("Tipo_de_identificacion_del_usuario"));
          
          u.setNumeroDeIdentificacionDelContribuyente(request.getParameter("numero_de_identificacion_del_contribuyente"));
          u.setClave(request.getParameter("clave"));
          u.setRazonSocial(request.getParameter("razon_social"));
          u.setPeriodoDeDeclaracionDeIva(request.getParameter("periodo_de_declaracion_de_IVA"));
          u.setCorreoElectronico(request.getParameter("correo_electronico"));
          u.setProvincia(request.getParameter("provincia"));
          u.setCiudad(request.getParameter("ciudad"));
          u.setAlertaCorreoIr("3");
          u.setAlertaCorreoIva("3");
          
          Modelo.guardar(u);
          
            response.sendRedirect("index.jsp");
        } 
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       doGet(request, response);
    }

 
}
