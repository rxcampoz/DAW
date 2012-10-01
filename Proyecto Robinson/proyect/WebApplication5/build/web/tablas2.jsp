<%-- 
    Document   : index
    Created on : 14/02/2011, 01:38:36 PM
    Author     : Alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="modelo" class="DB.Modelo" scope="page" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">


    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>JSP Page</title>


        <link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.8.2r1/build/fonts/fonts-min.css" />
        <link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.8.2r1/build/datatable/assets/skins/sam/datatable.css" />
        <link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.8.2r1/build/paginator/assets/skins/sam/paginator.css" />
        <link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.8.2r1/build/button/assets/skins/sam/button.css" />
        <script type="text/javascript" src="http://yui.yahooapis.com/2.8.2r1/build/yahoo-dom-event/yahoo-dom-event.js"></script>
        <script type="text/javascript" src="http://yui.yahooapis.com/2.8.2r1/build/element/element-min.js"></script>
        <script type="text/javascript" src="http://yui.yahooapis.com/2.8.2r1/build/button/button-min.js"></script>
        <script type="text/javascript" src="http://yui.yahooapis.com/2.8.2r1/build/dragdrop/dragdrop-min.js"></script>
        <script type="text/javascript" src="http://yui.yahooapis.com/2.8.2r1/build/datasource/datasource-min.js"></script>
        <script type="text/javascript" src="http://yui.yahooapis.com/2.8.2r1/build/datatable/datatable-min.js"></script>
        <script type="text/javascript" src="http://yui.yahooapis.com/2.8.2r1/build/paginator/paginator-min.js"></script>

        <style type="textext/css">
            .yui-skin-sam .yui-dt-body { cursor:pointer; } /* when rows are selectable */
            #single { margin-top:2em; }
            #cellrange, #singlecell { margin-top:2em; }
            #paginated {
            text-align: center;
            }
            #paginated table {
            margin-left:auto; margin-right:auto;
            }
            #paginated, #paginated .yui-dt-loading {
            text-align: center; background-color: transparent;
            }
        </style>

        <script type="text/javascript">
          <%--  <jsp:useBean id="helper" class="base.Helper" scope="page" />--%>
        </script>

        <script type="text/javascript">
        YAHOO.util.Event.addListener(window, "load", function() {
        YAHOO.example.cEnhanceFromMarkup = new function() {
            var myColumnDefs = [
                {key:"modi",label:""},
                {key:"tipo",label:"Tipo", sortable:true},
                {key:"anio",label:"Año",formatter:"number",sortable:true},
                {key:"mes",label:"Mes",formatter:"number",sortable:true},
                {key:"cliente",label:"Cliente", resizeable:true, sortable:false},
                {key:"total",label:"Total",formatter:"number",sortable:true},
                {key:"eli",label:""}

            ];

            this.myDataSource = new YAHOO.util.DataSource(YAHOO.util.Dom.get("accounts"));  //accounts -> nombre de la tabla
            this.myDataSource.responseType = YAHOO.util.DataSource.TYPE_HTMLTABLE;
            this.myDataSource.responseSchema = {
                fields: [
                    {key:"modi"},
                    {key:"tipo"},
                        {key:"anio", parser:"number"},
                        {key:"mes", parser:"number"},
                        {key:"cliente"},
                        {key:"total", parser:"number"},
                        {key:"eli"},
                        
               ]
            };

            var myConfigs = {
              paginator : new YAHOO.widget.Paginator({
                 rowsPerPage: 5
                })
            };


            var myDataTable = new YAHOO.widget.DataTable("container", myColumnDefs, this.myDataSource,  myConfigs,
                    {caption:"Noticias", sortedBy:{key:"id",dir:"asc"}});

            myDataTable.subscribe("rowMouseoverEvent", myDataTable.onEventHighlightRow);
            myDataTable.subscribe("rowMouseoutEvent", myDataTable.onEventUnhighlightRow);
            myDataTable.subscribe("rowClickEvent", myDataTable.onEventSelectRow);
            myDataTable.selectRow(myDataTable.getTrEl(0));
            myDataTable.focus();


            // Add/update/delete rows as indicated
            var handleClick = function() {
                    var selected = myDataTable.getSelectedRows();
                    var rset = myDataTable.getRecordSet();
                    for (var x = 0; x < selected.length; x++) {
                    myDataTable.deleteRow(rset.getRecordIndex(rset.getRecord(selected[x])));
                    }
                return;
            }

            var btn = new YAHOO.widget.Button("go");
            btn.on("click", handleClick);

                return {
                oDS: this.myDataSource,
                oDT: this.myDataTable
            };
            }();
        });

        </script>

</head>

<body class="yui-skin-sam">

        

    <div id="container">
        <table id="accounts">
            <thead>
            <tr>
                <td></td>
                <td>Tipo</td>
                <td>Año</td>
                <td>Mes</td>
                <td>Cliente</td>
                <td>Total</td>
                <td></td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${modelo.factura}" var="row">
                <tr>
                   <td>
                   <a href="Administrador_de_egresos_SERVLET?opcion=modificar">Modificar</a>
                    </td>
                    <td>${row.tipoBienOservicio}</td>
                    <td>${row.anio}</td>
                    <td>${row.mes}</td>
                    <td>${row.proveedor}</td>
                     <td>${row.total}</td>
                    <td>
                          <a href="Administrador_de_egresos_SERVLET?opcion=eliminar&id=${row.numeroFactura}">Eliminar</a>
                    </td>

                </tr>
            </c:forEach>
            </tbody>
           </table>
        </div>

    </body>
</html>
