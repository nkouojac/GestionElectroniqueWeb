/*
SQLyog Ultimate v11.5 (64 bit)
MySQL - 5.5.50 : Database - gestiondesdocuments
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`gestiondesdocuments` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `gestiondesdocuments`;

/*Table structure for table `document` */

DROP TABLE IF EXISTS `document`;

CREATE TABLE `document` (
  `idDocument` int(11) NOT NULL,
  `auteur` varchar(255) DEFAULT NULL,
  `dateRedaction` varchar(255) DEFAULT NULL,
  `destinataire` varchar(255) DEFAULT NULL,
  `nomDuDocument` varchar(255) DEFAULT NULL,
  `nombrePiecesJointes` int(11) NOT NULL,
  `objet` varchar(255) DEFAULT NULL,
  `refference` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idDocument`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `document` */

insert  into `document`(`idDocument`,`auteur`,`dateRedaction`,`destinataire`,`nomDuDocument`,`nombrePiecesJointes`,`objet`,`refference`) values (18,'Officier d\'Etat Civil','22/06/2014','Population','Acte de Décès',2,'Décès','D04'),(17,'Officier d\'etat civil','22/06/2014',NULL,'Acte de Décès',5,'Décès','D04'),(16,'Officier d\'Etat Civil','22/06/2014',NULL,'textament9',5,'Date de naissance8','D08'),(15,'Officier d\'Etat Civil','06/02/2019',NULL,'Acte de Naissance',2,'Date de naissance','D01'),(14,'Officier d\'Etat Civil','06/02/2019',NULL,'Acte de Naissance',2,'Date de naissance','D01'),(13,'Papa','22/02/2018',NULL,'textament',5,'succession','D04'),(12,'Papa','22/02/2018',NULL,'textament',5,'succession','D04'),(11,'MINCAF','22/06/2014',NULL,'Titre Foncier',6,'Propriété Foncière','D04');

/*Table structure for table `hibernate_sequence` */

DROP TABLE IF EXISTS `hibernate_sequence`;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `hibernate_sequence` */

insert  into `hibernate_sequence`(`next_val`) values (19);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
