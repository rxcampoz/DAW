/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


YAHOO.util.Event.addListener(window, "load", function() {  
YAHOO.example.EnhanceFromMarkup = function() {  
var myColumnDefs = [  {key:"id",label:"id",formatter:YAHOO.widget.DataTable.formatNumber,sortable:true}, {key:"nombre",label:"nombre", sortable:true, abbr:"Nombre CSS"},{key:"descripcion",label:"descripcion", sortable:true, abbr:"descripcion del css"}, {key:"path",label:"path", sortable:true, abbr:"ruta de css"}, {key:"bEdit",label:"editar", sortable:true, abbr:"editar css"}, {key:"bDelete",label:"delete", sortable:true, abbr:"eliminar css"}];  
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
{key:"descripcion"},  
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
