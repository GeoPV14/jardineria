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
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `codigocliente` varchar(50) NOT NULL,
  `apellidocontacto` varchar(30) DEFAULT NULL,
  `ciudad` varchar(50) NOT NULL,
  `codigopostal` varchar(10) DEFAULT NULL,
  `fax` varchar(15) NOT NULL,
  `limitecredito` double DEFAULT NULL,
  `lineadireccion1` varchar(50) NOT NULL,
  `lineadireccion2` varchar(50) DEFAULT NULL,
  `nombrecliente` varchar(50) NOT NULL,
  `nombrecontacto` varchar(30) DEFAULT NULL,
  `pais` varchar(50) DEFAULT NULL,
  `region` varchar(50) DEFAULT NULL,
  `telefono` varchar(15) NOT NULL,
  `codigoempleadorepventas` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigocliente`),
  KEY `FK2pvegwoqh04huxjxgpmjbuhuv` (`codigoempleadorepventas`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES ('1','GoldFish','San Francisco','24006','5556901746',3000,'False Street 52 2 A',NULL,'DGPRODUCTIONS GARDEN','Daniel G','USA',NULL,'5556901745',19),('3','Wright','Miami','24010','5557410346',6000,'Wall-e Avenue',NULL,'Gardening Associates','Anne','USA','Miami','5557410345',19),('4','Flaute','New York','85495','5552323128',12000,'Oaks Avenue nº22',NULL,'Gerudo Valley','Link','USA',NULL,'5552323129',22),('5','Tendo','Miami','696969','55591233211',600000,'Null Street nº69',NULL,'Tendo Garden','Akane','USA',NULL,'55591233210',22),('6','Lasas','Fuenlabrada','28945','34914851312',154310,'C/Leganes 15',NULL,'Lasas S.A.','Antonio','Spain','Madrid','34916540145',8),('7','Bermejo','Madrid','28942','916549872',20000,'C/pintor segundo','Getafe','Beragua','Jose','España','Madrid','654987321',11),('8','Lopez','Madrid','28930','919535678',40000,'C/sinesio delgado','Madrid','Club Golf Puerta del hierro','Paco','España','Madrid','62456810',11),('9','Rengifo','Madrid','28947','916428956',32000,'C/majadahonda','Boadilla','Naturagua','Guillermo','España','Madrid','689234750',11),('10','Serrano','Madrid','28946','916421756',50000,'C/azores','Fuenlabrada','DaraDistribuciones','David','España','Madrid','675598001',11),('11','Tacaño','Madrid','28943','916689215',20000,'C/Lagañas','Fuenlabrada','Madrileña de riegos','Jose','España','Madrid','655983045',11),('12','Lasas','Fuenlabrada','28945','34914851312',154310,'C/Leganes 15',NULL,'Lasas S.A.','Antonio','Spain','Madrid','34916540145',8),('13','Camunas','San Lorenzo del Escorial','28145','34914871541',16481,'C/Virgenes 45','C/Princesas 2 1ºB','Camunas Jardines S.L.','Pedro','Spain','Madrid','34914873241',8),('14','Rodriguez','Madrid','28003','34912484764',321000,'C/Nueva York 74',NULL,'Dardena S.A.','Juan','Spain','Madrid','34912453217',8),('15','Villar','Madrid','28950','914538776',40000,'C/ Oña 34',NULL,'Jardin de Flores','Javier','España','Madrid','654865643',30),('16','Rodriguez','Fuenlabrada','28945','912458657',1500,'C/Leganes24',NULL,'Flores Marivi','Maria','España','Madrid','666555444',5),('17','Fernandez','Montornes del valles','24586','978453216',3500,'C/Luis Salquillo4',NULL,'Flowers, S.A','Beatriz','España','Barcelona','698754159',5),('18','Cruz','Madrid','28011','916548735',5050,'Plaza Magallón 15',NULL,'Naturajardin','Victoria','España','Madrid','612343529',30),('19','Martinez','Santa cruz de Tenerife','38297','912354475',30000,'C/Estancado',NULL,'Golf S.A.','Luis','España','Islas Canarias','916458762',12),('20','Suarez','Barcelona','12320','964493063',20000,'C/Letardo',NULL,'AYMERICH GOLF MANAGEMENT, SL','Mario','España','Cataluña','964493072',12),('21','Rodrigez','Canarias','35488','914489898',50000,'C/Roman 3',NULL,'Aloha','Cristian','España','Canarias','916485852',12),('22','Camacho',' Barcelona','12320','916493211',30000,'Avenida Tibidabo',NULL,'El Prat','Francisco','España','Cataluña','916882323',12),('23','Santillana','Sotogrande','11310','914825645',60000,'C/Paseo del Parque',NULL,'Sotogrande','Maria','España','Cadiz','915576622',12),('24','Gomez','Humanes','28970','916040875',7430,'C/Miguel Echegaray 54',NULL,'Vivero Humanes','Federico','España','Madrid','654987690',30),('25','Muñoz Mena','Fuenlabrada','28574','915483754',4500,'C/Callo 52',NULL,'Fuenla City','Tony','España','Madrid','675842139',5),('26','Sánchez','Madrid','29874','914477777',76000,'Polígono Industrial Maspalomas, Nº52','Móstoles','Jardines y Mansiones CACTUS SL','Eva María','España','Madrid','916877445',9),('27','San Martín','Madrid','37845','917897474',100500,'C/Francisco Arce, Nº44','Bustarviejo','Jardinerías Matías SL','Matías','España','Madrid','916544147',9),('28','Lopez','Getafe','28904','916549264',8040,'C/Mar Caspio 43',NULL,'Agrojardin','Benito','España','Madrid','675432926',30),('29','Sanchez','Humanes','28574','974315924',5500,'C/Ibiza 32',NULL,'Top Campo','Joseluis','España','Madrid','685746512',5),('30','Marquez','Fenlabrada','27584','912475843',7500,'C/Lima 1',NULL,'Jardineria Sara','Sara','España','Madrid','675124537',5),('31','Jimenez','Fuenlabrada','28945','916159116',3250,'C/Peru 78',NULL,'Campohermoso','Luis','España','Madrid','645925376',30),('32','Toulou','Paris','75010','(33)5120578961',10000,'6 place d Alleray 15Ã¨me',NULL,'france telecom','FraÃ§ois','France',NULL,'(33)5120578961',16),('33','Delacroux','Paris','75058','(33)0140205442',30000,'Quai du Louvre',NULL,'Musée du Louvre','Pierre','France',NULL,'(33)0140205050',16),('35','Jones','Sydney','2000','2 9283-1695',10000,'level 24, St. Martins Tower.-31 Market St.',NULL,'Tutifruti S.A','Jacob','Australia','Nueva Gales del Sur','2 9261-2433',31),('36','Romero','Madrid','29643','685249700',6000,'Avenida España',NULL,'FLORES S.L.','Antonio','España','Fuenlabrada','654352981',18),('37','Mcain','London','65930','9364875882',10000,'Lihgting Park',NULL,'THE MAGIC GARDEN','Richard','United Kingdom','London','926523468',18),('38','Smith','Sydney','2003','2 8005-7162',8000,'176 Cumberland Street The rocks',NULL,'El Jardin Viviente S.L','Justin','Australia','Nueva Gales del Sur','2 8005-7161',31);
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-07 15:03:20
