       
             function validarletra(e) {
                tecla = (document.all) ? e.keyCode : e.which;
                if (tecla==8) return true;
                patron =/[A-Za-z\s]/;
                te = String.fromCharCode(tecla);
                return patron.test(te);
             }
            function chequearTextos() {
                informacion = "";
                if (document.form.nombres.value == "") {
                   informacion += "\n     -  Nombres";
                }
                
                if(informacion != ""){
                    informacion ="_____________________________\n" +
                    "Te ha faltado introducir los siguientes datos:\n" +
                    informacion + "\n_____________________________" +
                    "\nPor favor pulsa enter, rellena los datos y prueba de nuevo";
                    alert(informacion);
                    return false;
                }
                else return true;
      }


