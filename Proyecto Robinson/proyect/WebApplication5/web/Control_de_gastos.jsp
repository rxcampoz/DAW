<%-- 
    Document   : trabajo_realizado
    Created on : 13/09/2011, 04:42:14 PM
    Author     : VICTOR SAA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
     
        
        <title>JSP Page</title>
        
            <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>  
        <script type="text/javascript" src="js/highcharts.js"></script>  
        <!-- Este archivo es para darle un estilo (Este archivo es Opcional) -->  
        <script type="text/javascript" src="js/themes/grid.js"></script>  
        <!-- Este archivo es para poder exportar los datos que obtengamos -->  
        <script type="text/javascript" src="js/modules/exporting.js"></script> 
        
        
        <!--esto es la funcion acordeon-->
         <link href="css/style.css" rel="stylesheet" type="text/css" media="screen" />
         <link href="css/acordeon.css" rel="stylesheet" type="text/css" media="screen" />
         <link href="css/jquery-ui-1.8.5.custom.css" rel="stylesheet" type="text/css" media="screen" />          
         <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.16/jquery-ui.min.js"></script>
         <script type="text/javascript" src="js/acordeon.js"></script> 
         <script type="text/javascript" src="js/gra.js"></script> 
         <script type="text/javascript" src="js/funciones.js"></script> 
    </head>
    <body onload="grafica()">
   
       
        <h1>trabajo realizado con exito</h1>
        
       
         <div id="contenedor">
            <div id="acordeon">
                 
                <h3><a href="#">Anio 2009</a></h3>
                <div>
                    <ul>   
                        <li> <h2><a href="#" >anual</a></h2>
                           <div>
                                <ul>
                                    <li onclick="tipo_2009()">tipo</li>
                                    <li onclick="tipo_gasto_2009()">tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        
                        </li>
                        <li>
                            <h2><a href="#">enero</a></h2>
                                <div>
                                <ul>
                                    <li onclick="">tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                        
                       <li>
                          
                            <h2><a href="#">febrero</a></h2>
                             <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                           </div>
                        </li>
                        <li>
                            <h2><a href="#">marzo</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                       <li>
                            <h2><a href="#">abril</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                        <li>
                            <h2><a href="#">marzo</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                              </div>
                        </li>
                        <li>
                            <h2><a href="#">junio</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                              </div>
                        </li>
                         <li>
                            <h2><a href="#">julio</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                        <li>
                            <h2><a href="#">agosto</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                             </div>
                        </li>
                        <li>
                            <h2><a href="#">septiembre</a></h2>
                                <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                    </div>
                        </li>
                       <li>
                            <h2><a href="#">octubre</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                        <li>
                            <h2><a href="#">noviembre</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                       <li>
                            <h2><a href="#">Diciembre</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                    </ul>
                </div>
                <h3><a href="#">Anio 2010</a></h3>
                <div>
                    <ul>   
                         <li> <h2><a href="#" onclick="tipo_2009()">anual</a></h2>
                           <div>
                                <ul>
                                    <li onclick="">tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        
                        </li>
                        <li>
                            <h2><a href="#">enero</a></h2>
                                <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                        
                       <li>
                          
                            <h2><a href="#">febrero</a></h2>
                             <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                           </div>
                        </li>
                        <li>
                            <h2><a href="#">marzo</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                       <li>
                            <h2><a href="#">abril</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                        <li>
                            <h2><a href="#">marzo</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                              </div>
                        </li>
                        <li>
                            <h2><a href="#">junio</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                              </div>
                        </li>
                         <li>
                            <h2><a href="#">julio</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                        <li>
                            <h2><a href="#">agosto</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                             </div>
                        </li>
                        <li>
                            <h2><a href="#">septiembre</a></h2>
                                <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                    </div>
                        </li>
                       <li>
                            <h2><a href="#">octubre</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                        <li>
                            <h2><a href="#">noviembre</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                       <li>
                            <h2><a href="#">Diciembre</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                    </ul>
                </div>
                  <h3><a href="#">Anio 2011</a></h3>
                <div>
                    <ul>   
                         <li> <h2><a href="#" >anual</a></h2>
                           <div>
                                <ul>
                                    <li onclick="">tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        
                        </li>
                        <li>
                            <h2><a href="#">enero</a></h2>
                                <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                        
                       <li>
                          
                            <h2><a href="#">febrero</a></h2>
                             <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                           </div>
                        </li>
                        <li>
                            <h2><a href="#">marzo</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                       <li>
                            <h2><a href="#">abril</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                        <li>
                            <h2><a href="#">marzo</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                              </div>
                        </li>
                        <li>
                            <h2><a href="#">junio</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                              </div>
                        </li>
                         <li>
                            <h2><a href="#">julio</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                        <li>
                            <h2><a href="#">agosto</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                             </div>
                        </li>
                        <li>
                            <h2><a href="#">septiembre</a></h2>
                                <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                    </div>
                        </li>
                       <li>
                            <h2><a href="#">octubre</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                        <li>
                            <h2><a href="#">noviembre</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                       <li>
                            <h2><a href="#">Diciembre</a></h2>
                            <div>
                                <ul>
                                    <li>tipo</li>
                                    <li>tipo_gasto</li>
                                    <li>establecimiento</li>
                                </ul>
                                </div>
                        </li>
                    </ul>
                </div>
                            
        </div>
           <div id="sidebar" style="position:relative">
              <a href="Control_de_gastos.jsp" >Regresar</a>
         </div>
        <div id="ahora" style="width: 40em; height:20em;position:absolute; margin-left:60em;"></div>
         </div>
            
        
</body>
</html>