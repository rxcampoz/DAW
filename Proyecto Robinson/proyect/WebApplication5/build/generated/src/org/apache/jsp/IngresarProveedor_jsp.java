package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IngresarProveedor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Ingresar Proveedor</title>\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("         <script src=\"http://maps.google.com/maps?file=api&amp;v=2&amp;sensor=false&amp;key=ABQIAAAAHvHFgA4hXZiMtrKDtTus-RTI8pZPuaFxtS2S2Zel8y9gQXOwDxTUdtfJNARcHZYdv7H2uc2cf7X0lQ\" type=\"text/javascript\"></script>\n");
      out.write("         <script>\n");
      out.write("         \n");
      out.write("         </script>\n");
      out.write("         <style>\n");
      out.write("             #map{\n");
      out.write("                 position: relative;\n");
      out.write("                top: 10em;\n");
      out.write("                left: 50em;\n");
      out.write("                \n");
      out.write("             }     \n");
      out.write("             \n");
      out.write("             #formulario{\n");
      out.write("                 position: absolute;\n");
      out.write("                top: 10em;\n");
      out.write("                              \n");
      out.write("             } \n");
      out.write("         </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"map\" style=\"width:700px;height: 600px;\" >            \n");
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
      out.write("            formulario.innerHTML='<fieldset style=\"width:150px;\">'\n");
      out.write("                +'<legend>lugar interesante</legend>'               \n");
      out.write("                +'<button onclick=\"enviarCoordenadas()\">aceptar</button>'\n");
      out.write("                +'<input type=\"text\" id=\"longitud\" value=\"'+longitud+'\"/>'\n");
      out.write("                +'<input type=\"text\" id=\"latitud\" value=\"'+latitud+'\"/>'\n");
      out.write("                +'</fieldset>';\n");
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
      out.write("          \n");
      out.write("          </script>\n");
      out.write("        <div id=\"formulario\">\n");
      out.write("        <form action=\"Proveedor_SERVLET\" method=\"get\">\n");
      out.write("            <table border=\"3\">\n");
      out.write("                <tr><td>\n");
      out.write("                        RUC o Cédula:</td><td><input name=\"rucOCedula\" type=\"text\"/></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr><td>\n");
      out.write("                Razón Social:</td><td><input name=\"razonSocial\" type=\"text\"/></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr><td>\n");
      out.write("                Dirección :</td><td>\n");
      out.write("        <textarea name=\"direccion\" rows=\"10\" cols=\"10\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        </textarea></td>\n");
      out.write("            </tr>\n");
      out.write("       \n");
      out.write("        <input type=\"hidden\" name=\"coorX\" id=\"coorX\"/>\n");
      out.write("        <input type=\"hidden\" name=\"coorY\" id=\"coorY\"/>\n");
      out.write("        <tr><td>\n");
      out.write("                Teléfono: </td><td><input name=\"telefono\" type=\"text\"/></td>\n");
      out.write("        </tr>\n");
      out.write("        <input type=\"hidden\" name=\"opcion\" value=\"guardar\"/>\n");
      out.write("        <tr><td>\n");
      out.write("        <input type=\"submit\" value=\"guardar\"/></td>\n");
      out.write("        </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("            </div>\n");
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
