/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50153
 Source Host           : localhost:3306
 Source Schema         : springboot

 Target Server Type    : MySQL
 Target Server Version : 50153
 File Encoding         : 65001

 Date: 22/07/2018 17:53:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `password` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `phone` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `user_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `user_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('19970102', '312312', '402881e564c0da7b0164c0db6f550000', 'Tom');
INSERT INTO `t_user` VALUES ('sfas', '88888', '402881e564c0da7b0164c10e22c30004', 'Jony℃');
INSERT INTO `t_user` VALUES ('jidasdas', '888888888', '402881e564c0da7b0164c11adc8f0006', 'marry');
INSERT INTO `t_user` VALUES ('tiyv', '000000', '402881e564c0da7b0164c1227c5d000b', 'Bliabx');
INSERT INTO `t_user` VALUES ('dsada', '3123123', '402881e764bbd6340164bbd6af4e0001', 'Nusg');
INSERT INTO `t_user` VALUES ('kjhk', '321312', '402881e764bbd7b60164bbd9c3cb0002', 'XIoaji');
INSERT INTO `t_user` VALUES ('dsa', '110', '402881e764bbed9f0164bbee12c70000', 'Villig');
INSERT INTO `t_user` VALUES ('dasda', '312312', '402881e764bc15ed0164bc1768360000', 'Wijx');

SET FOREIGN_KEY_CHECKS = 1;
