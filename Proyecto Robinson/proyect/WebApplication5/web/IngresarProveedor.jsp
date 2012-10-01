<%-- 
    Document   : IngresarProveedor
    Created on : 03-sep-2011, 21:03:57
    Author     : Robinson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar Proveedor</title>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
         <script src="http://maps.google.com/maps?file=api&amp;v=2&amp;sensor=false&amp;key=ABQIAAAAHvHFgA4hXZiMtrKDtTus-RTI8pZPuaFxtS2S2Zel8y9gQXOwDxTUdtfJNARcHZYdv7H2uc2cf7X0lQ" type="text/javascript"></script>
         <script>
         
         </script>
         <style>
             #map{
                 position: relative;
                top: 10em;
                left: 50em;
                
             }     
             
             #formulario{
                 position: absolute;
                top: 10em;
                              
             } 
         </style>
    </head>
    <body>
        <div id="map" style="width:700px;height: 600px;" >            
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
                //+'<legend>lugar interesante</legend>'               
                '...........'+'<button onclick="enviarCoordenadas()">MARCAR AQUI</button>'
                +'<input type="hidden" id="longitud" value="'+longitud+'"/>'
                +'<input type="hidden" id="latitud" value="'+latitud+'"/>'
               // +'</fieldset>';
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
        <form action="Proveedor_SERVLET" method="get">
            <table border="3">
                <tr><td>
                        RUC o Cédula:</td><td><input name="rucOCedula" type="text"/></td>
        </tr>
        <tr><td>
                Razón Social:</td><td><input name="razonSocial" type="text"/></td>
        </tr>
        <tr><td>
                Dirección :</td><td>
        <textarea name="direccion" rows="10" cols="10">


        </textarea></td>
            </tr>
       
        <input type="hidden" name="coorX" id="coorX"/>
        <input type="hidden" name="coorY" id="coorY"/>
        <tr><td>
                Teléfono: </td><td><input name="telefono" type="text"/></td>
        </tr>
        <input type="hidden" name="opcion" value="guardar"/>
        <tr><td>
        <input type="submit" value="guardar"/></td>
        </tr>
            </table>
        </form>
            </div>
    </body>
</html>
