/*
* Este archivo permite cargar la seccion nosotros
*/

//Get a XMLHTTRequest valid objet based in the browser
function getXMLHTTPRequestNosotros()
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
function cargarNosotros()
{
	//Get object
	var xRequest = getXMLHTTPRequestNosotros();  

	//Get response from server
	xRequest.onreadystatechange=function()
	{
		//Request completed and response 
		if (xRequest.readyState==4 && xRequest.status==200)
		{
			//return
			llenarNosotros(xRequest.responseXML);
		}
	}

	//Make the request to server when obtain the response
	xRequest.open("GET","NosotrosXML",true);
	xRequest.send();
}

//Cargamos el contenido en los gadget
function llenarNosotros(responseXML){
	var listaNoticias = responseXML.getElementsByTagName("nosotros");

	$str ="";
	for(i=0;i<listaNoticias.length;i++)
	{
		$titulo = listaNoticias[i].getElementsByTagName("titulo")[0].firstChild.nodeValue;
		$articulo = listaNoticias[i].getElementsByTagName("articulo")[0].firstChild.nodeValue;
		
		$str = $str + "<article><h3>"+$titulo+" </h3><p>"+$articulo+"</p></article>";
	}
        document.getElementById("completo").innerHTML = $str;
}