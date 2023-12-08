CREATE TABLE `CUSTOMER` (
                            `customerId` INT NOT NULL AUTO_INCREMENT,
                            `name` VARCHAR(255) NOT NULL,
                            `gender` VARCHAR(10) NOT NULL,
                            `age` INT NOT NULL,
                            `email` VARCHAR(255) NOT NULL,
                            `telephone` VARCHAR(20) NOT NULL,
                            `password` VARCHAR(255) NOT NULL,
                            `membership` VARCHAR(10) NOT NULL,
                            PRIMARY KEY (`customerId`)
);
INSERT INTO `CUSTOMER` (`name`, `gender`, `age`, `email`, `telephone`, `password`, `membership`)
VALUES ('Zoey', 'Female', 24, 'zoey42zhang@gmail.com', '4478872273', 'admin886', 'non-member');