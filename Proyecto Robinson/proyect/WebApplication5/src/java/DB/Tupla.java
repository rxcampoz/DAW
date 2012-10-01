/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.util.LinkedList;

/**
 *
 * @author Robinson
 */
public class Tupla {
    private String nombre ;
    private String valor ;

    public Tupla() {
    }

    public Tupla(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public static int getValue(LinkedList<Tupla> t ,String name){
    
        for(int i = 0 ; i < t.size() ; i++){
            
              if(t.get(i).getNombre().equalsIgnoreCase(name)){
                  
                  return i ;
                      }
            }
        
    return 0 ;
    }
    
}
