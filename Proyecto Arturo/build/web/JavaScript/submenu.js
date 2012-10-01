/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
function creat()
    {
        var xRequest=null;
        if (window.XMLHttpRequest) {
            xRequest=new XMLHttpRequest();
        }
        else if (typeof ActiveXObject != "undefined"){
            xRequest=new ActiveXObject("Microsoft.XMLHTTP");
        }
        return xRequest;
    }
    function cargar()
    {
        var xRequest;
        xRequest=creat();
        xRequest.open("get","Archivo/submenu.xml");
        xRequest.onreadystatechange=function () {manejar(xRequest);}
        xRequest.send(null);
    }
    function manejar(xRequest)
    {

        if (xRequest.readyState==4)
        {
            if (xRequest.status==200)
            {

                var xml=xRequest.responseXML;
                var informacionContacto=document.getElementById("content");

              
                informacionContacto.innerHTML="";
                var i;
                var listaContactos=xml.getElementsByTagName("submenu");

                for (i=0;i<listaContactos.length;i++)
                {
                    var item=listaContactos.item(i);
                    var titulo=document.createElement("li");
                    
                    if(i<4){
                        titulo.appendChild(document.createTextNode(item.getElementsByTagName("titulo").item(0).firstChild.nodeValue));
                        informacionContacto.appendChild(titulo);
                    }
                    informacionContacto.appendChild(document.createElement("br"));

                   
                }

            }
        }
    }
