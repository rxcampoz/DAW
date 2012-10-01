/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;
import java.io.IOException;
import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;
import hibernate.*;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author Pavilion
 */
public class GenerarXML {
    
    
    public static void generarXMLProveedores(List<Proveedor> l ) throws JDOMException, IOException{
    
         SAXBuilder builder = new SAXBuilder(false);
            Document doc = builder.build("C:/Users/Pavilion/Desktop/Proveedores.xml");
            
            Element raiz = doc.getRootElement();
            
            Iterator i = l.iterator();
            while(i.hasNext()){
                
                String pro = ((Proveedor)i.next()).getCedulaOruc();
                
                
            Element proveedor =new Element("proveedor");
            
            proveedor.setText(pro);
            
            raiz.addContent(proveedor);
            }
            
             XMLOutputter outFile=new XMLOutputter();
            FileOutputStream file=new FileOutputStream("C:/Users/Pavilion/Desktop/Proveedores.xml");
            outFile.output(doc,file);
            file.flush();
            file.close();
            outFile.output(doc,System.out);
    }
}
