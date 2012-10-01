/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
var idioma=0;
var pagActual=1;




function initNosotros(num){
    cargarNosotros(num);
    cargarBannerRR();
}

function cargarNosotros(num){
    var xRequest;
    xRequest=create();
    xRequest.open("get","xml/nosotros.xml");
    xRequest.onreadystatechange=function () {generarXML2(xRequest, num);}
    xRequest.send(null);
    
}


function generarXML2(xRequest, num)
{
   
    if(xRequest.readyState == 4)
    {
        if (xRequest.status == 200)
        {
            var ref = xRequest.responseXML;
            llenarNosotros(ref, num);
        }
        else
        {
              alert(xRequest.status);
          alert("ERROR en el servidor, el requerimiento es incorrecto");
        }
    }
}

function llenarNosotros(ref, num){
    var i=0;
    var informacion = document.getElementById("contenido-nosotros");
   
    var listaInformacion = null;
  
    var imagen=null;
    listaI=ref.getElementsByTagName("contenidos")[idioma];
   
    
    if(num==1){
        listaInformacion=listaI.getElementsByTagName("quienessomos");
        
    }
    if(num==2){
        listaInformacion=listaI.getElementsByTagName("visitanos");
        
    }
     if(num==3){
        listaInformacion=listaI.getElementsByTagName("responsabilidad");
        
    }
   
    informacion.innerHTML="";
 
    for (i=0;i<listaInformacion.length;i++)
    {
        var item=listaInformacion.item(i);
        var p=document.createElement("p");
        var t=document.createElement("h3");
        t.appendChild(document.createTextNode(item.getElementsByTagName("titulo").item(0).firstChild.nodeValue));
        p.appendChild(document.createTextNode(item.getElementsByTagName("texto").item(0).firstChild.nodeValue));
        informacion.appendChild(t);
        informacion.appendChild(document.createElement("br"));
        informacion.appendChild(p);
         informacion.appendChild(document.createElement("br"));
    }
    
    listaImagenes = ref.getElementsByTagName("imagen");
    
    var preview=document.getElementById("imagenPreview").getElementsByTagName("ul")[0];
    var zoom=document.getElementById("imagenZoom").getElementsByTagName("ul")[0];
    preview.innerHTML="";
    zoom.innerHTML="";
    
    for(i=0;i<listaImagenes.length;i++)
	{
		imagen = document.createElement("img");
                imagenZ = document.createElement("img");
                li=document.createElement("li");
                li2=document.createElement("li");
                a=document.createElement("a");
                a.setAttribute("href","#zoom"+i);
                a2=document.createElement("a");
                li2.setAttribute("id","zoom"+i);
                
		imagen.setAttribute("src",listaImagenes[i].getElementsByTagName("path")[0].firstChild.nodeValue);
		imagen.setAttribute("alt",listaImagenes[i].getElementsByTagName("alt")[0].firstChild.nodeValue);
		imagen.setAttribute("width","99%");
		imagen.setAttribute("height","200");
                
                imagenZ.setAttribute("src",listaImagenes[i].getElementsByTagName("path")[0].firstChild.nodeValue);
		imagenZ.setAttribute("alt",listaImagenes[i].getElementsByTagName("alt")[0].firstChild.nodeValue);
		imagenZ.setAttribute("width","99%");
		imagenZ.setAttribute("height","200");
                li.appendChild(a);
                li2.appendChild(a2);
                a.appendChild(imagen);
               
                a2.appendChild(imagenZ);
                //hacer CSS http://webstandard.kulando.de/post/2010/05/21/sliding-image-gallery-css3-transition-tutorial
		preview.appendChild(li);
		zoom.appendChild(li2);
	}
    
      
    
  
    
}

