
function creat(){
        var xRequest=null;
        if (window.XMLHttpRequest) {
            xRequest=new XMLHttpRequest();
        }
        else if (typeof ActiveXObject != "undefined"){
            xRequest=new ActiveXObject("Microsoft.XMLHTTP");
        }
        return xRequest;
    }

    function cargarCon(){
        var xRequest;
        xRequest=creat();
        xRequest.open("get","Archivo/contactos.xml");
        xRequest.onreadystatechange=function () {ManejarCon(xRequest);}
        xRequest.send(null);
    }

    function ManejarCon(xRequest){
        if(xRequest.readyState==4){
            if(xRequest.status==200){

                var xml=xRequest.responseXML;
                var informacionContacto=document.getElementById("cajadetalles");                
                var fotoContacto=document.getElementById("im"+"0");

                fotoContacto.innerHTML="";
                informacionContacto.innerHTML="";

                var i;
                var listaContactos=xml.getElementsByTagName("contacto");

                for (i=0;i<listaContactos.length;i++){
                    var item=listaContactos.item(i);                   
                    fotoContacto=document.getElementById("im"+i);
                    var img=document.createElement("img");
                    img.setAttribute("src","imagenes/ImagenesContactos/"+item.getElementsByTagName("imagen").item(0).firstChild.nodeValue);
                    fotoContacto.appendChild(img);
                }

            }
        }
    }