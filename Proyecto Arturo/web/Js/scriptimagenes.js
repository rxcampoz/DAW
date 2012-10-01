/*****************************************************
 *****************************************************
 **     Script: scriptimagenes                       *
 **     Descripcion: Me Permite la carga automatica  *
 **     de Imagenes al cargar la Pagina              *
 **     Principal                                    *                                                    **
 *****************************************************
 *****************************************************/


/*  Funcion: ImagenesAutomaticas
 *  Descripcion: Funcion recursiva que me permite hacer el
 *  efecto de la carga autamatica de una galeria de imagenes
 *  la cual recibe como parametro:
 *  galeria: Nombre del div en que apareceran las Imagenes
 *  cadenaImagenes: Nombre concatenado de todas mis Imagenes
 *  tempoAtraso: Tiempo que se demorara cada imagen en aparecer
 **/

function ImagenesAutomaticas(galeria,cadenaImagenes,tiempoAtraso){
                
                var separador = cadenaImagenes.indexOf(";");
                var nextImage = cadenaImagenes.substring(0,separador);

                document.getElementById(galeria).src = nextImage;

                var futureImages= cadenaImagenes.substring(separador+1,cadenaImagenes.length)
                + ';' + nextImage;
                setTimeout("ImagenesAutomaticas('"+galeria+"','"+futureImages+"',"+tiempoAtraso+")",
                tiempoAtraso*1000);
                
                separador = futureImages.indexOf(";");
                nextImage = futureImages.substring(0,separador);
 }

