            function validarnumero(e) {
                tecla = (document.all) ? e.keyCode : e.which;
                if (tecla==8) return true;
                patron =/[0-9]/;
                te = String.fromCharCode(tecla);
                return patron.test(te);
            }

           function validarletra(e){
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
                if(document.form.apellidos.value == ""){
                    informacion += "\n     -  Apellidos";
                }

                if(document.form.telefono.value == ""){
                    informacion += "\n     -  Telefono";
                }
                if ((document.form.cedula.value == "")){
                    informacion += "\n     -  Cedula";
                }
                if((document.form.direccion.value == "")){
                    informacion += "\n     -  Direccion";
                }
                if((document.form.user.value == "")){
                    informacion += "\n     -  User";
                }
                if((document.form.password.value == "")){
                    informacion += "\n     -  Password";
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


