<%-- 
    Document   : AgregarContratoRelacionDependencia
    Created on : 03-sep-2011, 4:32:19
    Author     : Darius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar contrato con relacion de dependencia</title>
         <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
        <style>
           
            #tabla{
                
                position: relative;
                top: 10em;
                left: 10em;
            }
            
            #formulario{
                 position: relative;
                top: 10em;
                left: 10em;
                
            }
            
        </style>
        
        <script>
            var numeroDetallesIngreso = 0 ;
            var numeroDetallesEgreso = 0 ;
            function agregarDetalleIngreso(){
                
                numeroDetallesIngreso = numeroDetallesIngreso +1 ;
                
                var table = document.createElement("table");
                table.setAttribute("border", "3");
                
                var text1 = document.createTextNode("Concepto Ingreso:");
                var text2 = document.createTextNode("Valor :");
                var text3 = document.createTextNode("Tipo :");
                
                
                var tr1 = document.createElement("tr");
                var td11 = document.createElement("td");
                var td111 = document.createElement("td");
                
                var tr2 = document.createElement("tr");
                var td22 = document.createElement("td");
                var td222 = document.createElement("td");
                
                var tr3 = document.createElement("tr");
                var td33 = document.createElement("td");
                var td333 = document.createElement("td");
                
                var formulario = document.getElementById("form");
                var input = document.createElement("input");
                input.setAttribute("type", "text");
                input.setAttribute("name", "conceptoIngreso"+numeroDetallesIngreso);
                
                var input2 = document.createElement("input");
                input2.setAttribute("type", "text");
                input2.setAttribute("name", "valorConceptoIngreso"+numeroDetallesIngreso);
                
                var input3 = document.createElement("input");
                input3.setAttribute("type", "text");
                input3.setAttribute("name", "tipoIngreso"+numeroDetallesIngreso);
                
                td11.appendChild(text1);
                td111.appendChild(input);
                tr1.appendChild(td11);
                tr1.appendChild(td111);
                
                td22.appendChild(text2);
                td222.appendChild(input2);
                tr2.appendChild(td22);
                tr2.appendChild(td222);
                
                td33.appendChild(text3);
                td333.appendChild(input3);
                tr3.appendChild(td33);
                tr3.appendChild(td333);
                
                table.appendChild(tr1);
                table.appendChild(tr3);
                table.appendChild(tr2);
                
                formulario.appendChild(table);
                
                formulario.appendChild(document.createElement("br"));
                
                
                
                var cont = document.getElementById("numeroDetallesIngreso");
                
                cont.setAttribute("value", numeroDetallesIngreso);
                
            }
            
            function agregarDetalleEgreso(){
                
                numeroDetallesEgreso = numeroDetallesEgreso +1 ;
                
                var table = document.createElement("table");
                table.setAttribute("border", "3");
                
                var text1 = document.createTextNode("Concepto Egreso:");
                var text2 = document.createTextNode("Valor :");
                var text3 = document.createTextNode("Tipo :");
                
                
                var tr1 = document.createElement("tr");
                var td11 = document.createElement("td");
                var td111 = document.createElement("td");
                
                var tr2 = document.createElement("tr");
                var td22 = document.createElement("td");
                var td222 = document.createElement("td");
                
                var tr3 = document.createElement("tr");
                var td33 = document.createElement("td");
                var td333 = document.createElement("td");
                
                var formulario = document.getElementById("form");
                var input = document.createElement("input");
                input.setAttribute("type", "text");
                input.setAttribute("name", "conceptoEgreso"+numeroDetallesEgreso);
                
                var input2 = document.createElement("input");
                input2.setAttribute("type", "text");
                input2.setAttribute("name", "valorConceptoegreso"+numeroDetallesEgreso);
                
                var input3 = document.createElement("input");
                input3.setAttribute("type", "text");
                input3.setAttribute("name", "tipoegreso"+numeroDetallesEgreso);
                
                td11.appendChild(text1);
                td111.appendChild(input);
                tr1.appendChild(td11);
                tr1.appendChild(td111);
                
                td22.appendChild(text2);
                td222.appendChild(input2);
                tr2.appendChild(td22);
                tr2.appendChild(td222);
                
                td33.appendChild(text3);
                td333.appendChild(input3);
                tr3.appendChild(td33);
                tr3.appendChild(td333);
                
                table.appendChild(tr1);
                table.appendChild(tr3);
                table.appendChild(tr2);
                
                formulario.appendChild(table);
                
                formulario.appendChild(document.createElement("br"));
                
                
                
                var cont = document.getElementById("numeroDetallesEgreso");
                
                cont.setAttribute("value", numeroDetallesEgreso);
                
            }
            
        </script>
    </head>
    <body>
        <div id="formulario">
            <form id="form"action="ContratoRelacionDependencia_SERVLET" method="get">
                <table border="3">
                    <tr><td>
                 Fecha : </td>
                 <td>Dia<input type="text" name="dia" />Mes<input type="text" name="mes" />Año<input type="text" name="anio" /></td>
                </tr>
                <tr><td>
                        Empresa:</td><td><input type="text" name="empresa"/></td>
              </tr>
                        <input type="hidden" name="opcion" value="guardar"/>
                        <tr><td>
                        <input type="submit" value="Guardar"/></td>
                        </tr>
                </table>
                <input type="hidden" value="0" name="numeroDetallesIngreso" id="numeroDetallesIngreso"/>
               <input type="hidden" value="0" name="numeroDetallesEgreso" id="numeroDetallesEgreso"/>
                
                
            </form>
             <button onclick="agregarDetalleIngreso();">Agregar detalle ingreso</button><button onclick="agregarDetalleEgreso();">Agregar detalle egreso</button>
            
            
        </div>
    </body>
</html>
