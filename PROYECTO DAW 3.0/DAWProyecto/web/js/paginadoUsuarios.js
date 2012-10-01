/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

YAHOO.util.Event.addListener(window, "load", function() {  
YAHOO.example.EnhanceFromMarkup = function() {  
var myColumnDefs = [  {key:"id",label:"id",formatter:YAHOO.widget.DataTable.formatNumber,sortable:true}, {key:"nombre",label:"nombre", sortable:true, abbr:"Nombre de Usuario"},{key:"apellido",label:"apellido", sortable:true, abbr:"apellido de usuario"},{key:"nick",label:"nick", sortable:true, abbr:"nick del usuario"}, {key:"clave",label:"clave", sortable:true, abbr:"clave del Usuario"}, {key:"bEdit",label:"editar", sortable:true, abbr:"editar usuario"}, {key:"bDelete",label:"delete", sortable:true, abbr:"eliminar usuario"}];  
var parseNumberFromCurrency = function(sString) {  
// Remove dollar sign and make it a float  
return parseFloat(sString);  
};  
var myDataSource = new  
YAHOO.util.DataSource(YAHOO.util.Dom.get("accounts"));  
myDataSource.responseType = YAHOO.util.DataSource.TYPE_HTMLTABLE;  
myDataSource.responseSchema = {  
fields: [{key:"id", parser:"number"},  
{key:"nombre"},  
{key:"apellido"},  
{key:"nick"}, // point to a custom  parser  
{key:"clave"},
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
