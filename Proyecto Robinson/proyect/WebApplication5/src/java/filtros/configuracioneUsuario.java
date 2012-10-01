/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filtros;

import DB.Modelo;
import DB.Sesion;
import hibernate.Usuario;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author VICTOR SAA
 */
public class configuracioneUsuario implements Filter {
    
    
    public configuracioneUsuario() {
    }    
    
   

   
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        HttpSession s =  ((HttpServletRequest)request).getSession(false);
        
        Sesion se = (Sesion)s.getAttribute("sesion");
        
        String usuario = se.getUsuario();
        
        Usuario u = Modelo.buscarUsuario(usuario);
        
        request.setAttribute("nombre", u.getNombre());
        request.setAttribute("apellido", u.getApellido());
        request.setAttribute("ciudad", u.getCiudad());
        request.setAttribute("clave", u.getClave());
        request.setAttribute("alertaCorreoIr", u.getAlertaCorreoIr());
        request.setAttribute("alertaCorreoIva", u.getAlertaCorreoIva());
        request.setAttribute("correoElectronico", u.getCorreoElectronico());
        request.setAttribute("numeroDeIdentificacionDelContribuyente", u.getNumeroDeIdentificacionDelContribuyente());
       
        request.setAttribute("periodoDeDeclaracionDeIva", u.getPeriodoDeDeclaracionDeIva());
        request.setAttribute("provincia", u.getProvincia());
        request.setAttribute("razonSocial", u.getRazonSocial());
        
        chain.doFilter(request, response);
        
        
    }

    

    
    public void destroy() {        
    }

    public void init(FilterConfig filterConfig) {        
       
       
    }

   
    
}
