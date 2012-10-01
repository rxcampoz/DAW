/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function hagaseSlide(){
$(function(){
		$('.SlideTab').tabSwitch('create',{width: "47em", height: "35em"});
		$('.tabSelect').click(function(e){
			$('.SlideTab').tabSwitch('moveTo',{index: parseInt($(this).attr("tabindex"))-1});
			e.preventDefault();
		});
		$('.Nav').click(function(e){
			$('.SlideTab').tabSwitch('moveStep',{step: parseInt($(this).attr("tabindex"))-1});
			e.preventDefault();
		});
		
        var x=document.getElementById("contenido").getElementsByTagName("div");
		
		x.item(0).style.height="100%";
		x.item(0).style.width="100%";
		x.item(1).style.width="350em";
                
});

hagaseWidget();//http://mrdoob.com/projects/chromeexperiments/google_gravity/
cargarNoticias();
cargarNosotros();
cargarLogo();
cargarProductos('all');
queryProvincias();

}

function cambiarBackground(id, num)
{
	var fondos = new Array(5);
	fondos[0] = "rgba(139, 0, 0, 0.5)";
	fondos[1] = "rgba(255, 105, 180, 0.5)";
	fondos[2] = "rgba(255, 69, 0, 0.5)";
	fondos[3] = "rgba(70, 130, 180, 0.5)";
	fondos[4] = "none";
	var elemento = document.getElementById(id);
	
	num = (num+1)%5;
	
	elemento.style.background = fondos[num];
	//elemento.setAttribute("style","background-color:"+fondos[num]);
	document.getElementById("controles").getElementsByTagName("img")[0].setAttribute("onClick","cambiarBackground('"+id+"', "+num+");");
}

function cambiarFont(id, num)
{
	var fuentes = new Array(5);
	fuentes[0] = "ricardo";
	fuentes[1] = "edward";
	fuentes[2] = "david";
	fuentes[3] = "titulo";
	fuentes[4] = "texto";
	var elemento = document.getElementById(id);
	
	num = (num+1)%5;
	
	elemento.style.fontFamily = fuentes[num];
	//elemento.setAttribute("style","font-family:"+fuentes[num]);
	document.getElementById("controles").getElementsByTagName("img")[1].setAttribute("onClick","cambiarFont('"+id+"', "+num+");");
}
function mostrar()
{
	document.getElementById("resumen").style.display="none";
	document.getElementById("completo").style.display="block";
	document.getElementById("evento").innerHTML="[Ocultar]";
	document.getElementById("evento").setAttribute("onClick","ocultar();")
}
function ocultar()
{
	document.getElementById("completo").style.display="none";
	document.getElementById("resumen").style.display="block";
	document.getElementById("evento").innerHTML="[Ocultar]";
	document.getElementById("evento").setAttribute("onClick","mostrar();")
}