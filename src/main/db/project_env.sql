/*
Navicat MySQL Data Transfer

Source Server         : local_107
Source Server Version : 50636
Source Host           : 192.168.10.107:3306
Source Database       : devops

Target Server Type    : MYSQL
Target Server Version : 50636
File Encoding         : 65001

Date: 2017-12-19 16:34:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for project_env
-- ----------------------------
DROP TABLE IF EXISTS `project_env`;
CREATE TABLE `project_env` (
  `id` int(255) NOT NULL COMMENT '环境id号',
  `env` varchar(30) DEFAULT NULL COMMENT '环境具体名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project_env
-- ----------------------------
INSERT INTO `project_env` VALUES ('1', 'dev');
INSERT INTO `project_env` VALUES ('2', 'pretest');
INSERT INTO `project_env` VALUES ('3', 'test');
INSERT INTO `project_env` VALUES ('4', 'product');
INSERT INTO `project_env` VALUES ('5', 'lb-product');
INSERT INTO `project_env` VALUES ('6', 'lb3-product');
