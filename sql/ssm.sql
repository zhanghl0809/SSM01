SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for home
-- ----------------------------
DROP TABLE IF EXISTS `home`;
CREATE TABLE `home` (
  `home_id` int(10) NOT NULL,
  `home_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of home
-- ----------------------------
INSERT INTO `home` VALUES ('1', 'sasadasd');
INSERT INTO `home` VALUES ('1', '2345');
INSERT INTO `home` VALUES ('2323', 'dsfghj');
INSERT INTO `home` VALUES ('1', 'qqqqqqqqq');
INSERT INTO `home` VALUES ('1', 'dsaaaaaaaaa');

-- ----------------------------
-- Table structure for morder
-- ----------------------------
DROP TABLE IF EXISTS `morder`;
CREATE TABLE `morder` (
  `order_id` int(10) NOT NULL AUTO_INCREMENT,
  `order_name` varchar(255) DEFAULT NULL,
  `order_message` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of morder
-- ----------------------------
INSERT INTO `morder` VALUES ('1', '襪子', 'sadasdad');
INSERT INTO `morder` VALUES ('2', '撒旦', '額爲嗡嗡嗡');
INSERT INTO `morder` VALUES ('3', '法國紅酒看', 'fghjk');
INSERT INTO `morder` VALUES ('4', '有有有有有有有有有', 'ooooooooo');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `oid` int(11) DEFAULT NULL,
  `hid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zhl', '123', '2018-03-07', '男', '实打实打算', '1', '1');
INSERT INTO `user` VALUES ('2', '水水水水', null, '2018-03-29', '男', '啊实打实大苏打实打实的', '2', '2');
INSERT INTO `user` VALUES ('5', 'weffwsss', null, '2019-02-18', '7', '3', '3', '3');
INSERT INTO `user` VALUES ('6', 'weffwsss', null, '2019-02-18', '7', '3', '4', '4');
INSERT INTO `user` VALUES ('7', 'weffwsss', null, '2019-02-18', '7', '3', null, null);
INSERT INTO `user` VALUES ('8', 'weffwsss', null, '2019-02-18', '男', '0dizi0', null, null);
INSERT INTO `user` VALUES ('9', 'weffwsss', null, '2019-02-18', '男', '1dizi1', null, null);
INSERT INTO `user` VALUES ('10', 'weffwsss', null, '2019-02-18', '男', '2dizi2', null, null);
INSERT INTO `user` VALUES ('11', 'weffwsss', null, '2019-02-18', '男', '3dizi3', null, null);
INSERT INTO `user` VALUES ('12', 'weffwsss', null, '2019-02-18', '男', '4dizi4', null, null);
INSERT INTO `user` VALUES ('13', 'weffwsss', null, '2019-02-18', '男', '5dizi5', null, null);
INSERT INTO `user` VALUES ('14', 'weffwsss', null, '2019-02-18', '男', '6dizi6', null, null);
INSERT INTO `user` VALUES ('15', 'weffwsss', null, '2019-02-18', '男', '7dizi7', null, null);
INSERT INTO `user` VALUES ('16', 'weffwsss', null, '2019-02-18', '男', '8dizi8', null, null);
INSERT INTO `user` VALUES ('17', 'weffwsss', null, '2019-02-18', '男', '9dizi9', null, null);
INSERT INTO `user` VALUES ('18', 'weffwsss', null, '2019-02-18', '男', '10dizi10', null, null);
INSERT INTO `user` VALUES ('19', 'weffwsss', null, '2019-02-18', '男', '11dizi11', null, null);
INSERT INTO `user` VALUES ('21', 'weffwsss', null, '2019-02-18', '男', '13dizi13', null, null);
INSERT INTO `user` VALUES ('22', 'weffwsss', null, '2019-02-18', '男', '14dizi14', null, null);
INSERT INTO `user` VALUES ('23', 'weffwsss', null, '2019-02-18', '男', '15dizi15', null, null);
INSERT INTO `user` VALUES ('24', 'weffwsss', null, '2019-02-18', '男', '16dizi16', null, null);
INSERT INTO `user` VALUES ('25', 'weffwsss', null, '2019-02-18', '男', '17dizi17', null, null);
INSERT INTO `user` VALUES ('26', 'weffwsss', null, '2019-02-18', '男', '18dizi18', null, null);
INSERT INTO `user` VALUES ('27', 'weffwsss', null, '2019-02-18', '男', '19dizi19', null, null);
INSERT INTO `user` VALUES ('28', 'weffwsss', null, '2019-02-18', '男', 'dizi', null, null);

-- ----------------------------
-- Table structure for web_logs
-- ----------------------------
DROP TABLE IF EXISTS `web_logs`;
CREATE TABLE `web_logs` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `web_user` varchar(255) DEFAULT NULL,
  `user_IP` varchar(255) DEFAULT NULL,
  `used_controller` varchar(255) DEFAULT NULL,
  `used_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=155 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of web_logs
-- ----------------------------
INSERT INTO `web_logs` VALUES ('150', '事务0', '事务IP0', '事务controller0', '事务时间0');
INSERT INTO `web_logs` VALUES ('151', '事务1', '事务IP1', '事务controller1', '事务时间1');
INSERT INTO `web_logs` VALUES ('152', '事务2', '事务IP2', '事务controller2', '事务时间2');
INSERT INTO `web_logs` VALUES ('153', '事务3', '事务IP3', '事务controller3', '事务时间3');
INSERT INTO `web_logs` VALUES ('154', '事务4', '事务IP4', '事务controller4', '事务时间4');
