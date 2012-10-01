package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AgregarContratoRelacionDependencia_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Agregar contrato con relacion de dependencia</title>\n");
      out.write("         <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <style>\n");
      out.write("           \n");
      out.write("            #tabla{\n");
      out.write("                \n");
      out.write("                position: relative;\n");
      out.write("                top: 10em;\n");
      out.write("                left: 10em;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #formulario{\n");
      out.write("                 position: relative;\n");
      out.write("                top: 10em;\n");
      out.write("                left: 10em;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            var numeroDetallesIngreso = 0 ;\n");
      out.write("            var numeroDetallesEgreso = 0 ;\n");
      out.write("            function agregarDetalleIngreso(){\n");
      out.write("                \n");
      out.write("                numeroDetallesIngreso = numeroDetallesIngreso +1 ;\n");
      out.write("                \n");
      out.write("                var table = document.createElement(\"table\");\n");
      out.write("                table.setAttribute(\"border\", \"3\");\n");
      out.write("                \n");
      out.write("                var text1 = document.createTextNode(\"Concepto Ingreso:\");\n");
      out.write("                var text2 = document.createTextNode(\"Valor :\");\n");
      out.write("                var text3 = document.createTextNode(\"Tipo :\");\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                var tr1 = document.createElement(\"tr\");\n");
      out.write("                var td11 = document.createElement(\"td\");\n");
      out.write("                var td111 = document.createElement(\"td\");\n");
      out.write("                \n");
      out.write("                var tr2 = document.createElement(\"tr\");\n");
      out.write("                var td22 = document.createElement(\"td\");\n");
      out.write("                var td222 = document.createElement(\"td\");\n");
      out.write("                \n");
      out.write("                var tr3 = document.createElement(\"tr\");\n");
      out.write("                var td33 = document.createElement(\"td\");\n");
      out.write("                var td333 = document.createElement(\"td\");\n");
      out.write("                \n");
      out.write("                var formulario = document.getElementById(\"form\");\n");
      out.write("                var input = document.createElement(\"input\");\n");
      out.write("                input.setAttribute(\"type\", \"text\");\n");
      out.write("                input.setAttribute(\"name\", \"c\"+numeroDetallesIngreso);\n");
      out.write("                \n");
      out.write("                var input2 = document.createElement(\"input\");\n");
      out.write("                input2.setAttribute(\"type\", \"text\");\n");
      out.write("                input2.setAttribute(\"name\", \"valorConceptoIngreso\"+numeroDetallesIngreso);\n");
      out.write("                \n");
      out.write("                var input3 = document.createElement(\"input\");\n");
      out.write("                input3.setAttribute(\"type\", \"text\");\n");
      out.write("                input3.setAttribute(\"name\", \"tipoIngreso\"+numeroDetallesIngreso);\n");
      out.write("                \n");
      out.write("                td11.appendChild(text1);\n");
      out.write("                td111.appendChild(input);\n");
      out.write("                tr1.appendChild(td11);\n");
      out.write("                tr1.appendChild(td111);\n");
      out.write("                \n");
      out.write("                td22.appendChild(text2);\n");
      out.write("                td222.appendChild(input2);\n");
      out.write("                tr2.appendChild(td22);\n");
      out.write("                tr2.appendChild(td222);\n");
      out.write("                \n");
      out.write("                td33.appendChild(text3);\n");
      out.write("                td333.appendChild(input3);\n");
      out.write("                tr3.appendChild(td33);\n");
      out.write("                tr3.appendChild(td333);\n");
      out.write("                \n");
      out.write("                table.appendChild(tr1);\n");
      out.write("                table.appendChild(tr2);\n");
      out.write("                table.appendChild(tr3);\n");
      out.write("                \n");
      out.write("                formulario.appendChild(table);\n");
      out.write("                \n");
      out.write("                formulario.appendChild(document.createElement(\"br\"));\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                var cont = document.getElementById(\"numeroDetallesIngreso\");\n");
      out.write("                \n");
      out.write("                cont.setAttribute(\"value\", numeroDetallesIngreso);\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function agregarDetalleEgreso(){\n");
      out.write("                \n");
      out.write("                numeroDetallesEgreso = numeroDetallesEgreso +1 ;\n");
      out.write("                \n");
      out.write("                var table = document.createElement(\"table\");\n");
      out.write("                table.setAttribute(\"border\", \"3\");\n");
      out.write("                \n");
      out.write("                var text1 = document.createTextNode(\"Concepto Egreso:\");\n");
      out.write("                var text2 = document.createTextNode(\"Valor :\");\n");
      out.write("                var text3 = document.createTextNode(\"Tipo :\");\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                var tr1 = document.createElement(\"tr\");\n");
      out.write("                var td11 = document.createElement(\"td\");\n");
      out.write("                var td111 = document.createElement(\"td\");\n");
      out.write("                \n");
      out.write("                var tr2 = document.createElement(\"tr\");\n");
      out.write("                var td22 = document.createElement(\"td\");\n");
      out.write("                var td222 = document.createElement(\"td\");\n");
      out.write("                \n");
      out.write("                var tr3 = document.createElement(\"tr\");\n");
      out.write("                var td33 = document.createElement(\"td\");\n");
      out.write("                var td333 = document.createElement(\"td\");\n");
      out.write("                \n");
      out.write("                var formulario = document.getElementById(\"form\");\n");
      out.write("                var input = document.createElement(\"input\");\n");
      out.write("                input.setAttribute(\"type\", \"text\");\n");
      out.write("                input.setAttribute(\"name\", \"cegreso\"+numeroDetallesEgreso);\n");
      out.write("                \n");
      out.write("                var input2 = document.createElement(\"input\");\n");
      out.write("                input2.setAttribute(\"type\", \"text\");\n");
      out.write("                input2.setAttribute(\"name\", \"valorConceptoegreso\"+numeroDetallesEgreso);\n");
      out.write("                \n");
      out.write("                var input3 = document.createElement(\"input\");\n");
      out.write("                input3.setAttribute(\"type\", \"text\");\n");
      out.write("                input3.setAttribute(\"name\", \"tipoegreso\"+numeroDetallesEgreso);\n");
      out.write("                \n");
      out.write("                td11.appendChild(text1);\n");
      out.write("                td111.appendChild(input);\n");
      out.write("                tr1.appendChild(td11);\n");
      out.write("                tr1.appendChild(td111);\n");
      out.write("                \n");
      out.write("                td22.appendChild(text2);\n");
      out.write("                td222.appendChild(input2);\n");
      out.write("                tr2.appendChild(td22);\n");
      out.write("                tr2.appendChild(td222);\n");
      out.write("                \n");
      out.write("                td33.appendChild(text3);\n");
      out.write("                td333.appendChild(input3);\n");
      out.write("                tr3.appendChild(td33);\n");
      out.write("                tr3.appendChild(td333);\n");
      out.write("                \n");
      out.write("                table.appendChild(tr1);\n");
      out.write("                table.appendChild(tr2);\n");
      out.write("                table.appendChild(tr3);\n");
      out.write("                \n");
      out.write("                formulario.appendChild(table);\n");
      out.write("                \n");
      out.write("                formulario.appendChild(document.createElement(\"br\"));\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                var cont = document.getElementById(\"numeroDetallesEgreso\");\n");
      out.write("                \n");
      out.write("                cont.setAttribute(\"value\", numeroDetallesEgreso);\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"formulario\">\n");
      out.write("            <form id=\"form\"action=\"ContratoRelacionDependencia_SERVLET\" method=\"get\">\n");
      out.write("                <table border=\"3\">\n");
      out.write("                    <tr><td>\n");
      out.write("                 Fecha : </td>\n");
      out.write("                 <td>Dia<input type=\"text\" name=\"dia\" />Mes<input type=\"text\" name=\"mes\" />Año<input type=\"text\" name=\"anio\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>\n");
      out.write("                        Empresa:</td><td><input type=\"text\" name=\"empresa\"/></td>\n");
      out.write("              </tr>\n");
      out.write("                        <input type=\"hidden\" name=\"opcion\" value=\"guardar\"/>\n");
      out.write("                        <tr><td>\n");
      out.write("                        <input type=\"submit\" value=\"Guardar\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                </table>\n");
      out.write("                <input type=\"hidden\" value=\"\" name=\"numeroDetallesIngreso\" id=\"numeroDetallesIngreso\"/>\n");
      out.write("               <input type=\"hidden\" value=\"\" name=\"numeroDetallesEgreso\" id=\"numeroDetallesEgreso\"/>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("             <button onclick=\"agregarDetalleIngreso();\">Agregar detalle ingreso</button><button onclick=\"agregarDetalleEgreso();\">Agregar detalle egreso</button>\n");
      out.write("            \n");
      out.write("            \n");
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
