package Modelo;
// Generated 09/02/2011 03:56:32 AM by Hibernate Tools 3.2.1.GA



/**
 * Seccion generated by hbm2java
 */
public class Seccion  implements java.io.Serializable {


     private int idseccion;
     private String nombre;
     private String estado;

    public Seccion() {
    }

    public Seccion(int idseccion, String nombre, String estado) {
       this.idseccion = idseccion;
       this.nombre = nombre;
       this.estado = estado;
    }
   
    public int getIdseccion() {
        return this.idseccion;
    }
    
    public void setIdseccion(int idseccion) {
        this.idseccion = idseccion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


