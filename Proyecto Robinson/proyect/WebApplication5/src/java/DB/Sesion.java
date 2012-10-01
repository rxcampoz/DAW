/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author Robinson
 */
public class Sesion {
    private String usuario;
    private String clave;
  

    

   
    public Sesion(){
    }
    
    public Sesion(String usuario, String clave){
       
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
