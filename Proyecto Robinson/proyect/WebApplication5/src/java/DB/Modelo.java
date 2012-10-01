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
       
       s.getTransaction().commit();
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
  /* 
   public static void eliminarFacturaIngreso(String id){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
       
       String sd = (String)s.createQuery("delete from Facturaingreso F where F.numeroFactura="+id+"").uniqueResult();
       
       s.getTransaction().commit();
   }
  */
   
    public static void eliminar(Object o){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
       
       s.delete(o);
       
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
   
   
   public static String totalVivienda(){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
       String total = (String)s.createQuery("select U.clave from Usuario U where U.clave='1'").uniqueResult();
       
       s.getTransaction().commit();
       return  total;
       
       
      
   }
   
   public Facturaingreso getFacturaingresoById(String codigo){
   
       Facturaingreso f = new Facturaingreso();
         
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
    
            f = (Facturaingreso)s.createQuery("from Facturaingreso f where f.numeroFactura='"+codigo+"'").uniqueResult();
        
       s.getTransaction().commit();
       
            return f ;
   }
   
   public Facturaegreso getFacturaegresoById(String codigo){
   
       Facturaegreso f = new Facturaegreso();
         
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
    
            f = (Facturaegreso)s.createQuery("from Facturaegreso f where f.numeroFactura='"+codigo+"'").uniqueResult();
        
       s.getTransaction().commit();
       
            return f ;
   }
   
   public Usuario getUsuarioByUsuarioClave(String usuario, String clave){
   
       Usuario u = new Usuario();
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       
       s.beginTransaction();
       
       u = (Usuario)s.createQuery("from Usuario u where u.numeroDeIdentificacionDelUsuario='"+usuario+"' and u.clave ='"+clave+"'").uniqueResult();
        s.getTransaction().commit();
       
            return u ;
   
   }
   
   // VARELA
   
 
    /*tipos de gastos obtenidos de la base de datos 
    *vivienda
    * educacion
    * salud
    * vestimenta
    * ptros....
    */

       
     public static String totalTipoDeGastos( String tipoGasto, String mes, String anio){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        String total;
       try{
       s.beginTransaction();
        total = s.createQuery("Select Sum(total) from Facturaegreso where tipoDeGasto=\'"+tipoGasto+"\' and mes=\'"+mes+"\'and anio=\'"+anio+"\'" ).uniqueResult().toString();
       
       s.getTransaction().commit();
        return total;
       }
       catch(Exception e)
       {
           return total="0";
       }
         
      
}
    
     public static String totalTipoDeGastosAnual( String tipoGasto, String anio){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        String total;
       try{
       s.beginTransaction();
        total = s.createQuery("Select Sum(total) from Facturaegreso where tipoDeGasto='"+tipoGasto+"' and anio='"+anio+"'" ).uniqueResult().toString();
       
       s.getTransaction().commit();
        return total;
       }
       catch(Exception e)
       {
           return total="0";
       }
         
      
}
 
      

      /*establecimiento obtenidos de la base de datos 
    *vivienda
    * educacion
    * salud
    * vestimenta
    * ptros....
    */
   
     public static String totalEstablecimiento( String establecimiento, String mes, String anio){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       String total;
       try{
       s.beginTransaction();
       total = s.createQuery("Select Sum(total) from Facturaegreso where proveedor=\'"+establecimiento+"\' and mes=\'"+mes+"\' and anio=\'"+anio+"\'" ).uniqueResult().toString();
       
       s.getTransaction().commit();
      
       return  total;
       }
       catch(Exception e)
       {
           return  total="0";
       }
            
   }
     
      public static String totalEstablecimientoAnual( String establecimiento, String anio){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       String total;
       try{
       s.beginTransaction();
       total = s.createQuery("Select Sum(total) from Facturaegreso where proveedor=\'"+establecimiento+"\' and anio=\'"+anio+"\'" ).uniqueResult().toString();
       
       s.getTransaction().commit();
      
       return  total;
       }
       catch(Exception e)
       {
           return  total="0";
       }
            
   }
      /*tipo obtenidos de la base de datos 
    *vivienda
    * educacion
    * salud
    * vestimenta
    * ptros....
    */
   
     public static String totalTipo( String tipo, String mes, String anio){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       String total;
       try{
       s.beginTransaction();
        total = s.createQuery("Select Sum(de.valor) from Detalleegreso de, Contrato c where  de.idContrato=c.idContrato and de.tipo=\'"+tipo+"\' and c.mes=\'"+mes+"\'and c.anio=\'"+anio+"\'" ).uniqueResult().toString();
       
       s.getTransaction().commit();
      
       return  total;
       }
       catch(Exception e)
       {
            return  total="0";
       }
   }
     public static String totalTipoAnual( String tipo, String anio){
   
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       String total;
       try{
       s.beginTransaction();
        total = s.createQuery("Select Sum(de.valor) from Detalleegreso de, Contrato c where de.idContrato=c.idContrato and de.tipo=\'"+tipo+"\'and c.anio=\'"+anio+"\'" ).uniqueResult().toString();
       
       s.getTransaction().commit();
      
       return  total;
       }
       catch(Exception e)
       {
            return  total="0";
       }
   }
     
     
     /*ultimo*/
     
     public static String totaGastos(){
     
         Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       String total;
       
       s.beginTransaction();
        total = s.createQuery("Select Sum(f.total) from Facturaingreso f " ).uniqueResult().toString();
       
       s.getTransaction().commit();
         
       return total ;
     }
     
}


   
   

