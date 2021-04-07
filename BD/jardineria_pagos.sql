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
-- Table structure for table `pagos`
--

DROP TABLE IF EXISTS `pagos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagos` (
  `IDTRANSACCION` varchar(20) NOT NULL,
  `cantidad` double DEFAULT NULL,
  `fechapago` datetime DEFAULT NULL,
  `formapago` varchar(255) DEFAULT NULL,
  `codigocliente` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`IDTRANSACCION`),
  KEY `FKs88e30mo43wft2thffxbg2bxg` (`codigocliente`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagos`
--

LOCK TABLES `pagos` WRITE;
/*!40000 ALTER TABLE `pagos` DISABLE KEYS */;
INSERT INTO `pagos` VALUES ('ak-std-000001',2000,'2008-12-10 00:00:00','PayPal','1'),('ak-std-000002',2000,'2008-10-12 00:00:00','PayPal','1'),('ak-std-000003',5000,'2009-01-16 00:00:00','PayPal','3'),('ak-std-000004',5000,'2009-02-16 00:00:00','PayPal','3'),('ak-std-000005',926,'2009-02-19 00:00:00','PayPal','3'),('ak-std-000006',20000,'2007-01-08 00:00:00','PayPal','4'),('ak-std-000007',20000,'2007-01-08 00:00:00','PayPal','4'),('ak-std-000008',20000,'2007-01-08 00:00:00','PayPal','4'),('ak-std-000009',20000,'2007-01-08 00:00:00','PayPal','4'),('ak-std-000010',1849,'2007-01-08 00:00:00','PayPal','4'),('ak-std-000011',23794,'2006-01-18 00:00:00','Transferencia','5'),('ak-std-000012',2390,'2009-01-13 00:00:00','Cheque','7'),('ak-std-000013',929,'2009-01-06 00:00:00','PayPal','9'),('ak-std-000014',2246,'2008-08-04 00:00:00','PayPal','13'),('ak-std-000015',4160,'2008-07-15 00:00:00','PayPal','14'),('ak-std-000016',2081,'2009-01-15 00:00:00','PayPal','15'),('ak-std-000035',10000,'2009-02-15 00:00:00','PayPal','15'),('ak-std-000017',4399,'2009-02-16 00:00:00','PayPal','16'),('ak-std-000018',232,'2009-03-06 00:00:00','PayPal','19'),('ak-std-000019',272,'2009-03-26 00:00:00','PayPal','23'),('ak-std-000020',18846,'2008-03-18 00:00:00','PayPal','26'),('ak-std-000021',10972,'2009-02-08 00:00:00','PayPal','27'),('ak-std-000022',8489,'2009-01-13 00:00:00','PayPal','28'),('ak-std-000024',7863,'2009-01-16 00:00:00','PayPal','30'),('ak-std-000025',3321,'2007-06-10 00:00:00','PayPal','35'),('ak-std-000026',1171,'2006-05-26 00:00:00','PayPal','38');
/*!40000 ALTER TABLE `pagos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-07 15:03:24
