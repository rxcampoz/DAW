-- Database: daw

-- DROP DATABASE daw;

CREATE DATABASE daw
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Spanish_Ecuador.1252'
       LC_CTYPE = 'Spanish_Ecuador.1252'
       CONNECTION LIMIT = -1;

-- Table: articulo

-- DROP TABLE articulo;

CREATE TABLE articulo
(
  id_articulo bigserial NOT NULL,
  titulo character varying(50),
  contenido character varying(1000),
  tipo character varying(50),
  CONSTRAINT articulo_pk PRIMARY KEY (id_articulo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE articulo OWNER TO postgres;

-- Table: permiso

-- DROP TABLE permiso;

CREATE TABLE permiso
(
  id_permiso bigserial NOT NULL,
  nombre character varying(30),
  CONSTRAINT permiso_pk PRIMARY KEY (id_permiso)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE permiso OWNER TO postgres;

-- Table: producto

-- DROP TABLE producto;

CREATE TABLE producto
(
  id_producto bigserial NOT NULL,
  marca character varying(20),
  modelo character varying(20),
  categoria character varying(20),
  tipo character varying(20),
  precio numeric(10,2),
  path character varying(200),
  CONSTRAINT producto_pk PRIMARY KEY (id_producto)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE producto OWNER TO postgres;

-- Table: rol

-- DROP TABLE rol;

CREATE TABLE rol
(
  id_rol bigserial NOT NULL,
  nombre character varying(25),
  CONSTRAINT rol_pk PRIMARY KEY (id_rol)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE rol OWNER TO postgres;

-- Table: rol_articulo

-- DROP TABLE rol_articulo;

CREATE TABLE rol_articulo
(
  id_rol integer NOT NULL,
  id_articulo integer NOT NULL,
  CONSTRAINT rol_articulo_pk PRIMARY KEY (id_rol, id_articulo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE rol_articulo OWNER TO postgres;

-- Table: rol_permiso

-- DROP TABLE rol_permiso;

CREATE TABLE rol_permiso
(
  id_rol integer NOT NULL,
  id_permiso integer NOT NULL,
  CONSTRAINT rol_permiso_pk PRIMARY KEY (id_rol, id_permiso)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE rol_permiso OWNER TO postgres;

-- Table: rol_producto

-- DROP TABLE rol_producto;

CREATE TABLE rol_producto
(
  id_rol integer NOT NULL,
  id_producto integer NOT NULL,
  CONSTRAINT rol_producto_pk PRIMARY KEY (id_rol, id_producto)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE rol_producto OWNER TO postgres;

-- Table: rol_tema

-- DROP TABLE rol_tema;

CREATE TABLE rol_tema
(
  id_rol integer NOT NULL,
  id_tema integer NOT NULL,
  CONSTRAINT rol_tema_pk PRIMARY KEY (id_rol, id_tema)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE rol_tema OWNER TO postgres;

-- Table: rol_usuario

-- DROP TABLE rol_usuario;

CREATE TABLE rol_usuario
(
  id_rol integer NOT NULL,
  id_usuario integer NOT NULL,
  CONSTRAINT rol_usuario_pk PRIMARY KEY (id_rol, id_usuario)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE rol_usuario OWNER TO postgres;

-- Table: tema

-- DROP TABLE tema;

CREATE TABLE tema
(
  id_tema bigserial NOT NULL,
  nombre character varying(20),
  descripcion character varying(100),
  path character varying(50),
  CONSTRAINT tema_pk PRIMARY KEY (id_tema)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tema OWNER TO postgres;

-- Table: usuario

-- DROP TABLE usuario;

CREATE TABLE usuario
(
  id_usuario bigserial NOT NULL,
  nombre character varying(25),
  apellido character varying(25),
  nick character varying(25),
  clave character varying(10),
  CONSTRAINT usuario_pk PRIMARY KEY (id_usuario),
  CONSTRAINT usuario_unq UNIQUE (nick)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE usuario OWNER TO postgres;

INSERT INTO "usuario" (nombre,apellido,nick,clave) VALUES ('ESPOL','ESPOL','admin','esp01daw');
INSERT INTO "rol_usuario" (id_rol,id_usuario) VALUES ('1','1');