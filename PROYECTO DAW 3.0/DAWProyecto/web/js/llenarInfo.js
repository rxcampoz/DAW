/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
var idioma=0;
var pagActual=1;




function cargarContenido(){
    var xRequest;
    xRequest=create();
    xRequest.open("get","xml/introduccion.xml");
    xRequest.onreadystatechange=function () {generarXML3(xRequest);}
    xRequest.send(null);
}



function generarXML3(xRequest)
{

    if(xRequest.readyState == 4)
    {
        if (xRequest.status == 200)
        {
            var ref = xRequest.responseXML;
            llenarIndex(ref);
        }
        else
        {
              alert(xRequest.status);
          alert("ERROR en el servidor, el requerimiento es incorrecto");
        }
    }
}

function llenarIndex(ref){
    var i;
    var informacion = document.getElementById("contenido-index");
    
   
   var listaInfo = ref.getElementsByTagName("contenidos")[idioma];
   var listaInformacion=listaInfo.getElementsByTagName("contenido");
        
   

    informacion.innerHTML="";

    for (i=0;i<listaInformacion.length;i++)
    {
        var item=listaInformacion.item(i);
        var p=document.createElement("p");
        var t=document.createElement("p");
        t.appendChild(document.createTextNode(item.getElementsByTagName("titulo").item(0).firstChild.nodeValue));
        p.appendChild(document.createTextNode(item.getElementsByTagName("texto").item(0).firstChild.nodeValue));
        informacion.appendChild(t);
        informacion.appendChild(document.createElement("br"));
        informacion.appendChild(p);
         informacion.appendChild(document.createElement("br"));
    }
    
}

