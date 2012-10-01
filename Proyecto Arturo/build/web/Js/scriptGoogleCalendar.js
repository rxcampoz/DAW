
google.load('gdata', '2', {packages:['calendar']});
function irAGoogleCalendar(){
    google.setOnLoadCallback(goToGoogleCalendar);
    goToGoogleCalendar();
}
function initRequestGC(){
    var xhr=createXMLHttpRequest();
    var parrafoTareaId= document.getElementById("tareaId");
    var strTareaId = parrafoTareaId.firstChild.nodeValue;
    var strNombreServlet="consultar2";
    var strAccion="googleCalendar";

    xhr.open("GET",strNombreServlet+"?accion="+strAccion+"&TareaId="+strTareaId,true);
    xhr.onreadystatechange= function(){
        llenarVariables(xhr);
    }
    xhr.send(null);
}
function llenarVariables(xhr){
    if(xhr.readyState==4){
        if(xhr.status==200){
            //Cojo los datos escritos en xml desde el controlador
            var resp=xhr.responseXML;

            //var idtareas = resp.getElementsByTagName("idtarea");
            var nombres = resp.getElementsByTagName("nombre");
            var horasEstimadass = resp.getElementsByTagName("horasEstimadas");
            var fasignadas = resp.getElementsByTagName("fasignada");

            var tituloNo=nombres[0].firstChild.nodeValue;
            var horasEstimadasNo=horasEstimadass[0].firstChild.nodeValue;
            var fechaAsigNo=fasignadas[0].firstChild.nodeValue;

            google.setOnLoadCallback(goToGoogleCalendar);
            goToGoogleCalendar(fechaAsigNo, horasEstimadasNo, tituloNo);

         }else
            alert("Ha ocurrido un error al llenarVariables. "+ xhr.statusText);
    }
}
function goToGoogleCalendar(strFechaAsig, strHorasEstimadas, strTitulo){
    //strFechaAsig llega: 2010-12-27 08:15:00.0
    //convertir a 2012-02-10T08:15:00.000-08:00
    //definitiva: 2010-12-27T08:15:00.000-08:00
    //fecha fin definitiva: 2010-12-27T09:15:00.000-08:00

    var horasYMins=strFechaAsig.substring(11, 16);

    //Convierto la fecha asignada al formato que utiliza GoogleCalendar.
    var fechaAsigDefinitiva=strFechaAsig.substring(0, 10)+"T"+horasYMins+":00.000-08:00";

    //Saco la hora de la fecha asignada (inicio)
    var horasIniciales=(horasYMins.substring(0,2))*1;
    //Que strHorasEstimadas sea numero
    strHorasEstimadas=strHorasEstimadas*1;
    //Calculo la hora estimada de fin de la tarea.
    var horasFinales=horasIniciales+strHorasEstimadas;
    if(horasFinales<10)
        horasFinales="0"+horasFinales;
    //Seteo la fecha de fin estimado de la tarea al formato que utiliza GoogleCalendar.
    var fechaAsigFinDefinitiva=(fechaAsigDefinitiva.substring(0, 10))+"T"+horasFinales+(fechaAsigDefinitiva.substring(13, 32));


    var scope='http://www.google.com/calendar/feeds/';
    if(!google.accounts.user.checkLogin(scope)){
        updateMsjEnviadoACalendar(google.accounts.user.login());
        //alert(google.accounts.user.login());
        google.accounts.user.login();
        updateMsjEnviadoACalendar("No autenticado");
    }else{
        updateMsjEnviadoACalendar("Autenticado");

    //Create a single event
    //Create the calendar service object
    var calendarService = new google.gdata.calendar.CalendarService('GoogleInc-jsguide-1.0');

    //The default "private/full" feed is used to insert event to the primary calendar of the authenticated user
    var feedUri = 'http://www.google.com/calendar/feeds/apadillavilema@gmail.com/private/full';

    // Create an instance of CalendarEventEntry representing the new event
    var entry = new google.gdata.calendar.CalendarEventEntry();

    // Crear y setear el titulo del evento.
    var gTitulo =google.gdata.atom.Text.create(strTitulo);
    entry.setTitle(gTitulo);

    //Creo el objeto When que esta vinculado al evento.
    var when = new google.gdata.When();
    
    //Seteo las fechas de inicio y fin del When object.
    var startTime = google.gdata.DateTime.fromIso8601(fechaAsigDefinitiva);
    var endTime = google.gdata.DateTime.fromIso8601(fechaAsigFinDefinitiva);
    when.setStartTime(startTime);
    when.setEndTime(endTime);
    
    //Agrego el objeto When al evento.
    entry.addTime(when);

    //Lo que ejecuto si se ingreso correctamente el evento (insertEntry())
    var callback = function(result) {
        updateMsjEnviadoACalendar("El evento ha sido creado.");
    }

    //Lo que ejecuto si hay algun error desde insertEntry()
    var handleError = function(error) {
        updateMsjEnviadoACalendar("Ha ocurrido un error.");
    }

    // Submit the request using the calendar service object
    calendarService.insertEntry(feedUri, entry, callback,handleError, google.gdata.calendar.CalendarEventEntry);
}
}
function logMeOut() {
    google.accounts.user.logout();
}
function updateMsjEnviadoACalendar(strMensaje){
    //alert(strMensaje);
    var divMensajeRespuesta= document.getElementById("DivMensajeRespuesta");
    borrarHijos(divMensajeRespuesta);
    setMsjRespuesta(divMensajeRespuesta, "", strMensaje, strMensaje);
}
