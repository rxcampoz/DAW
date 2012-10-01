//Author: Gonzalo Luzardo
//gonchalox@gmail.com
//Get a XMLHTTRequest valid objet based in the browser
function getXMLHTTPRequestCiudades()
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


//Add a option in select Provincias
function addOptionProvincias(val,text)
{
	  //Use DOM
	  
	  //Create option object with atribute node value
	  var opt_node = document.createElement('option');
	  opt_node.value = val;
	  	  
	  //Create text node and add to option node and add to option node
	  var text_node = document.createTextNode(text);
	  opt_node.appendChild(text_node);
    
    //add option node to list
    document.getElementById('provincias').appendChild(opt_node); 
	 
}
 
//Load Provincias in the input option, read xml
function loadXMLProvincias(xml)
{
	  var i=0; 
    //alert("XML Root Tag Name: " + xml.documentElement.tagName);
    var provinces = xml.getElementsByTagName("provincia");
       
    for(i=0; i<provinces.length; i++)
    {
       //The order is >> list[i].tag(id)[0].child.value 
   	   var province_id =  provinces[i].getElementsByTagName("id")[0].firstChild.nodeValue;
   	   var province_name =  provinces[i].getElementsByTagName("nombre_provincia")[0].firstChild.nodeValue;
   	   //Add option
       addOptionProvincias(province_id,province_name);
    }
}


//Send a request for Provincias to server
function queryProvincias()
{
	 //Get object
	var xRequest = getXMLHTTPRequestCiudades();  
     
   //Get response from server
   xRequest.onreadystatechange=function()
   {
  	 //Request completed and response 
     if (xRequest.readyState==4 && xRequest.status==200)
     {
    	  //Load Provincias and put on select input
        loadXMLProvincias(xRequest.responseXML);
     }
   }
   
   //Make the request to server when obtain the response
   xRequest.open("GET","xml/provincias.xml",true);
   xRequest.send();
}





function addOptionCiudades(val,text)
{
	  //Use DOM
	  
	  //Create option object with atribute node value
	  var opt_node = document.createElement('option');
	  opt_node.value = val;
	  	  
	  //Create text node and add to option node and add to option node
	  var text_node = document.createTextNode(text);
	  opt_node.appendChild(text_node);
    
    //add option node to list
    document.getElementById('ciudades').appendChild(opt_node); 
	 
}

function loadXMLCiudades(xml){
var i=0;
var cities=xml.getElementsByTagName("ciudad");
var cell=document.getElementById("ciudades");
	if(cell.hasChildNodes())
		while(cell.childNodes.length>=1)
			cell.removeChild(cell.firstChild);
			
		for(i=0;i<cities.length;i++)
		{
			var city_name= cities[i].getAttribute('nombre_ciudad');
			var city_id= cities[i].getAttribute('id');
		
		
			addOptionCiudades(city_id,city_name);
		}
					
}


function queryCiudades(str)
{
	 //Get object
	var xRequest = getXMLHTTPRequestCiudades();  
     
   //Get response from server
   xRequest.onreadystatechange=function()
   {
  	 //Request completed and response 
     if (xRequest.readyState==4 && xRequest.status==200)
     {
    	  //Load Provincias and put on select input
        loadXMLCiudades(xRequest.responseXML);
     }
   }
   
   //Make the request to server when obtain the response
   xRequest.open("GET","xml/getcities.php?pr="+str,true);
   xRequest.send();
}