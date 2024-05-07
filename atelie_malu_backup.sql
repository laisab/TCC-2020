-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: localhost    Database: atelie
-- ------------------------------------------------------
-- Server version	5.6.17

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
-- Table structure for table `caixa`
--

DROP TABLE IF EXISTS `caixa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `caixa` (
  `cai_cod_pgt` int(11) NOT NULL AUTO_INCREMENT,
  `cai_pgt` float NOT NULL,
  `cai_prod_pgt` varchar(255) NOT NULL,
  `cai_nome_cli` varchar(255) NOT NULL,
  `cai_data_pgt` date NOT NULL,
  PRIMARY KEY (`cai_cod_pgt`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `caixa`
--

LOCK TABLES `caixa` WRITE;
/*!40000 ALTER TABLE `caixa` DISABLE KEYS */;
/*!40000 ALTER TABLE `caixa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `cli_cod` int(11) NOT NULL AUTO_INCREMENT,
  `cli_nome` varchar(255) NOT NULL,
  `cli_tel` varchar(14) NOT NULL,
  `cli_email` varchar(100) DEFAULT NULL,
  `cli_cpf` varchar(11) NOT NULL,
  `cli_sexo` char(1) NOT NULL,
  `cli_rua` varchar(20) NOT NULL,
  `cli_num` varchar(4) NOT NULL,
  `cli_compl` varchar(20) DEFAULT NULL,
  `cli_bairro` varchar(50) NOT NULL,
  `cli_cidade` varchar(50) NOT NULL,
  `cli_cep` varchar(10) NOT NULL,
  PRIMARY KEY (`cli_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `encomenda`
--

DROP TABLE IF EXISTS `encomenda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `encomenda` (
  `enco_cod` int(11) NOT NULL AUTO_INCREMENT,
  `enco_prod` varchar(255) NOT NULL,
  `enco_qtde` int(11) NOT NULL,
  `enco_tamanho` float NOT NULL,
  `enco_valor` float NOT NULL,
  `enco_forma_pgt` varchar(30) NOT NULL,
  `enco_data_entrega` date NOT NULL,
  `cli_cod` int(11) NOT NULL,
  PRIMARY KEY (`enco_cod`),
  KEY `cli_cod` (`cli_cod`),
  CONSTRAINT `encomenda_ibfk_1` FOREIGN KEY (`cli_cod`) REFERENCES `cliente` (`cli_cod`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `encomenda`
--

LOCK TABLES `encomenda` WRITE;
/*!40000 ALTER TABLE `encomenda` DISABLE KEYS */;
/*!40000 ALTER TABLE `encomenda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estoque`
--

DROP TABLE IF EXISTS `estoque`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estoque` (
  `esto_cod_produto` int(11) NOT NULL AUTO_INCREMENT,
  `esto_ingrediente` varchar(255) DEFAULT NULL,
  `esto_embalagem` varchar(255) DEFAULT NULL,
  `esto_qtd_ingrediente` int(11) DEFAULT NULL,
  `esto_qtd_embalagem` int(11) DEFAULT NULL,
  PRIMARY KEY (`esto_cod_produto`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estoque`
--

LOCK TABLES `estoque` WRITE;
/*!40000 ALTER TABLE `estoque` DISABLE KEYS */;
INSERT INTO `estoque` VALUES (1,'Açúcar confeiteiro (g)',NULL,500,NULL),(2,'Açúcar cristal (g)',NULL,1000,NULL),(3,'Açúcar gelado (g)',NULL,500,NULL),(4,'Açúcar mascavo (g)',NULL,5000,NULL),(5,'Açúcar refinado (g)',NULL,20000,NULL),(6,'Amendoim triturado (g)',NULL,1000,NULL),(7,'Amido de milho (g)',NULL,5000,NULL),(8,'Aveia em flocos finos (g)',NULL,1000,NULL),(9,'Bicarbonato de sódio (g)',NULL,500,NULL),(10,'Biscoito Oreo (g)',NULL,180,NULL),(11,'Cacau em pó 100% (g)',NULL,20000,NULL),(12,'Canela em pó 100% (g)',NULL,500,NULL),(13,'Canudinho de waffer (g)',NULL,500,NULL),(14,'Casquinha de waffer - cone (g)',NULL,500,NULL),(15,'Chantilly (mL)',NULL,14000,NULL),(16,'Chocolate ao leite em barra (g)',NULL,10000,NULL),(17,'Chocolate branco em barra (g)',NULL,4000,NULL),(18,'Chocolate fracionado branco (g)',NULL,2000,NULL),(19,'Chocolate fracionado meio amargo (g)',NULL,4000,NULL),(20,'Chocolate Kit Kat (g)',NULL,830,NULL),(21,'Chocolate meio amargo em barra (g)',NULL,10000,NULL),(22,'Coco ralado queimado (g)',NULL,1000,NULL),(23,'Coco ralado seco (g)',NULL,5000,NULL),(24,'Conhaque Dreher (mL)',NULL,1000,NULL),(25,'Corante em gel amarelo (g)',NULL,15,NULL),(26,'Corante em gel azul (g)',NULL,15,NULL),(27,'Corante em gel laranja (g)',NULL,15,NULL),(28,'Corante em gel lilás (g)',NULL,15,NULL),(29,'Corante em gel preto (g)',NULL,15,NULL),(30,'Corante em gel rosa (g)',NULL,15,NULL),(31,'Corante em gel verde (g)',NULL,15,NULL),(32,'Corante em gel vermelho (g)',NULL,15,NULL),(33,'Corante para chocolate amarelo (g)',NULL,15,NULL),(34,'Corante para chocolate azul (g)',NULL,15,NULL),(35,'Corante para chocolate preto (g)',NULL,15,NULL),(36,'Corante para chocolate rosa (g)',NULL,15,NULL),(37,'Corante para chocolate verde (g)',NULL,15,NULL),(38,'Corante para chocolate vermelho (g)',NULL,15,NULL),(39,'Cravo em pó (g)',NULL,300,NULL),(40,'Creme de avelã - Nutella (g)',NULL,650,NULL),(41,'Creme de leite (g)',NULL,10000,NULL),(42,'Doce de leite (g)',NULL,10000,NULL),(43,'Emulsificante (g)',NULL,1000,NULL),(44,'Essência de banana (mL)',NULL,30,NULL),(45,'Essência de baunilha (mL)',NULL,1000,NULL),(46,'Essência de laranja (mL)',NULL,30,NULL),(47,'Essência de limão (mL)',NULL,30,NULL),(48,'Essência de mel (mL)',NULL,1000,NULL),(49,'Essência de rum (mL)',NULL,1000,NULL),(50,'Farinha de amendoim (g)',NULL,500,NULL),(51,'Farinha de trigo (g)',NULL,15000,NULL),(52,'Fermento químico em pó (g)',NULL,2000,NULL),(53,'Flocos de coco (g)',NULL,5000,NULL),(54,'Fubá mimoso (g)',NULL,1000,NULL),(55,'Gelatina incolor (g)',NULL,300,NULL),(56,'Granulado chocolate (g)',NULL,5000,NULL),(57,'Granulado colorido (g)',NULL,2000,NULL),(58,'Leite condensado (g)',NULL,43000,NULL),(59,'Leite em pó (g)',NULL,10000,NULL),(60,'Leite integral (mL)',NULL,10000,NULL),(61,'Manteiga (g)',NULL,500,NULL),(62,'Mel (mL)',NULL,2000,NULL),(63,'Milho de pipoca (g)',NULL,1500,NULL),(64,'Noz moscada em pó (g)',NULL,300,NULL),(65,'Óleo de soja (mL)',NULL,2000,NULL),(66,'Ovos (g)',NULL,10000,NULL),(67,'Paçoca de rolha (g)',NULL,800,NULL),(68,'Pasta americana branca (g)',NULL,3000,NULL),(69,'Pó brilhante para decoração dourado (g)',NULL,20,NULL),(70,'Pó brilhante para decoração perolado (g)',NULL,20,NULL),(71,'Pó brilhante para decoração rose gold (g)',NULL,20,NULL),(72,'Pó brilhante para decoração vermelho (g)',NULL,20,NULL),(73,'Sal (g)',NULL,1000,NULL),(74,NULL,'Bandeja de isopor',NULL,100),(75,NULL,'Caixa de papelão viagem 100 unidades',NULL,50),(76,NULL,'Caixa de papelão viagem 50 unidades',NULL,25),(77,NULL,'Embalagem de acetato para bolo 35MA',NULL,10),(78,NULL,'Embalagem de acetato para bolo 50MA',NULL,100),(79,NULL,'Embalagem de acetato para bolo 50MB',NULL,50),(80,NULL,'Fôrma de docinho quatro pétalas branca',NULL,5000),(81,NULL,'Fôrminha de papel N°5 para docinhos',NULL,500),(82,NULL,'Fundo renda para doce',NULL,1000),(83,NULL,'Placa de isopor para bolo 15 cm',NULL,25),(84,NULL,'Placa de isopor para bolo 25 cm',NULL,25),(85,NULL,'Placa de isopor para bolo 35 cm',NULL,25),(86,NULL,'Vela mágica',NULL,50);
/*!40000 ALTER TABLE `estoque` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historico_encomenda`
--

DROP TABLE IF EXISTS `historico_encomenda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historico_encomenda` (
  `hist_enco_cod` int(11) NOT NULL AUTO_INCREMENT,
  `hist_enco_prod` varchar(255) NOT NULL,
  `hist_enco_qtde` int(11) NOT NULL,
  `hist_enco_tamanho` float NOT NULL,
  `hist_enco_valor` float NOT NULL,
  `hist_enco_forma_pgt` varchar(30) NOT NULL,
  `hist_data_entrega` date NOT NULL,
  PRIMARY KEY (`hist_enco_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historico_encomenda`
--

LOCK TABLES `historico_encomenda` WRITE;
/*!40000 ALTER TABLE `historico_encomenda` DISABLE KEYS */;
/*!40000 ALTER TABLE `historico_encomenda` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-05 18:34:58
