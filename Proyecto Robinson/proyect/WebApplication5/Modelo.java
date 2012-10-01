/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author Robinson
 */
import hibernate.*;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import  org.hibernate.Session ;
public class Modelo {
    
   public Modelo(){
   }
   
   public static void guardar(Object o){
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       s.beginTransaction();
       s.save(o);
       s.getTransaction().commit();
   }
   
   public static Representante buscar(String identificacion){
        
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       s.beginTransaction();
        
       List<Representante> l =null; //s.createQuery("from representante").list();
       
       
   s.getTransaction().commit();
      Iterator i = l.iterator();
       while(i.hasNext()){
           Representante r = (Representante) i.next();
           
           if(identificacion.equalsIgnoreCase(r.getNumeroDeIdentificacionDelContribuyente())){
           return r ;
           }
       }
   
      return null ;
   }
   
   public static boolean consultarUsuarios(String usuario , String clave){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       s.beginTransaction();
       
       List<Usuario> l = (List<Usuario>)s.createQuery("from Usuario").list();
        
        
       s.getTransaction().commit();
       
       Iterator i = l.iterator();
    while( i .hasNext()){
       Usuario U = (Usuario)i.next();
   
       if(usuario.equalsIgnoreCase(U.getNumeroDeIdentificacionDelUsuario())){
       
           if(clave.equalsIgnoreCase(U.getClave())){
           return true ;
           }
       }
   }
    return false ;
   }
   
   
   public static void actualizar(Object o){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       s.beginTransaction();
       s.update(o);
       s.getTransaction().commit();
       
       
       
   }
   
   public static Usuario buscarUsuario(String usuario){
   
       
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       s.beginTransaction();
       List<Usuario> l =(List<Usuario>) s.createQuery("from Usuario").list();
       
       Iterator i = l.iterator();
       
       while(i.hasNext()){
           
           Usuario u = (Usuario) i.next();
           
           if(usuario.equalsIgnoreCase(u.getNumeroDeIdentificacionDelUsuario())){
           
               return u ;
           }
       }
       return null;
   }
   
   public  List<Facturaingreso> getFacturas(){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
       
       List<Facturaingreso> l = (List<Facturaingreso>) s.createQuery("from Facturaingreso").list();
       
       s.getTransaction().commit();
       
       return l ;
   } 
   
   public static void eliminarFacturaIngreso(String id){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
       
       String sd = (String)s.createQuery("delete from Facturaingreso F where F.numeroFactura="+id+"").uniqueResult();
       
       s.getTransaction().commit();
   }
   
   public  List<Facturaegreso> getFactura(){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
       
       List<Facturaegreso> l = (List<Facturaegreso>) s.createQuery("from Facturaegreso").list();
       
       s.getTransaction().commit();
       
       return l ;
   } 
   
   public  List<Proveedor> getProveedor(){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
       List<Proveedor> l = (List<Proveedor>)s.createQuery("from Proveedor").list();
       
       s.getTransaction().commit();
       return l ;
   
   }
   
   public List<Cliente> getCliente(){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
       List<Cliente> l = (List<Cliente>)s.createQuery("from Cliente").list();
       
       s.getTransaction().commit();
       return l ;
   }
   
   
   public static String totalViviendaQQQQQQ(){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
       String total = s.createQuery("select U.numero_de_identificacion_del_usuario from Usuario U where U.clave='1'").uniqueResult().toString();
        JOptionPane.showMessageDialog(null, total);
       s.getTransaction().commit();
       return  total;
   } 
       
      
   
     public static String totalVivienda(){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
       String total = s.createQuery("Select Sum(total) from Facturaegreso where tipoDeGasto='vivienda'").uniqueResult().toString();
       
       s.getTransaction().commit();
      
       return  total;
            
   }
    
   
    public static String totalOtros(){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
       String total = s.createQuery("Select Sum(total) from Facturaegreso where tipoDeGasto='otros'").uniqueResult().toString();
       
       s.getTransaction().commit();
      
       return  total;
            
   }
     public static String totalSalud(){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
       String total = s.createQuery("Select Sum(total) from Facturaegreso where tipoDeGasto='salud'").uniqueResult().toString();
       
       s.getTransaction().commit();
      
       return  total;
            
   }
      public static String totalAlimentacion(){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
       String total = s.createQuery("Select Sum(total) from Facturaegreso where tipoDeGasto='alimentacion'").uniqueResult().toString();
       
       s.getTransaction().commit();
      
       return  total;
            
   }
       public static String totalEducacion(){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
       String total = s.createQuery("Select Sum(total) from Facturaegreso where tipoDeGasto='educacion'").uniqueResult().toString();
       
       s.getTransaction().commit();
      
       return  total;
            
   }
        public static String totalVestimenta(){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
       String total = s.createQuery("Select Sum(total) from Facturaegreso where tipoDeGasto='vestimenta'").uniqueResult().toString();
       
       s.getTransaction().commit();
      
       return  total;
            
   }
        
     public static String totalEstablecimiento(String establecimiento){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
       String total = s.createQuery("Select Sum(total) from Facturaegreso where proveedor="+establecimiento+"").uniqueResult().toString();
       
       s.getTransaction().commit();
      
       return  total;            
   }
    

