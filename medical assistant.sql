CREATE DATABASE `guiguxiaozhi`;
USE `guiguxiaozhi`;
CREATE TABLE `appointment` (
`id` BIGINT NOT NULL AUTO_INCREMENT,
`username` VARCHAR(50) NOT NULL,
`id_card` VARCHAR(18) NOT NULL,
`department` VARCHAR(50) NOT NULL,
`date` VARCHAR(10) NOT NULL,
`time` VARCHAR(10) NOT NULL,
`doctor_name` VARCHAR(50) DEFAULT NULL,
PRIMARY KEY (`id`)
);