/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Hibernate;

import Modelo.Empleado;
import Modelo.Noticia;
import Modelo.RecursoMultimedio;
import Modelo.Seccion;
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
    {
        this.IniciarTransaccion();
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

    /***************************************************************************
     **                  Metodos para los Empleado                            **
     ***************************************************************************/
     public List<Empleado> getEmpleado(){
        List<Empleado> lista=null;
        this.IniciarTransaccion();
        org.hibernate.Query q = sesion.createQuery("from Empleado");
        lista=(List<Empleado>) q.list();
        return lista;
    }

     public Empleado getEmpleadoByUser(String username){
        Empleado ep = new Empleado();
        try {
            //org.hibernate.Transaction txc = sesion.beginTransaction();
            this.IniciarTransaccion();
            Query q = this.sesion.createQuery("from Empleado where user='"+username+"'");
            ep = (Empleado)q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ep;
     }

     public Empleado getEmpleadoById(int codigo){
        Empleado emp = new Empleado();
        try {
            //org.hibernate.Transaction txc = sesion.beginTransaction();
            this.IniciarTransaccion();
            Query q= sesion.createQuery("from Empleado where idempleado='"+codigo+"'");
            emp = (Empleado)q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emp;
     }

     public Empleado getUsuarioXLoggin(String user, String pass){
        Empleado obj=null;
        this.IniciarTransaccion();
        org.hibernate.Query q = sesion.createQuery("from Empleado where user="+user+" and password="+pass);
        q.setMaxResults(1);
        obj=(Empleado)q.uniqueResult();
        return obj;
    }

    /***************************************************************************
     **                  Metodos para las Secciones                           **
     ***************************************************************************/

   public List<Seccion> getSeccion(){
        List<Seccion> lista=null;
        this.IniciarTransaccion();
        org.hibernate.Query q = sesion.createQuery("from Seccion");
        lista=(List<Seccion>) q.list();
        return lista;
    }

   public Seccion getSeccionById(int codigo){
        Seccion sec = new Seccion();
        try {

            //org.hibernate.Transaction txc = sesion.beginTransaction();
            this.IniciarTransaccion();
            Query q = sesion.createQuery("from Seccion where idseccion='"+codigo+"'");
            sec = (Seccion)q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sec;
     }

     public Seccion getSeccionByNombre(String nombre){
        Seccion sec = new Seccion();
        try {

            //org.hibernate.Transaction txc = sesion.beginTransaction();
            this.IniciarTransaccion();
            Query q = sesion.createQuery("from Seccion where nombre='"+nombre+"'");
            sec = (Seccion)q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sec;
     }



    /***************************************************************************
     **                   Metodos para las Noticias                           **
     ***************************************************************************/
   public List<Noticia> getNoticia(){
        List<Noticia> lista=null;
        this.IniciarTransaccion();
        org.hibernate.Query q = sesion.createQuery("from Noticia");
        lista=(List<Noticia>) q.list();
        return lista;
    }

   public Noticia getNoticiaById(int codigo)
    {
        Noticia not = new Noticia();
        try {
            //org.hibernate.Transaction txc = sesion.beginTransaction();
            this.IniciarTransaccion();
            Query q= sesion.createQuery("from Noticia where idnoticia='"+codigo+"'");
            not = (Noticia)q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return not;
     }

   public List<Noticia> getNoticiaBySeccion(int codigoSeccion){
            List<Noticia> lista=null;
            try{
                //org.hibernate.Transaction txc = sesion.beginTransaction();
                this.IniciarTransaccion();
                Query q = sesion.createQuery("from Noticia where idseccion='"+codigoSeccion+"'");
                lista=(List<Noticia>) q.list();
            }catch (Exception e) {
                e.printStackTrace();
            }
            return lista;
       }

   public ArrayList<Noticia> generarNoticasXKey(String key){
        List<Noticia> listaNoticia = null;
       // List<RecursoMultimedio> listaRecurso = null;
        listaNoticia = getNoticia();
        //listaRecurso = getRecurso();
        ArrayList<Noticia> listaNoticiaXKey = new ArrayList<Noticia>();
        for(int i=0;i<listaNoticia.size();i++){
           if(key.equals(listaNoticia.get(i).getPalabraClave())){
                listaNoticiaXKey.add(listaNoticia.get(i));
           }
        }

        return listaNoticiaXKey;
    }

   public ArrayList<Noticia> generarNoticasXid(int codigo){
        List<Noticia> listaNoticia = null;
       // List<RecursoMultimedio> listaRecurso = null;
        listaNoticia = getNoticia();
        //listaRecurso = getRecurso();
        ArrayList<Noticia> listaNoticiaXKey = new ArrayList<Noticia>();
        for(int i=0;i<listaNoticia.size();i++){
           if(codigo == listaNoticia.get(i).getIdnoticia()){
                listaNoticiaXKey.add(listaNoticia.get(i));
           }
        }

        return listaNoticiaXKey;
    }



   /***************************************************************************
     **               Metodos para los Recursos Multimedios                  **
     ***************************************************************************/
     public List<RecursoMultimedio> getRecurso()
    {
        List<RecursoMultimedio> lista = null;
        try {
            //org.hibernate.Transaction txc = sesion.beginTransaction();
            this.IniciarTransaccion();
            org.hibernate.Query q = sesion.createQuery("from RecursoMultimedio");
            lista = (List<RecursoMultimedio>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;

//
//        List<RecursoMultimedio> lista=null;
//        this.IniciarTransaccion();
//        Query q = sesion.createQuery("from recurso_multimedio");
//        lista=(List<RecursoMultimedio>) q.list();
//        return lista;
    }

   public RecursoMultimedio getRecursoById(int codigo)
    {
        RecursoMultimedio rec = new RecursoMultimedio();
        try {
      
            this.IniciarTransaccion();
            Query q= sesion.createQuery("from RecursoMultimedio where idrecursoMultimedio='"+codigo+"'");
            rec = (RecursoMultimedio)q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rec;
     }

   public RecursoMultimedio getRecursoByDescrip(String archivo)
    {
        RecursoMultimedio rec = new RecursoMultimedio();
        try {

            this.IniciarTransaccion();
            Query q= sesion.createQuery("from RecursoMultimedio where archivo='"+archivo+"'");
            rec = (RecursoMultimedio)q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rec;
     }

   /****lista para el scripts**/

    public String generaXML_ListaNoticias(){
        List<Noticia> listaNoticia = null;
       // List<RecursoMultimedio> listaRecurso = null;
        listaNoticia = getNoticia();
        //listaRecurso = getRecurso();
        String XML="<noticias>";
        String img="";
        RecursoMultimedio r = null;
        for(int i=0;i<listaNoticia.size();i++){
            r = (RecursoMultimedio) getRecursoById(listaNoticia.get(i).getIdrecursoMultimedio());
            img = r.getArchivo();
            //JOptionPane.showMessageDialog(null,lista1.get(i).getDescripcion(), "Error en la base de datos", JOptionPane.ERROR_MESSAGE);
            XML+= "<noticia>"+
            "<codigo>"+listaNoticia.get(i).getIdnoticia()+"</codigo>"+
            "<titulo>"+listaNoticia.get(i).getTitulo()+"</titulo>"+
            "<imagen>"+img+"</imagen>"+
            "<latitud>"+listaNoticia.get(i).getLatitud()+"</latitud>"+
            "<longitud>"+listaNoticia.get(i).getLongitud()+"</longitud>"+
            "<descripcion>"+listaNoticia.get(i).getNoticiaCompleta()+"</descripcion>"+
            "<palabraclave>"+listaNoticia.get(i).getPalabraClave()+"</palabraclave>"+
            "</noticia>";
        }
        XML+="</noticias>";
        return XML;
    }

}
