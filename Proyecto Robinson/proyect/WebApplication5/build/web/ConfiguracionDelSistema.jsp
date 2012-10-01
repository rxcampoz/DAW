<%-- 
    Document   : ConfiguracionDelSistema
    Created on : 04-sep-2011, 13:35:55
    Author     : Robinson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Configuraciones del Sistema</title>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        
        <div id="">
            <form action="Configuracion_del_Sistema_SERVLET" method="get">
                Porcetaje definido para el IVA <input type="text" name="PorcentajeDefinidoDelIvaValor" value="${requestScope.porcentaje}" />%</br></br>
                <input type="hidden" name="PorcentajeDefinidoDelIvafechaIngreso" value="${requestScope.fechaIngreso}"/>
                <h1> Porcentaje de Pagos De Multas e Intereses:</h1></br></br>
                <h2> Intereses :</h2>
                
                <table width="400" border="1">
                    <tr>
                        <td>TRIMESTRE</td>
                        <td>AÑO 2011</td>
                    </tr>
                    <tr>
                        <td>Enero-Marzo</td>
                        <td><input type="text" name="Trimestre1" value="${requestScope.valorPorcentaje1}" /></td>
                    </tr>
                    <tr>
                        <td>Abril-Junio</td>
                        <td><input type="text" name="Trimestre2" value="${requestScope.valorPorcentaje2}" /></td>
                    </tr>
                    <tr>
                        <td>Julio-Septiembre</td>
                        <td><input type="text" name="Trimestre3" value="${requestScope.valorPorcentaje3}" /></td>
                    </tr>
                    <tr>
                        <td>Octubre-Diciembre</td>
                        <td><input type="text" name="Trimestre4" value="${requestScope.valorPorcentaje4}" /></td>
                    </tr>
                </table></br></br>
                
                
                <h2>Multas</h2>
                
                 <table width="400" border="1">
                    <tr>
                        <td>Infracciones</td>
                        <td>Impuesto a la  renta anual</td>
                        <td>IMPUESTO AL VALOR AGREGADO (mensual)</td>
                        <td>IMPUESTO AL VALOR AGREGADO (semestral)</td>
                    </tr>
                    <tr>
                        <td>Si causa impuesto</td>
                        <td><input type="text" name="Si_causa_impuesto_ir" value="${requestScope.valorImpuestoALaRenta}"/></td>
                        <td><input type="text" name="Si_causa_impuesto_ivaMensual" value="${requestScope.valorMensual}"/></td>
                        <td><input type="text" name="Si_causa_impuesto_ivaSemestral" value="${requestScope.valorSemestral}"/></td>
                    </tr>
                    <tr>
                        <td>No causa impuesto</td>
                        <td><input type="text" name="No_causa_impuesto_ir" value="${requestScope.valorNoCausaImpuestoImpuestoALaRenta}"/></td>
                        <td><input type="text" name="No_causa_impuesto_ivaMensual" value="${requestScope.NoCausaImpuestoImpuestoAlValorAgregadoMensual}"/></td>
                        <td><input type="text" name="No_causa_impuesto_ivaSemestral" value="${requestScope.NoCausaImpuestoImpuestoAlValorAgregadoSemestral}"/></td>
                    </tr>
                    
                </table></br></br>
                
                <h1>PLAZOS DE DECLARACIÓN DE IMPUESTOS</h1>
                    
                 <table width="400" border="1">
                     <tr>
                         <td>Noveno Digito del Ruc</td>
                         <td>IMPUESTO A LA RENTA</br>Personas naturales</td>
                         <td>IVA</br>Mensual</td>
                         <td>IVA</br>1er.Semestre</td>
                         <td>IVA</br>2do.Semestre</td>
                     </tr>
                     <tr>
                         <td>1</td>
                         <td><input type="text" name="Digito1IpuestoALaRentaPersonasNaturales" value="${requestScope.valorNovenoDigitoDigito1IpuestoALaRentaPersonasNaturales}"/></td>
                         <td><input type="text" name="Digito1IvaMensual" value="${requestScope.valorNovenoDigitoDigito1IvaMensual}"/>del mes siguiente</td>
                         <td><input type="text" name="Digito1IvaSemestre1" value="${requestScope.valorNovenoDigitoDigito1IvaSemestral1}"/></td>
                         <td><input type="text" name="Digito1IvaSemestre2" value="${requestScope.valorNovenoDigitoDigito1IvaSemestral2}"/></td>
                     </tr>
                     <tr>
                         <td>2</td>
                         <td><input type="text" name="Digito2IpuestoALaRentaPersonasNaturales" value="${requestScope.valorNovenoDigitoDigito2IpuestoALaRentaPersonasNaturales}"/></td>
                         <td><input type="text" name="Digito2IvaMensual" value="${requestScope.valorNovenoDigitoDigito2IvaMensual}"/>del mes siguiente</td>
                         <td><input type="text" name="Digito2IvaSemestre1" value="${requestScope.valorNovenoDigitoDigito2IvaSemestral1}"/></td>
                         <td><input type="text" name="Digito2IvaSemestre2" value="${requestScope.valorNovenoDigitoDigito2IvaSemestral2}"/></td>
                     </tr>
                     <tr>
                         <td>3</td>
                         <td><input type="text" name="Digito3IpuestoALaRentaPersonasNaturales" value="${requestScope.valorNovenoDigitoDigito3IpuestoALaRentaPersonasNaturales}"/></td>
                         <td><input type="text" name="Digito3IvaMensual" value="${requestScope.valorNovenoDigitoDigito3IvaMensual}"/>del mes siguiente</td>
                         <td><input type="text" name="Digito3IvaSemestre1" value="${requestScope.valorNovenoDigitoDigito3IvaSemestral1}"/></td>
                         <td><input type="text" name="Digito3IvaSemestre2" value="${requestScope.valorNovenoDigitoDigito3IvaSemestral2}"/></td>
                     </tr>
                     <tr>
                         <td>4</td>
                         <td><input type="text" name="Digito4IpuestoALaRentaPersonasNaturales" value="${requestScope.valorNovenoDigitoDigito4IpuestoALaRentaPersonasNaturales}"/></td>
                         <td><input type="text" name="Digito4IvaMensual" value="${requestScope.valorNovenoDigitoDigito4IvaMensual}"/>del mes siguiente</td>
                         <td><input type="text" name="Digito4IvaSemestre1" value="${requestScope.valorNovenoDigitoDigito4IvaSemestral1}"/></td>
                         <td><input type="text" name="Digito4IvaSemestre2" value="${requestScope.valorNovenoDigitoDigito4IvaSemestral2}"/></td>
                     </tr>
                     <tr>
                         <td>5</td>
                         <td><input type="text" name="Digito5IpuestoALaRentaPersonasNaturales" value="${requestScope.valorNovenoDigitoDigito5IpuestoALaRentaPersonasNaturales}"/></td>
                         <td><input type="text" name="Digito5IvaMensual" value="${requestScope.valorNovenoDigitoDigito5IvaMensual}"/>del mes siguiente</td>
                         <td><input type="text" name="Digito5IvaSemestre1" value="${requestScope.valorNovenoDigitoDigito5IvaSemestral1}"/></td>
                         <td><input type="text" name="Digito5IvaSemestre2" value="${requestScope.valorNovenoDigitoDigito5IvaSemestral2}"/></td>
                     </tr>
                     <tr>
                         <td>6</td>
                         <td><input type="text" name="Digito6IpuestoALaRentaPersonasNaturales" value="${requestScope.valorNovenoDigitoDigito6IpuestoALaRentaPersonasNaturales}"/></td>
                         <td><input type="text" name="Digito6IvaMensual" value="${requestScope.valorNovenoDigitoDigito6IvaMensual}"/>del mes siguiente</td>
                         <td><input type="text" name="Digito6IvaSemestre1" value="${requestScope.valorNovenoDigitoDigito6IvaSemestral1}"/></td>
                         <td><input type="text" name="Digito6IvaSemestre2" value="${requestScope.valorNovenoDigitoDigito6IvaSemestral2}"/></td>
                     </tr>
                     <tr>
                         <td>7</td>
                         <td><input type="text" name="Digito7IpuestoALaRentaPersonasNaturales" value="${requestScope.valorNovenoDigitoDigito7IpuestoALaRentaPersonasNaturales}"/></td>
                         <td><input type="text" name="Digito7IvaMensual" value="${requestScope.valorNovenoDigitoDigito7IvaMensual}"/>del mes siguiente</td>
                         <td><input type="text" name="Digito7IvaSemestre1" value="${requestScope.valorNovenoDigitoDigito7IvaSemestral1}"/></td>
                         <td><input type="text" name="Digito7IvaSemestre2" value="${requestScope.valorNovenoDigitoDigito7IvaSemestral2}"/></td>
                     </tr>
                     <tr>
                         <td>8</td>
                         <td><input type="text" name="Digito8IpuestoALaRentaPersonasNaturales" value="${requestScope.valorNovenoDigitoDigito8IpuestoALaRentaPersonasNaturales}"/></td>
                         <td><input type="text" name="Digito8IvaMensual" value="${requestScope.valorNovenoDigitoDigito8IvaMensual}"/>del mes siguiente</td>
                         <td><input type="text" name="Digito8IvaSemestre1" value="${requestScope.valorNovenoDigitoDigito8IvaSemestral1}"/></td>
                         <td><input type="text" name="Digito8IvaSemestre2" value="${requestScope.valorNovenoDigitoDigito8IvaSemestral2}"/></td>
                     </tr>
                     <tr>
                         <td>9</td>
                         <td><input type="text" name="Digito9IpuestoALaRentaPersonasNaturales" value="${requestScope.valorNovenoDigitoDigito9IpuestoALaRentaPersonasNaturales}"/></td>
                         <td><input type="text" name="Digito9IvaMensual" value="${requestScope.valorNovenoDigitoDigito9IvaMensual}"/>del mes siguiente</td>
                         <td><input type="text" name="Digito9IvaSemestre1" value="${requestScope.valorNovenoDigitoDigito9IvaSemestral1}"/></td>
                         <td><input type="text" name="Digito9IvaSemestre2" value="${requestScope.valorNovenoDigitoDigito9IvaSemestral2}"/></td>
                     </tr>
                     <tr>
                         <td>0</td>
                         <td><input type="text" name="Digito0IpuestoALaRentaPersonasNaturales" value="${requestScope.valorNovenoDigitoDigito0IpuestoALaRentaPersonasNaturales}"/></td>
                         <td><input type="text" name="Digito0IvaMensual" value="${requestScope.valorNovenoDigitoDigito0IvaMensual}"/>del mes siguiente</td>
                         <td><input type="text" name="Digito0IvaSemestre1" value="${requestScope.valorNovenoDigitoDigito0IvaSemestral1}"/></td>
                         <td><input type="text" name="Digito0IvaSemestre2" value="${requestScope.valorNovenoDigitoDigito0IvaSemestral2}"/></td>
                     </tr>
                 </table></br></br>
                 
                 <h1>Porcentajes sobre la base para el pago del impuesto a la renta definido para el año</h1></br>
                 <input type="text" name="valuePorcentageSobreLaBaseParaElPagoDelImpuestoALaRenta" value="${requestScope.valuePorcentageSobreLaBaseParaElPagoDelImpuestoALaRenta}"/></br></br></br>
                 <h1>Porcentaje del IR retenido por default</h1>
                 <input type="text" name="valuePorcentajeDelIrRetenidoPorDefauld" value="${requestScope.valuePorcentajeDelIrRetenidoPorDefauld}"/></br></br>
                 
                 <input type="hidden" name="opcion" value="guardar"/>
                 <input type="submit" value="Guardar" />
                
            
            </form>
        </div>
        
    </body>
</html>
