/*
* Archivo: llenarProductos
* Descripcion: Este archio realiza el precargado de las imagenes
*				que se mostraran en la seccion de productos
*/
var imagenesXML = null;
//Get a XMLHTTRequest valid objet based in the browser
function getXMLHTTPRequest()
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

//Send a request for Ciudades to server
function cargarLogo()
{
	//Get object
	xRequest = getXMLHTTPRequest();  

	//Get response from server
	xRequest.onreadystatechange=function()
	{
		//Request completed and response 
		if (xRequest.readyState==4 && xRequest.status==200)
		{
			//return
			llenarLogo(xRequest.responseXML);
		}
	}

	//Make the request to server when obtain the response
	xRequest.open("GET","xml/Logos.xml",true);
	xRequest.send();
}

function llenarLogo(responseXML){
	var listaLogo = responseXML.getElementsByTagName("logo");
	$numAlet = aleatorio(0,7);
	$img = listaLogo[$numAlet].getElementsByTagName("img-path")[0].firstChild.nodeValue;
	//document.getElementById("logo").innerHTML = "<img src='"+$img+"' alt='Logo Cholo Machine' />"
	document.getElementById("logo").getElementsByTagName("img")[0].src = $img;
}

function aleatorio(inferior,superior){ 
   	numPosibilidades = superior - inferior 
   	aleat = Math.random() * numPosibilidades 
   	aleat = Math.round(aleat) 
   	return parseInt(inferior) + aleat 
} 