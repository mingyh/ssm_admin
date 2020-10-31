/*
SQLyog Professional v12.09 (64 bit)
MySQL - 5.5.56 : Database - ssm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ssm`;

/*Table structure for table `member` */

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) DEFAULT NULL,
  `nickName` varchar(25) DEFAULT NULL COMMENT '昵称',
  `phoneNum` varchar(25) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `member` */

insert  into `member`(`id`,`name`,`nickName`,`phoneNum`,`email`) values (1,'张三','小三','1388888888','zhangsan@QQ.com');

/*Table structure for table `order_traveller` */

DROP TABLE IF EXISTS `order_traveller`;

CREATE TABLE `order_traveller` (
  `orderId` varchar(32) DEFAULT NULL,
  `travellerId` varchar(32) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_traveller` */

insert  into `order_traveller`(`orderId`,`travellerId`) values ('1','1'),('2','2'),('3','1'),('4','1'),('5','2'),('6','1'),('7','2'),('8','1'),('9','2');

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `id` varchar(32) NOT NULL,
  `orderNum` varchar(20) NOT NULL,
  `orderTime` timestamp NULL DEFAULT NULL,
  `peopleCount` int(11) DEFAULT NULL,
  `orderDesc` varchar(500) DEFAULT NULL,
  `payType` int(11) DEFAULT NULL,
  `orderStatus` int(11) DEFAULT NULL,
  `productId` int(32) DEFAULT NULL,
  `memberId` int(32) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `fk_o_p` (`productId`) USING BTREE,
  KEY `fk_o_m` (`memberId`) USING BTREE,
  CONSTRAINT `fk_o_m` FOREIGN KEY (`memberId`) REFERENCES `member` (`id`),
  CONSTRAINT `fk_o_p` FOREIGN KEY (`productId`) REFERENCES `product` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `orders` */

insert  into `orders`(`id`,`orderNum`,`orderTime`,`peopleCount`,`orderDesc`,`payType`,`orderStatus`,`productId`,`memberId`) values ('1','12345','2018-02-03 00:00:00',2,'北京两日游',0,1,1,1),('10','12354','2020-08-12 10:55:10',2,'湖南三日游',1,1,1,1),('11','12355','2020-08-12 10:55:10',2,'山东五日游',1,1,1,1),('12','12356','2020-08-15 10:57:38',2,'长安文化游',0,1,1,1),('2','12346','2020-04-15 11:15:17',2,'大连三日游',0,2,1,1),('3','12347','2020-08-12 10:55:10',2,'云南双飞六日游',1,3,1,1),('4','12348','2020-08-12 10:55:10',2,'海南海岛游',1,4,1,1),('5','12349','2020-08-12 10:55:10',2,'四川生态游',1,2,1,1),('6','12350','2020-08-15 10:57:38',2,'山西文化游',0,1,1,1),('7','12351','2018-02-03 00:00:00',2,'大同两日游',0,3,1,1),('8','12352','2020-04-15 11:15:17',2,'魔都三日游',0,1,1,1),('9','12353','2020-08-12 10:55:10',2,'云贵六日游',1,1,1,1);

/*Table structure for table `permission` */

DROP TABLE IF EXISTS `permission`;

CREATE TABLE `permission` (
  `id` int(11) NOT NULL,
  `permissionName` varchar(50) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `permission` */

insert  into `permission`(`id`,`permissionName`,`url`) values (107,'角色管理','/role/findAll.do'),(1943,'资源权限管理','/permission/findAll.do'),(23527,'超级管理员','/user/findAll.do');

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `productNum` varchar(50) DEFAULT NULL,
  `productName` varchar(50) DEFAULT NULL,
  `cityName` varchar(50) DEFAULT NULL,
  `DepartureTime` date DEFAULT NULL,
  `productPrice` double(11,0) DEFAULT NULL,
  `productDesc` varchar(250) DEFAULT NULL,
  `productStatus` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `product` */

insert  into `product`(`id`,`productNum`,`productName`,`cityName`,`DepartureTime`,`productPrice`,`productDesc`,`productStatus`) values (1,'001','云南一日游','云南','2020-04-07',2100,'云南欢迎你',0),(2,'002','昆明三日游','昆明','2020-06-06',1800,'昆明欢迎你',1),(3,'003','上海一日游','上海','2020-05-08',3800,'魔都欢迎你',1),(4,'004','北京三日游','北京','2020-05-09',5800,'北京我来了',1),(5,'005','深圳七日游','昆明','2020-04-07',18000,'深圳欢迎你',1),(6,'006','昭通一日游','昭通','2020-05-08',1200,'昭通大山包',0),(7,'007','丽江一日游','昆明','2020-06-04',1500,'丽江古镇',0),(8,'aaa','aaaaa','aaaaa','2020-04-07',18000,'aaaa',1),(9,'ming-999','昆明一日游','昆明','2020-10-07',666,'昆明一日游',1);

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(11) NOT NULL,
  `roleName` varchar(255) DEFAULT NULL,
  `roleDesc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `role` */

insert  into `role`(`id`,`roleName`,`roleDesc`) values (1,'ADMIN','系统管理员'),(2,'USER','用户');

/*Table structure for table `role_permission` */

DROP TABLE IF EXISTS `role_permission`;

CREATE TABLE `role_permission` (
  `permissionId` int(11) NOT NULL,
  `roleId` int(11) NOT NULL,
  PRIMARY KEY (`permissionId`,`roleId`) USING BTREE,
  KEY `r_id` (`roleId`) USING BTREE,
  CONSTRAINT `role_permission_ibfk_1` FOREIGN KEY (`permissionId`) REFERENCES `permission` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `role_permission_ibfk_2` FOREIGN KEY (`roleId`) REFERENCES `role` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `role_permission` */

insert  into `role_permission`(`permissionId`,`roleId`) values (107,1),(1943,1),(23527,1),(107,2),(1943,2),(23527,2);

/*Table structure for table `syslog` */

DROP TABLE IF EXISTS `syslog`;

CREATE TABLE `syslog` (
  `id` varchar(70) NOT NULL,
  `visitTime` datetime DEFAULT NULL COMMENT '访问时间',
  `username` varchar(50) DEFAULT NULL COMMENT '操作者用户名',
  `ip` varchar(40) DEFAULT NULL COMMENT '访问ip',
  `url` varchar(40) DEFAULT NULL COMMENT '访问资源url',
  `executionTime` int(11) DEFAULT NULL COMMENT '执行时长',
  `method` varchar(255) DEFAULT NULL COMMENT '访问方法',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `syslog` */

insert  into `syslog`(`id`,`visitTime`,`username`,`ip`,`url`,`executionTime`,`method`) values ('0304be3b2b284c0895d6e3489305eb39','2020-10-06 11:43:47','admin','0:0:0:0:0:0:0:1','/product/findAll.do',14,'[类名] com.hz.controller.ProductController [方法名] findAll'),('10a7317d608d4619b9d0b6bf64b707d6','2020-10-06 13:51:15','admin','0:0:0:0:0:0:0:1','/user/findAll.do',6,'[类名] com.hz.controller.UserController [方法名] findAll'),('11e8e325f5f84a5ebcb1e65c98b22c5a','2020-10-06 13:51:29','admin','0:0:0:0:0:0:0:1','/user/findAll.do',9,'[类名] com.hz.controller.UserController [方法名] findAll'),('1945daa5941849ada68f3d6cb4031510','2020-04-16 16:57:45','admin','0:0:0:0:0:0:0:1','/user/findAll.do',22,'[类名] com.hz.controller.UserController [方法名] findAll'),('19a7e04ea227409e918f21eb7522bffb','2020-10-06 11:42:13','tom','0:0:0:0:0:0:0:1','/orders/findAll.do',348,'[类名] com.hz.controller.OrdersController [方法名] findAll'),('2477c316ae634530a8d01ae70fb8d2a7','2020-10-06 14:43:43','admin','0:0:0:0:0:0:0:1','/role/findAll.do',86,'[类名] com.hz.controller.RoleController [方法名] findAll'),('2e1b6066d1e64d2f977e8f1ac0c7f8ff','2020-10-06 13:27:54','admin','0:0:0:0:0:0:0:1','/user/findAll.do',5,'[类名] com.hz.controller.UserController [方法名] findAll'),('3004d6b5db9949ae9e5d7c3a61e35a31','2020-04-22 03:34:22','admin','0:0:0:0:0:0:0:1','/orders/findAll.do',7,'[类名] com.hz.controller.OrdersController [方法名] findAll'),('343a0464dfba45e4a91995d8f53196a4','2020-10-06 11:43:43','admin','0:0:0:0:0:0:0:1','/orders/findAll.do',81,'[类名] com.hz.controller.OrdersController [方法名] findAll'),('3b3b8e5d06c7489f8b7d90db5b6af751','2020-10-06 13:27:40','admin','0:0:0:0:0:0:0:1','/user/findAll.do',10,'[类名] com.hz.controller.UserController [方法名] findAll'),('406463b2bdb94f04a4acde0c3456acb7','2020-10-06 13:51:07','admin','0:0:0:0:0:0:0:1','/user/findAll.do',13,'[类名] com.hz.controller.UserController [方法名] findAll'),('42165f9cbd1a473fa148f25b18a63017','2020-10-31 06:59:59','admin','0:0:0:0:0:0:0:1','/orders/findAll.do',1607,'[类名] com.hz.controller.OrdersController [方法名] findAll'),('584091f60f08412898d888b902f4528a','2020-10-06 13:27:43','admin','0:0:0:0:0:0:0:1','/user/findAll.do',78,'[类名] com.hz.controller.UserController [方法名] findAll'),('5c5f1a0fdcd24c7bbfee6502fa166c65','2020-04-22 03:20:43','admin','0:0:0:0:0:0:0:1','/user/findAll.do',23,'[类名] com.hz.controller.UserController [方法名] findAll'),('761cd19c7e6c47158214e91c662d5bc5','2020-10-06 13:27:36','admin','0:0:0:0:0:0:0:1','/user/findAll.do',56,'[类名] com.hz.controller.UserController [方法名] findAll'),('7e11837e2eb34d3599f3810ff16bdca1','2020-10-06 13:10:09','admin','0:0:0:0:0:0:0:1','/user/findAll.do',9,'[类名] com.hz.controller.UserController [方法名] findAll'),('85f572408c8c4700832319c456cb0ba2','2020-10-06 13:51:18','admin','0:0:0:0:0:0:0:1','/user/findAll.do',4,'[类名] com.hz.controller.UserController [方法名] findAll'),('956039adab8f4edc9e3fcab8b6c7666f','2020-10-06 11:43:37','admin','0:0:0:0:0:0:0:1','/user/findAll.do',34,'[类名] com.hz.controller.UserController [方法名] findAll'),('a2184cdd4c3f417d9d211d3d28a04d4b','2020-04-22 03:48:32','admin','0:0:0:0:0:0:0:1','/orders/findAll.do',23,'[类名] com.hz.controller.OrdersController [方法名] findAll'),('b26b426be70547f8bba6ff2214ad03f4','2020-10-06 11:42:03','tom','0:0:0:0:0:0:0:1','/product/findAll.do',145,'[类名] com.hz.controller.ProductController [方法名] findAll'),('c2de9b9ea63a4dd5a2ec32848610f50a','2020-10-06 13:51:23','admin','0:0:0:0:0:0:0:1','/user/findAll.do',5,'[类名] com.hz.controller.UserController [方法名] findAll'),('c8878c06e529408696e40c11792519fb','2020-10-06 13:27:21','admin','0:0:0:0:0:0:0:1','/user/findAll.do',302,'[类名] com.hz.controller.UserController [方法名] findAll'),('d8aa4a5086d040a4a54c6a5550ff9756','2020-10-06 13:27:21','admin','0:0:0:0:0:0:0:1','/user/findAll.do',13,'[类名] com.hz.controller.UserController [方法名] findAll'),('da96c3577bab4e26949aadaa19ca75b3','2020-04-22 03:34:15','admin','0:0:0:0:0:0:0:1','/orders/findAll.do',22,'[类名] com.hz.controller.OrdersController [方法名] findAll'),('e46c2915c47f413c9b4b7d3b1beee561','2020-04-22 03:20:54','admin','0:0:0:0:0:0:0:1','/product/findAll.do',16,'[类名] com.hz.controller.ProductController [方法名] findAll'),('f40a48d2613a436e842595390bc028ba','2020-10-31 06:59:54','admin','0:0:0:0:0:0:0:1','/product/findAll.do',54,'[类名] com.hz.controller.ProductController [方法名] findAll'),('fbdd9303270e4e16921ca938652ac1ca','2020-04-22 03:20:57','admin','0:0:0:0:0:0:0:1','/orders/findAll.do',48,'[类名] com.hz.controller.OrdersController [方法名] findAll');

/*Table structure for table `traveller` */

DROP TABLE IF EXISTS `traveller`;

CREATE TABLE `traveller` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) DEFAULT NULL,
  `sex` varchar(8) DEFAULT NULL,
  `phoneNum` varchar(20) DEFAULT NULL,
  `credentialsType` int(11) DEFAULT NULL COMMENT '证件类型 0身份证 1护照 2军官证',
  `credentialsNum` varchar(50) DEFAULT NULL COMMENT '证件号码',
  `travellerType` int(11) DEFAULT NULL COMMENT '旅客类型(人群) 0 成人 1 儿童',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `traveller` */

insert  into `traveller`(`id`,`name`,`sex`,`phoneNum`,`credentialsType`,`credentialsNum`,`travellerType`) values (1,'赵龙','男','13888888888',0,'123456789009876543',0);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) NOT NULL,
  `username` varchar(25) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phoneNum` varchar(20) DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT '状态0 未开启 1 开启',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=20615 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `users` */

insert  into `users`(`id`,`email`,`username`,`password`,`phoneNum`,`status`) values (1,'a@qq.com','admin','$2a$10$GnUhdxLkvsqIOA5lVX/ksOoXXIRoPszSdULcShHsUXITrG/DtzhWO','13888888888',1),(2,'adfa','tom','$2a$10$GnUhdxLkvsqIOA5lVX/ksOoXXIRoPszSdULcShHsUXITrG/DtzhWO','546514684',1),(3,'1847481@QQ.com','wBekvam','$2a$10$Ce8LB3jdYDZ2f6HB281zA.4eC7v6ziJdK8MMWg0Yu8ETMg5ToMpIe','15752250992',1),(4,'11948939@qq.com','等灯','$2a$10$Ce8LB3jdYDZ2f6HB281zA.4eC7v6ziJdK8MMWg0Yu8ETMg5ToMpIe','15752250992',0),(5,'a@qq.com','user','$2a$10$i7QFXNog.2TT3pCrekha1uJsw54fcBPqVK1ncWtW6HxaGkiMFCBw.','54154151',1),(6,'a@qq.com','赵龙','$2a$10$Ce8LB3jdYDZ2f6HB281zA.4eC7v6ziJdK8MMWg0Yu8ETMg5ToMpIe','13888888888',1),(6862,'11919@qq.com','hz','$2a$10$mEKoiccVd9lmBJh7czLgy.3bIzaGLiUmn1nsQ65mEvSlI7G3K.1J6','15752250992',1),(19306,'741998@qq.com','dandan','$2a$10$NrabWfEJ3q30O5HPn3Yo7eyZFmZYwtzZmVeAmmEuWENRqZaGHVmVG','18888888888',1),(20614,'zhixing1010@163.com','root','$2a$10$xmIe31HlXwR5xLKAzzEnju.CDiYZ.qFuCaO832.fFQB0mWYNc/xya','15752250992',0);

/*Table structure for table `users_role` */

DROP TABLE IF EXISTS `users_role`;

CREATE TABLE `users_role` (
  `userId` int(11) NOT NULL,
  `roleId` int(11) NOT NULL,
  PRIMARY KEY (`userId`,`roleId`) USING BTREE,
  KEY `roleId` (`roleId`) USING BTREE,
  CONSTRAINT `users_role_ibfk_1` FOREIGN KEY (`roleId`) REFERENCES `role` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `users_role_ibfk_2` FOREIGN KEY (`userId`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `users_role` */

insert  into `users_role`(`userId`,`roleId`) values (1,1),(5,1),(6,1),(6862,1),(1,2),(2,2),(3,2),(4,2),(5,2),(6,2),(6862,2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
