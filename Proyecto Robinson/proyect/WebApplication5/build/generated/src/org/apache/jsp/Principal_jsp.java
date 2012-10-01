package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Principal</title>\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("    </head>\n");
      out.write("    <body><div id=\"footer\">\n");
      out.write("            <p>Bienvebido ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.usuario.numeroDeIdentificacionDelUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div id =\"menu\">\n");
      out.write("        <ul id=\"header\">\n");
      out.write("            <li><a href=\"Editar_Configuraciones_Usuario.jsp\">Editar configuracion de Usuario</a></li>\n");
      out.write("            <li><a href=\"Administracion_de_ingresos.jsp\">Administración de ingresos</a></li>\n");
      out.write("            <li><a href=\"Administracion_de_egresos.jsp\">Administración de egresos</a></li>\n");
      out.write("         </ul>\n");
      out.write("          <ul id=\"header\">  \n");
      out.write("            <li><a href=\"PagoDeImpuestos.jsp\">Pago de impuestos</a></li>\n");
      out.write("            <li><a href=\"Control_de_gastos.jsp\">Control de gastos</a></li>\n");
      out.write("            <li><a href=\"ConfiguracionesDelUsuario.jsp\">Configuraciones de usuario</a></li>\n");
      out.write("            <li><a href=\"Configuracion_del_Sistema_SERVLET\">Configuración del sistema (administrador)</a></li>\n");
      out.write("\n");
      out.write("           </ul>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
