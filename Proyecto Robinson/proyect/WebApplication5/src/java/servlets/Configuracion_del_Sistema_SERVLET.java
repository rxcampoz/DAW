/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;

import  DB.Modelo;
import hibernate.*;



/**
 *
 * @author Robinson
 */
public class Configuracion_del_Sistema_SERVLET extends HttpServlet {


    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       String opcion = request.getParameter("opcion");
      
       
       
       if(opcion==null){
            try {
                
                cargarConfiguracionSistemaXML(request, response ,out);
                
                
            } catch (JDOMException ex) {
                Logger.getLogger(Configuracion_del_Sistema_SERVLET.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
       if(opcion.equalsIgnoreCase("guardar")){
            try {
                guardarConfiguracionSistema(request,response,out);
            } catch (JDOMException ex) {
                Logger.getLogger(Configuracion_del_Sistema_SERVLET.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
               
    }

   
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     doGet(request, response);
    }

   public void cargarConfiguracionSistemaXML(HttpServletRequest request, HttpServletResponse response ,PrintWriter out) throws IOException, JDOMException, ServletException {
        SAXBuilder builder = new SAXBuilder(false);
            Document doc = builder.build("C:/Users/Robin/Desktop/configuracionDelSistema/Configuraciones del sistema.xml");
            
            Element raiz = doc.getRootElement();
            
            
            /***************************************************************/
           Element PorcentajeDefinidoDelIva = raiz.getChild("PorcentajeDefinidoDelIva");
            Element fechaIngreso = PorcentajeDefinidoDelIva.getChild("fechaIngreso");
          Element porcentaje = PorcentajeDefinidoDelIva.getChild("porcentaje");
          String valorfechaIngreso = fechaIngreso.getValue();
          String valorporcentaje = porcentaje.getValue();
          request.setAttribute("fechaIngreso",valorfechaIngreso);
          request.setAttribute("porcentaje",valorporcentaje );
          /********************************************************************/
            
         Element PorcentajeDePagosDeMultasEIntereses = raiz.getChild("PorcentajeDePagosDeMultasEIntereses");
          Element Intereses = PorcentajeDePagosDeMultasEIntereses.getChild("Intereses");
          Element Anio = Intereses.getChild("Anio");
          String valorAnio = Anio.getValue();
          request.setAttribute("valorAnio",valorAnio);
          
          Element Trimestre_1 = Anio.getChild("Trimestre_1");
          Element Periodo = Trimestre_1.getChild("Periodo");
          String valorPeriodo1 = Periodo.getValue();
          Element Porcentaje =  Trimestre_1.getChild("Porcentaje");
          String valorPorcentaje1 = Porcentaje.getValue();
          request.setAttribute("valorPeriodo1",valorPeriodo1);
          request.setAttribute("valorPorcentaje1",valorPorcentaje1);
            
            
        Element Trimestre_2 = Anio.getChild("Trimestre_2");
          Element Periodo2 = Trimestre_2.getChild("Periodo");
          String valorPeriodo2 = Periodo2.getValue();
          Element Porcentaje2 =  Trimestre_1.getChild("Porcentaje");
          String valorPorcentaje2 = Porcentaje2.getValue();
          request.setAttribute("valorPeriodo2",valorPeriodo2);
          request.setAttribute("valorPorcentaje2",valorPorcentaje2);
          
          
           Element Trimestre_3 = Anio.getChild("Trimestre_3");
          Element Periodo3 = Trimestre_3.getChild("Periodo");
          String valorPeriodo3 = Periodo3.getValue();
          Element Porcentaje3 =  Trimestre_3.getChild("Porcentaje");
          String valorPorcentaje3 = Porcentaje3.getValue();
          request.setAttribute("valorPeriodo3",valorPeriodo3);
          request.setAttribute("valorPorcentaje3",valorPorcentaje3);
          
            Element Trimestre_4 = Anio.getChild("Trimestre_4");
          Element Periodo4 = Trimestre_4.getChild("Periodo");
          String valorPeriodo4 = Periodo4.getValue();
          Element Porcentaje4 =  Trimestre_4.getChild("Porcentaje");
          String valorPorcentaje4 = Porcentaje4.getValue();
          request.setAttribute("valorPeriodo4",valorPeriodo4);
          request.setAttribute("valorPorcentaje4",valorPorcentaje4);
          
          
          Element Multas = PorcentajeDePagosDeMultasEIntereses.getChild("Multas");
          Element Infracciones = Multas.getChild("Infracciones");
          Element SiCausaImpuesto = Infracciones.getChild("SiCausaImpuesto");
          Element ImpuestoALaRenta = SiCausaImpuesto.getChild("ImpuestoALaRenta");
          
          String valorImpuestoALaRenta = ImpuestoALaRenta.getValue();
          request.setAttribute("valorImpuestoALaRenta",valorImpuestoALaRenta);
          
          Element ImpuestoAlValorAgregado = SiCausaImpuesto.getChild("ImpuestoAlValorAgregado");
          Element Mensual = ImpuestoAlValorAgregado.getChild("Mensual");
          
          String valorMensual = Mensual.getValue();
          request.setAttribute("valorMensual",valorMensual);
          
          
          Element Semestral = ImpuestoAlValorAgregado.getChild("Semestral");
          
          String valorSemestral = Semestral.getValue();
          request.setAttribute("valorSemestral",valorSemestral);
          
          Element NoCausaImpuesto = Infracciones.getChild("NoCausaImpuesto");
          Element NoCausaImpuestoImpuestoALaRenta = NoCausaImpuesto.getChild("ImpuestoALaRenta");
          
          String valorNoCausaImpuestoImpuestoALaRenta = NoCausaImpuestoImpuestoALaRenta.getValue();
         request.setAttribute("valorNoCausaImpuestoImpuestoALaRenta",valorNoCausaImpuestoImpuestoALaRenta);
         
         
          
          Element NoCausaImpuestoImpuestoAlValorAgregado = NoCausaImpuesto.getChild("ImpuestoAlValorAgregado");
          
          String NoCausaImpuestoImpuestoAlValorAgregadoMensual = NoCausaImpuestoImpuestoAlValorAgregado.getChild("Mensual").getValue();
          request.setAttribute("NoCausaImpuestoImpuestoAlValorAgregadoMensual",NoCausaImpuestoImpuestoAlValorAgregadoMensual);
          String NoCausaImpuestoImpuestoAlValorAgregadoSemestral = NoCausaImpuestoImpuestoAlValorAgregado.getChild("Semestral").getValue();
          request.setAttribute("NoCausaImpuestoImpuestoAlValorAgregadoSemestral",NoCausaImpuestoImpuestoAlValorAgregadoSemestral);
          
          
          Element FechasParaLosPagosDelImpuestoPorAnio = raiz.getChild("FechasParaLosPagosDelImpuestoPorAnio");
          Element NovenoDigito = FechasParaLosPagosDelImpuestoPorAnio.getChild("NovenoDigito");
          
          
          for(int i = 0 ; i < 10 ; i++){
              
          Element digito = NovenoDigito.getChild("Digito"+i);
          Element IpuestoALaRenta = digito.getChild("IpuestoALaRenta");
          Element PersonasNaturales = IpuestoALaRenta.getChild("PersonasNaturales");
          String valorNovenoDigitoDigitoIpuestoALaRentaPersonasNaturales = PersonasNaturales.getValue();
          request.setAttribute("valorNovenoDigitoDigito"+i+"IpuestoALaRentaPersonasNaturales",valorNovenoDigitoDigitoIpuestoALaRentaPersonasNaturales);
          
          
          Element Iva = digito.getChild("Iva");
          Element IvaMensual = Iva.getChild("Mensual");
          String valorNovenoDigitoDigitoIvaMensual = IvaMensual.getValue(); 
          
         
          Element Semestre1 = Iva.getChild("Semestre1");
          String valorNovenoDigitoDigitoIvaSemestral1 = Semestre1.getValue();
          
          Element Semestre2 = Iva.getChild("Semestre2");
          String valorNovenoDigitoDigitoIvaSemestral2 = Semestre2.getValue();
          
          
        
          request.setAttribute("valorNovenoDigitoDigito"+i+"IvaMensual",valorNovenoDigitoDigitoIvaMensual);
          request.setAttribute("valorNovenoDigitoDigito"+i+"IvaSemestral1",valorNovenoDigitoDigitoIvaSemestral1);
          request.setAttribute("valorNovenoDigitoDigito"+i+"IvaSemestral2",valorNovenoDigitoDigitoIvaSemestral2);
          
          }
          
          
          
          Element PorcentageSobreLaBaseParaElPagoDelImpuestoALaRenta = raiz.getChild("PorcentageSobreLaBaseParaElPagoDelImpuestoALaRenta");
          
          String valuePorcentageSobreLaBaseParaElPagoDelImpuestoALaRenta = PorcentageSobreLaBaseParaElPagoDelImpuestoALaRenta.getValue();
         
         Element PorcentajeDelIrRetenidoPorDefauld = raiz.getChild("PorcentajeDelIrRetenidoPorDefauld");
         
         String valuePorcentajeDelIrRetenidoPorDefauld = PorcentajeDelIrRetenidoPorDefauld.getValue();
         
         request.setAttribute("valuePorcentageSobreLaBaseParaElPagoDelImpuestoALaRenta",valuePorcentageSobreLaBaseParaElPagoDelImpuestoALaRenta);
         request.setAttribute("valuePorcentajeDelIrRetenidoPorDefauld",valuePorcentajeDelIrRetenidoPorDefauld);
         
         
         
         
         request.getRequestDispatcher("ConfiguracionDelSistema.jsp").forward(request, response);
}

   public void guardarConfiguracionSistema(HttpServletRequest request, HttpServletResponse response ,PrintWriter out) throws JDOMException, IOException{
   
        SAXBuilder builder = new SAXBuilder(false);
            Document doc = builder.build("C:/Users/Robin/Desktop/configuracionDelSistema/Configuraciones del sistema.xml");
            Element raiz = doc.getRootElement();
           Element PorcentajeDefinidoDelIva = raiz.getChild("PorcentajeDefinidoDelIva");
            Element fechaIngreso = PorcentajeDefinidoDelIva.getChild("fechaIngreso");
          Element porcentaje = PorcentajeDefinidoDelIva.getChild("porcentaje");
          Date d = new Date();
          String fecha = d.getHours()+"-"+d.getMinutes()+"-"+d.getSeconds()+"-"+d.getDay()+"-"+d.getMonth();
          fechaIngreso.setText(""+d.getDay()+"-"+d.getMonth() );
          porcentaje.setText(request.getParameter("PorcentajeDefinidoDelIvaValor"));  
          
         Element PorcentajeDePagosDeMultasEIntereses = raiz.getChild("PorcentajeDePagosDeMultasEIntereses");
          Element Intereses = PorcentajeDePagosDeMultasEIntereses.getChild("Intereses");
          Element Anio = Intereses.getChild("Anio");
          Element Trimestre_1 = Anio.getChild("Trimestre_1");
          Element Porcentaje =  Trimestre_1.getChild("Porcentaje");
          
          Porcentaje.setText(request.getParameter("Trimestre1"));
          
        Element Trimestre_2 = Anio.getChild("Trimestre_2");
          Element Porcentaje2 =  Trimestre_2.getChild("Porcentaje");
          
          Porcentaje2.setText(request.getParameter("Trimestre2"));
          
           Element Trimestre_3 = Anio.getChild("Trimestre_3");
          Element Porcentaje3 =  Trimestre_3.getChild("Porcentaje");
          
          Porcentaje3.setText(request.getParameter("Trimestre3"));
          
            Element Trimestre_4 = Anio.getChild("Trimestre_4");
          Element Porcentaje4 =  Trimestre_4.getChild("Porcentaje");
          
          Porcentaje4.setText(request.getParameter("Trimestre4"));
          
          Element Multas = PorcentajeDePagosDeMultasEIntereses.getChild("Multas");
          Element Infracciones = Multas.getChild("Infracciones");
          Element SiCausaImpuesto = Infracciones.getChild("SiCausaImpuesto");
          Element ImpuestoALaRenta = SiCausaImpuesto.getChild("ImpuestoALaRenta");
          
          ImpuestoALaRenta.setText(request.getParameter("Si_causa_impuesto_ir"));
          
          Element ImpuestoAlValorAgregado = SiCausaImpuesto.getChild("ImpuestoAlValorAgregado");
          Element Mensual = ImpuestoAlValorAgregado.getChild("Mensual");
          
          Mensual.setText(request.getParameter("Si_causa_impuesto_ivaMensual"));
          
          Element Semestral = ImpuestoAlValorAgregado.getChild("Semestral");
          
          Semestral.setText(request.getParameter("Si_causa_impuesto_ivaSemestral"));
          
          Element NoCausaImpuesto = Infracciones.getChild("NoCausaImpuesto");
          Element NoCausaImpuestoImpuestoALaRenta = NoCausaImpuesto.getChild("ImpuestoALaRenta");
          
          NoCausaImpuestoImpuestoALaRenta.setText(request.getParameter("No_causa_impuesto_ir"));
          
          Element NoCausaImpuestoImpuestoAlValorAgregado = NoCausaImpuesto.getChild("ImpuestoAlValorAgregado");
          
          NoCausaImpuestoImpuestoAlValorAgregado.getChild("Mensual").setText(request.getParameter("No_causa_impuesto_ivaMensual"));
          NoCausaImpuestoImpuestoAlValorAgregado.getChild("Semestral").setText(request.getParameter("No_causa_impuesto_ivaSemestral"));
          
         Element FechasParaLosPagosDelImpuestoPorAnio = raiz.getChild("FechasParaLosPagosDelImpuestoPorAnio");
          Element NovenoDigito = FechasParaLosPagosDelImpuestoPorAnio.getChild("NovenoDigito");
           for(int i = 0 ; i < 10 ; i++){  
          Element digito = NovenoDigito.getChild("Digito"+i);
          Element IpuestoALaRenta = digito.getChild("IpuestoALaRenta");
          Element PersonasNaturales = IpuestoALaRenta.getChild("PersonasNaturales");
          
         PersonasNaturales.setText(request.getParameter("Digito"+i+"IpuestoALaRentaPersonasNaturales"));
          
          Element Iva = digito.getChild("Iva");
          Element IvaMensual = Iva.getChild("Mensual");
          
          IvaMensual.setText(request.getParameter("Digito"+i+"IvaMensual"));
          
          Element Semestre1 = Iva.getChild("Semestre1");
          
          Semestre1.setText(request.getParameter("Digito"+i+"IvaSemestre1"));
          
          Element Semestre2 = Iva.getChild("Semestre2");
          
          Semestre2.setText(request.getParameter("Digito"+i+"IvaSemestre2"));
          
          }
          Element PorcentageSobreLaBaseParaElPagoDelImpuestoALaRenta = raiz.getChild("PorcentageSobreLaBaseParaElPagoDelImpuestoALaRenta");
          
          PorcentageSobreLaBaseParaElPagoDelImpuestoALaRenta.setText(request.getParameter("valuePorcentageSobreLaBaseParaElPagoDelImpuestoALaRenta"));
          
         Element PorcentajeDelIrRetenidoPorDefauld = raiz.getChild("PorcentajeDelIrRetenidoPorDefauld");
         
         PorcentajeDelIrRetenidoPorDefauld.setText(request.getParameter("valuePorcentajeDelIrRetenidoPorDefauld"));
         
        XMLOutputter outFile=new XMLOutputter();
            FileOutputStream file=new FileOutputStream("C:/Users/Robin/Desktop/configuracionDelSistema/Configuraciones del sistema.xml");
            outFile.output(doc,file);
            file.flush();
            file.close();
            outFile.output(doc,System.out);
            
            Configuraciodelsistema c = new Configuraciodelsistema(fecha);
          
            c.setPorcentajeDefinidoDelIvaValor(request.getParameter("PorcentajeDefinidoDelIvaValor"));
            c.setTrimestre1(request.getParameter("Trimestre1"));
            c.setTrimestre2(request.getParameter("Trimestre2"));
            c.setTrimestre3(request.getParameter("Trimestre3"));
            c.setTrimestre4(request.getParameter("Trimestre4"));
            c.setSiCausaImpuestoIr(request.getParameter("Si_causa_impuesto_ir"));
            c.setSiCausaImpuestoIvaMensual(request.getParameter("Si_causa_impuesto_ivaMensual"));
            c.setSiCausaImpuestoIvaSemestral(request.getParameter("Si_causa_impuesto_ivaSemestral"));
            c.setNoCausaImpuestoIr(request.getParameter("No_causa_impuesto_ir"));
            c.setNoCausaImpuestoIvaMensual(request.getParameter("No_causa_impuesto_ivaMensual"));
            c.setNoCausaImpuestoIvaSemestral(request.getParameter("No_causa_impuesto_ivaSemestral"));
            
            c.setDigito1ipuestoAlaRentaPersonasNaturales(request.getParameter("Digito1IpuestoALaRentaPersonasNaturales"));
            c.setDigito1ivaMensual(request.getParameter("Digito1IvaMensual"));
            c.setDigito1ivaSemestre1(request.getParameter("Digito1IvaSemestre1"));
            c.setDigito1ivaSemestre2(request.getParameter("Digito1IvaSemestre2"));
            
            c.setDigito1ipuestoAlaRentaPersonasNaturales(request.getParameter("Digito2IpuestoALaRentaPersonasNaturales"));
            c.setDigito1ivaMensual(request.getParameter("Digito2IvaMensual"));
            c.setDigito1ivaSemestre1(request.getParameter("Digito2IvaSemestre1"));
            c.setDigito1ivaSemestre2(request.getParameter("Digito2IvaSemestre2"));
            
            c.setDigito1ipuestoAlaRentaPersonasNaturales(request.getParameter("Digito3IpuestoALaRentaPersonasNaturales"));
            c.setDigito1ivaMensual(request.getParameter("Digito3IvaMensual"));
            c.setDigito1ivaSemestre1(request.getParameter("Digito3IvaSemestre1"));
            c.setDigito1ivaSemestre2(request.getParameter("Digito3IvaSemestre2"));
            
            c.setDigito1ipuestoAlaRentaPersonasNaturales(request.getParameter("Digito4IpuestoALaRentaPersonasNaturales"));
            c.setDigito1ivaMensual(request.getParameter("Digito4IvaMensual"));
            c.setDigito1ivaSemestre1(request.getParameter("Digito4IvaSemestre1"));
            c.setDigito1ivaSemestre2(request.getParameter("Digito4IvaSemestre2"));
            
            c.setDigito1ipuestoAlaRentaPersonasNaturales(request.getParameter("Digito5IpuestoALaRentaPersonasNaturales"));
            c.setDigito1ivaMensual(request.getParameter("Digito5IvaMensual"));
            c.setDigito1ivaSemestre1(request.getParameter("Digito5IvaSemestre1"));
            c.setDigito1ivaSemestre2(request.getParameter("Digito5IvaSemestre2"));
            
            c.setDigito1ipuestoAlaRentaPersonasNaturales(request.getParameter("Digito6IpuestoALaRentaPersonasNaturales"));
            c.setDigito1ivaMensual(request.getParameter("Digito6IvaMensual"));
            c.setDigito1ivaSemestre1(request.getParameter("Digito6IvaSemestre1"));
            c.setDigito1ivaSemestre2(request.getParameter("Digito6IvaSemestre2"));
            
            c.setDigito1ipuestoAlaRentaPersonasNaturales(request.getParameter("Digito7IpuestoALaRentaPersonasNaturales"));
            c.setDigito1ivaMensual(request.getParameter("Digito7IvaMensual"));
            c.setDigito1ivaSemestre1(request.getParameter("Digito7IvaSemestre1"));
            c.setDigito1ivaSemestre2(request.getParameter("Digito7IvaSemestre2"));
            
            c.setDigito1ipuestoAlaRentaPersonasNaturales(request.getParameter("Digito8IpuestoALaRentaPersonasNaturales"));
            c.setDigito1ivaMensual(request.getParameter("Digito8IvaMensual"));
            c.setDigito1ivaSemestre1(request.getParameter("Digito8IvaSemestre1"));
            c.setDigito1ivaSemestre2(request.getParameter("Digito8IvaSemestre2"));
            
            c.setDigito1ipuestoAlaRentaPersonasNaturales(request.getParameter("Digito9IpuestoALaRentaPersonasNaturales"));
            c.setDigito1ivaMensual(request.getParameter("Digito9IvaMensual"));
            c.setDigito1ivaSemestre1(request.getParameter("Digito9IvaSemestre1"));
            c.setDigito1ivaSemestre2(request.getParameter("Digito9IvaSemestre2"));
            
            c.setDigito1ipuestoAlaRentaPersonasNaturales(request.getParameter("Digito0IpuestoALaRentaPersonasNaturales"));
            c.setDigito1ivaMensual(request.getParameter("Digito0IvaMensual"));
            c.setDigito1ivaSemestre1(request.getParameter("Digito0IvaSemestre1"));
            c.setDigito1ivaSemestre2(request.getParameter("Digito0IvaSemestre2"));
            
            c.setPorcentageSobreLaBaseParaElPagoDelImpuestoAlaRenta(request.getParameter("valuePorcentageSobreLaBaseParaElPagoDelImpuestoALaRenta"));
            c.setPorcentajeDelIrRetenidoPorDefauld(request.getParameter("valuePorcentajeDelIrRetenidoPorDefauld"));
            
              Modelo.guardar(c);
              
              response.sendRedirect("guardadoConExito.jsp");
            
            
            
   }

}