-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssm6w3g2
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssm6w3g2/upload/1615540809690.jpg'),(2,'picture2','http://localhost:8080/ssm6w3g2/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssm6w3g2/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dangkepeixunjieguo`
--

DROP TABLE IF EXISTS `dangkepeixunjieguo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dangkepeixunjieguo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `fujian` varchar(200) DEFAULT NULL COMMENT '附件',
  `neirong` longtext COMMENT '内容',
  `tianjiashijian` datetime DEFAULT NULL COMMENT '添加时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615540577624 DEFAULT CHARSET=utf8 COMMENT='党课培训结果';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dangkepeixunjieguo`
--

LOCK TABLES `dangkepeixunjieguo` WRITE;
/*!40000 ALTER TABLE `dangkepeixunjieguo` DISABLE KEYS */;
INSERT INTO `dangkepeixunjieguo` VALUES (51,'2021-03-12 09:06:13','账号1','姓名1','标题1','','内容1','2021-03-12 17:06:13',1),(52,'2021-03-12 09:06:13','账号2','姓名2','标题2','','内容2','2021-03-12 17:06:13',2),(53,'2021-03-12 09:06:13','账号3','姓名3','标题3','','内容3','2021-03-12 17:06:13',3),(54,'2021-03-12 09:06:13','账号4','姓名4','标题4','','内容4','2021-03-12 17:06:13',4),(55,'2021-03-12 09:06:13','账号5','姓名5','标题5','','内容5','2021-03-12 17:06:13',5),(56,'2021-03-12 09:06:13','账号6','姓名6','标题6','','内容6','2021-03-12 17:06:13',6),(1615540577623,'2021-03-12 09:16:17','账号1','姓名1','111','http://localhost:8080/ssm6w3g2/upload/1615540572462.jpg','<p>11112</p>','2021-03-12 17:16:15',1);
/*!40000 ALTER TABLE `dangkepeixunjieguo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dangyuantanhuajilu`
--

DROP TABLE IF EXISTS `dangyuantanhuajilu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dangyuantanhuajilu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `fujian` varchar(200) DEFAULT NULL COMMENT '附件',
  `neirong` longtext COMMENT '内容',
  `tianjiashijian` datetime DEFAULT NULL COMMENT '添加时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615540565063 DEFAULT CHARSET=utf8 COMMENT='党员谈话记录';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dangyuantanhuajilu`
--

LOCK TABLES `dangyuantanhuajilu` WRITE;
/*!40000 ALTER TABLE `dangyuantanhuajilu` DISABLE KEYS */;
INSERT INTO `dangyuantanhuajilu` VALUES (41,'2021-03-12 09:06:13','账号1','姓名1','标题1','','内容1','2021-03-12 17:06:13',1),(42,'2021-03-12 09:06:13','账号2','姓名2','标题2','','内容2','2021-03-12 17:06:13',2),(43,'2021-03-12 09:06:13','账号3','姓名3','标题3','','内容3','2021-03-12 17:06:13',3),(44,'2021-03-12 09:06:13','账号4','姓名4','标题4','','内容4','2021-03-12 17:06:13',4),(45,'2021-03-12 09:06:13','账号5','姓名5','标题5','','内容5','2021-03-12 17:06:13',5),(46,'2021-03-12 09:06:13','账号6','姓名6','标题6','','内容6','2021-03-12 17:06:13',6),(1615540565062,'2021-03-12 09:16:04','账号1','姓名1','111','http://localhost:8080/ssm6w3g2/upload/1615540559378.jpg','<p>1112</p>','2021-03-12 17:16:01',1);
/*!40000 ALTER TABLE `dangyuantanhuajilu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dangyuanxinxi`
--

DROP TABLE IF EXISTS `dangyuanxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dangyuanxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shenfenleixing` varchar(200) DEFAULT NULL COMMENT '身份类型',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `tijiaoriqi` date DEFAULT NULL COMMENT '提交日期',
  `beizhu` longtext COMMENT '备注',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='党员信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dangyuanxinxi`
--

LOCK TABLES `dangyuanxinxi` WRITE;
/*!40000 ALTER TABLE `dangyuanxinxi` DISABLE KEYS */;
INSERT INTO `dangyuanxinxi` VALUES (21,'2021-03-12 09:06:13','账号1','姓名1','积极分子','男','http://localhost:8080/ssm6w3g2/upload/dangyuanxinxi_zhaopian1.jpg',1,'2021-03-12','备注1',1),(22,'2021-03-12 09:06:13','账号2','姓名2','积极分子','男','http://localhost:8080/ssm6w3g2/upload/dangyuanxinxi_zhaopian2.jpg',2,'2021-03-12','备注2',2),(23,'2021-03-12 09:06:13','账号3','姓名3','积极分子','男','http://localhost:8080/ssm6w3g2/upload/dangyuanxinxi_zhaopian3.jpg',3,'2021-03-12','备注3',3),(24,'2021-03-12 09:06:13','账号4','姓名4','积极分子','男','http://localhost:8080/ssm6w3g2/upload/dangyuanxinxi_zhaopian4.jpg',4,'2021-03-12','备注4',4),(25,'2021-03-12 09:06:13','账号5','姓名5','积极分子','男','http://localhost:8080/ssm6w3g2/upload/dangyuanxinxi_zhaopian5.jpg',5,'2021-03-12','备注5',5),(26,'2021-03-12 09:06:13','账号6','姓名6','积极分子','男','http://localhost:8080/ssm6w3g2/upload/dangyuanxinxi_zhaopian6.jpg',6,'2021-03-12','备注6',6);
/*!40000 ALTER TABLE `dangyuanxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huodongzhanshi`
--

DROP TABLE IF EXISTS `huodongzhanshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huodongzhanshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huodongbiaoti` varchar(200) DEFAULT NULL COMMENT '活动标题',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `huodongneirong` longtext COMMENT '活动内容',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615540649015 DEFAULT CHARSET=utf8 COMMENT='活动展示';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huodongzhanshi`
--

LOCK TABLES `huodongzhanshi` WRITE;
/*!40000 ALTER TABLE `huodongzhanshi` DISABLE KEYS */;
INSERT INTO `huodongzhanshi` VALUES (71,'2021-03-12 09:06:13','活动标题1','2021-03-12 17:06:13','活动内容1','http://localhost:8080/ssm6w3g2/upload/huodongzhanshi_fengmian1.jpg'),(72,'2021-03-12 09:06:13','活动标题2','2021-03-12 17:06:13','活动内容2','http://localhost:8080/ssm6w3g2/upload/huodongzhanshi_fengmian2.jpg'),(73,'2021-03-12 09:06:13','活动标题3','2021-03-12 17:06:13','活动内容3','http://localhost:8080/ssm6w3g2/upload/huodongzhanshi_fengmian3.jpg'),(74,'2021-03-12 09:06:13','活动标题4','2021-03-12 17:06:13','活动内容4','http://localhost:8080/ssm6w3g2/upload/huodongzhanshi_fengmian4.jpg'),(75,'2021-03-12 09:06:13','活动标题5','2021-03-12 17:06:13','活动内容5','http://localhost:8080/ssm6w3g2/upload/huodongzhanshi_fengmian5.jpg'),(76,'2021-03-12 09:06:13','活动标题6','2021-03-12 17:06:13','活动内容6','http://localhost:8080/ssm6w3g2/upload/huodongzhanshi_fengmian6.jpg'),(1615540649014,'2021-03-12 09:17:28','11','2021-03-12 17:17:20','<p>1111<img src=\"http://localhost:8080/ssm6w3g2/upload/1615540647244.jpg\"></p>','http://localhost:8080/ssm6w3g2/upload/1615540642860.jpg');
/*!40000 ALTER TABLE `huodongzhanshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `minzhutoupiao`
--

DROP TABLE IF EXISTS `minzhutoupiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `minzhutoupiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shenqingliyou` varchar(200) DEFAULT NULL COMMENT '申请理由',
  `piaoshu` int(11) NOT NULL COMMENT '票数',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `reversetime` datetime DEFAULT NULL COMMENT '倒计结束时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615540773497 DEFAULT CHARSET=utf8 COMMENT='民主投票';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `minzhutoupiao`
--

LOCK TABLES `minzhutoupiao` WRITE;
/*!40000 ALTER TABLE `minzhutoupiao` DISABLE KEYS */;
INSERT INTO `minzhutoupiao` VALUES (1615540746721,'2021-03-12 09:19:05','账号1','姓名1','申请理由1',1,'2021-03-12 17:18:57','2021-03-12 17:19:02'),(1615540762505,'2021-03-12 09:19:21','账号2','姓名2','申请理由2',0,'2021-03-12 17:19:13','2021-03-13 01:00:00'),(1615540773496,'2021-03-12 09:19:32','账号3','姓名3','申请理由3',0,'2021-03-12 17:19:30','2021-03-12 17:19:32');
/*!40000 ALTER TABLE `minzhutoupiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pingyoushenqing`
--

DROP TABLE IF EXISTS `pingyoushenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pingyoushenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shenqingwenjian` varchar(200) DEFAULT NULL COMMENT '申请文件',
  `shenqingliyou` longtext COMMENT '申请理由',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615540945686 DEFAULT CHARSET=utf8 COMMENT='评优申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pingyoushenqing`
--

LOCK TABLES `pingyoushenqing` WRITE;
/*!40000 ALTER TABLE `pingyoushenqing` DISABLE KEYS */;
INSERT INTO `pingyoushenqing` VALUES (92,'2021-03-12 09:06:13','账号2','姓名2','','申请理由2','是','',2),(93,'2021-03-12 09:06:13','账号3','姓名3','','申请理由3','是','',3),(94,'2021-03-12 09:06:13','账号4','姓名4','','申请理由4','是','',4),(95,'2021-03-12 09:06:13','账号5','姓名5','','申请理由5','是','',5),(96,'2021-03-12 09:06:13','账号6','姓名6','','申请理由6','是','',6),(1615540945685,'2021-03-12 09:22:25','账号1','姓名1','http://localhost:8080/ssm6w3g2/upload/1615540943565.jpg','1111','是','1111',11);
/*!40000 ALTER TABLE `pingyoushenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','zf4a06pt2tzk5exsuukr6ib3z8del0m1','2021-03-12 09:14:08','2021-03-12 10:23:48'),(2,2,'书记','users','管理员','6hb5zm7bohpe5mng6wybwephzs6u4g50','2021-03-12 09:20:24','2021-03-12 10:20:24'),(3,11,'账号1','yonghu','用户','fbrv648nyrek3eqi0bq652ehorkyrlel','2021-03-12 09:20:50','2021-03-12 10:24:43');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tongzhigonggao`
--

DROP TABLE IF EXISTS `tongzhigonggao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tongzhigonggao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonggaobiaoti` varchar(200) DEFAULT NULL COMMENT '公告标题',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `gonggaoneirong` longtext COMMENT '公告内容',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615540684934 DEFAULT CHARSET=utf8 COMMENT='通知公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tongzhigonggao`
--

LOCK TABLES `tongzhigonggao` WRITE;
/*!40000 ALTER TABLE `tongzhigonggao` DISABLE KEYS */;
INSERT INTO `tongzhigonggao` VALUES (81,'2021-03-12 09:06:13','公告标题1','2021-03-12 17:06:13','公告内容1','http://localhost:8080/ssm6w3g2/upload/tongzhigonggao_fengmian1.jpg'),(82,'2021-03-12 09:06:13','公告标题2','2021-03-12 17:06:13','公告内容2','http://localhost:8080/ssm6w3g2/upload/tongzhigonggao_fengmian2.jpg'),(83,'2021-03-12 09:06:13','公告标题3','2021-03-12 17:06:13','公告内容3','http://localhost:8080/ssm6w3g2/upload/tongzhigonggao_fengmian3.jpg'),(84,'2021-03-12 09:06:13','公告标题4','2021-03-12 17:06:13','公告内容4','http://localhost:8080/ssm6w3g2/upload/tongzhigonggao_fengmian4.jpg'),(85,'2021-03-12 09:06:13','公告标题5','2021-03-12 17:06:13','公告内容5','http://localhost:8080/ssm6w3g2/upload/tongzhigonggao_fengmian5.jpg'),(86,'2021-03-12 09:06:13','公告标题6','2021-03-12 17:06:13','公告内容6','http://localhost:8080/ssm6w3g2/upload/tongzhigonggao_fengmian6.jpg'),(1615540684933,'2021-03-12 09:18:04','11','2021-03-12 17:17:42','<p>1111<img src=\"http://localhost:8080/ssm6w3g2/upload/1615540669573.jpg\"></p><p><br></p><p><br></p><p>1111111</p><p><br></p><p><img src=\"http://localhost:8080/ssm6w3g2/upload/1615540682380.jpg\"></p>','http://localhost:8080/ssm6w3g2/upload/1615540664705.jpg');
/*!40000 ALTER TABLE `tongzhigonggao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `toupiao`
--

DROP TABLE IF EXISTS `toupiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `toupiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shenqingliyou` varchar(200) DEFAULT NULL COMMENT '申请理由',
  `piaoshu` varchar(200) NOT NULL COMMENT '票数',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615540956678 DEFAULT CHARSET=utf8 COMMENT='投票';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `toupiao`
--

LOCK TABLES `toupiao` WRITE;
/*!40000 ALTER TABLE `toupiao` DISABLE KEYS */;
INSERT INTO `toupiao` VALUES (1615540956677,'2021-03-12 09:22:36','账号1','姓名1','申请理由1','1',11);
/*!40000 ALTER TABLE `toupiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-03-12 09:06:13'),(2,'书记','123456','管理员','2021-03-12 09:19:55');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1615540478065 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2021-03-12 09:06:13','账号1','123456','姓名1','男','13823888881','773890001@qq.com','http://localhost:8080/ssm6w3g2/upload/yonghu_zhaopian1.jpg','备注1'),(12,'2021-03-12 09:06:13','用户2','123456','姓名2','男','13823888882','773890002@qq.com','http://localhost:8080/ssm6w3g2/upload/yonghu_zhaopian2.jpg','备注2'),(13,'2021-03-12 09:06:13','用户3','123456','姓名3','男','13823888883','773890003@qq.com','http://localhost:8080/ssm6w3g2/upload/yonghu_zhaopian3.jpg','备注3'),(14,'2021-03-12 09:06:13','用户4','123456','姓名4','男','13823888884','773890004@qq.com','http://localhost:8080/ssm6w3g2/upload/yonghu_zhaopian4.jpg','备注4'),(15,'2021-03-12 09:06:13','用户5','123456','姓名5','男','13823888885','773890005@qq.com','http://localhost:8080/ssm6w3g2/upload/yonghu_zhaopian5.jpg','备注5'),(16,'2021-03-12 09:06:13','用户6','123456','姓名6','男','13823888886','773890006@qq.com','http://localhost:8080/ssm6w3g2/upload/yonghu_zhaopian6.jpg','备注6'),(1615540478064,'2021-03-12 09:14:38','11','11','11','男','13800138000','','http://localhost:8080/ssm6w3g2/upload/1615540475403.jpg','111');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhengshenjieguo`
--

DROP TABLE IF EXISTS `zhengshenjieguo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhengshenjieguo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `fujian` varchar(200) DEFAULT NULL COMMENT '附件',
  `neirong` longtext COMMENT '内容',
  `tianjiashijian` datetime DEFAULT NULL COMMENT '添加时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615540548761 DEFAULT CHARSET=utf8 COMMENT='政审结果';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhengshenjieguo`
--

LOCK TABLES `zhengshenjieguo` WRITE;
/*!40000 ALTER TABLE `zhengshenjieguo` DISABLE KEYS */;
INSERT INTO `zhengshenjieguo` VALUES (31,'2021-03-12 09:06:13','账号1','姓名1','标题1','','内容1','2021-03-12 17:06:13',1),(32,'2021-03-12 09:06:13','账号2','姓名2','标题2','','内容2','2021-03-12 17:06:13',2),(33,'2021-03-12 09:06:13','账号3','姓名3','标题3','','内容3','2021-03-12 17:06:13',3),(34,'2021-03-12 09:06:13','账号4','姓名4','标题4','','内容4','2021-03-12 17:06:13',4),(35,'2021-03-12 09:06:13','账号5','姓名5','标题5','','内容5','2021-03-12 17:06:13',5),(36,'2021-03-12 09:06:13','账号6','姓名6','标题6','','内容6','2021-03-12 17:06:13',6),(1615540548760,'2021-03-12 09:15:48','账号1','姓名1','11','http://localhost:8080/ssm6w3g2/upload/1615540536585.jpg','<p>2111<img src=\"http://localhost:8080/ssm6w3g2/upload/1615540544731.jpg\"></p>','2021-03-12 17:15:40',1);
/*!40000 ALTER TABLE `zhengshenjieguo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhuanzhengguanli`
--

DROP TABLE IF EXISTS `zhuanzhengguanli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhuanzhengguanli` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shenfenleixing` varchar(200) DEFAULT NULL COMMENT '身份类型',
  `zhuanzhengcailiao` varchar(200) DEFAULT NULL COMMENT '转正材料',
  `shenqingyuanyin` longtext COMMENT '申请原因',
  `shenqingshijian` datetime DEFAULT NULL COMMENT '申请时间',
  `dangzuzhiyijian` longtext COMMENT '党组织意见',
  `dangneiwaiqunzhongyijian` longtext COMMENT '党内外群众意见',
  `zhiweihuishenchajieguo` longtext COMMENT '支委会审查结果',
  `dangweishenpijieguo` longtext COMMENT '党委审批结果',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615540897478 DEFAULT CHARSET=utf8 COMMENT='转正管理';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhuanzhengguanli`
--

LOCK TABLES `zhuanzhengguanli` WRITE;
/*!40000 ALTER TABLE `zhuanzhengguanli` DISABLE KEYS */;
INSERT INTO `zhuanzhengguanli` VALUES (61,'2021-03-12 09:06:13','账号1','姓名1','身份类型1','','申请原因1','2021-03-12 17:06:13','党组织意见1','党内外群众意见1','支委会审查结果1','党委审批结果1','是','',1),(62,'2021-03-12 09:06:13','账号2','姓名2','身份类型2','','申请原因2','2021-03-12 17:06:13','党组织意见2','党内外群众意见2','支委会审查结果2','党委审批结果2','是','',2),(63,'2021-03-12 09:06:13','账号3','姓名3','身份类型3','','申请原因3','2021-03-12 17:06:13','党组织意见3','党内外群众意见3','支委会审查结果3','党委审批结果3','是','',3),(64,'2021-03-12 09:06:13','账号4','姓名4','身份类型4','','申请原因4','2021-03-12 17:06:13','党组织意见4','党内外群众意见4','支委会审查结果4','党委审批结果4','是','',4),(65,'2021-03-12 09:06:13','账号5','姓名5','身份类型5','','申请原因5','2021-03-12 17:06:13','党组织意见5','党内外群众意见5','支委会审查结果5','党委审批结果5','是','',5),(66,'2021-03-12 09:06:13','账号6','姓名6','身份类型6','','申请原因6','2021-03-12 17:06:13','党组织意见6','党内外群众意见6','支委会审查结果6','党委审批结果6','是','',6),(1615540897477,'2021-03-12 09:21:36','账号1','姓名1','积极分子','http://localhost:8080/ssm6w3g2/upload/1615540889705.jpg','11111','2021-03-12 17:21:26','','','','','是','1111',11);
/*!40000 ALTER TABLE `zhuanzhengguanli` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-14 15:49:55
