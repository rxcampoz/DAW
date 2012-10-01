/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function createXMLHttpRequest() {
    var request = false;

    /* Does this browser support the XMLHttpRequest object? */
    if (window.XMLHttpRequest) {
        if (typeof XMLHttpRequest != 'undefined')
        /* Try to create a new XMLHttpRequest object */
            try {
            request = new XMLHttpRequest();
        } catch (e) {
            request = false;
        }
        /* Does this browser support ActiveX objects? */
    } else if (window.ActiveXObject) {
        /* Try to create a new ActiveX XMLHTTP object */
        try {
            request = new ActiveXObject('Msxml2.XMLHTTP');
        } catch (e) {
            try {
                request = new ActiveXObject('Microsoft.XMLHTTP');
            } catch (e) {
                request = false;
            }
        }
    }
    return request;
}


function initialize() {
  var map;
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("mapa_Google"));
    map.setCenter(new GLatLng(-2.203331,-79.896183), 4);
    map.enableContinuousZoom();
    map.setUIToDefault();
    cargarMarcadoresAgrupados(map);
  }
}


function initialize2() {
  var map;
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("mapa_Google"));
    map.setCenter(new GLatLng(-2.203331,-79.896183), 13);
    map.enableContinuousZoom();
    map.setUIToDefault();
    cargarMarcadoresMapa(map)
  }
}


function cargarMarcadoresMapa(map){
    var xhr;
    xhr = createXMLHttpRequest();
    xhr.open("GET","ServletNoticia?comando=cargarMarcador");
    
    xhr.onreadystatechange = function () {
        if(xhr.readyState==4){
            if(xhr.status==200){
                var tareas=xhr.responseXML.getElementsByTagName("noticia");
                for(var i=0;i<tareas.length;i++){
                    var latitud=(tareas[i].getElementsByTagName("latitud")[0]).firstChild.nodeValue;
                    var longitud=(tareas[i].getElementsByTagName("longitud")[0]).firstChild.nodeValue;
                    var key=(tareas[i].getElementsByTagName("palabraclave")[0]).firstChild.nodeValue;
                    generarMarcadores(map,key,latitud,longitud);
                }
            }else alert("error "+xhr.status);
        }
    }
    xhr.send(null);
}


function cargarMarcadoresAgrupados(map){
    var xhr;

    xhr = createXMLHttpRequest();
    xhr.open( "GET", "ServletNoticia?comando=cargarMarcador");
    var markers = [];
    xhr.onreadystatechange = function () {
        if(xhr.readyState==4){
            if(xhr.status==200){
                var tareas=xhr.responseXML.getElementsByTagName("noticia");
                
                for(var i=0;i<tareas.length;i++){
                    var codigo=(tareas[i].getElementsByTagName("codigo")[0]).firstChild.nodeValue;
                    var titulo=(tareas[i].getElementsByTagName("titulo")[0]).firstChild.nodeValue;
                    var imagen=(tareas[i].getElementsByTagName("imagen")[0]).firstChild.nodeValue;
                    var descripcion=(tareas[i].getElementsByTagName("descripcion")[0]).firstChild.nodeValue;
                    var latitud=(tareas[i].getElementsByTagName("latitud")[0]).firstChild.nodeValue;
                    var longitud=(tareas[i].getElementsByTagName("longitud")[0]).firstChild.nodeValue;
                    var point = new GLatLng(latitud,longitud);
                    var marker = new GMarker(point);
                    cargarInformacion(codigo,imagen,marker,titulo,descripcion);
                    markers.push(marker);
                    
                }
                var markerCluster = new MarkerClusterer(map, markers);
            }else alert("error no entro ak "+xhr.status);
        }
    }  
   
  xhr.send(null);
}

function cargarInformacion(codigo,imagen,marker,titulo,descripcion){
      var div=document.createElement('div');
                    var ti=document.createElement('h2');
                    var p=document.createElement('p');
                    var l=document.createElement('p');
                    var img=document.createElement("img");
                    var link=document.createElement('a');
                    link.href='ServletNoticia?comando=informacion&id='+codigo;
                    
                    img.setAttribute("src", "images/"+imagen);
                    img.style.size='100px,100px';

                    ti.style.color='green';
                    p.style.color='black';
                    var textoTitulo=document.createTextNode(titulo);
                    var texto=document.createTextNode(descripcion);
                    var enlace=document.createTextNode("mas informacion");
                    link.appendChild(enlace);
                    l.appendChild(link);
                    ti.appendChild(textoTitulo);
                    p.appendChild(texto);
                    div.appendChild(ti);
                    div.appendChild(p);
                    div.appendChild(img);
                    div.appendChild(l);
                 
                    marker.bindInfoWindow(div);
}


function generarMarcadores(map,key,latitud,longitud){
    var point = new GLatLng(latitud,longitud);

    var div=document.createElement('div');
    var titulo=document.createElement('h2');
    var p=document.createElement('p');
    var link=document.createElement('a');

    link.href='ServletNoticia?comando=palabraClave&key='+key;
    titulo.style.color='green';
    p.style.color='black';
    var textoTitulo=document.createTextNode("Key:");
    var texto=document.createTextNode(key);

    //img.src=foto;
    link.appendChild(texto);
    titulo.appendChild(textoTitulo);
    p.appendChild(link);

    div.appendChild(titulo);
    div.appendChild(p);
    //div.appendChild(img);
    //div=nodoDoM;
    createMarker(map,point,div);
}


function addtag(point, address) {
                var marker = new GMarker(point);

                GEvent.addListener(marker, "click", function() {
                marker.openInfoWindowHtml(address);} );
                return marker;
 }

function add(marker, address) {
                GEvent.addListener(marker, "click", function() {
                marker.openInfoWindowHtml(address);} );
                return marker;
 }


//Create point, then marker, and then add to map
//Fuente: -- http://stackoverflow.com/questions/1517870/how-do-i-link-google-maps-markers-to-other-elements
function createMarker(map,point, nodoDOM) {
    var marker=new GMarker(point);
    map.addOverlay(marker);

    marker.bindInfoWindow(nodoDOM);

}

function createMarkerNoticia(map,point, nodoDOM) {
    var marker=new GMarker(point);
    map.addOverlay(marker);

    marker.bindInfoWindow(nodoDOM);
    //var markerCluster = new MarkerClusterer(map, marker);
}