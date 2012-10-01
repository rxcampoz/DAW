package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IngresarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Ingresar cliente</title>\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("         <style>\n");
      out.write("            #formulario{\n");
      out.write("                \n");
      out.write("                position: relative;\n");
      out.write("                top: 10em;\n");
      out.write("                left: 10em;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div id=\"map\" style=\"width:50em;height: 50em;\" >            \n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("          var coorXx ;\n");
      out.write("          var coorYy ;\n");
      out.write("           var map= new GMap(document.getElementById(\"map\"));\n");
      out.write("            map.addControl(new GSmallMapControl());\n");
      out.write("            map.addControl(new GMapTypeControl());\n");
      out.write("            map.addControl(new GOverviewMapControl());          \n");
      out.write("           //map.GMapTypeControl();          \n");
      out.write("            map.centerAndZoom(new GPoint(-78.582459,-2.168642),10);\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            GEvent.addListener(map, \"click\",function(overview, latLng){\n");
      out.write("             // var marker=new GMarker(latLng);\n");
      out.write("            //map.addOverlay(marker);\n");
      out.write("            var latitud=latLng.lat();\n");
      out.write("            var longitud=latLng.lng();\n");
      out.write("            coorXx = latitud;\n");
      out.write("            coorYy = longitud;\n");
      out.write("            var formulario= document.createElement(\"form\");\n");
      out.write("            formulario.setAttribute(\"action\",\"\");\n");
      out.write("            formulario.onsubmit=function(){enviarCoordenadas();return false;};\n");
      out.write("            formulario.innerHTML=//'<fieldset style=\"width:150px;\">'\n");
      out.write("               // +'<legend>lugar interesante</legend>'               \n");
      out.write("                '..................'+'<button onclick=\"enviarCoordenadas()\">AQUI</button>'\n");
      out.write("                +'<input type=\"hidden\" id=\"longitud\" value=\"'+longitud+'\"/>'\n");
      out.write("                +'<input type=\"hidden\" id=\"latitud\" value=\"'+latitud+'\"/>'\n");
      out.write("                //+'</fieldset>'\n");
      out.write("            ;\n");
      out.write("            map.openInfoWindow(latLng,formulario);                      \n");
      out.write("          });\n");
      out.write("          \n");
      out.write("          function enviarCoordenadas(){\n");
      out.write("             var coorX = document.getElementById(\"coorX\");\n");
      out.write("             var coorY = document.getElementById(\"coorY\");\n");
      out.write("             \n");
      out.write("             coorX.setAttribute(\"value\",coorXx );\n");
      out.write("             coorY.setAttribute(\"value\", coorYy);\n");
      out.write("             \n");
      out.write("         }\n");
      out.write("         </script>\n");
      out.write("        <div id=\"formulario\">\n");
      out.write("            <form action=\"Cliente_SERVLET\" method=\"get\">\n");
      out.write("              \tNombre del proveedor <input type=\"text\" name=\"nombre\"/></br></br>\n");
      out.write("             \tRUC o cédula <input type=\"text\" name=\"cedulaOruc\"/></br></br>\n");
      out.write("             \tDirección:</br>   <textarea name=\"direccion\" rows=5 cols=40>\n");
      out.write("                                \n");
      out.write("                                </textarea></br></br>\n");
      out.write("            \tTeléfono <input name=\"telefono\" type=\"text\"/></br></br>\n");
      out.write("                \n");
      out.write("                <input type=\"hidden\" value=\"guardar\" name=\"opcion\"/>\n");
      out.write("                <input type=\"submit\" value=\"Guardar\"/>\n");
      out.write("\n");
      out.write("            </form>\n");
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
