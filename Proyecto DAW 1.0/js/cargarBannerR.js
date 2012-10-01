/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function cargarBannerRR(){
    var xRequest;
    xRequest=create();
    xRequest.open("get","xml/imagenesBannerR.xml");
    xRequest.onreadystatechange=function () {generarXML5(xRequest);}
    xRequest.send(null);
    
}

function generarXML5(xRequest)
{
   
    if(xRequest.readyState == 4)
    {
        if (xRequest.status == 200)
        {
            var ref = xRequest.responseXML;
            llenarBannerR(ref);
        }
        else
        {
			alert(xRequest.status);
			alert("ERROR en el servidor, el requerimiento es incorrecto");
        }
    }
}

function llenarBannerR(ref){
    var i=0;
    var bannerR = document.getElementById("bannerR");
  
    imagenesBR = ref.getElementsByTagName("imagen");
    bannerR.innerHTML="";
  
    for(i=0;i<imagenesBR.length;i++)
	{
		imagen = document.createElement("img");
                               
		imagen.setAttribute("src",imagenesBR[i].getElementsByTagName("path")[0].firstChild.nodeValue);
		imagen.setAttribute("alt",imagenesBR[i].getElementsByTagName("alt")[0].firstChild.nodeValue);
		imagen.setAttribute("width","99%");
		imagen.setAttribute("height","200");
                bannerR.appendChild(imagen);
                
	}
     
     
     //JQUERY
    $('#bannerR').cycle({ 
    fx:     'scrollLeft', 
    speed:   300, 
    timeout: 3000, 
    next:   '#bannerR', 
    pause:   1 
});

 
      
    
  
    
}