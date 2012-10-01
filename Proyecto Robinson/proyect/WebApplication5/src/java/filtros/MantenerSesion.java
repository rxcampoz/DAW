/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filtros;

import DB.Sesion;
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
 * @author Robinson
 */
public class MantenerSesion implements Filter {
    
    private static final boolean debug = true;
   
    private FilterConfig filterConfig = null;
    
    public MantenerSesion() {
    }    
    
    
    
  
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        HttpSession s = ((HttpServletRequest)request).getSession(false);
        
        Sesion sesion = (Sesion)s.getAttribute("sesion");
        PrintWriter out = response.getWriter();
        
        if(sesion.getUsuario() != null){
            if(sesion.getClave()!=null){
           out.println(sesion.getUsuario());
           out.println(sesion.getClave());
            //chain.doFilter(request, response);
            }
        
        }
     
    }

    public void destroy() {        
    }

    public void init(FilterConfig filterConfig) {        
        this.filterConfig = filterConfig;
        
    }

}
