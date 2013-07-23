CREATE DATABASE  IF NOT EXISTS `furlong` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `furlong`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: furlong
-- ------------------------------------------------------
-- Server version	5.5.19

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
-- Table structure for table `handheld`
--

DROP TABLE IF EXISTS `handheld`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `handheld` (
  `idhandheld` int(11) NOT NULL AUTO_INCREMENT,
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
  PRIMARY KEY (`idhandheld`),
  UNIQUE KEY `serial_UNIQUE` (`serial`),
  UNIQUE KEY `chip_UNIQUE` (`chip`),
  UNIQUE KEY `CHAPA NRO_UNIQUE` (`CHAPA_NRO`),
  KEY `modelo` (`modelo`),
  KEY `chip` (`chip`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=latin1;
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
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER InsertarBackupHanheld BEFORE DELETE ON furlong.handheld
  FOR EACH ROW BEGIN
    INSERT INTO `furlong`.`bajahandheld` 
    ( `CHAPA_NRO`, `serial`, `chip`, `ChipMarca`, `modelo`, 
    `estado`, `SECTOR_ASIGNADO`, `COMENTARIO`, `LUGAR_FISICO_REAL`, `ESDUAL`,
    `GARANTIA_EXTENDIDA_HASTA`) 
    VALUES (old.CHAPA_NRO, old.serial, old.chip, old.ChipMarca, old.modelo, 
    old.estado, old.SECTOR_ASIGNADO, old.COMENTARIO, old.LUGAR_FISICO_REAL, old.ESDUAL,
    old.GARANTIA_EXTENDIDA_HASTA);


  END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-07-22 21:37:49
