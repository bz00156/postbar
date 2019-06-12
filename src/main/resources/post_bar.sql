/*
SQLyog  v12.2.6 (32 bit)
MySQL - 5.5.27 : Database - post_bar
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`post_bar` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `post_bar`;

/*Table structure for table `pb_app` */

DROP TABLE IF EXISTS `pb_app`;

CREATE TABLE `pb_app` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `appID` varchar(32) DEFAULT NULL,
  `apiKey` varchar(32) DEFAULT NULL,
  `secretKey` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `pb_app` */

insert  into `pb_app`(`id`,`appID`,`apiKey`,`secretKey`) values 
(1,'15436824','6kkP0eWEu5rGss7IwW0DQr8s','jz0XbDKln7DO2Bep5c9rzDVtFgq3Xjq9');

/*Table structure for table `pb_audio` */

DROP TABLE IF EXISTS `pb_audio`;

CREATE TABLE `pb_audio` (
  `auSetUUID` varchar(32) NOT NULL,
  `userUUID` varchar(32) NOT NULL,
  `auSetSpd` int(1) NOT NULL DEFAULT '5' COMMENT '0-9',
  `auSetPit` int(1) NOT NULL DEFAULT '5' COMMENT '0-9',
  `auSetVol` int(2) NOT NULL DEFAULT '5' COMMENT '0-15',
  `auSetVoiPer` int(1) NOT NULL DEFAULT '0' COMMENT '0-4',
  PRIMARY KEY (`auSetUUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pb_audio` */

insert  into `pb_audio`(`auSetUUID`,`userUUID`,`auSetSpd`,`auSetPit`,`auSetVol`,`auSetVoiPer`) values 
('6bcef5d528b34deea4d680306e3ee43c','ad313b12f2c54b2b8a7df306f90243b2',5,5,5,0),
('d6aaea801ce04790953e6620f8ca1a91','e4f94bf452d9483aaa11972e6cc4d59d',5,5,5,1);

/*Table structure for table `pb_comment` */

DROP TABLE IF EXISTS `pb_comment`;

CREATE TABLE `pb_comment` (
  `cmUUID` varchar(32) NOT NULL,
  `postUUID` varchar(32) NOT NULL,
  `userUUID` varchar(32) NOT NULL,
  `cmText` text NOT NULL,
  `cmAudio` varchar(255) DEFAULT NULL,
  `cmTime` datetime NOT NULL,
  PRIMARY KEY (`cmUUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pb_comment` */

/*Table structure for table `pb_comment_praise` */

DROP TABLE IF EXISTS `pb_comment_praise`;

CREATE TABLE `pb_comment_praise` (
  `cmPrUUID` varchar(32) NOT NULL,
  `postUUID` varchar(32) DEFAULT NULL,
  `userUUID` varchar(32) DEFAULT NULL,
  `cmUUID` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`cmPrUUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pb_comment_praise` */

insert  into `pb_comment_praise`(`cmPrUUID`,`postUUID`,`userUUID`,`cmUUID`) values 
('42ebd9ae0ade4a489c4679abc72dea22','fd67cc79fbed41118115d063df7d5470','ad313b12f2c54b2b8a7df306f90243b2',NULL);

/*Table structure for table `pb_post` */

DROP TABLE IF EXISTS `pb_post`;

CREATE TABLE `pb_post` (
  `postUUID` varchar(32) NOT NULL,
  `userUUID` varchar(32) NOT NULL,
  `postTitle` varchar(16) NOT NULL,
  `postText` text NOT NULL,
  `postPageviews` int(11) unsigned NOT NULL DEFAULT '0',
  `postAudio` varchar(255) DEFAULT NULL,
  `postTime` datetime NOT NULL,
  PRIMARY KEY (`postUUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pb_post` */

/*Table structure for table `pb_post_praise` */

DROP TABLE IF EXISTS `pb_post_praise`;

CREATE TABLE `pb_post_praise` (
  `poPrUUID` varchar(32) NOT NULL,
  `postUUID` varchar(32) NOT NULL DEFAULT '00000000000000000000000000000000',
  `userUUID` varchar(32) NOT NULL DEFAULT '00000000000000000000000000000000',
  PRIMARY KEY (`poPrUUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pb_post_praise` */

/*Table structure for table `pb_register` */

DROP TABLE IF EXISTS `pb_register`;

CREATE TABLE `pb_register` (
  `regUUID` varchar(32) NOT NULL,
  `userUUID` varchar(32) NOT NULL,
  `regSex` varchar(1) NOT NULL,
  `regAge` int(3) NOT NULL,
  `regEmial` varchar(255) NOT NULL,
  `regPhoto` varchar(255) DEFAULT NULL,
  `regTime` datetime NOT NULL,
  PRIMARY KEY (`regUUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pb_register` */

insert  into `pb_register`(`regUUID`,`userUUID`,`regSex`,`regAge`,`regEmial`,`regPhoto`,`regTime`) values 
('3c51cf5926d447c4b965459a0639057c','e4f94bf452d9483aaa11972e6cc4d59d','0',37,'sjm@163.com','/postbar/headPhoto/default/default.jpg','2019-03-12 12:46:38'),
('9425cfc0384a430787daeecda1ab3beb','ad313b12f2c54b2b8a7df306f90243b2','1',40,'wangxiao@163.com','/postbar/headPhoto/default/default.jpg','2019-03-12 12:47:11');

/*Table structure for table `pb_user` */

DROP TABLE IF EXISTS `pb_user`;

CREATE TABLE `pb_user` (
  `userUUID` varchar(32) NOT NULL,
  `userName` varchar(20) NOT NULL,
  `password` varchar(32) NOT NULL,
  `loginTime` datetime DEFAULT NULL,
  `admin` varchar(1) DEFAULT '0',
  PRIMARY KEY (`userUUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pb_user` */

insert  into `pb_user`(`userUUID`,`userName`,`password`,`loginTime`,`admin`) values 
('ad313b12f2c54b2b8a7df306f90243b2','admin','96e79218965eb72c92a549dd5a330112','2019-06-12 15:48:42','1'),
('e4f94bf452d9483aaa11972e6cc4d59d','sjm','96e79218965eb72c92a549dd5a330112','2019-03-17 20:39:20','0');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
