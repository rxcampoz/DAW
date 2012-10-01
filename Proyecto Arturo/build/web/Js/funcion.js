window.onload=function()
{

}

function Mostrar(id,id2){
    var divInfo = document.getElementById(id);
    var btn = document.getElementById(id2).name;

    if(btn=="Festividades..."){
        divInfo.style.display="block";
		document.getElementById(id2).value="Ocultar";
        document.getElementById(id2).name="Ocultar";
    }
    else{
        divInfo.style.display="none";
        document.getElementById(id2).value="Festividades...";
        document.getElementById(id2).name="Festividades...";
}
}

function registro(){
	var a=document.getElementById("nombre").value
	var b=document.getElementById("apellido").value
	var e=document.getElementById("telefono").value
	var f=document.getElementById("mail").value

	if(vacio(a)==true && vacio(b)==true && vacio(e)==true && isEmail(f) && isValidPhoneNumber(e)==true ){
		alert("OK");
	}
	else{
		if(vacio(a)==false){
			alert("Introduzca el NOMBRE");
		}
		if(vacio(b)==false){
			alert("Introduzca el APELLIDO");
		}
		if(vacio(e)==false){
			alert("Introduzca el TELEFONO");
		}
		if(vacio(f)==false){
			alert("Introduzca el MAIL");
		}
		if(!isEmail(f)){
			alert("El MAIL es INCORRECTO");
		}
		if(!isValidPhoneNumber(b)){
			alert ("INCORRECTO.......Ingrese el Telefono");
		}

	}

}

function isValidPhoneNumber(n) {
	for ( i = 0; i < n.length; i++ ) {
		var a= n.charAt(i);
          if (!isNumero(a)) {
                 return false;
          }
      }
         return true;

}

function isNumero(n){
	if(n=="1" || n=="2" ||n=="3" ||n=="4" ||n=="5" ||n=="6" ||n=="7" ||n=="8" ||n=="9" ||n=="0")
		return true;
	else
		return false;
}




function isEmail(email){

var filter=/^[A-Za-z][A-Za-z0-9_]*@[A-Za-z0-9_]+.[A-Za-z0-9_.]+[A-za-z]$/;
if (email.length == 0 ) return false;
   if (filter.test(email))
      return true;
   else
   return false;

}

function vacio(q) {
         for ( i = 0; i < q.length; i++ ) {
             if ( q.charAt(i) != " " ) {
                return true;
                 }
         }
         return false;
 }


function cambiarcolor(valor){
    var des=document.getElementById("dataContent");

    if(valor=="celeste")
    	des.style.backgroundColor="#61B7CF";
    if(valor=="blanco")
    	des.style.backgroundColor="white";
    if(valor=="amarillo")
    	des.style.backgroundColor="yellow";
    if(valor=="rojo")
    	des.style.backgroundColor="#FF9473";
}

function cambiarletra(valor){
    var des=document.getElementById("dataContent");

    if(valor=="Arial")
    	des.style.fontFamily="Arial";
    if(valor=="Verdana")
    	des.style.fontFamily="Verdana";
    if(valor=="Georgia")
    	des.style.fontFamily="Georgia";
    if(valor=="Algerian")
    	des.style.fontFamily="Algerian";

}
function ver_imagen()
{
	n=0;
	this[n++]="images/galeria/recintos/playas.png";
	this[n++]="images/galeria/recintos/playas2.png";
	this[n++]="images/galeria/recintos/data.png";
	this[n++]="images/galeria/recintos/arenal.png";
	this[n++]="images/galeria/recintos/svicente.png";
	this[n++]="images/galeria/recintos/morro.png";
	this[n++]="images/galeria/recintos/ptomorro.png";
	this.N=n;
}
function aleatorio(){
	var imagen=new ver_imagen();
	src= imagen[ Math.floor(Math.random() * imagen.N) ] ;
	document.write("<img src="+src+">");
}