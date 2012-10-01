package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IngresarFacturaIngreso_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      DB.Modelo modelo = null;
      synchronized (_jspx_page_context) {
        modelo = (DB.Modelo) _jspx_page_context.getAttribute("modelo", PageContext.PAGE_SCOPE);
        if (modelo == null){
          modelo = new DB.Modelo();
          _jspx_page_context.setAttribute("modelo", modelo, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ingresar Factura de Ingreso</title>\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <script src=\"http://maps.google.com/maps?file=api&amp;v=2&amp;sensor=false&amp;key=ABQIAAAAHvHFgA4hXZiMtrKDtTus-RTI8pZPuaFxtS2S2Zel8y9gQXOwDxTUdtfJNARcHZYdv7H2uc2cf7X0lQ\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("            #map{\n");
      out.write("                 position: relative;\n");
      out.write("                top: 10em;\n");
      out.write("                left: 65em;\n");
      out.write("                \n");
      out.write("             }  \n");
      out.write("            #formulario{\n");
      out.write("                \n");
      out.write("                position: absolute;\n");
      out.write("                top: 10em;\n");
      out.write("                left: 9.5em;\n");
      out.write("                font-weight:bold;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            #retencion{\n");
      out.write("                width: 100%;\n");
      out.write("                background: #97080D url(images/nuevo1.gif) repeat-x left top;\n");
      out.write("                color:black; \n");
      out.write("               display: block;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("       \n");
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
      out.write("            \n");
      out.write("            <form method=\"POST\" action=\"Administrador_de_ingresos_SERVLET\" enctype=\"multipart/form-data\">\n");
      out.write("                <table border=\"2\" >\n");
      out.write("                    \n");
      out.write("                    <tr><td>Cliente : </td><td><select name=\"cliente\">\n");
      out.write("                \n");
      out.write("             ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                   \n");
      out.write("            </select><a href=\"IngresarCliente.jsp\">Ingresar Cliente Nuevo</a> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Tipo de factura :</td><td><select name=\"tipo\">\n");
      out.write("            <option>Reembolso\n");
      out.write("            <option SELECTED>Normal\n");
      out.write("            </select></td>\n");
      out.write("            </tr> \n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>Fecha : </td>\n");
      out.write("                <td>Dia<input type=\"text\" name=\"dia\" />Mes<input type=\"text\" name=\"mes\" />Año<input type=\"text\" name=\"anio\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td>Numero de factura :</td><td><input type=\"text\" name=\"numerofactura\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td>Subtotal Valor 0%: </td><td><input type=\"text\" name=\"subtotalValor0\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                \n");
      out.write("                    <td>Subtotal Valor IVA: </td><td><input type=\"text\" name=\"subtotalValorIva\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
      out.write("<input type=\"hidden\" name=\"coorX\" id=\"coorX\"/>\n");
      out.write("            ");
      out.write("<input type=\"hidden\" name=\"coorY\" id=\"coorY\"/>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td>Total : </td><td><input type=\"text\" name=\"total\" /></td>\n");
      out.write("            </tr>\n");
      out.write("                </table><br /><br />\n");
      out.write("            Retencion : <a href=\"#\" onclick=\"AgregarRetencion();\" >Agregar retencion</a><br/><br/>\n");
      out.write("            \n");
      out.write("            <br /><br />\n");
      out.write("            <div id=\"retencion\">\n");
      out.write("                <table border=\"3\">\n");
      out.write("                    <tr> \n");
      out.write("                        <td>Número de comprobante de retención :</td><td><input type=\"text\" name=\"numeroComprobante\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>  \n");
      out.write("                        <td>Ejercicio Fiscal  </td><td>Mes<input type=\"text\" name=\"retencionmes\" />Año<input type=\"text\" name=\"retencionanio\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td>Base imponible </td><td><input type=\"text\" name=\"baseImponible\"/></td>\n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                \n");
      out.write("                    <td>Impuesto :</td><td><select name=\"impuesto\">\n");
      out.write("                            <option>Iva\n");
      out.write("                            <option>IR\n");
      out.write("                            </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        %Retencion : </td><td><input type=\"text\" name=\"porcentjeRetencion\"/> </td>\n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>    \n");
      out.write("                    <td>Total Retenido : </td><td><input type=\"text\" name=\"totalRetenido\" value =\"\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <input type=\"hidden\" name=\"opcion\" value=\"guardar\"/>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"file\" name=\"archivoFile\" />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("            <input type=\"submit\" value=\"Guardar\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${modelo.cliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("row");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                 <option>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.rucOcedula}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
