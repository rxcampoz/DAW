/*
* Archivo: llenarProductos
* Descripcion: Este archio realiza el precargado de las imagenes
*				que se mostraran en la seccion de productos
*/
var imagenesXML = null;
//Get a XMLHTTRequest valid objet based in the browser
function getXMLHTTPRequestProductos()
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
function cargarProductos(categoria)
{
	//Get object
	var xRequest = getXMLHTTPRequestProductos();  

	//Get response from server
	xRequest.onreadystatechange=function()
	{
		//Request completed and response 
		if (xRequest.readyState==4 && xRequest.status==200)
		{
			//return
			llenarProductos(xRequest.responseXML);
		}
	}

	//Make the request to server when obtain the response
	xRequest.open("GET","Visor?opcion="+categoria,true);
	xRequest.send();
}

function llenarProductos(responseXML)
{
	imagenesXML = responseXML.getElementsByTagName("zapato");
	
	$str ="";
	for(i=0;i<imagenesXML.length;i++)
	{
		$marca = imagenesXML[i].getElementsByTagName("marca")[0].firstChild.nodeValue;
		$modelo = imagenesXML[i].getElementsByTagName("modelo")[0].firstChild.nodeValue;
		$categoria = imagenesXML[i].getElementsByTagName("categoria")[0].firstChild.nodeValue;
		$tipo = imagenesXML[i].getElementsByTagName("tipo")[0].firstChild.nodeValue;
		$precio = imagenesXML[i].getElementsByTagName("precio")[0].firstChild.nodeValue;
		$img = imagenesXML[i].getElementsByTagName("img-path")[0].firstChild.nodeValue;
		
		$str = $str + "<li><a title=" +$modelo+ "><img src=" +$img+" alt="+$modelo+" />"+
				"<span class='tooltip'><span></span>"+
					"Marca: " +$marca+ "<br/>"+
					"Modelo: " +$modelo+ "<br/>"+
					"Categoria: " +$categoria+ "<br/>"+
					"Tipo: " +$tipo+ "<br/>"+
					"Precio: " +$precio+ "<br/></span></a></li>";
	}
	
	document.getElementById("polaroid").innerHTML = $str;
}
