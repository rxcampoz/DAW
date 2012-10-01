/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BD;

import EntidadesBD.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import org.hibernate.*;

import java.util.List;

//import modelo.NewHibernateUtil;
//import modelo.Tarea;
import org.hibernate.Query;
import org.hibernate.Session;


/**
 *
 * @author Luis
 */
public class Helper {

    private Session sesion=null;
    private Transaction tx=null;

    public Helper() {
        this.sesion=HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public void IniciarTransaccion()
    {
        if (tx==null) tx=sesion.beginTransaction();
    }

    public void ConfirmarTransaccion()
    {
        tx.commit();
        tx=null;
    }

    public void AbortarTransaccion()
    {
        tx.rollback();
        tx=null;
    }

    public void Update(Object o)
    {   this.IniciarTransaccion();
        sesion.update(o);
    
    }

    public void Delete(Object o)
    {
        this.IniciarTransaccion();
        sesion.delete(o);
    }

    public void Insert(Object o)
    {
        this.IniciarTransaccion();
        sesion.save(o);
    }
    
    public void cerrarSession(){
        this.sesion.close();
    }

    /***************************************************************************
     **                  Metodos para los Usuarios                            **
     ***************************************************************************/
     public List<Usuario> getUsuarios(){
        List<Usuario> lista=null;
        this.IniciarTransaccion();
        org.hibernate.Query q = sesion.createQuery("from Usuario");
        lista=(List<Usuario>) q.list();
        return lista;
    }
     
     public void asignarRoles(int rol,int id){
        
        this.IniciarTransaccion();
        String query="INSERT INTO rol_usuario (id_rol,id_usuario) VALUES ('"+rol+"','"+id+"')";
        SQLQuery q = sesion.createSQLQuery(query);
        q.executeUpdate();
        System.out.println(q.toString());
        System.out.println(q);
        
    }
     
      public void eliminarRol(int id){
        
        this.IniciarTransaccion();
        String query="delete from rol_usuario where id_usuario="+id+";";
        SQLQuery q = sesion.createSQLQuery(query);
        q.executeUpdate();
        System.out.println(q.toString());
        System.out.println(q);
        
    }
     
     public String obtenerRol(int id){
        String rol=null;
        this.IniciarTransaccion();
        String query="select max(id_rol) from rol_usuario where id_usuario="+id+";";
        SQLQuery q = sesion.createSQLQuery(query);
        
        System.out.println(q.toString());
        System.out.println(q);
        rol=q.uniqueResult().toString();
        if(rol.equals("1"))
            rol="administrador";
        else if(rol.equals("2"))
            rol="administrador de contenidos";
        else if(rol.equals("3"))
            rol="administrador de presentacion";
        
        return rol;
    }
     
     public List<String> obtenerListaRoles(int id){
        List <String> roles=null;
        this.IniciarTransaccion();
        String query="select id_rol from rol_usuario where id_usuario="+id+";";
        SQLQuery q = sesion.createSQLQuery(query);
        roles=(List<String>) q.list();
            
        return roles;
    }
     
     /***************************************************************************
     **                  Metodos para los Productos                            **
     ***************************************************************************/
     
    public long obtenerMaxIDProductos(){
        this.IniciarTransaccion();
        SQLQuery q = sesion.createSQLQuery("SELECT max(id_producto) FROM Producto;");
         long value=-1;
        if (q.uniqueResult()!=null)
          value=((Number)q.uniqueResult()).longValue();
        
        System.out.println(value);   
        return value;
    } 
    
     public List<Producto> getProductos(){
        List<Producto> lista=null;
        this.IniciarTransaccion();
        org.hibernate.Query q = sesion.createQuery("from Producto");
        lista=(List<Producto>) q.list();
        cerrarSession();
        return lista;
    }
     
     public Producto getProductoById(int codigo){
        Producto p = new Producto();
        try {
            //org.hibernate.Transaction txc = sesion.beginTransaction();
            this.IniciarTransaccion();
            Query q= sesion.createQuery("from Producto where id_producto='"+codigo+"'");
            p = (Producto)q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
     }
     
       public Usuario getUsuarioById(int codigo){
        Usuario p = new Usuario();
        try {
            //org.hibernate.Transaction txc = sesion.beginTransaction();
            this.IniciarTransaccion();
            Query q= sesion.createQuery("from Usuario where id_usuario='"+codigo+"'");
            p = (Usuario)q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
     }
       
  public long obtenerMaxIDUsuario(){
        this.IniciarTransaccion();
        SQLQuery q = sesion.createSQLQuery("SELECT max(id_usuario) FROM Usuario;");
         long value=-1;
        if (q.uniqueResult()!=null)
          value=((Number)q.uniqueResult()).longValue();
        
        System.out.println(value);   
        return value;
    } 
  
   public long obtenerMaxIDTema(){
        this.IniciarTransaccion();
        SQLQuery q = sesion.createSQLQuery("SELECT max(id_tema) FROM Tema;");
         long value=-1;
        if (q.uniqueResult()!=null)
          value=((Number)q.uniqueResult()).longValue();
        
        System.out.println(value);   
        return value;
    } 
   
    public long obtenerMaxIDArticulo(){
        this.IniciarTransaccion();
        SQLQuery q = sesion.createSQLQuery("SELECT max(id_articulo) FROM Articulo;");
         long value=-1;
        if (q.uniqueResult()!=null)
          value=((Number)q.uniqueResult()).longValue();
        
        System.out.println(value);   
        return value;
    } 
     
     
    public List<Tema> getTemas(){
        List<Tema> lista=null;
        this.IniciarTransaccion();
        org.hibernate.Query q = sesion.createQuery("from Tema");
        lista=(List<Tema>) q.list();
        return lista;
    }
 
     public Tema getTemaById(int codigo){
        Tema t = new Tema();
        try {
            //org.hibernate.Transaction txc = sesion.beginTransaction();
            this.IniciarTransaccion();
            Query q= sesion.createQuery("from Tema where id_tema='"+codigo+"'");
            t = (Tema)q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
     }
     
     public List<Articulo> getArticulos(){
        List<Articulo> lista=null;
        this.IniciarTransaccion();
        org.hibernate.Query q = sesion.createQuery("from Articulo");
        lista=(List<Articulo>) q.list();
        return lista;
    }
 
     public Articulo getArticuloById(int codigo){
        Articulo articulo = new Articulo();
        try {
            //org.hibernate.Transaction txc = sesion.beginTransaction();
            this.IniciarTransaccion();
            Query q= sesion.createQuery("from Articulo where id_articulo='"+codigo+"'");
            articulo = (Articulo)q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return articulo;
     }
     
     public Usuario getUsuario(String user, String password){
        Usuario usuario = new Usuario();
        try {
            //org.hibernate.Transaction txc = sesion.beginTransaction();
            this.IniciarTransaccion();
            Query q= sesion.createQuery("from Usuario where nick='"+user+"'"+" and clave='"+password+"'");
            usuario = (Usuario)q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuario;
     }
     
     public int getRol(long id_usuario){
        int res=0;
        try {
            //org.hibernate.Transaction txc = sesion.beginTransaction();
            this.IniciarTransaccion();
            Query q= sesion.createSQLQuery("select id_rol from rol_usuario where id_usuario='"+id_usuario+"'");
            res = (Integer)q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
     }
}