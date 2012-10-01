package hibernate;
// Generated 22-sep-2011 10:49:33 by Hibernate Tools 3.2.1.GA



/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private String cedulaOruc;
     private String razonSocial;
     private String direcion;
     private String coorX;
     private String coorY;
     private String telefono;

    public Proveedor() {
    }

	
    public Proveedor(String cedulaOruc) {
        this.cedulaOruc = cedulaOruc;
    }
    public Proveedor(String cedulaOruc, String razonSocial, String direcion, String coorX, String coorY, String telefono) {
       this.cedulaOruc = cedulaOruc;
       this.razonSocial = razonSocial;
       this.direcion = direcion;
       this.coorX = coorX;
       this.coorY = coorY;
       this.telefono = telefono;
    }
   
    public String getCedulaOruc() {
        return this.cedulaOruc;
    }
    
    public void setCedulaOruc(String cedulaOruc) {
        this.cedulaOruc = cedulaOruc;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getDirecion() {
        return this.direcion;
    }
    
    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }
    public String getCoorX() {
        return this.coorX;
    }
    
    public void setCoorX(String coorX) {
        this.coorX = coorX;
    }
    public String getCoorY() {
        return this.coorY;
    }
    
    public void setCoorY(String coorY) {
        this.coorY = coorY;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }




}

