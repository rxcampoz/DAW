YAHOO.util.Event.addListener(window, "load", function() {
YAHOO.example.EnhanceFromMarkup = function() {
var myColumnDefs = [
///{key:"due",label:"Id Tarea",formatter:YAHOO.widget.DataTable.formatDate,sortable:true},
{key:"idempleado",label:"Codigo",formatter:YAHOO.widget.DataTable.formatNumber,sortable:true},
{key:"nombres",label:"Nombres", sortable:true},
{key:"apellidos",label:"Apellidos",sortable:true},
{key:"cedula",label:"Cedula",sortable:true},
{key:"rol",label:"Rol",sortable:true},
{key:"user",label:"User",sortable:true},
{key:"telefono",label:"Telefono",sortable:true},
{key:"direccion",label:"Direccion",sortable:true},
{key:"estado",label:"Estado",sortable:true}
];

var myDataSource = new
YAHOO.util.DataSource(YAHOO.util.Dom.get("tab"));
myDataSource.responseType = YAHOO.util.DataSource.TYPE_HTMLTABLE;
myDataSource.responseSchema = {
//fields: [{key:"due", parser:"date"},
fields: [{key:"idempleado", parser:"number"},
 // point to a custom parser
{key:"nombres"},
{key:"apellidos"},
{key:"cedula"},
{key:"rol"},
{key:"user"},
{key:"telefono"},
{key:"direccion"},
{key:"estado"} ]};

var tblConfig = {
paginator : new YAHOO.widget.Paginator({ rowsPerPage : 10 }),
initialRequest : '',
selectionMode : 'single'
};
var myDataTable = new YAHOO.widget.DataTable("content", myColumnDefs,
myDataSource,tblConfig);
return {
oDS: myDataSource,
oDT: myDataTable};
}();
});/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


