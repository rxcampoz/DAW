/*
*	Archivo validador.js
*	Descripcion: Este acrhivo tiene las funciones para validar los campos
*				del formulario de la pagina WEB de Cholo Machine
*/

function valNumero(e) {
	tecla = (document.all) ? e.keyCode : e.which;
	if (tecla==8) return true;
	patron =/[0-9]/;
	te = String.fromCharCode(tecla);
	return patron.test(te);

}

function valLetra(e) {
	tecla = (document.all) ? e.keyCode : e.which;
	if (tecla==8) return true;
	patron =/[A-Za-z\s]/;
	te = String.fromCharCode(tecla);
	return patron.test(te);
}

function valEmail(valor){
	tecla = (document.all) ? e.keyCode : e.which;
	if (tecla==8) return true;
    re=/^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*[.]([a-z]{2,3})$/
    if(!re.exec(valor))    {
        return false;
    }else{
        return true;
    }
}
function validarFormulario() {
	informacion = "";
	
	if (document.formulario.na.value == "") {
		informacion += "\n-  Nombres y Apellido";
	}
	if ((document.formulario.co.value == "")) {
		informacion += "\n-  Correo Incorrecto";
	}
	if(document.formulario.te.value == ""){
		informacion += "\n-  Teléfono";
	}
	if(document.formulario.msj.value == ""){
		informacion += "\n-  Escriba su comentario";
	}
	if(informacion != ""){
		informacion ="******************************\n" +
		"Falta por llenar o son incorrectos los siguientes campos:\n" +
		informacion + "\n******************************" +
		"\nFavor pulse enter, llene los campos e intentelo nuevamente";
		alert(informacion);
		return false;
	}
	else return true;
}