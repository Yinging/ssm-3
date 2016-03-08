/*
Navicat MySQL Data Transfer

Source Server         : laravel5111
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : learn

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2016-03-08 17:31:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for car
-- ----------------------------
DROP TABLE IF EXISTS `car`;
CREATE TABLE `car` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `bland` varchar(30) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of car
-- ----------------------------
INSERT INTO `car` VALUES ('1', '奥迪', '黑色');
INSERT INTO `car` VALUES ('2', '奔驰', '白色');
INSERT INTO `car` VALUES ('3', '宝马', '红色');

-- ----------------------------
-- Table structure for learner
-- ----------------------------
DROP TABLE IF EXISTS `learner`;
CREATE TABLE `learner` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(60) DEFAULT NULL,
  `age` smallint(5) unsigned DEFAULT NULL,
  `salt` varchar(60) DEFAULT NULL,
  `locked` tinyint(3) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of learner
-- ----------------------------
INSERT INTO `learner` VALUES ('1', 'zhangsan', '6fb25a06de836ce998fe9d5156c9d983', '18', 'fc6b6bd0eb355cb5663b73353466fae7', null);
INSERT INTO `learner` VALUES ('2', 'lisi', 'f0c4a1c8e01bf2b3a1453565d1a87630', '24', '0920b4c084c9dbbc01e5308fe45253c1', null);
INSERT INTO `learner` VALUES ('3', 'wangwu', 'ca9ea3598d8f59ff4080cd3dd88201ef', '28', '9b031421926bc7dbd5caa8b0d70ab1b0', null);
INSERT INTO `learner` VALUES ('4', 'zhaoliu', '15f33e2a62a84866a5c9d818877caa7d', '35', '060d5a19ab00f572220bc150bea7ac92', null);
