/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filtros;

import DB.Modelo;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;


import java.util.Iterator;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Robinson
 */
public class Login implements Filter {
    
    private static final boolean debug = true;
    private FilterConfig filterConfig = null;
    public Login() {
    }    
    

   
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        request = (HttpServletRequest)request ; 
        
        if(this.validarUsuarioClave(request.getParameter("usuario"),request.getParameter("clave"))){
            
            
            chain.doFilter(request, response);
        }else{
        ((HttpServletResponse)response).sendRedirect("AccesoIncorrecto.jsp");
        }
       
    }

   
    public void destroy() {        
    }

    public void init(FilterConfig filterConfig) {        
        this.filterConfig = filterConfig;
        
    }
    
   private boolean validarUsuarioClave(String usuario , String clave){
  
   return Modelo.consultarUsuarios( usuario ,  clave) ;
   
    
   }
   
   
   

  
}
