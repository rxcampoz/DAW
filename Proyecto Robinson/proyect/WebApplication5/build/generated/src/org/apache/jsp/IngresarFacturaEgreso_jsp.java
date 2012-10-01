package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IngresarFacturaEgreso_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ingresar factura de egreso</title>\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("       \n");
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
      out.write("    <body >\n");
      out.write("        \n");
      out.write("        <div id=\"formulario\">\n");
      out.write("            <form action=\"Administrador_de_egresos_SERVLET\" enctype=\"multipart/form-data\" method=\"POST\">\n");
      out.write("                <table border=\"3\">\n");
      out.write("                    <tr><td>\n");
      out.write("                        Proveedor : </td><td><select name=\"proveedor\" id=\"proveedor\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </select><a href=\"IngresarProveedor.jsp\">ingresar preveedor</a></td>\n");
      out.write("                </tr>\n");
      out.write("                    <tr><td>\n");
      out.write("                            Numero de factura : </td><td><input type=\"text\" name=\"numerofactura\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>\n");
      out.write("                        Fecha :</td><td> \n");
      out.write("                Dia<input type=\"text\" name=\"dia\" />Mes<input type=\"text\" name=\"mes\" />Año<input type=\"text\" name=\"anio\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr><td>\n");
      out.write("                        Tipo de bien o servicio :</td><td><select name=\"tipoBienOServicio\">\n");
      out.write("                    <option>Hotel</option>\n");
      out.write("                    <option>Gasolina</option>\n");
      out.write("                    <option>Educacion</option>\n");
      out.write("                    <option>Hogar</option>\n");
      out.write("                    <option>Salud</option>\n");
      out.write("                    <option>Servicion</option>\n");
      out.write("                    </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>\n");
      out.write("                        Subtotal 0% :</td><td><input type=\"text\" name=\"subtotal0\"/></td>\n");
      out.write("                </tr>    \n");
      out.write("                <tr><td>\n");
      out.write("                        Subtotal 12% </td><td><input type=\"text\" name=\"subtotal\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>\n");
      out.write("                        derecho a crédito :</td><td><select name=\"derecho_credito\">\n");
      out.write("                        <option>Si</option>\n");
      out.write("                        <option>No</option>\n");
      out.write("                    </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>\n");
      out.write("                        Tipo de gasto :</td><td><select name=\"Tipo_gasto\">\n");
      out.write("                        <option>Vivienda</option>\n");
      out.write("                        <option>Educación</option>\n");
      out.write("                        <option>Salud</option>\n");
      out.write("                        <option>Alimentación</option>\n");
      out.write("                        <option>Vestimenta</option>\n");
      out.write("                        <option>Otro</option>\n");
      out.write("                    </select> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>\n");
      out.write("                        Deducible: </td><td><select name=\"deducible\">\n");
      out.write("                        <option>Si</option>\n");
      out.write("                        <option>No</option>\n");
      out.write("                    </select> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>\n");
      out.write("                        Total: </td><td><input name=\"total\" type=\"text\"/></td>\n");
      out.write("                </tr>    \n");
      out.write("                <input type=\"hidden\" value=\"guardar\" name=\"opcion\"/>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"file\" name=\"archivoFile\" />\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                    <input type=\"submit\" value=\"Guardar\" /></td>\n");
      out.write("                    </tr>    \n");
      out.write("                </table>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${modelo.proveedor}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("row");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <option>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.cedulaOruc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                   \n");
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
