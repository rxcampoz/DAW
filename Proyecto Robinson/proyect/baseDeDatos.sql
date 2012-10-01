select * from detalleEgreso de,contrato c where de.idContrato = c.idContrato ;  



drop database daw2 ;
create database daw2 ;
use daw2;

CREATE TABLE configuracioDelSistema(
			fecha  VARCHAR(20),
		  PorcentajeDefinidoDelIvaValor VARCHAR(20) ,
		  Trimestre1 VARCHAR(20),
		  Trimestre2 VARCHAR(20),
		  Trimestre3 VARCHAR(20),
		  Trimestre4 VARCHAR(20),
		  Si_causa_impuesto_ir VARCHAR(20),
		  Si_causa_impuesto_ivaMensual VARCHAR(20),
		  Si_causa_impuesto_ivaSemestral VARCHAR(20),
		  No_causa_impuesto_ir VARCHAR(20),
		  No_causa_impuesto_ivaMensual VARCHAR(20),
		  No_causa_impuesto_ivaSemestral VARCHAR(20),
		  
		  Digito1IpuestoALaRentaPersonasNaturales VARCHAR(20),
		 Digito1IvaMensual VARCHAR(20),
		 Digito1IvaSemestre1 VARCHAR(20),
		 Digito1IvaSemestre2 VARCHAR(20),
		 
		 Digito2IpuestoALaRentaPersonasNaturales VARCHAR(20),
		 Digito2IvaMensual VARCHAR(20),
		 Digito2IvaSemestre1 VARCHAR(20),
		 Digito2IvaSemestre2 VARCHAR(20),
		 
		 Digito3IpuestoALaRentaPersonasNaturales VARCHAR(20),
		 Digito3IvaMensual VARCHAR(20),
		 Digito3IvaSemestre1 VARCHAR(20),
		 Digito3IvaSemestre2 VARCHAR(20),
		 
		 Digito4IpuestoALaRentaPersonasNaturales VARCHAR(20),
		 Digito4IvaMensual VARCHAR(20),
		 Digito4IvaSemestre1 VARCHAR(20),
		 Digito4IvaSemestre2 VARCHAR(20),
		 
		 PorcentageSobreLaBaseParaElPagoDelImpuestoALaRenta VARCHAR(20),
		 PorcentajeDelIrRetenidoPorDefauld VARCHAR(20),
		PRIMARY KEY (fecha)
);

CREATE TABLE representante (
		nombre VARCHAR(20),
		apellido VARCHAR(20),
		tipo_de_identificacion_del_contribuyente_o_representante_legal  VARCHAR(20),
		numero_de_identificacion_del_contribuyente VARCHAR(20),
		correo_electronico VARCHAR(50),
		PRIMARY KEY (numero_de_identificacion_del_contribuyente)
);

CREATE TABLE usuario(
		nombre VARCHAR(20),
		apellido VARCHAR(20),
		Tipo_de_identificacion_del_usuario VARCHAR(20),
		numero_de_identificacion_del_usuario VARCHAR(20),
		numero_de_identificacion_del_contribuyente VARCHAR(20),
		clave VARCHAR(20),
		razon_social  VARCHAR(50),
		periodo_de_declaracion_de_IVA  VARCHAR(20),
		correo_electronico VARCHAR(50),
		provincia VARCHAR(20),
		ciudad VARCHAR(20),
		alertaCorreoIVA  VARCHAR(20),
		alertaCorreoIR  VARCHAR(20),
		PRIMARY KEY (numero_de_identificacion_del_usuario)
		
);

CREATE TABLE facturaIngreso (
		tipoFactura VARCHAR(20),
		dia VARCHAR(20),
		mes VARCHAR(20),
		anio VARCHAR(20),
		coorX VARCHAR(100),
		coorY VARCHAR(100),
		numeroFactura VARCHAR(20),
		cliente VARCHAR(20),
		subtotalValor0 VARCHAR(20),
		subtotalValorIVA VARCHAR(20),
		total VARCHAR(20),
		comprobanteDeRetencion VARCHAR(20),
		PRIMARY KEY (numeroFactura)
);

CREATE TABLE cliente (
		nombre VARCHAR(100),
		rucOcedula VARCHAR(20),
		direccion VARCHAR(1000),
		telefono VARCHAR(20),
		PRIMARY KEY (rucOcedula)
);

CREATE TABLE  comprobanteRetencion(
		numeroComprobanteRetencion VARCHAR(20),
		mes VARCHAR(20),
		anio VARCHAR(20),
		baseImponible VARCHAR(20),
		impuesto VARCHAR(20),
		porcentaje VARCHAR(20),
		totalRetenio  VARCHAR(20),
		PRIMARY KEY (numeroComprobanteRetencion)
);

CREATE TABLE  contrato(
	idContrato VARCHAR(20),
	dia VARCHAR(20),
	mes VARCHAR(20),
	anio VARCHAR(20),
	empresa VARCHAR(50),
	liquidoRecivido VARCHAR(20),
	PRIMARY KEY(idContrato)
);


CREATE TABLE  detalleIngreso(
	idDetalleIngreso  VARCHAR(20),
	concepto  VARCHAR(20),
	valor  VARCHAR(20),
	tipo  VARCHAR(20),
	idContrato  VARCHAR(20),
	PRIMARY KEY(idDetalleIngreso)
);

CREATE TABLE  detalleEgreso(
	idDetalleEgreso  VARCHAR(20),
	concepto  VARCHAR(20),
	valor  VARCHAR(20),
	tipo  VARCHAR(20),
	idContrato  VARCHAR(20),
	PRIMARY KEY(idDetalleEgreso)
);


CREATE TABLE  facturaEgreso(
		numeroFactura   VARCHAR(20),
		dia  VARCHAR(20),
		mes  VARCHAR(20),
		anio  VARCHAR(20),
		proveedor  VARCHAR(20),
		tipoBienOServicio  VARCHAR(20),
		subtotal0  VARCHAR(20),
		subtotalIVA  VARCHAR(20),
		derechoAcredito  VARCHAR(20),
		tipoDeGasto  VARCHAR(20),
		deducible  VARCHAR(20),
		total  VARCHAR(20),
		PRIMARY KEY(numeroFactura)
);

CREATE TABLE  proveedor(
		cedulaOruc VARCHAR(100),
		razonSocial VARCHAR(100),
		direcion VARCHAR(100),
		coorX VARCHAR(100),
		coorY VARCHAR(100),
		telefono VARCHAR(100),
		PRIMARY KEY(cedulaOruc)
		
);


