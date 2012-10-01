
           function validarnumero(e) {
                tecla = (document.all) ? e.keyCode : e.which;
                if (tecla==8) return true;
                patron =/[0-9]/;
                te = String.fromCharCode(tecla);
                return patron.test(te);
            }

           function validarletra(e) {
                tecla = (document.all) ? e.keyCode : e.which;
                if (tecla==8) return true;
                patron =/[A-Za-z\s]/;
                te = String.fromCharCode(tecla);
                return patron.test(te);
            }
            function chequearTextos() {
                informacion = "";
                if (document.form.titulo.value == "") {
                   informacion += "\n     -  Titulo";
                }
                if(document.form.noticorta.value == ""){
                    informacion += "\n     -  Noticia Corta";
                }

                if(document.form.noticompleta.value == ""){
                    informacion += "\n     -  Noticia Completa";
                }
                if ((document.form.provincia.value == "")){
                    informacion += "\n     -  Provincia";
                }
                if((document.form.canton.value == "")){
                    informacion += "\n     -  Canton";
                }
                if ((document.form.latitud.value == "")){
                    informacion += "\n     -  Latitud";
                }

                if ((document.form.longitud.value == "")){
                    informacion += "\n     -  Longitud";
                }


                if ((document.form.fecha.value == "")){
                    informacion += "\n     -  Fecha";
                }

                if ((document.form.direccion.value == "")){
                    informacion += "\n     -  Direccion";
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

