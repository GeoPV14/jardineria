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
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleados` (
  `codigoempleado` int(11) NOT NULL,
  `apellido1` varchar(50) NOT NULL,
  `apellido2` varchar(50) DEFAULT NULL,
  `codigooficina` varchar(10) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `extension` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `puesto` varchar(50) DEFAULT NULL,
  `codigo_jefe` int(11) DEFAULT NULL,
  `cod_oficina` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`codigoempleado`),
  KEY `FKigghxt48mvumy6aqfvmtjwxv3` (`codigo_jefe`),
  KEY `FK59dw79nwclfyw8wnpqp0qnxlw` (`cod_oficina`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES (1,'Magaña','Perez',NULL,'marcos@jardineria.es','3897','Marcos','Director General',NULL,'TAL-ES'),(2,'López','Martinez',NULL,'rlopez@jardineria.es','2899','Ruben','Subdirector Marketing',1,'TAL-ES'),(3,'Soria','Carrasco',NULL,'asoria@jardineria.es','2837','Alberto','Subdirector Ventas',2,'TAL-ES'),(4,'Solís','Jerez',NULL,'msolis@jardineria.es','2847','Maria','Secretaria',2,'TAL-ES'),(5,'Rosas','Marquez',NULL,'frosas@jardineria.es','2844','Felipe','Representante Ventas',3,'TAL-ES'),(6,'Ortiz','Serrano',NULL,'cortiz@jardineria.es','2845','Juan Carlos','Representante Ventas',3,'TAL-ES'),(7,'Soria','Jimenez',NULL,'csoria@jardineria.es','2444','Carlos','Director Oficina',3,'MAD-ES'),(8,'López','Murcia',NULL,'mlopez@jardineria.es','2442','Mariano','Representante Ventas',7,'MAD-ES'),(9,'Campoamor','Martín',NULL,'lcampoamor@jardineria.es','2442','Lucio','Representante Ventas',7,'MAD-ES'),(10,'Rodriguez','Huertas',NULL,'hrodriguez@jardineria.es','2444','Hilario','Representante Ventas',7,'MAD-ES'),(11,'Magaña','Perez',NULL,'manu@jardineria.es','2518','Emmanuel','Director Oficina',3,'BCN-ES'),(12,'Martinez','De la Osa',NULL,'jmmart@hotmail.es','2519','José Manuel','Representante Ventas',11,'BCN-ES'),(13,'Palma','Aceituno',NULL,'dpalma@jardineria.es','2519','David','Representante Ventas',11,'BCN-ES'),(14,'Palma','Aceituno',NULL,'opalma@jardineria.es','2519','Oscar','Representante Ventas',11,'BCN-ES'),(15,'Fignon',NULL,NULL,'ffignon@gardening.com','9981','Francois','Director Oficina',3,'PAR-FR'),(16,'Narvaez',NULL,NULL,'lnarvaez@gardening.com','9982','Lionel','Representante Ventas',15,'PAR-FR'),(17,'Serra',NULL,NULL,'lserra@gardening.com','9982','Laurent','Representante Ventas',15,'PAR-FR'),(18,'Bolton',NULL,NULL,'mbolton@gardening.com','7454','Michael','Director Oficina',3,'SFC-USA'),(19,'Sanchez','Lopez',NULL,'wssanchez@gardening.com','7454','Walter Santiago','Representante Ventas',18,'SFC-USA'),(20,'Washington',NULL,NULL,'hwashington@gardening.com','7565','Hilary','Director Oficina',3,'BOS-USA'),(21,'Paxton',NULL,NULL,'mpaxton@gardening.com','7565','Marcus','Representante Ventas',20,'BOS-USA'),(22,'Paxton',NULL,NULL,'lpaxton@gardening.com','7665','Lorena','Representante Ventas',20,'BOS-USA'),(23,'Nishikori',NULL,NULL,'nnishikori@gardening.com','8734','Nei','Director Oficina',3,'TOK-JP'),(24,'Riko',NULL,NULL,'nriko@gardening.com','8734','Narumi','Representante Ventas',23,'TOK-JP'),(25,'Nomura',NULL,NULL,'tnomura@gardening.com','8735','Takuma','Representante Ventas',23,'TOK-JP'),(26,'Johnson',NULL,NULL,'ajohnson@gardening.com','3321','Amy','Director Oficina',3,'LON-UK'),(27,'Westfalls',NULL,NULL,'lwestfalls@gardening.com','3322','Larry','Representante Ventas',26,'LON-UK'),(28,'Walton',NULL,NULL,'jwalton@gardening.com','3322','John','Representante Ventas',26,'LON-UK'),(29,'Fallmer',NULL,NULL,'kfalmer@gardening.com','3210','Kevin','Director Oficina',3,'SYD-AU'),(30,'Bellinelli',NULL,NULL,'jbellinelli@gardening.com','3211','Julian','Representante Ventas',29,'SYD-AU'),(31,'Kishi',NULL,NULL,'mkishi@gardening.com','3211','Mariko','Representante Ventas',29,'SYD-AU');
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-07 15:03:22
