<%-- 
    Document   : IngresarCliente
    Created on : 03-sep-2011, 3:15:50
    Author     : Darius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar cliente</title>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
        <script src="http://maps.google.com/maps?file=api&amp;v=2&amp;sensor=false&amp;key=ABQIAAAAHvHFgA4hXZiMtrKDtTus-RTI8pZPuaFxtS2S2Zel8y9gQXOwDxTUdtfJNARcHZYdv7H2uc2cf7X0lQ" type="text/javascript"></script>
        <style>
            #formulario{
                
                position: absolute;
                top: 5em;
                left: 5em;
            }
             #map{
                 position: relative;
                top: 5em;
                left: 40em;
                
             } 
            
        </style>
    </head>
    <body>
         <div id="map" style="width:40em;height: 40em;" >            
        </div>
        <script>
          var coorXx ;
          var coorYy ;
           var map= new GMap(document.getElementById("map"));
            map.addControl(new GSmallMapControl());
            map.addControl(new GMapTypeControl());
            map.addControl(new GOverviewMapControl());          
           //map.GMapTypeControl();          
            map.centerAndZoom(new GPoint(-78.582459,-2.168642),10);
            
           
            GEvent.addListener(map, "click",function(overview, latLng){
             // var marker=new GMarker(latLng);
            //map.addOverlay(marker);
            var latitud=latLng.lat();
            var longitud=latLng.lng();
            coorXx = latitud;
            coorYy = longitud;
            var formulario= document.createElement("form");
            formulario.setAttribute("action","");
            formulario.onsubmit=function(){enviarCoordenadas();return false;};
            formulario.innerHTML=//'<fieldset style="width:150px;">'
               // +'<legend>lugar interesante</legend>'               
                '..................'+'<button onclick="enviarCoordenadas()">AQUI</button>'
                +'<input type="hidden" id="longitud" value="'+longitud+'"/>'
                +'<input type="hidden" id="latitud" value="'+latitud+'"/>'
                //+'</fieldset>'
            ;
            map.openInfoWindow(latLng,formulario);                      
          });
          
          function enviarCoordenadas(){
             var coorX = document.getElementById("coorX");
             var coorY = document.getElementById("coorY");
             
             coorX.setAttribute("value",coorXx );
             coorY.setAttribute("value", coorYy);
             
         }
         </script>
        <div id="formulario">
            <form action="Cliente_SERVLET" method="get">
              	Nombre del proveedor <input type="text" name="nombre"/></br></br>
             	RUC o cédula <input type="text" name="cedulaOruc"/></br></br>
             	Dirección:</br>   <textarea name="direccion" rows=5 cols=40>
                                
                                </textarea></br></br>
            	Teléfono <input name="telefono" type="text"/></br></br>
                
                <input type="hidden" value="guardar" name="opcion"/>
                <input type="submit" value="Guardar"/>

            </form>
            
        </div>
    </body>
</html>
