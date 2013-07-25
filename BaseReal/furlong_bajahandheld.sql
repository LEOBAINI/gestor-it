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
-- Dumping data for table `bajahandheld`
--

LOCK TABLES `bajahandheld` WRITE;
/*!40000 ALTER TABLE `bajahandheld` DISABLE KEYS */;
/*!40000 ALTER TABLE `bajahandheld` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-07-25 16:46:13
