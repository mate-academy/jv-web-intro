CREATE SCHEMA `taxi` DEFAULT CHARACTER SET utf8 ;
CREATE TABLE `taxi`.`manufacturers` (
                                        `id` BIGINT(11) NOT NULL AUTO_INCREMENT,
                                        `name` VARCHAR(225) NOT NULL,
                                        `country` VARCHAR(225) NOT NULL,
                                        `deleted` TINYINT NOT NULL DEFAULT 0,
                                        PRIMARY KEY (`id`));
