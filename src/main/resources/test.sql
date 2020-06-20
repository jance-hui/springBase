/*
Navicat MySQL Data Transfer

Source Server         : 1
Source Server Version : 80019
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80019
File Encoding         : 65001

Date: 2020-06-20 17:04:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `task_info`
-- ----------------------------
DROP TABLE IF EXISTS `task_info`;
CREATE TABLE `task_info` (
  `id` int NOT NULL AUTO_INCREMENT,
  `task_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '任务名称',
  `task_no` int NOT NULL COMMENT '任务编号',
  `task_type` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '任务类型[1一次性任务；2每月任务；3每日任务]',
  `task_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '任务时间？[2020-06-01 12:10:10]',
  `instruction` varchar(200) DEFAULT NULL COMMENT '指令',
  `sts` varchar(1) DEFAULT NULL COMMENT '状态[1：状态1；2：状态2]',
  `creat_time` varchar(12) DEFAULT NULL COMMENT '创建时间',
  `filler` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `task_info_index_1` (`task_name`,`task_no`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='任务信息表';

-- ----------------------------
-- Records of task_info
-- ----------------------------
INSERT INTO `task_info` VALUES ('2', '任务1', '1', '1', '2020-06-20 12:07:00', null, null, null, null);
