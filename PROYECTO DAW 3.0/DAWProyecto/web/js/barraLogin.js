/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//Get a XMLHTTRequest valid objet based in the browser
function getXMLHTTPRequestLogin()
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

//Send a request for U to server
function verificarUsuario(user, password)
{
	//Get object
	var xRequest = getXMLHTTPRequestLogin();
        var strParametros = "user="+user+"&clave="+password;
        
	//Get response from server
	xRequest.onreadystatechange=function()
	{
		//Request completed and response 
		if (xRequest.readyState==4 && xRequest.status==200)
		{
			//return
			existeUsuario(xRequest.responseXML);
                        
                        //alert(xRequest.responseXML);
		}
	}

	//Make the request to server when obtain the response
	xRequest.open("POST","LoginServlet",true);
	xRequest.setRequestHeader("Content-type","application/x-www-form-urlencoded");
        xRequest.send(strParametros);
}

function existeUsuario(responseXML)
{
    var user = responseXML.getElementsByTagName("user")[0];
    alert(user.firstChild.nodeValue);
}

