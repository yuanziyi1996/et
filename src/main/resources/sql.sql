DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `nickname` varchar(20) DEFAULT NULL,
  `userType` int(1) DEFAULT NULL COMMENT '0.学生1.教师',
  `pic` varchar(200) DEFAULT NULL COMMENT '照片',
  `createDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
--资源
DROP TABLE IF EXISTS `resource`;
CREATE TABLE `resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `des` varchar(500) DEFAULT NULL,
  `resPath` varchar(200) DEFAULT NULL,
  `fileName` varchar(50) DEFAULT NULL,
  `num` int(11) DEFAULT 0,
  `createDate` datetime DEFAULT NULL,
  `createUser` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--课程
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `des` varchar(500) DEFAULT NULL,
  `teacherName` varchar(20) DEFAULT NULL,
  `pic` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


--回复消息
DROP TABLE IF EXISTS `msg`;
CREATE TABLE `msg` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `msg` varchar(500) DEFAULT NULL,
  `msgTo` int(11) DEFAULT NULL COMMENT '回复给。。',
  `postId` int(11) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `createUser` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--帖子
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `des` varchar(500) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `createUser` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--教师信息
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teacherName` varchar(20) DEFAULT NULL,
  `des` varchar(500) DEFAULT NULL,
  `pic` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4