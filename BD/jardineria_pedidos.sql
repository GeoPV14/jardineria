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
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidos` (
  `codigopedido` varchar(3) NOT NULL,
  `comentarios` varchar(200) DEFAULT NULL,
  `estado` varchar(15) NOT NULL,
  `fechaentrega` datetime DEFAULT NULL,
  `fechaesperada` datetime NOT NULL,
  `fechapedido` datetime NOT NULL,
  `codigocliente` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codigopedido`),
  KEY `FKt9svuakawr00bpgvg6kxr0u9f` (`codigocliente`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
INSERT INTO `pedidos` VALUES ('1',NULL,'Entregado','2006-01-19 00:00:00','2006-01-19 00:00:00','2006-01-17 00:00:00','5'),('2',NULL,'Entregado','2007-10-26 00:00:00','2007-10-28 00:00:00','2007-10-23 00:00:00','5'),('3',NULL,'Rechazado',NULL,'2008-06-25 00:00:00','2008-06-20 00:00:00','5'),('4',NULL,'Pendiente',NULL,'2009-01-26 00:00:00','2009-01-20 00:00:00','5'),('8',NULL,'Entregado','2008-11-14 00:00:00','2008-11-14 00:00:00','2008-11-09 00:00:00','1'),('9',NULL,'Entregado','2008-12-28 00:00:00','2008-12-27 00:00:00','2008-12-22 00:00:00','1'),('10',NULL,'Pendiente',NULL,'2009-01-20 00:00:00','2009-01-15 00:00:00','3'),('11',NULL,'Pendiente',NULL,'2009-01-27 00:00:00','2009-01-20 00:00:00','1'),('12',NULL,'Pendiente',NULL,'2009-01-27 00:00:00','2009-01-22 00:00:00','1'),('13',NULL,'entregado','2009-01-15 00:00:00','2009-01-14 00:00:00','2009-01-12 00:00:00','7'),('14',NULL,'rechazado',NULL,'2009-01-02 00:00:00','2009-01-02 00:00:00','7'),('15',NULL,'entregado','2009-01-11 00:00:00','2009-01-12 00:00:00','2009-01-09 00:00:00','7'),('16',NULL,'entregado','2009-01-15 00:00:00','2009-01-07 00:00:00','2009-01-06 00:00:00','7'),('17',NULL,'entregado','2009-01-11 00:00:00','2009-01-09 00:00:00','2009-01-08 00:00:00','7'),('18',NULL,'entregado','2009-01-07 00:00:00','2009-01-06 00:00:00','2009-01-05 00:00:00','9'),('19',NULL,'pendiente',NULL,'2009-02-12 00:00:00','2009-01-18 00:00:00','9'),('20',NULL,'pendiente',NULL,'2009-02-15 00:00:00','2009-01-20 00:00:00','9'),('21',NULL,'rechazado','2009-01-09 00:00:00','2009-01-09 00:00:00','2009-01-09 00:00:00','9'),('22',NULL,'entregado','2009-01-13 00:00:00','2009-01-11 00:00:00','2009-01-11 00:00:00','9'),('23',NULL,'Rechazado',NULL,'2009-01-10 00:00:00','2008-12-30 00:00:00','5'),('24',NULL,'Entregado','2008-07-25 00:00:00','2008-07-31 00:00:00','2008-07-14 00:00:00','14'),('25',NULL,'Rechazado',NULL,'2009-02-08 00:00:00','2009-02-02 00:00:00','1'),('26',NULL,'Rechazado',NULL,'2009-02-12 00:00:00','2009-02-06 00:00:00','3'),('27',NULL,'Entregado',NULL,'2009-02-13 00:00:00','2009-02-07 00:00:00','3'),('28',NULL,'Entregado','2009-02-20 00:00:00','2009-02-17 00:00:00','2009-02-10 00:00:00','3'),('29',NULL,'Rechazado','2008-09-01 00:00:00','2008-09-01 00:00:00','2008-08-01 00:00:00','14'),('30',NULL,'Entregado','2008-08-31 00:00:00','2008-09-03 00:00:00','2008-08-03 00:00:00','13'),('31',NULL,'Rechazado','2008-10-04 00:00:00','2008-09-30 00:00:00','2008-09-04 00:00:00','13'),('32',NULL,'Entregado','2007-01-27 00:00:00','2007-01-19 00:00:00','2007-01-07 00:00:00','4'),('33',NULL,'Rechazado',NULL,'2007-05-28 00:00:00','2007-05-20 00:00:00','4'),('34',NULL,'Entregado','2008-06-28 00:00:00','2008-06-28 00:00:00','2007-06-20 00:00:00','4'),('35',NULL,'Rechazado',NULL,'2009-03-20 00:00:00','2008-03-10 00:00:00','4'),('36',NULL,'Entregado','2008-12-10 00:00:00','2008-12-15 00:00:00','2008-10-15 00:00:00','14'),('37',NULL,'Pendiente',NULL,'2009-11-13 00:00:00','2008-11-03 00:00:00','4'),('38',NULL,'Entregado','2009-03-07 00:00:00','2009-03-06 00:00:00','2009-03-05 00:00:00','19'),('39',NULL,'Pendiente','2009-03-09 00:00:00','2009-03-07 00:00:00','2009-03-06 00:00:00','19'),('40',NULL,'Rechazado','2009-03-13 00:00:00','2009-03-10 00:00:00','2009-03-09 00:00:00','19'),('41',NULL,'Entregado','2009-03-13 00:00:00','2009-03-13 00:00:00','2009-03-12 00:00:00','19'),('42',NULL,'Entregado','2009-03-27 00:00:00','2009-03-23 00:00:00','2009-03-22 00:00:00','19'),('43',NULL,'Pendiente','2009-03-28 00:00:00','2009-03-26 00:00:00','2009-03-25 00:00:00','23'),('44',NULL,'Pendiente','2009-03-30 00:00:00','2009-03-27 00:00:00','2009-03-26 00:00:00','23'),('45',NULL,'Entregado','2009-03-07 00:00:00','2009-03-04 00:00:00','2009-04-01 00:00:00','23'),('46',NULL,'Rechazado','2009-03-05 00:00:00','2009-03-04 00:00:00','2009-04-03 00:00:00','23'),('47',NULL,'Entregado','2009-03-17 00:00:00','2009-03-17 00:00:00','2009-04-15 00:00:00','23'),('48',NULL,'Entregado','2008-03-29 00:00:00','2008-03-30 00:00:00','2008-03-17 00:00:00','26'),('50',NULL,'Pendiente',NULL,'2008-08-09 00:00:00','2008-03-17 00:00:00','26'),('51',NULL,'Entregado','2008-10-14 00:00:00','2008-10-14 00:00:00','2008-10-01 00:00:00','26'),('52',NULL,'Pendiente',NULL,'2008-12-21 00:00:00','2008-12-07 00:00:00','26'),('53',NULL,'Entregado','2008-11-09 00:00:00','2008-11-15 00:00:00','2008-10-15 00:00:00','13'),('54',NULL,'Pendiente',NULL,'2009-02-11 00:00:00','2009-01-11 00:00:00','14'),('55',NULL,'Entregado','2009-01-11 00:00:00','2009-01-10 00:00:00','2008-12-10 00:00:00','14'),('56',NULL,'Rechazado',NULL,'2009-01-20 00:00:00','2008-12-19 00:00:00','13'),('57',NULL,'Pendiente',NULL,'2009-02-05 00:00:00','2009-01-05 00:00:00','13'),('58',NULL,'Entregado','2009-01-30 00:00:00','2009-01-31 00:00:00','2009-01-24 00:00:00','3'),('59',NULL,'Entregado','2008-11-14 00:00:00','2008-11-14 00:00:00','2008-11-09 00:00:00','1'),('60',NULL,'Entregado','2008-12-28 00:00:00','2008-12-27 00:00:00','2008-12-22 00:00:00','1'),('61',NULL,'Pendiente',NULL,'2009-01-20 00:00:00','2009-01-15 00:00:00','3'),('62',NULL,'Pendiente',NULL,'2009-01-27 00:00:00','2009-01-20 00:00:00','1'),('63',NULL,'Pendiente',NULL,'2009-01-27 00:00:00','2009-01-22 00:00:00','1'),('64',NULL,'Entregado','2009-01-30 00:00:00','2009-01-31 00:00:00','2009-01-24 00:00:00','1'),('65',NULL,'Rechazado',NULL,'2009-02-08 00:00:00','2009-02-02 00:00:00','1'),('66',NULL,'Rechazado',NULL,'2009-02-12 00:00:00','2009-02-06 00:00:00','3'),('67',NULL,'Entregado',NULL,'2009-02-13 00:00:00','2009-02-07 00:00:00','3'),('68',NULL,'Entregado','2009-02-20 00:00:00','2009-02-17 00:00:00','2009-02-10 00:00:00','3'),('74',NULL,'Rechazado',NULL,'2009-01-22 00:00:00','2009-01-14 00:00:00','15'),('75',NULL,'Entregado','2009-01-13 00:00:00','2009-01-13 00:00:00','2009-01-11 00:00:00','15'),('76',NULL,'Entregado','2008-11-23 00:00:00','2008-11-23 00:00:00','2008-11-15 00:00:00','15'),('77',NULL,'Pendiente',NULL,'2009-01-08 00:00:00','2009-01-03 00:00:00','15'),('78',NULL,'Entregado','2008-12-17 00:00:00','2008-12-17 00:00:00','2008-12-15 00:00:00','15'),('79',NULL,'Entregado','2009-01-13 00:00:00','2009-01-13 00:00:00','2009-01-12 00:00:00','28'),('80',NULL,'Pendiente',NULL,'2009-01-26 00:00:00','2009-01-25 00:00:00','28'),('81',NULL,'Rechazado',NULL,'2009-01-24 00:00:00','2009-01-18 00:00:00','28'),('82',NULL,'Entregado','2009-01-29 00:00:00','2009-01-29 00:00:00','2009-01-20 00:00:00','28'),('83',NULL,'Entregado',NULL,'2009-01-28 00:00:00','2009-01-24 00:00:00','28'),('89',NULL,'Entregado','2007-12-10 00:00:00','2007-12-13 00:00:00','2007-10-05 00:00:00','35'),('90',NULL,'Pendiente',NULL,'2008-02-17 00:00:00','2009-02-07 00:00:00','27'),('91',NULL,'Entregado','2009-03-27 00:00:00','2009-03-29 00:00:00','2009-03-18 00:00:00','27'),('92',NULL,'Entregado','2009-05-03 00:00:00','2009-04-30 00:00:00','2009-04-19 00:00:00','27'),('93',NULL,'Entregado','2009-05-17 00:00:00','2009-05-30 00:00:00','2009-05-03 00:00:00','27'),('94',NULL,'Pendiente',NULL,'2009-11-01 00:00:00','2009-10-18 00:00:00','27'),('95',NULL,'Entregado','2008-01-19 00:00:00','2008-01-19 00:00:00','2008-01-04 00:00:00','35'),('96',NULL,'Entregado','2008-04-13 00:00:00','2008-04-12 00:00:00','2008-03-20 00:00:00','35'),('97',NULL,'Entregado','2008-11-25 00:00:00','2008-11-25 00:00:00','2008-10-08 00:00:00','35'),('98',NULL,'Pediente',NULL,'2009-02-13 00:00:00','2009-01-08 00:00:00','35'),('99',NULL,'Pendiente',NULL,'2009-02-27 00:00:00','2009-02-15 00:00:00','16'),('100',NULL,'Entregado','2009-01-15 00:00:00','2009-01-15 00:00:00','2009-01-10 00:00:00','16'),('101',NULL,'Rechazado',NULL,'2009-03-27 00:00:00','2009-03-07 00:00:00','16'),('102',NULL,'Entregado','2009-01-08 00:00:00','2009-01-08 00:00:00','2008-12-28 00:00:00','16'),('103',NULL,'Pendiente','2009-01-24 00:00:00','2009-01-20 00:00:00','2009-01-15 00:00:00','30'),('104',NULL,'Entregado','2009-03-06 00:00:00','2009-03-06 00:00:00','2009-03-02 00:00:00','30'),('105',NULL,'Rechazado',NULL,'2009-02-20 00:00:00','2009-02-14 00:00:00','30'),('106',NULL,'Pendiente','2009-05-20 00:00:00','2009-05-15 00:00:00','2009-05-13 00:00:00','30'),('107',NULL,'Entregado','2009-04-10 00:00:00','2009-04-10 00:00:00','2009-04-06 00:00:00','30'),('108',NULL,'Entregado','2009-04-15 00:00:00','2009-04-15 00:00:00','2009-04-09 00:00:00','16'),('109',NULL,'Entregado','2006-07-28 00:00:00','2006-07-28 00:00:00','2006-05-25 00:00:00','38'),('110',NULL,'Entregado','2007-04-24 00:00:00','2007-04-24 00:00:00','2007-03-19 00:00:00','38'),('111',NULL,'Entregado','2008-03-30 00:00:00','2008-03-30 00:00:00','2008-03-05 00:00:00','36'),('112',NULL,'Pendiente','2009-05-07 00:00:00','2009-04-06 00:00:00','2009-03-05 00:00:00','36'),('113',NULL,'Rechazado','2009-01-09 00:00:00','2008-11-09 00:00:00','2008-10-28 00:00:00','36'),('114',NULL,'Entregado','2009-01-31 00:00:00','2009-01-29 00:00:00','2009-01-15 00:00:00','36'),('115',NULL,'Pendiente','2009-02-27 00:00:00','2009-01-26 00:00:00','2008-11-29 00:00:00','36'),('116',NULL,'Entregado','2008-08-01 00:00:00','2008-08-01 00:00:00','2008-06-28 00:00:00','38'),('117',NULL,'Rechazado',NULL,'2008-10-01 00:00:00','2008-08-25 00:00:00','38'),('118',NULL,'Pendiente',NULL,'2009-02-27 00:00:00','2009-02-15 00:00:00','16'),('119',NULL,'Entregado','2009-01-15 00:00:00','2009-01-15 00:00:00','2009-01-10 00:00:00','16'),('120',NULL,'Rechazado',NULL,'2009-03-27 00:00:00','2009-03-07 00:00:00','16'),('121',NULL,'Entregado','2009-01-08 00:00:00','2009-01-08 00:00:00','2008-12-28 00:00:00','16'),('122',NULL,'Entregado','2009-04-15 00:00:00','2009-04-15 00:00:00','2009-04-09 00:00:00','16'),('123',NULL,'Pendiente','2009-01-24 00:00:00','2009-01-20 00:00:00','2009-01-15 00:00:00','30'),('124',NULL,'Entregado','2009-03-06 00:00:00','2009-03-06 00:00:00','2009-03-02 00:00:00','30'),('125',NULL,'Rechazado',NULL,'2009-02-20 00:00:00','2009-02-14 00:00:00','30'),('126',NULL,'Pendiente','2009-05-20 00:00:00','2009-05-15 00:00:00','2009-05-13 00:00:00','30'),('127',NULL,'Entregado','2009-04-10 00:00:00','2009-04-10 00:00:00','2009-04-06 00:00:00','30'),('128',NULL,'Rechazado','2008-12-29 00:00:00','2008-12-10 00:00:00','2008-11-10 00:00:00','38');
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-07 15:03:18