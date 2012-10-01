/*
* Este archivo permite cargar las noticias en los gadget
*/

//Get a XMLHTTRequest valid objet based in the browser
function getXMLHTTPRequestNoticias()
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
function cargarNoticias()
{
	//Get object
	var xRequest = getXMLHTTPRequestNoticias();  

	//Get response from server
	xRequest.onreadystatechange=function()
	{
		//Request completed and response 
		if (xRequest.readyState==4 && xRequest.status==200)
		{
			//return
			llenarNoticias(xRequest.responseXML);
		}
	}

	//Make the request to server when obtain the response
	xRequest.open("GET","WidgetsXML",true);
	xRequest.send();
}

//Cargamos el contenido en los gadget
function llenarNoticias(responseXML){
	var listaNoticias = responseXML.getElementsByTagName("noticia");
	var articulos = document.getElementById("columns").getElementsByTagName("article");
	
	for(i=0;i<listaNoticias.length;i++)
	{
		$titulo = listaNoticias[i].getElementsByTagName("titulo")[0].firstChild.nodeValue;
		$articulo = listaNoticias[i].getElementsByTagName("articulo")[0].firstChild.nodeValue;
		
		articulos[i].getElementsByTagName("div")[0].getElementsByTagName("h3")[0].innerHTML = $titulo;
		if(i==0)
			articulos[i].getElementsByTagName("div")[1].innerHTML="<p>"+$articulo+"</p>";
		else
			articulos[i].getElementsByTagName("div")[2].innerHTML="<p>"+$articulo+"</p>";
	}
}