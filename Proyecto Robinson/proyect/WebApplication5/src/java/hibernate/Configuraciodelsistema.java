package hibernate;
// Generated 22-sep-2011 10:49:33 by Hibernate Tools 3.2.1.GA



/**
 * Configuraciodelsistema generated by hbm2java
 */
public class Configuraciodelsistema  implements java.io.Serializable {


     private String fecha;
     private String porcentajeDefinidoDelIvaValor;
     private String trimestre1;
     private String trimestre2;
     private String trimestre3;
     private String trimestre4;
     private String siCausaImpuestoIr;
     private String siCausaImpuestoIvaMensual;
     private String siCausaImpuestoIvaSemestral;
     private String noCausaImpuestoIr;
     private String noCausaImpuestoIvaMensual;
     private String noCausaImpuestoIvaSemestral;
     private String digito1ipuestoAlaRentaPersonasNaturales;
     private String digito1ivaMensual;
     private String digito1ivaSemestre1;
     private String digito1ivaSemestre2;
     private String digito2ipuestoAlaRentaPersonasNaturales;
     private String digito2ivaMensual;
     private String digito2ivaSemestre1;
     private String digito2ivaSemestre2;
     private String digito3ipuestoAlaRentaPersonasNaturales;
     private String digito3ivaMensual;
     private String digito3ivaSemestre1;
     private String digito3ivaSemestre2;
     private String digito4ipuestoAlaRentaPersonasNaturales;
     private String digito4ivaMensual;
     private String digito4ivaSemestre1;
     private String digito4ivaSemestre2;
     private String porcentageSobreLaBaseParaElPagoDelImpuestoAlaRenta;
     private String porcentajeDelIrRetenidoPorDefauld;

    public Configuraciodelsistema() {
    }

	
    public Configuraciodelsistema(String fecha) {
        this.fecha = fecha;
    }
    public Configuraciodelsistema(String fecha, String porcentajeDefinidoDelIvaValor, String trimestre1, String trimestre2, String trimestre3, String trimestre4, String siCausaImpuestoIr, String siCausaImpuestoIvaMensual, String siCausaImpuestoIvaSemestral, String noCausaImpuestoIr, String noCausaImpuestoIvaMensual, String noCausaImpuestoIvaSemestral, String digito1ipuestoAlaRentaPersonasNaturales, String digito1ivaMensual, String digito1ivaSemestre1, String digito1ivaSemestre2, String digito2ipuestoAlaRentaPersonasNaturales, String digito2ivaMensual, String digito2ivaSemestre1, String digito2ivaSemestre2, String digito3ipuestoAlaRentaPersonasNaturales, String digito3ivaMensual, String digito3ivaSemestre1, String digito3ivaSemestre2, String digito4ipuestoAlaRentaPersonasNaturales, String digito4ivaMensual, String digito4ivaSemestre1, String digito4ivaSemestre2, String porcentageSobreLaBaseParaElPagoDelImpuestoAlaRenta, String porcentajeDelIrRetenidoPorDefauld) {
       this.fecha = fecha;
       this.porcentajeDefinidoDelIvaValor = porcentajeDefinidoDelIvaValor;
       this.trimestre1 = trimestre1;
       this.trimestre2 = trimestre2;
       this.trimestre3 = trimestre3;
       this.trimestre4 = trimestre4;
       this.siCausaImpuestoIr = siCausaImpuestoIr;
       this.siCausaImpuestoIvaMensual = siCausaImpuestoIvaMensual;
       this.siCausaImpuestoIvaSemestral = siCausaImpuestoIvaSemestral;
       this.noCausaImpuestoIr = noCausaImpuestoIr;
       this.noCausaImpuestoIvaMensual = noCausaImpuestoIvaMensual;
       this.noCausaImpuestoIvaSemestral = noCausaImpuestoIvaSemestral;
       this.digito1ipuestoAlaRentaPersonasNaturales = digito1ipuestoAlaRentaPersonasNaturales;
       this.digito1ivaMensual = digito1ivaMensual;
       this.digito1ivaSemestre1 = digito1ivaSemestre1;
       this.digito1ivaSemestre2 = digito1ivaSemestre2;
       this.digito2ipuestoAlaRentaPersonasNaturales = digito2ipuestoAlaRentaPersonasNaturales;
       this.digito2ivaMensual = digito2ivaMensual;
       this.digito2ivaSemestre1 = digito2ivaSemestre1;
       this.digito2ivaSemestre2 = digito2ivaSemestre2;
       this.digito3ipuestoAlaRentaPersonasNaturales = digito3ipuestoAlaRentaPersonasNaturales;
       this.digito3ivaMensual = digito3ivaMensual;
       this.digito3ivaSemestre1 = digito3ivaSemestre1;
       this.digito3ivaSemestre2 = digito3ivaSemestre2;
       this.digito4ipuestoAlaRentaPersonasNaturales = digito4ipuestoAlaRentaPersonasNaturales;
       this.digito4ivaMensual = digito4ivaMensual;
       this.digito4ivaSemestre1 = digito4ivaSemestre1;
       this.digito4ivaSemestre2 = digito4ivaSemestre2;
       this.porcentageSobreLaBaseParaElPagoDelImpuestoAlaRenta = porcentageSobreLaBaseParaElPagoDelImpuestoAlaRenta;
       this.porcentajeDelIrRetenidoPorDefauld = porcentajeDelIrRetenidoPorDefauld;
    }
   
    public String getFecha() {
        return this.fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getPorcentajeDefinidoDelIvaValor() {
        return this.porcentajeDefinidoDelIvaValor;
    }
    
    public void setPorcentajeDefinidoDelIvaValor(String porcentajeDefinidoDelIvaValor) {
        this.porcentajeDefinidoDelIvaValor = porcentajeDefinidoDelIvaValor;
    }
    public String getTrimestre1() {
        return this.trimestre1;
    }
    
    public void setTrimestre1(String trimestre1) {
        this.trimestre1 = trimestre1;
    }
    public String getTrimestre2() {
        return this.trimestre2;
    }
    
    public void setTrimestre2(String trimestre2) {
        this.trimestre2 = trimestre2;
    }
    public String getTrimestre3() {
        return this.trimestre3;
    }
    
    public void setTrimestre3(String trimestre3) {
        this.trimestre3 = trimestre3;
    }
    public String getTrimestre4() {
        return this.trimestre4;
    }
    
    public void setTrimestre4(String trimestre4) {
        this.trimestre4 = trimestre4;
    }
    public String getSiCausaImpuestoIr() {
        return this.siCausaImpuestoIr;
    }
    
    public void setSiCausaImpuestoIr(String siCausaImpuestoIr) {
        this.siCausaImpuestoIr = siCausaImpuestoIr;
    }
    public String getSiCausaImpuestoIvaMensual() {
        return this.siCausaImpuestoIvaMensual;
    }
    
    public void setSiCausaImpuestoIvaMensual(String siCausaImpuestoIvaMensual) {
        this.siCausaImpuestoIvaMensual = siCausaImpuestoIvaMensual;
    }
    public String getSiCausaImpuestoIvaSemestral() {
        return this.siCausaImpuestoIvaSemestral;
    }
    
    public void setSiCausaImpuestoIvaSemestral(String siCausaImpuestoIvaSemestral) {
        this.siCausaImpuestoIvaSemestral = siCausaImpuestoIvaSemestral;
    }
    public String getNoCausaImpuestoIr() {
        return this.noCausaImpuestoIr;
    }
    
    public void setNoCausaImpuestoIr(String noCausaImpuestoIr) {
        this.noCausaImpuestoIr = noCausaImpuestoIr;
    }
    public String getNoCausaImpuestoIvaMensual() {
        return this.noCausaImpuestoIvaMensual;
    }
    
    public void setNoCausaImpuestoIvaMensual(String noCausaImpuestoIvaMensual) {
        this.noCausaImpuestoIvaMensual = noCausaImpuestoIvaMensual;
    }
    public String getNoCausaImpuestoIvaSemestral() {
        return this.noCausaImpuestoIvaSemestral;
    }
    
    public void setNoCausaImpuestoIvaSemestral(String noCausaImpuestoIvaSemestral) {
        this.noCausaImpuestoIvaSemestral = noCausaImpuestoIvaSemestral;
    }
    public String getDigito1ipuestoAlaRentaPersonasNaturales() {
        return this.digito1ipuestoAlaRentaPersonasNaturales;
    }
    
    public void setDigito1ipuestoAlaRentaPersonasNaturales(String digito1ipuestoAlaRentaPersonasNaturales) {
        this.digito1ipuestoAlaRentaPersonasNaturales = digito1ipuestoAlaRentaPersonasNaturales;
    }
    public String getDigito1ivaMensual() {
        return this.digito1ivaMensual;
    }
    
    public void setDigito1ivaMensual(String digito1ivaMensual) {
        this.digito1ivaMensual = digito1ivaMensual;
    }
    public String getDigito1ivaSemestre1() {
        return this.digito1ivaSemestre1;
    }
    
    public void setDigito1ivaSemestre1(String digito1ivaSemestre1) {
        this.digito1ivaSemestre1 = digito1ivaSemestre1;
    }
    public String getDigito1ivaSemestre2() {
        return this.digito1ivaSemestre2;
    }
    
    public void setDigito1ivaSemestre2(String digito1ivaSemestre2) {
        this.digito1ivaSemestre2 = digito1ivaSemestre2;
    }
    public String getDigito2ipuestoAlaRentaPersonasNaturales() {
        return this.digito2ipuestoAlaRentaPersonasNaturales;
    }
    
    public void setDigito2ipuestoAlaRentaPersonasNaturales(String digito2ipuestoAlaRentaPersonasNaturales) {
        this.digito2ipuestoAlaRentaPersonasNaturales = digito2ipuestoAlaRentaPersonasNaturales;
    }
    public String getDigito2ivaMensual() {
        return this.digito2ivaMensual;
    }
    
    public void setDigito2ivaMensual(String digito2ivaMensual) {
        this.digito2ivaMensual = digito2ivaMensual;
    }
    public String getDigito2ivaSemestre1() {
        return this.digito2ivaSemestre1;
    }
    
    public void setDigito2ivaSemestre1(String digito2ivaSemestre1) {
        this.digito2ivaSemestre1 = digito2ivaSemestre1;
    }
    public String getDigito2ivaSemestre2() {
        return this.digito2ivaSemestre2;
    }
    
    public void setDigito2ivaSemestre2(String digito2ivaSemestre2) {
        this.digito2ivaSemestre2 = digito2ivaSemestre2;
    }
    public String getDigito3ipuestoAlaRentaPersonasNaturales() {
        return this.digito3ipuestoAlaRentaPersonasNaturales;
    }
    
    public void setDigito3ipuestoAlaRentaPersonasNaturales(String digito3ipuestoAlaRentaPersonasNaturales) {
        this.digito3ipuestoAlaRentaPersonasNaturales = digito3ipuestoAlaRentaPersonasNaturales;
    }
    public String getDigito3ivaMensual() {
        return this.digito3ivaMensual;
    }
    
    public void setDigito3ivaMensual(String digito3ivaMensual) {
        this.digito3ivaMensual = digito3ivaMensual;
    }
    public String getDigito3ivaSemestre1() {
        return this.digito3ivaSemestre1;
    }
    
    public void setDigito3ivaSemestre1(String digito3ivaSemestre1) {
        this.digito3ivaSemestre1 = digito3ivaSemestre1;
    }
    public String getDigito3ivaSemestre2() {
        return this.digito3ivaSemestre2;
    }
    
    public void setDigito3ivaSemestre2(String digito3ivaSemestre2) {
        this.digito3ivaSemestre2 = digito3ivaSemestre2;
    }
    public String getDigito4ipuestoAlaRentaPersonasNaturales() {
        return this.digito4ipuestoAlaRentaPersonasNaturales;
    }
    
    public void setDigito4ipuestoAlaRentaPersonasNaturales(String digito4ipuestoAlaRentaPersonasNaturales) {
        this.digito4ipuestoAlaRentaPersonasNaturales = digito4ipuestoAlaRentaPersonasNaturales;
    }
    public String getDigito4ivaMensual() {
        return this.digito4ivaMensual;
    }
    
    public void setDigito4ivaMensual(String digito4ivaMensual) {
        this.digito4ivaMensual = digito4ivaMensual;
    }
    public String getDigito4ivaSemestre1() {
        return this.digito4ivaSemestre1;
    }
    
    public void setDigito4ivaSemestre1(String digito4ivaSemestre1) {
        this.digito4ivaSemestre1 = digito4ivaSemestre1;
    }
    public String getDigito4ivaSemestre2() {
        return this.digito4ivaSemestre2;
    }
    
    public void setDigito4ivaSemestre2(String digito4ivaSemestre2) {
        this.digito4ivaSemestre2 = digito4ivaSemestre2;
    }
    public String getPorcentageSobreLaBaseParaElPagoDelImpuestoAlaRenta() {
        return this.porcentageSobreLaBaseParaElPagoDelImpuestoAlaRenta;
    }
    
    public void setPorcentageSobreLaBaseParaElPagoDelImpuestoAlaRenta(String porcentageSobreLaBaseParaElPagoDelImpuestoAlaRenta) {
        this.porcentageSobreLaBaseParaElPagoDelImpuestoAlaRenta = porcentageSobreLaBaseParaElPagoDelImpuestoAlaRenta;
    }
    public String getPorcentajeDelIrRetenidoPorDefauld() {
        return this.porcentajeDelIrRetenidoPorDefauld;
    }
    
    public void setPorcentajeDelIrRetenidoPorDefauld(String porcentajeDelIrRetenidoPorDefauld) {
        this.porcentajeDelIrRetenidoPorDefauld = porcentajeDelIrRetenidoPorDefauld;
    }




}

