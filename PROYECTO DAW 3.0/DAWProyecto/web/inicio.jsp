<%-- 
    Document   : inicio
    Created on : 28-ene-2012, 18:34:20
    Author     : Edward Holguín
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es" lang="es">
	<head>
		<meta charset="UTF-8" />
		<title>Cholo Machine Star Sport</title>
		<meta name="description" content="Proyecto de DAW" />
		<meta name="keywords" xml:lang="es" lang="es" content="zapatos cholo machine ecuador estudiantes nike adiddas" />
		<meta name="Author" content="Ricardo Campozano Carlos Cerezo David Culcay y Edward Holguín" />
		<meta name="description" content= "Esta es la pagina WEB desarrollada con propositos estudiantiles" />
		
		<!-- CSS -->
		<link id="cssArchivo" rel="stylesheet" type="text/css" href="css/Estilos.css" />
		<link rel="stylesheet" type="text/css" href="css/Animaciones.css" />
		<link rel="stylesheet" type="text/css" href="css/Gallery.css" />
		<link rel="stylesheet" type="text/css" href="css/inettuts.css"/>
		<link rel="stylesheet" type="text/css" href="css/polaroids.css" />
		<link rel="stylesheet" type="text/css" href="css/tooltip.css" />
		<link rel="stylesheet" type="text/css" href="css/EstiloFrom.css" />
		
		
		<!-- Gallery 3D-->
		<link rel="stylesheet" type="text/css" href="css/slicebox.css" />
		
		<!-- JavaScript-->
		<script type="text/javascript" src="js/jquery.js"></script>
		<script type="text/javascript" src="js/validador.js"></script>
		
		<script type="text/javascript" src="js/jquery-ui-1.8.16.custom.min.js"></script>
		<script type="text/javascript" src="js/jquery.cycle.all.js"></script>
		
		<script type="text/javascript" src="js/llenarNoticias.js"></script>
                <script type="text/javascript" src="js/llenarProductos.js"></script>
                <script type="text/javascript" src="js/cambiarCSS.js"></script>
		
		<!-- Slider-->
		<script type="text/javascript" src="js/jquery.tabSwitch.yui.js"></script>
		<script type="text/javascript" src="js/secciones.js"></script>
		
		<!-- Gallery 3D-->
		<script type="text/javascript" src="js/modernizr.custom.13303.js"></script>
		
		
		<script type="text/javascript" src="js/llenarLogo.js"></script>
		<script type="text/javascript" src="js/Provincia.js"></script>
                <script type="text/javascript" src="js/llenarNosotros.js"></script>
                
                <link rel="stylesheet" type="text/css" href="css/barra.css" />
        <script type="text/javascript" src="js/barraLogin.js"></script>
		
		
	</head>
	<body onLoad="hagaseSlide();">
<div id="fb-root"></div>
<script>(function(d, s, id) {
  var js, fjs = d.getElementsByTagName(s)[0];
  if (d.getElementById(id)) return;
  js = d.createElement(s); js.id = id;
  js.src = "//connect.facebook.net/es_LA/all.js#xfbml=1";
  fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));</script>
		<div id="pagina">
                    
                    <c:choose>
                        <c:when test="${sessionScope.usuario.nombre != null}">
                            <jsp:include page="Barra.jsp" flush="true" />
                        </c:when>
                        <c:otherwise>
                            <jsp:include page="BarraLogin.jsp" flush="true" />
                        </c:otherwise>
                    </c:choose>
			
                    <header>
				<h1>Cholo Machine</h1>
				<figure id="logo">
					<img src="imagenes/logo3.png" alt="Logo Cholo Machine" />
				</figure>
				<figure id="bannerR">
					<div id="sb-slider" class="sb-slider">
						<img src="imagenes/1.jpg" title="Reezing" alt="img-Reezing" />
						<img src="imagenes/2.jpg" title="AB" alt="img-Ab" />
						<img src="imagenes/3.jpg" title="Puma" alt="img-Puma" />
						<img src="imagenes/4.jpg" title="Nike" alt="img-Nike" />
					</div>
					<!-- <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script> -->
					<script type="text/javascript" src="js/jquery.slicebox.min.js"></script>
					<script type="text/javascript">
						$(function() {
							$('#sb-slider').slicebox({
								slicesCount			: 5,
								disperseFactor		: 30,
								sequentialRotation	: true,
								sequentialFactor	: 100
							});

							if( !Modernizr.csstransforms3d ) {
								$('#sb-note').show();

								$('#sb-examples > li:gt(2)').remove();

								$('body').append(
									$('script').attr( 'type', 'text/javascript' ).attr( 'src', 'js/jquery.easing.1.3.js' )
								);
							}
						});
					</script>
				</figure>
				<div id="redesSociales">
					<figure>
						<a href="https://plus.google.com"><img class="animated tada" src="imagenes/google.png" alt="google" /></a>
					</figure>
					<figure>
						<a href="http://www.facebook.com"><img class="animated tada" src="imagenes/facebook.png" alt="facebook" /></a>
					</figure>
					<figure>
						<a href="http://twitter.com/"><img class="animated tada" src="imagenes/twitter.png" alt="twitter" /></a>
					</figure>
					<figure>
						<a href="https://plus.google.com"><img class="animated tada" src="imagenes/google+1.png" alt="google+1" /></a>
					</figure>
				</div>
			</header>
			<nav>
			<ul id="menu">
				<li><a class="tabSelect" href="#inicio" tabindex="1" >INICIO</a></li>
				<li><a class="tabSelect" href="#productos" tabindex="2" onClick="cargarProductos('all');" >PRODUCTOS</a>
					<ul class="subMenu">
						<li><a class="tabSelect" href="#productos" tabindex="2" onClick="cargarProductos('hombre');">Hombre</a></li>
						<li><a class="tabSelect" href="#productos" tabindex="2" onClick="cargarProductos('mujer');">Mujer</a></li>
						<li><a class="tabSelect" href="#productos" tabindex="2" onClick="cargarProductos('junior');">Niños</a></li>
					</ul>
				</li>
				<li><a class="tabSelect" href="#nosotros" tabindex="3" >NOSOTROS</a>
					<ul class="subMenu">
						<li><a class="tabSelect" tabindex="3" >Quienes somos</a></li>
						<li><a class="tabSelect" tabindex="3" >Visitanos</a></li>
						<li><a class="tabSelect" tabindex="3" >Responsabilidad Social</a></li>
						<li><a class="tabSelect" tabindex="3" >Personal</a></li>
					</ul>
				</li>
				<li><a class="tabSelect" href="#contactenos" tabindex="4" >CONTACTENOS</a></li>
				<li><a class="tabSelect" href="#ubicanos" tabindex="5" >ESTILOS</a>
				</li>
			</ul>
			</nav>
			<div id="contenido">
				<section id="inicio" class="SlideTab">
					<h2>BIENVENID@ ${usuario.nombre}</h2>
					<video controls="controls" autoplay="autoplay" loop="loop">
						<source src="video/video.mp4" type="video/mp4" />
						<p>Tu Navegador no soporta video</p>
					</video>
					<div id="acordion">
						<ul class="gallery">
							<li class="pic-1">
								<a href="#">
									<figure>
										<img  src="imagenes/acor1.jpg" alt="imagen1" />
										<figcaption>Basketball</figcaption>
									</figure>
								</a>
							</li>
							<li class="pic-2">
								<a href="#">
									<figure>
										<img  src="imagenes/acor2.jpg" alt="imagen2" />
										<figcaption>Futbol</figcaption>
									</figure>
								</a>
							</li>
							<li class="pic-3">
								<a href="#">
									<figure>
										<img  src="imagenes/acor3.jpg" alt="imagen3"  />
										<figcaption>Original</figcaption>
									</figure>
								</a>
							</li>
							
						</ul>
						<ul class="gallery">
							<li class="pic-4">
								<a href="#">
									<figure>
										<img  src="imagenes/acor4.jpg" alt="imagen4" />
										<figcaption>Runnig</figcaption>
									</figure>
								</a>
							</li>
							<li class="pic-5">
								<a href="#">
									<figure>
										<img  src="imagenes/acor5.jpg" alt="imagen5" />
										<figcaption>Skater</figcaption>
									</figure>
								</a>
							</li>
							<li class="pic-6">
								<a href="#">
									<figure>
										<img  src="imagenes/acor6.jpg" alt="imagen6" />
										<figcaption>Tenis</figcaption>
									</figure>
								</a>
							</li>
						</ul>
					</div>
				</section>
				<section id="productos" class="SlideTab">					
					<h2>Productos</h2>
					<ul id="polaroid" class="polaroids">
					</ul>
				</section>
				<section id="nosotros" class="SlideTab">
					<header>
						<h2 style="float:left">Nosotros</h2>
						<div id="controles" style="float:right">
							<img src="imagenes/logo7.jpg" alt="Cambia Fondos" width="25" height="25" onClick="cambiarBackground('nosotros', 1)" />
							<img src="imagenes/f.jpg" alt="Cambia Fuentes" width="25" height="25" onClick="cambiarFont('nosotros', 1)" />
						</div>
					</header>
					<div id="resumen" style="clear:both">
						<h3>Historia</h3>
						<p>
						Cholo Machine desde 20xx ha incursionado en el Ecuador en la venta de Calzado, y actualmente 
						somos pioneros en la venta por catalogo. Hoy nuestro calzado lo puede encontrar en cualquier ciudad del 
						país gracias a la venta por catalogo.

						Cholo Machine es una empresa estructurada tecnológica y administrativamente para atender a un mercado
						cada vez más competitivo y exigente,...
                                                </p>
					</div>
					<div id="completo" style="clear:both;display:none">
                                            <article>
                                                <h3>Historia</h3>
						<p>
						Cholo Machine desde 20xx ha incursionado en el Ecuador en la venta de Calzado, y actualmente 
						somos pioneros en la venta por catalogo. Hoy nuestro calzado lo puede encontrar en cualquier ciudad del 
						país gracias a la venta por catalogo.

						Cholo Machine es una empresa estructurada tecnológica y administrativamente para atender a un mercado
						cada vez más competitivo y exigente, que se dedica a la Venta de Calzado, cuyo
						valor agregado es la garantía que solo nosotros podemos ofrecer frente a un producto de excelente 
						calidad, y 6 acogedoras tiendas que ponemos a disposición del consumidor. De esta manera somos capaces 
						de ofrecer productos con alta tecnología, valor agregado y el mejor servicio al cliente.

						Si Busca lo último en moda esta en el lugar indicado gracias a nuestro portal web ahora podrá estar al 
						día con nuestras nuevas colecciones.
						</p>
                                            </article>
                                            <article>
						<h3>Visión</h3>
						<p>
						Llegar a calzar a tod@s l@s ecuatorian@s, ofreciéndoles un calzado confortable de calidad 
						e imponiendo moda a través de las diferentes marcas que distribuimos.
						</p>
                                            </article>
                                            <article>
						<h3>Misión</h3>
						<p>
						Mediante modernos y funcionales locales que ponemos a disposición del público ofrecer un servicio y 
						un producto de alta calidad, además de aportar al desarrollo económico de varias familias con nuestro 
						sistema de venta por catalogo.
						</p>
                                            </article>
					</div>
					<div>
						<p id="evento" onClick="mostrar();">[Mostrar]</p>
					</div>
				</section>
				<section id="contactenos" class="SlideTab">
					<header>
						<h2>Contactenos</h2>
						<p>Envienos sus comentarios y sugerencias.</p>
					</header>
					<form name="formulario" onSubmit="return validarFormulario();">
						<fieldset>
						<legend>Datos</legend>
							<label for="name">Nombre y Apellido:</label><br />
							<input id="name" type="text" name="na" required="required" placeholder="Nombre" onkeypress=" return valLetra(event)" /><br />
							<label for="correo">Correo Electrónico</label><br />
							<input id="correo" type="email" name="co" required="required" placeholder="email@example.com" /><br />
							<label for="fono">Teléfono:</label><br />
							<input id="fono" type="number" name="te"  onkeypress=" return valNumero(event)" /><br />
							<label for="provincias">Província</label><br />
							<select id="provincias" name="pr" onChange="queryCiudades(pr.value);">
							</select><br />
							<label for="ciudades">Ciudades:</label><br />
							<select id="ciudades" name="ci" style="text-transform:capitalize;">
							</select><br />
							<label for="msj">Comentario:</label><br />
							<textArea id="msj" name="msj" required="required"></textArea><br />
							<input id="bt" type="submit" name="boton" value="Enviar" />
						</fieldset>
					</form>
				</section>
				<section id="ubicanos" class="SlideTab">
                                    <h2>Temas disponibles</h2>
                                    <jsp:useBean id="helper" class="BD.Helper" type="BD.Helper" scope="page"/>
                                    <c:forEach var="temas" items="${helper.temas}">
                                        <div>
                                            <h3>${temas.nombre}</h3>
                                            <p>Descripcion: ${temas.descripcion}</p>
                                            <a href="#" onclick="cambiarArchivoCss('${temas.path}');"><strong>Cargar Tema</strong></a><br/>
                                        </div>

                                    </c:forEach>
                                    <br/><a href="#" onclick="cambiarArchivoCss('css/Estilos.css');"><strong>Cargar Tema por defecto</strong></a>
				</section>
			</div>
			<aside style="overflow-y:scroll">
				<div id="columns">
					<ul id="column1" class="column">
						<li class="widget color-green" id="intro">
							<article>
								<div class="widget-head">
									<h3>Inspirados en Volver al futuro 2</h3>
								</div>
								<div class="widget-content">
									<p class="noticia">Todos hemos visto la famosa escena de volver al futuro 2 en donde Marty Mcfly, el personaje que interpretó el actor Michael J. Fox, usa unos tenis que abrochan por si solos, pero ¿acaso Nike tiene planeado lanzarlos al mercado?</p>
								</div>
							</article>
						</li>
						<li class="widget color-red">  
							<article>
								<div class="widget-head">
									<h3>Facebook y Twitter?</h3>
								</div>
								<div class="widget-content">
									<p class="noticia">Facebook y Twitter, las redes sociales más populares en la actualidad, ya cuentan con un modelo de zapatos propio, sí! oíste bien, zapatos de Facebook y Twitter.  ¿A quien se le ocurrió esta idea que para muchos será descabellada, pero, para otros sencillamente genial? pues hablamos de Adidas quien al parecer lanzará los zapatos inicialmente al mercado estadounidense.</p>
								</div>
							</article>
						</li>
					</ul>

					<ul id="column2" class="column">
						<li class="widget color-blue">  
							<article>
								<div class="widget-head">
									<h3>MENOS PESO MÁS FAAS RUNNING</h3>
								</div>
								<div class="widget-content">
									<p class="noticia">Descubre el nuevo modelo de tenis PUMA desarrollado con la ayuda del hombre más rápido del mundo, Usain Bolt, en uno de los laboratorios naturales donde se crean los líderes en el mundo de las carreras de velocidad: Jamaica!</p>
								</div>
							</article>
						</li>
						<li class="widget color-yellow">  
							<article>
								<div class="widget-head">
									<h3>Reebok por un dólar?</h3>
								</div>
								<div class="widget-content">
									<p class="noticia">La marca deportiva Adidas está desarrollando unas zapatillas deportivas Reebok para vender a bajo precio en zonas rurales de India, posiblemente por tan sólo un dólar. ¿Cómo lo hará?</p>
								</div>
							</article>
						</li>
					</ul>
				</div>
				<script type="text/javascript" src="js/inettuts.js"></script>
			</aside>
                        <section id="facebook">
                            
                            <div id="fb1" class="fb-like-box" data-href="http://www.facebook.com/pages/Cholo-Machine-Community/332506413454779" data-width="292" data-height="500" data-colorscheme="dark" data-show-faces="true" data-stream="true" data-header="true"></div>
                            <div id="fb2" class="fb-comments" data-href="http://www.facebook.com/pages/Cholo-Machine-Community/332506413454779" data-num-posts="4" data-width="470" data-height="500" data-colorscheme="dark"></div>
                            <div id="fb3" class="fb-activity" data-site="http://www.facebook.com/pages/Cholo-Machine-Community/332506413454779" data-app-id="105873936208646" data-width="300" data-colorscheme="dark" data-height="500" data-header="true" data-recommendations="false"></div>
                            
                        </section>            
			<footer id="pie">
				<p>Desarrolladores:  <span id="r">Ricardo Campozano</span> | <span id="c">Carlos Cerezoa</span> | <span id="d">David Culcay</span> | <span id="e">Edward Holguín</span></p>
				<p>Estudiantes de la <a href="http://espol.edu.ec">Escuela Superior Politecnica de Litoral (ESPOL)</a></p>
				<p>RCHC © 2011. Todos los derechos reservados.</p>
			</footer>
		</div>
	</body>
</html>
