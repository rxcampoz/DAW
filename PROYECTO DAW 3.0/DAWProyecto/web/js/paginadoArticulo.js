/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

YAHOO.util.Event.addListener(window, "load", function() {  
YAHOO.example.EnhanceFromMarkup = function() {  
var myColumnDefs = [  {key:"id",label:"id",formatter:YAHOO.widget.DataTable.formatNumber,sortable:true}, {key:"titulo",label:"titulo", sortable:true, abbr:"titulo del articulo"},{key:"contenido",label:"contenido", sortable:true, abbr:"contenido del articulo"},{key:"tipo",label:"tipo", sortable:true, abbr:"tipo del articulo"}, {key:"bEdit",label:"editar", sortable:true, abbr:"editar articulo"}, {key:"bDelete",label:"delete", sortable:true, abbr:"eliminar articulo"}];  
var parseNumberFromCurrency = function(sString) {  
// Remove dollar sign and make it a float  
return parseFloat(sString);  
};  
var myDataSource = new  
YAHOO.util.DataSource(YAHOO.util.Dom.get("accounts"));  
myDataSource.responseType = YAHOO.util.DataSource.TYPE_HTMLTABLE;  
myDataSource.responseSchema = {  
fields: [{key:"id", parser:"number"},  
{key:"titulo"},  
{key:"contenido"},
{key:"tipo"},
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
