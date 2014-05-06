CREATE DATABASE  IF NOT EXISTS `furlong` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `furlong`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: FUR008    Database: furlong
-- ------------------------------------------------------
-- Server version	5.1.49-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `facturacionsixt`
--

DROP TABLE IF EXISTS `facturacionsixt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `facturacionsixt` (
  `TELEFONO` varchar(30) NOT NULL,
  PRIMARY KEY (`TELEFONO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `historial_pc`
--

DROP TABLE IF EXISTS `historial_pc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historial_pc` (
  `ID_HISTORIAL` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `sistemaOperativo` varchar(45) DEFAULT NULL,
  `usuarioAsignado` varchar(45) DEFAULT NULL,
  `usuarioLogin` varchar(45) DEFAULT NULL,
  `esVisible` varchar(10) DEFAULT 'TRUE',
  `Office` varchar(45) DEFAULT NULL,
  `comentario` varchar(200) DEFAULT 'SIN COMENTARIO',
  `esnotebook` varchar(45) DEFAULT 'NO',
  `empresa` varchar(50) DEFAULT NULL,
  `locacion` varchar(50) DEFAULT NULL,
  `LAN_MAC` varchar(45) DEFAULT NULL,
  `WLAN_MAC` varchar(45) DEFAULT NULL,
  `FECHA_MODIF` date DEFAULT NULL,
  PRIMARY KEY (`ID_HISTORIAL`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Temporary table structure for view `verhandmovi`
--

DROP TABLE IF EXISTS `verhandmovi`;
/*!50001 DROP VIEW IF EXISTS `verhandmovi`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `verhandmovi` (
  `SERIAL` varchar(45),
  `CHIP` varchar(45),
  `NROTELEFONO` varchar(45),
  `MODELO` varchar(45),
  `SECTOR_ASIGNADO` varchar(45)
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `bajapc`
--

DROP TABLE IF EXISTS `bajapc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bajapc` (
  `nombre` varchar(45) NOT NULL,
  `sistemaOperativo` varchar(45) DEFAULT NULL,
  `usuarioAsignado` varchar(45) DEFAULT NULL,
  `usuarioLogin` varchar(45) DEFAULT NULL,
  `esVisible` varchar(10) DEFAULT 'TRUE',
  `Office` varchar(45) DEFAULT NULL,
  `comentario` varchar(200) DEFAULT 'SIN COMENTARIO',
  `esnotebook` varchar(45) DEFAULT 'NO',
  `motivo` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `chip`
--

DROP TABLE IF EXISTS `chip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chip` (
  `idchip` int(11) NOT NULL AUTO_INCREMENT,
  `marca` varchar(45) DEFAULT NULL,
  `serial` varchar(45) NOT NULL DEFAULT 'AVERIGUAR',
  `nrotelefono` varchar(45) DEFAULT NULL,
  `comentario` varchar(45) DEFAULT 'sin comentario',
  `estado` varchar(45) DEFAULT 'EN STOCK',
  `Problema` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idchip`),
  UNIQUE KEY `serial_UNIQUE` (`serial`)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `locacion`
--

DROP TABLE IF EXISTS `locacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `locacion` (
  `idlocacion` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `provincia` varchar(45) DEFAULT 'Bs As',
  PRIMARY KEY (`idlocacion`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `impresora`
--

DROP TABLE IF EXISTS `impresora`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `impresora` (
  `id` varchar(30) NOT NULL,
  `Marca` varchar(45) DEFAULT NULL,
  `Modelo` varchar(45) DEFAULT NULL,
  `ubicacion` varchar(45) DEFAULT 'ASIGNAR',
  `sector` varchar(45) DEFAULT 'ASIGNAR',
  `comentario` varchar(45) DEFAULT 'SIN  COMENTARIO',
  `ESTADO` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `bajachip`
--

DROP TABLE IF EXISTS `bajachip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bajachip` (
  `idbajachip` int(11) NOT NULL AUTO_INCREMENT,
  `marca` varchar(45) DEFAULT NULL,
  `serial` varchar(45) NOT NULL DEFAULT 'AVERIGUAR',
  `nrotelefono` varchar(45) DEFAULT NULL,
  `comentario` varchar(45) DEFAULT 'sin comentario',
  `estado` varchar(45) DEFAULT 'EN STOCK',
  `motivo` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idbajachip`),
  UNIQUE KEY `serial_UNIQUE` (`serial`),
  UNIQUE KEY `nrotelefono_UNIQUE` (`nrotelefono`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `bam`
--

DROP TABLE IF EXISTS `bam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bam` (
  `imei` varchar(30) NOT NULL,
  `marca` varchar(45) DEFAULT NULL,
  `modelo` varchar(45) DEFAULT NULL,
  `proveedor_predeterminado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`imei`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `modeloshandheld`
--

DROP TABLE IF EXISTS `modeloshandheld`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `modeloshandheld` (
  `idmodeloshandheld` int(11) NOT NULL AUTO_INCREMENT,
  `marca` varchar(45) DEFAULT NULL,
  `modelo` varchar(45) NOT NULL,
  PRIMARY KEY (`idmodeloshandheld`),
  UNIQUE KEY `modelo_UNIQUE` (`modelo`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `historialreparacion`
--

DROP TABLE IF EXISTS `historialreparacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historialreparacion` (
  `idHistorialReparacion` int(11) NOT NULL AUTO_INCREMENT,
  `Lugar` varchar(45) DEFAULT NULL,
  `Fecha_enviado` date DEFAULT NULL,
  `Fecha_recibido` date DEFAULT NULL,
  `Serial` varchar(45) DEFAULT NULL,
  `Tipo` varchar(45) DEFAULT NULL,
  `Modelo` varchar(45) DEFAULT NULL,
  `Descripcion` varchar(300) DEFAULT NULL,
  `Estado` varchar(45) DEFAULT NULL,
  `MailContacto` varchar(45) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idHistorialReparacion`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `modelocargadores`
--

DROP TABLE IF EXISTS `modelocargadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `modelocargadores` (
  `idmodelocargadores` int(11) NOT NULL AUTO_INCREMENT,
  `marca` varchar(45) DEFAULT NULL,
  `modelo` varchar(45) DEFAULT NULL,
  `corresponde_a` varchar(45) NOT NULL,
  `COMENTARIO` varchar(45) NOT NULL DEFAULT 'SIN_COMENTARIO',
  PRIMARY KEY (`idmodelocargadores`),
  UNIQUE KEY `modelo_UNIQUE` (`modelo`),
  KEY `modeloHand` (`corresponde_a`),
  CONSTRAINT `modeloHand` FOREIGN KEY (`corresponde_a`) REFERENCES `modeloshandheld` (`modelo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `chipprestado`
--

DROP TABLE IF EXISTS `chipprestado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chipprestado` (
  `idChipPrestado` varchar(45) NOT NULL,
  `Destinatario` varchar(45) DEFAULT NULL,
  `QuienPresto` varchar(45) DEFAULT NULL,
  `Comentario` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idChipPrestado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `bajabam`
--

DROP TABLE IF EXISTS `bajabam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bajabam` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `LOCACION` varchar(45) DEFAULT NULL,
  `SOLICITANTE` varchar(45) DEFAULT NULL,
  `CHIPNRO` varchar(45) DEFAULT NULL,
  `MARCACHIP` varchar(45) DEFAULT NULL,
  `IMEI` varchar(45) DEFAULT NULL,
  `PROVEEDOR PREDET` varchar(45) DEFAULT NULL,
  `motivo` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Temporary table structure for view `verbammovi`
--

DROP TABLE IF EXISTS `verbammovi`;
/*!50001 DROP VIEW IF EXISTS `verbammovi`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `verbammovi` (
  `LOCACION` varchar(45),
  `CHIPNRO` varchar(45),
  `solicitante` varchar(45),
  `nrotelefono` varchar(45)
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `reparacion`
--

DROP TABLE IF EXISTS `reparacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reparacion` (
  `IDREPA` int(11) NOT NULL AUTO_INCREMENT,
  `lugar` varchar(45) DEFAULT NULL,
  `fecha_enviado` date DEFAULT NULL,
  `serial_del_equipo` varchar(45) DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `modelo` varchar(45) DEFAULT NULL,
  `descripcion` varchar(300) DEFAULT NULL,
  `estado` varchar(200) DEFAULT NULL,
  `mail_de_contacto` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDREPA`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `furlong`.`A_HISTORIAL`
AFTER DELETE ON `furlong`.`reparacion`
FOR EACH ROW
INSERT INTO furlong.historialReparacion(lugar,fecha_enviado,fecha_recibido,serial,tipo,modelo,descripcion,estado,mailcontacto,telefono)
   VALUES (old.lugar,old.fecha_enviado,curdate(),old.serial_del_equipo,old.tipo,old.modelo,old.descripcion,old.estado,old.mail_de_contacto,old.telefono) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `historialmovhandheld`
--

DROP TABLE IF EXISTS `historialmovhandheld`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historialmovhandheld` (
  `idhandheld` int(11) NOT NULL AUTO_INCREMENT,
  `CHAPA_NRO` int(11) DEFAULT NULL,
  `serial` varchar(45) DEFAULT NULL,
  `chip` varchar(45) DEFAULT NULL,
  `chipmarca` varchar(45) DEFAULT NULL,
  `modelo` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `SECTOR_ASIGNADO` varchar(45) DEFAULT NULL,
  `COMENTARIO` varchar(45) DEFAULT NULL,
  `LUGAR_FISICO_REAL` varchar(45) DEFAULT NULL,
  `ES_DUAL` varchar(45) DEFAULT NULL,
  `GARANTIA_EXTENDIDA_HASTA` varchar(45) DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  PRIMARY KEY (`idhandheld`)
) ENGINE=InnoDB AUTO_INCREMENT=1809 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `handheld`
--

DROP TABLE IF EXISTS `handheld`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `handheld` (
  `idhandheld` int(11) NOT NULL AUTO_INCREMENT,
  `CHAPA_NRO` varchar(20) DEFAULT NULL,
  `serial` varchar(45) DEFAULT NULL,
  `chip` varchar(45) DEFAULT NULL,
  `ChipMarca` varchar(45) DEFAULT 'SIN CHIP',
  `modelo` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT 'OK',
  `SECTOR_ASIGNADO` varchar(45) NOT NULL DEFAULT 'SIN ASIGNAR',
  `COMENTARIO` varchar(45) DEFAULT 'S/C',
  `LUGAR_FISICO_REAL` varchar(45) DEFAULT 'EN SU CORRESPOND LOCACION',
  `esDUAL` varchar(45) DEFAULT 'CONSULTAR',
  `GARANTIA_EXTENDIDA_HASTA` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idhandheld`),
  UNIQUE KEY `serial_UNIQUE` (`serial`),
  UNIQUE KEY `chip_UNIQUE` (`chip`),
  UNIQUE KEY `CHAPA NRO_UNIQUE` (`CHAPA_NRO`),
  KEY `modelo` (`modelo`),
  KEY `chip` (`chip`),
  CONSTRAINT `chip` FOREIGN KEY (`chip`) REFERENCES `chip` (`serial`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `modelo` FOREIGN KEY (`modelo`) REFERENCES `modeloshandheld` (`modelo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`gestorit`@`%`*/ /*!50003 TRIGGER `furlong`.`UpdateHandHelds`
BEFORE UPDATE ON `furlong`.`handheld`
FOR EACH ROW
BEGIN
INSERT INTO `historialMovHandHeld` 
(`CHAPA_NRO`, `serial`, `chip`, `chipmarca`, `modelo`, `estado`, `SECTOR_ASIGNADO`, `COMENTARIO`, `LUGAR_FISICO_REAL`, `ES_DUAL`, `GARANTIA_EXTENDIDA_HASTA`,`FECHA`) 
VALUES (old.CHAPA_NRO, old.serial, old.chip, old.chipmarca, old.modelo, old.estado, old.SECTOR_ASIGNADO, old.COMENTARIO, old.LUGAR_FISICO_REAL, old.ESDUAL, old.GARANTIA_EXTENDIDA_HASTA,CURDATE());

END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Temporary table structure for view `loscocinados`
--

DROP TABLE IF EXISTS `loscocinados`;
/*!50001 DROP VIEW IF EXISTS `loscocinados`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `loscocinados` (
  `serial` varchar(45),
  `chapa_nro` varchar(20),
  `sector_asignado` varchar(45),
  `nrochip` varchar(45),
  `marca` varchar(45)
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `pc`
--

DROP TABLE IF EXISTS `pc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pc` (
  `nombre` varchar(45) NOT NULL,
  `sistemaOperativo` varchar(45) DEFAULT NULL,
  `usuarioAsignado` varchar(45) DEFAULT NULL,
  `usuarioLogin` varchar(45) DEFAULT NULL,
  `esVisible` varchar(10) DEFAULT 'TRUE',
  `Office` varchar(45) DEFAULT NULL,
  `comentario` varchar(200) DEFAULT 'SIN COMENTARIO',
  `esnotebook` varchar(45) DEFAULT 'NO',
  `empresa` varchar(50) DEFAULT NULL,
  `locacion` varchar(50) DEFAULT NULL,
  `LAN_MAC` varchar(45) DEFAULT NULL,
  `WLAN_MAC` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `furlong`.`a_historial_pc_update`
AFTER UPDATE ON `furlong`.`pc`
FOR EACH ROW
INSERT INTO `furlong`.`historial_pc` (`nombre`, `sistemaOperativo`, `usuarioAsignado`, `usuarioLogin`, `esVisible`, `Office`, `comentario`, `esnotebook`, `empresa`, `locacion`, `LAN_MAC`, `WLAN_MAC`,`FECHA_MODIF`)
VALUES (old.nombre,old.sistemaOperativo,old.usuarioAsignado,  old.usuarioLogin, old.esVisible, old.Office, old.comentario, old.esnotebook, old.empresa, old.locacion, old.LAN_MAC, old.WLAN_MAC,CURDATE()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `furlong`.`a_historial_pc`
AFTER DELETE ON `furlong`.`pc`
FOR EACH ROW
INSERT INTO `furlong`.`historial_pc` (`nombre`, `sistemaOperativo`, `usuarioAsignado`, `usuarioLogin`, `esVisible`, `Office`, `comentario`, `esnotebook`, `empresa`, `locacion`, `LAN_MAC`, `WLAN_MAC`,`FECHA_MODIF`)
VALUES (old.nombre,old.sistemaOperativo,old.usuarioAsignado,  old.usuarioLogin, old.esVisible, old.Office, old.comentario, old.esnotebook, old.empresa, old.locacion, old.LAN_MAC, old.WLAN_MAC,CURDATE()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `bajahandheld`
--

DROP TABLE IF EXISTS `bajahandheld`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bajahandheld` (
  `idbajahandheld` int(11) NOT NULL AUTO_INCREMENT,
  `CHAPA_NRO` int(11) DEFAULT '0',
  `serial` varchar(45) DEFAULT NULL,
  `chip` varchar(45) DEFAULT NULL,
  `ChipMarca` varchar(45) DEFAULT 'SIN CHIP',
  `modelo` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT 'OK',
  `SECTOR_ASIGNADO` varchar(45) NOT NULL DEFAULT 'SIN ASIGNAR',
  `COMENTARIO` varchar(45) DEFAULT 'S/C',
  `LUGAR_FISICO_REAL` varchar(45) DEFAULT 'EN SU CORRESPOND LOCACION',
  `ESDUAL` varchar(45) DEFAULT 'CONSULTAR',
  `GARANTIA_EXTENDIDA_HASTA` varchar(45) DEFAULT NULL,
  `motivo` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idbajahandheld`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cargadores`
--

DROP TABLE IF EXISTS `cargadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cargadores` (
  `idcargadores` int(11) NOT NULL AUTO_INCREMENT,
  `serial` varchar(45) DEFAULT NULL,
  `corresponde_a` varchar(45) NOT NULL,
  `estado` varchar(45) DEFAULT 'OK',
  `SECTOR_ASIGNADO` varchar(45) NOT NULL DEFAULT 'SIN_ASIGNAR',
  `COMENTARIO` varchar(45) DEFAULT 'S/C',
  PRIMARY KEY (`idcargadores`),
  UNIQUE KEY `serial_UNIQUE` (`serial`),
  KEY `corresponde_a` (`corresponde_a`),
  CONSTRAINT `corresponde_a` FOREIGN KEY (`corresponde_a`) REFERENCES `modeloshandheld` (`modelo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `bajaimpresora`
--

DROP TABLE IF EXISTS `bajaimpresora`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bajaimpresora` (
  `id` varchar(30) NOT NULL,
  `Marca` varchar(45) DEFAULT NULL,
  `Modelo` varchar(45) DEFAULT NULL,
  `ubicacion` varchar(45) DEFAULT 'ASIGNAR',
  `sector` varchar(45) DEFAULT 'ASIGNAR',
  `motivo` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `registrodebam`
--

DROP TABLE IF EXISTS `registrodebam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registrodebam` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `LOCACION` varchar(45) DEFAULT NULL,
  `SOLICITANTE` varchar(45) DEFAULT NULL,
  `CHIPNRO` varchar(45) DEFAULT NULL,
  `MARCACHIP` varchar(45) DEFAULT NULL,
  `IMEI` varchar(45) DEFAULT NULL,
  `PROVEEDOR_PREDET` varchar(45) DEFAULT NULL,
  `OBSERVACIONES` varchar(45) DEFAULT NULL,
  `FECHA_ENTREGADO` date DEFAULT NULL,
  `FECHA_DEVUELTO` date DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `IMEI_UNIQUE` (`IMEI`),
  UNIQUE KEY `CHIPNRO_UNIQUE` (`CHIPNRO`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Final view structure for view `verhandmovi`
--

/*!50001 DROP TABLE IF EXISTS `verhandmovi`*/;
/*!50001 DROP VIEW IF EXISTS `verhandmovi`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`gestorit`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `verhandmovi` AS select `h`.`serial` AS `SERIAL`,`h`.`chip` AS `CHIP`,`c`.`nrotelefono` AS `NROTELEFONO`,`h`.`modelo` AS `MODELO`,`h`.`SECTOR_ASIGNADO` AS `SECTOR_ASIGNADO` from (`handheld` `h` join `chip` `c`) where ((`c`.`marca` = 'MOVI') and (`h`.`chip` = `c`.`serial`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `verbammovi`
--

/*!50001 DROP TABLE IF EXISTS `verbammovi`*/;
/*!50001 DROP VIEW IF EXISTS `verbammovi`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`gestorit`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `verbammovi` AS select `r`.`LOCACION` AS `LOCACION`,`r`.`CHIPNRO` AS `CHIPNRO`,`r`.`SOLICITANTE` AS `solicitante`,`c`.`nrotelefono` AS `nrotelefono` from (`registrodebam` `r` join `chip` `c`) where ((`c`.`serial` = `r`.`CHIPNRO`) and (`c`.`marca` = 'MOVI')) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `loscocinados`
--

/*!50001 DROP TABLE IF EXISTS `loscocinados`*/;
/*!50001 DROP VIEW IF EXISTS `loscocinados`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`gestorit`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `loscocinados` AS select distinct `h`.`serial` AS `serial`,`h`.`CHAPA_NRO` AS `chapa_nro`,`h`.`SECTOR_ASIGNADO` AS `sector_asignado`,`chip`.`serial` AS `nrochip`,`chip`.`marca` AS `marca` from (`handheld` `h` join `chip`) where ((`chip`.`comentario` like '%coci)') and (`h`.`chip` = `chip`.`serial`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Dumping events for database 'furlong'
--

--
-- Dumping routines for database 'furlong'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-05-06 13:33:07
