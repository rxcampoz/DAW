/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

YAHOO.util.Event.addListener(window, "load", function() {  
YAHOO.example.EnhanceFromMarkup = function() {  
var myColumnDefs = [  {key:"id",label:"id",formatter:YAHOO.widget.DataTable.formatNumber,sortable:true}, {key:"marca",label:"marca", sortable:true, abbr:"Marca de zapato"},{key:"modelo",label:"modelo", sortable:true, abbr:"modelo de zapato"},{key:"categoria",label:"categoria", sortable:true, abbr:"Tipo cliente"}, {key:"tipo",label:"tipo", sortable:true, abbr:"tipo de zapato"}, {key:"precio",label:"Precio del zapato",formatter:YAHOO.widget.DataTable.formatCurrency,sortable:true}, {key:"path",label:"path", sortable:true, abbr:"ruta de imagen"}, {key:"bEdit",label:"editar", sortable:true, abbr:"editar imagen"}, {key:"bDelete",label:"delete", sortable:true, abbr:"eliminar imagen"}];  
var parseNumberFromCurrency = function(sString) {  
// Remove dollar sign and make it a float  
return parseFloat(sString);  
};  
var myDataSource = new  
YAHOO.util.DataSource(YAHOO.util.Dom.get("accounts"));  
myDataSource.responseType = YAHOO.util.DataSource.TYPE_HTMLTABLE;  
myDataSource.responseSchema = {  
fields: [{key:"id", parser:"number"},  
{key:"marca"},  
{key:"modelo"},  
{key:"categoria"}, // point to a custom  parser  
{key:"tipo"},
{key:"precio", parser:parseNumberFromCurrency},
{key:"path"},
{key:"bEdit"},
{key:"bDelete"},
]  
};  
var tblConfig = {  
paginator : new YAHOO.widget.Paginator({ rowsPerPage : 4 }),  
initialRequest : '',  
selectionMode : 'single'  
};  
var myDataTable = new YAHOO.widget.DataTable("markup", myColumnDefs,myDataSource,tblConfig);  
return {  
oDS: myDataSource,  
oDT: myDataTable  
};  
}();  
});
