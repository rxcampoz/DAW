<?php
//Funciones

function isset_or(&$check, $alternate = NULL)
{
    return (isset($check)) ? (empty($check) ? $alternate : $check) : $alternate;
} 

function getGETPOST($var)
{
	  return isset_or($_GET[$var],isset_or($_POST[$var],''));
}

function getCiudad($ciudad)
{
	$xml = "";
	if(strcmp($ciudad,"01")==0)
  {
		$xml="
		<ciudades>
		<ciudad id=\"1\" nombre_ciudad=\"CAMILO PONCE ENRIQUE\" />
		<ciudad id=\"2\" nombre_ciudad=\"CUENCA\" />
		<ciudad id=\"3\" nombre_ciudad=\"GUALACEO\" />
		<ciudad id=\"4\" nombre_ciudad=\"PAUTE\" />
		<ciudad id=\"5\" nombre_ciudad=\"GIRÓN\" />
		<ciudad id=\"6\" nombre_ciudad=\"SAN FERNANDO\" />
		<ciudad id=\"7\" nombre_ciudad=\"SANTA ISABEL\" />
		<ciudad id=\"8\" nombre_ciudad=\"SIGSIG\" />
		<ciudad id=\"9\" nombre_ciudad=\"SEVILLA DE ORO\" />
		</ciudades>";
	}
	else if(strcmp($ciudad,"02")==0)
	{
	   $xml="<ciudades>
			<ciudad id=\"10\" nombre_ciudad=\"SAN SEBASTIÁN\" />
			<ciudad id=\"11\" nombre_ciudad=\"GUARANDA\" />
			<ciudad id=\"12\" nombre_ciudad=\"CHIMBO\" />
			<ciudad id=\"13\" nombre_ciudad=\"CHILLANES\" />
			<ciudad id=\"14\" nombre_ciudad=\"BALZAPAMBA\" />
			<ciudad id=\"15\" nombre_ciudad=\"SALINAS\" />
			<ciudad id=\"16\" nombre_ciudad=\"SAN JOSE DEL TAMBO\" />
			<ciudad id=\"17\" nombre_ciudad=\"SAN MIGUEL DE BOLÍVA\" />
			<ciudad id=\"18\" nombre_ciudad=\"ECHEANDÍA\" />
			<ciudad id=\"19\" nombre_ciudad=\"CALUMA\" />
			<ciudad id=\"20\" nombre_ciudad=\"LA MAGDALENA\" />
			</ciudades>";
	}
	else if(strcmp($ciudad,"03")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"21\" nombre_ciudad=\"LA TRONCAL\" />
				<ciudad id=\"22\" nombre_ciudad=\"BIBLIÁN\" />
				<ciudad id=\"23\" nombre_ciudad=\"DUCUR\" />
				<ciudad id=\"24\" nombre_ciudad=\"EL TAMBO\" />
				<ciudad id=\"25\" nombre_ciudad=\"SUSCAL\" />
				<ciudad id=\"26\" nombre_ciudad=\"AZOGUES\" />
				<ciudad id=\"27\" nombre_ciudad=\"CAÑAR\" />
				<ciudad id=\"28\" nombre_ciudad=\"COCHANCAY\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"04")==0)
	{
			$xml="<ciudades>
				</ciudades>";
	}
	else if(strcmp($ciudad,"05")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"29\" nombre_ciudad=\"HUIGRA\" />
				<ciudad id=\"30\" nombre_ciudad=\"CHUNCHI\" />
				<ciudad id=\"31\" nombre_ciudad=\"PALLATANGA\" />
				<ciudad id=\"32\" nombre_ciudad=\"ALAUSI\" />
				<ciudad id=\"33\" nombre_ciudad=\"RIOBAMBA\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"06")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"34\" nombre_ciudad=\"TINGO\" />
				<ciudad id=\"35\" nombre_ciudad=\"LATACUNGA\" />
				<ciudad id=\"36\" nombre_ciudad=\"LAZO\" />
				<ciudad id=\"37\" nombre_ciudad=\"PUJILÍ\" />
				<ciudad id=\"38\" nombre_ciudad=\"SAQUISILÍ\" />
				<ciudad id=\"39\" nombre_ciudad=\"SALCEDO\" />
				<ciudad id=\"40\" nombre_ciudad=\"LA MANÁ\" />
				<ciudad id=\"41\" nombre_ciudad=\"EL SALVADOR\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"07")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"42\" nombre_ciudad=\"ESMERALDAS\" />
				<ciudad id=\"43\" nombre_ciudad=\"BORBON\" />
				<ciudad id=\"44\" nombre_ciudad=\"PALESTINA ESMERALDAS\" />
				<ciudad id=\"45\" nombre_ciudad=\"VICHE\" />
				<ciudad id=\"46\" nombre_ciudad=\"QUININDE\" />
				<ciudad id=\"47\" nombre_ciudad=\"TONCHIGUE\" />
				<ciudad id=\"48\" nombre_ciudad=\"MUISNE\" />
				<ciudad id=\"49\" nombre_ciudad=\"CHAMANGA\" />
				<ciudad id=\"50\" nombre_ciudad=\"ATACAMES\" />
				<ciudad id=\"51\" nombre_ciudad=\"LA UNIÓN\" />
				<ciudad id=\"52\" nombre_ciudad=\"LIMONES\" />
				<ciudad id=\"53\" nombre_ciudad=\"SAN LORENZO\" />
				<ciudad id=\"54\" nombre_ciudad=\"LA CONCORDIA\" />
				<ciudad id=\"55\" nombre_ciudad=\"SUA\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"08")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"56\" nombre_ciudad=\"SANTA CRUZ\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"09")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"57\" nombre_ciudad=\"DURAN\" />
				<ciudad id=\"58\" nombre_ciudad=\"GUAYAQUIL\" />
				<ciudad id=\"59\" nombre_ciudad=\"MILAGRO\" />
				<ciudad id=\"60\" nombre_ciudad=\"COLIMES\" />
				<ciudad id=\"61\" nombre_ciudad=\"DAULE\" />
				<ciudad id=\"62\" nombre_ciudad=\"LOMAS DE SARGENTILLO\" />
				<ciudad id=\"63\" nombre_ciudad=\"LAUREL\" />
				<ciudad id=\"64\" nombre_ciudad=\"NARANJAL\" />
				<ciudad id=\"65\" nombre_ciudad=\"NARANJITO\" />
				<ciudad id=\"66\" nombre_ciudad=\"LA AURORA\" />
				<ciudad id=\"67\" nombre_ciudad=\"SAMBORONDÓN\" />
				<ciudad id=\"68\" nombre_ciudad=\"SALITRE\" />
				<ciudad id=\"69\" nombre_ciudad=\"YAGUACHI\" />
				<ciudad id=\"70\" nombre_ciudad=\"EL EMPALME\" />
				<ciudad id=\"71\" nombre_ciudad=\"BALZAR\" />
				<ciudad id=\"72\" nombre_ciudad=\"EL TRIUNFO\" />
				<ciudad id=\"73\" nombre_ciudad=\"PEDRO CARBO\" />
				<ciudad id=\"74\" nombre_ciudad=\"BALAO\" />
				<ciudad id=\"75\" nombre_ciudad=\"NOBOL\" />
				<ciudad id=\"76\" nombre_ciudad=\"PLAYAS\" />
				<ciudad id=\"77\" nombre_ciudad=\"POSORJA\" />
				<ciudad id=\"78\" nombre_ciudad=\"PROGRESO\" />
				<ciudad id=\"79\" nombre_ciudad=\"SANTA LUCÍA\" />
				<ciudad id=\"80\" nombre_ciudad=\"PALESTINA\" />
				<ciudad id=\"81\" nombre_ciudad=\"BUCAY\" />
				<ciudad id=\"82\" nombre_ciudad=\"DATA\" />
				<ciudad id=\"83\" nombre_ciudad=\"MARCELINO MARIDUEÑA\" />
				<ciudad id=\"84\" nombre_ciudad=\"KM. 26 VÍA PALLATANG\" />
				<ciudad id=\"85\" nombre_ciudad=\"BALAO GRANDE\" />
				<ciudad id=\"86\" nombre_ciudad=\"JUJAN\" />
				<ciudad id=\"87\" nombre_ciudad=\"TRES POSTES\" />
				<ciudad id=\"88\" nombre_ciudad=\"CUMANDA\" />
				<ciudad id=\"89\" nombre_ciudad=\"SIMON BOLÍVAR\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"10")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"90\" nombre_ciudad=\"IBARRA\" />
				<ciudad id=\"91\" nombre_ciudad=\"OTAVALO\" />
				<ciudad id=\"92\" nombre_ciudad=\"SAN ANTONIO\" />
				<ciudad id=\"93\" nombre_ciudad=\"ATUNTAQUI\" />
				<ciudad id=\"94\" nombre_ciudad=\"SAN RAFAEL\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"11")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"95\" nombre_ciudad=\"LOJA\" />
				<ciudad id=\"96\" nombre_ciudad=\"AMALUZA\" />
				<ciudad id=\"97\" nombre_ciudad=\"CHAGUARPAMBA\" />
				<ciudad id=\"98\" nombre_ciudad=\"OLMEDO\" />
				<ciudad id=\"99\" nombre_ciudad=\"PINDAL\" />
				<ciudad id=\"100\" nombre_ciudad=\"MACARA\" />
				<ciudad id=\"101\" nombre_ciudad=\"SOZORANGA\" />
				<ciudad id=\"102\" nombre_ciudad=\"MALACATOS\" />
				<ciudad id=\"103\" nombre_ciudad=\"VILCABAMBA\" />
				<ciudad id=\"104\" nombre_ciudad=\"CELICA\" />
				<ciudad id=\"105\" nombre_ciudad=\"CARIAMANGA\" />
				<ciudad id=\"106\" nombre_ciudad=\"GONZANAMÁ\" />
				<ciudad id=\"107\" nombre_ciudad=\"ALAMOR\" />
				<ciudad id=\"108\" nombre_ciudad=\"CATACOCHA\" />
				<ciudad id=\"109\" nombre_ciudad=\"LA TOMA\" />
				<ciudad id=\"110\" nombre_ciudad=\"SARAGURO\" />
				<ciudad id=\"111\" nombre_ciudad=\"ZAPOTILLO\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"12")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"112\" nombre_ciudad=\"PICHINCHA\" />
				<ciudad id=\"113\" nombre_ciudad=\"PORTOVIEJO\" />
				<ciudad id=\"114\" nombre_ciudad=\"CALDERON MANABI\" />
				<ciudad id=\"115\" nombre_ciudad=\"CRUCITA\" />
				<ciudad id=\"116\" nombre_ciudad=\"MANTA\" />
				<ciudad id=\"117\" nombre_ciudad=\"JAMA\" />
				<ciudad id=\"118\" nombre_ciudad=\"JARAMIJÓ\" />
				<ciudad id=\"119\" nombre_ciudad=\"JIPIJAPA\" />
				<ciudad id=\"120\" nombre_ciudad=\"CHONE\" />
				<ciudad id=\"121\" nombre_ciudad=\"BAHÍA\" />
				<ciudad id=\"122\" nombre_ciudad=\"COJIMIES\" />
				<ciudad id=\"123\" nombre_ciudad=\"SAN ISIDRO\" />
				<ciudad id=\"124\" nombre_ciudad=\"SAN SEBASTIAN-PORTOV\" />
				<ciudad id=\"125\" nombre_ciudad=\"MONTECRISTI\" />
				<ciudad id=\"126\" nombre_ciudad=\"PUERTO CALLO\" />
				<ciudad id=\"127\" nombre_ciudad=\"PUERTO LÓPEZ\" />
				<ciudad id=\"128\" nombre_ciudad=\"PAJÁN\" />
				<ciudad id=\"129\" nombre_ciudad=\"EL CÁRMEN\" />
				<ciudad id=\"130\" nombre_ciudad=\"ROCAFUERTE\" />
				<ciudad id=\"131\" nombre_ciudad=\"SUCRE\" />
				<ciudad id=\"132\" nombre_ciudad=\"SANTA ANA\" />
				<ciudad id=\"133\" nombre_ciudad=\"JUNÍN\" />
				<ciudad id=\"134\" nombre_ciudad=\"MACHALILLA\" />
				<ciudad id=\"135\" nombre_ciudad=\"SAN VICENTE\" />
				<ciudad id=\"136\" nombre_ciudad=\"PEDERNALES\" />
				<ciudad id=\"137\" nombre_ciudad=\"SAN PLÁCIDO\" />
				<ciudad id=\"138\" nombre_ciudad=\"CALCETA\" />
				<ciudad id=\"139\" nombre_ciudad=\"CHARAPOTÓ\" />
				<ciudad id=\"140\" nombre_ciudad=\"TOSAGUA\" />
				<ciudad id=\"141\" nombre_ciudad=\"FLAVIO ALFARO\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"13")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"142\" nombre_ciudad=\"MACAS\" />
				<ciudad id=\"143\" nombre_ciudad=\"SUCUA\" />
				<ciudad id=\"144\" nombre_ciudad=\"MÉNDEZ\" />
				<ciudad id=\"145\" nombre_ciudad=\"GUALAQUIZA\" />
				<ciudad id=\"146\" nombre_ciudad=\"GENERAL PLAZA\" />
				<ciudad id=\"147\" nombre_ciudad=\"LIMON-INDANZA\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"14")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"148\" nombre_ciudad=\"PAPALLACTA\" />
				<ciudad id=\"149\" nombre_ciudad=\"BAEZA\" />
				<ciudad id=\"150\" nombre_ciudad=\"TENA\" />
				<ciudad id=\"151\" nombre_ciudad=\"ARCHIDONA\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"15")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"152\" nombre_ciudad=\"COCA\" />
				<ciudad id=\"153\" nombre_ciudad=\"LA JOYA DE LOS SACHA\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"16")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"154\" nombre_ciudad=\"MACHALA\" />
				<ciudad id=\"155\" nombre_ciudad=\"PASAJE\" />
				<ciudad id=\"156\" nombre_ciudad=\"PUERTO BOLÍVAR\" />
				<ciudad id=\"157\" nombre_ciudad=\"EL GUABO\" />
				<ciudad id=\"158\" nombre_ciudad=\"HUAQUILLAS\" />
				<ciudad id=\"159\" nombre_ciudad=\"PIÑAS\" />
				<ciudad id=\"160\" nombre_ciudad=\"ZARUMA\" />
				<ciudad id=\"161\" nombre_ciudad=\"BALSAS\" />
				<ciudad id=\"162\" nombre_ciudad=\"PORTOVELO\" />
				<ciudad id=\"163\" nombre_ciudad=\"SANTA ROSA\" />
				<ciudad id=\"164\" nombre_ciudad=\"ARENILLAS\" />
				<ciudad id=\"165\" nombre_ciudad=\"PACCHA\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"17")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"166\" nombre_ciudad=\"PUYO\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"18")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"167\" nombre_ciudad=\"PUEBLONUEVO\" />
				<ciudad id=\"168\" nombre_ciudad=\"SAN JUAN PICHINCHA\" />
				<ciudad id=\"169\" nombre_ciudad=\"SAN M. DE LOS BANCOS\" />
				<ciudad id=\"170\" nombre_ciudad=\"PUERTO QUITO\" />
				<ciudad id=\"171\" nombre_ciudad=\"PEDRO V. MALDONADO\" />
				<ciudad id=\"172\" nombre_ciudad=\"QUITO\" />
				<ciudad id=\"173\" nombre_ciudad=\"TANDAPI\" />
				<ciudad id=\"174\" nombre_ciudad=\"CAYAMBE\" />
				<ciudad id=\"175\" nombre_ciudad=\"GUAYABAMBA\" />
				<ciudad id=\"176\" nombre_ciudad=\"ALOAG\" />
				<ciudad id=\"177\" nombre_ciudad=\"MACHACHI\" />
				<ciudad id=\"178\" nombre_ciudad=\"AMAGUAÑA\" />
				<ciudad id=\"179\" nombre_ciudad=\"ALANGASI\" />
				<ciudad id=\"180\" nombre_ciudad=\"CALACALI\" />
				<ciudad id=\"181\" nombre_ciudad=\"CALDERON PICHINCHA\" />
				<ciudad id=\"182\" nombre_ciudad=\"CONOCOTO\" />
				<ciudad id=\"183\" nombre_ciudad=\"CUMBAYA\" />
				<ciudad id=\"184\" nombre_ciudad=\"GUANGOPOLO\" />
				<ciudad id=\"185\" nombre_ciudad=\"LA MERCED\" />
				<ciudad id=\"186\" nombre_ciudad=\"NONO\" />
				<ciudad id=\"187\" nombre_ciudad=\"PIFO\" />
				<ciudad id=\"188\" nombre_ciudad=\"TAMBILLO\" />
				<ciudad id=\"189\" nombre_ciudad=\"TUMBACO\" />
				<ciudad id=\"190\" nombre_ciudad=\"POMASQUI\" />
				<ciudad id=\"191\" nombre_ciudad=\"PUEMBO\" />
				<ciudad id=\"192\" nombre_ciudad=\"QUINCHE\" />
				<ciudad id=\"193\" nombre_ciudad=\"SANGOLQUI\" />
				<ciudad id=\"194\" nombre_ciudad=\"SANTA ROSA PICHINCHA\" />
				<ciudad id=\"195\" nombre_ciudad=\"YARUQUÍ\" />
				</ciudades>";
					}
	else if(strcmp($ciudad,"19")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"196\" nombre_ciudad=\"SAN CARLOS\" />
				<ciudad id=\"197\" nombre_ciudad=\"VALENCIA\" />
				<ciudad id=\"198\" nombre_ciudad=\"BUENA FÉ\" />
				<ciudad id=\"199\" nombre_ciudad=\"BABAHOYO\" />
				<ciudad id=\"200\" nombre_ciudad=\"SAN JUAN LOS RIOS\" />
				<ciudad id=\"201\" nombre_ciudad=\"QUEVEDO\" />
				<ciudad id=\"202\" nombre_ciudad=\"LA UNION-LOS RIOS\" />
				<ciudad id=\"203\" nombre_ciudad=\"MATA DE CACAO\" />
				<ciudad id=\"204\" nombre_ciudad=\"QUINSALOMA\" />
				<ciudad id=\"205\" nombre_ciudad=\"LOS ANGELES\" />
				<ciudad id=\"206\" nombre_ciudad=\"PUEBLOVIEJO\" />
				<ciudad id=\"207\" nombre_ciudad=\"VENTANAS\" />
				<ciudad id=\"208\" nombre_ciudad=\"VINCES\" />
				<ciudad id=\"209\" nombre_ciudad=\"PALENQUE\" />
				<ciudad id=\"210\" nombre_ciudad=\"BABA\" />
				<ciudad id=\"211\" nombre_ciudad=\"CATARAMA\" />
				<ciudad id=\"212\" nombre_ciudad=\"MOCACHE\" />
				<ciudad id=\"213\" nombre_ciudad=\"PIMOCHA\" />
				<ciudad id=\"214\" nombre_ciudad=\"PLAYAS DE MONTALVO\" />
				<ciudad id=\"215\" nombre_ciudad=\"PATRICIA PILAR\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"20")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"216\" nombre_ciudad=\"LUMBAQUI\" />
				<ciudad id=\"217\" nombre_ciudad=\"LAGO AGRIO\" />
				<ciudad id=\"218\" nombre_ciudad=\"SUSHUFINDI\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"21")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"219\" nombre_ciudad=\"AMBATO\" />
				<ciudad id=\"220\" nombre_ciudad=\"PATATE\" />
				<ciudad id=\"221\" nombre_ciudad=\"PELILEO\" />
				<ciudad id=\"222\" nombre_ciudad=\"PÍLLARO\" />
				<ciudad id=\"223\" nombre_ciudad=\"QUERO\" />
				<ciudad id=\"224\" nombre_ciudad=\"CEVALLOS\" />
				<ciudad id=\"225\" nombre_ciudad=\"BAÑOS\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"22")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"226\" nombre_ciudad=\"ZUMBA\" />
				<ciudad id=\"227\" nombre_ciudad=\"EL PANGUI\" />
				<ciudad id=\"228\" nombre_ciudad=\"ZAMORA\" />
				<ciudad id=\"229\" nombre_ciudad=\"PALANDA\" />
				<ciudad id=\"230\" nombre_ciudad=\"YANZATZA\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"23")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"231\" nombre_ciudad=\"PUERTO LIMON\" />
				<ciudad id=\"232\" nombre_ciudad=\"VALLE HERMOSO\" />
				<ciudad id=\"233\" nombre_ciudad=\"SANTO DOMINGO\" />
				<ciudad id=\"234\" nombre_ciudad=\"ALLURIQUIN\" />
				</ciudades>";
	}
	else if(strcmp($ciudad,"24")==0)
	{
			$xml="<ciudades>
				<ciudad id=\"235\" nombre_ciudad=\"SANTA ELENA\" />
				<ciudad id=\"236\" nombre_ciudad=\"SALINAS\" />
				<ciudad id=\"237\" nombre_ciudad=\"ANCÓN\" />
				<ciudad id=\"238\" nombre_ciudad=\"ATAHUALPA\" />
				<ciudad id=\"239\" nombre_ciudad=\"BALLENITA\" />
				<ciudad id=\"240\" nombre_ciudad=\"LA LIBERTAD\" />
				<ciudad id=\"241\" nombre_ciudad=\"SALANGO\" />
				<ciudad id=\"242\" nombre_ciudad=\"MANGLARALTO\" />
				<ciudad id=\"243\" nombre_ciudad=\"OLON\" />
				<ciudad id=\"244\" nombre_ciudad=\"PALMAR\" />
				<ciudad id=\"245\" nombre_ciudad=\"CHANDUY\" />
				<ciudad id=\"246\" nombre_ciudad=\"SAN CAMILO\" />
				<ciudad id=\"247\" nombre_ciudad=\"SAN PABLO\" />
				<ciudad id=\"248\" nombre_ciudad=\"SAN PEDRO\" />
				</ciudades>";
	}
	
	
	return $xml;
}

$pr=getGETPOST('pr');

header('Content-Type: text/xml');
print '<?xml version="1.0" encoding="iso-8859-1" standalone="yes"?>';
print trim(getCiudad($pr));



?>

