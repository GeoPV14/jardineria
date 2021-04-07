-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: jardineria
-- ------------------------------------------------------
-- Server version	5.7.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `oficinas`
--

DROP TABLE IF EXISTS `oficinas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `oficinas` (
  `CODIGOOFICINA` varchar(10) NOT NULL,
  `ciudad` varchar(255) NOT NULL,
  `codigopostal` varchar(255) NOT NULL,
  `lineadireccion1` varchar(255) NOT NULL,
  `lineadireccion2` varchar(255) DEFAULT NULL,
  `pais` varchar(255) NOT NULL,
  `region` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) NOT NULL,
  PRIMARY KEY (`CODIGOOFICINA`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oficinas`
--

LOCK TABLES `oficinas` WRITE;
/*!40000 ALTER TABLE `oficinas` DISABLE KEYS */;
INSERT INTO `oficinas` VALUES ('BCN-ES','Barcelona','08019','Avenida Diagonal, 38','3A escalera Derecha','España','Barcelona','+34 93 3561182'),('BOS-USA','Boston','02108','1550 Court Place','Suite 102','EEUU','MA','+1 215 837 0825'),('LON-UK','Londres','EC2N 1HN','52 Old Broad Street','Ground Floor','Inglaterra','EMEA','+44 20 78772041'),('MAD-ES','Madrid','28032','Bulevar Indalecio Prieto, 32',NULL,'España','Madrid','+34 91 7514487'),('PAR-FR','Paris','75017','29 Rue Jouffroy d\'abbans',NULL,'Francia','EMEA','+33 14 723 4404'),('SFC-USA','San Francisco','94080','100 Market Street','Suite 300','EEUU','CA','+1 650 219 4782'),('SYD-AU','Sydney','NSW 2010','5-11 Wentworth Avenue','Floor #2','Australia','APAC','+61 2 9264 2451'),('TAL-ES','Talavera de la Reina','45632','Francisco Aguirre, 32','5º piso (exterior)','España','Castilla-LaMancha','+34 925 867231'),('TOK-JP','Tokyo','102-8578','4-1 Kioicho',NULL,'Japón','Chiyoda-Ku','+81 33 224 5000');
/*!40000 ALTER TABLE `oficinas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-07 15:03:13
