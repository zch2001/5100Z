CREATE TABLE `PRODUCT` (
                           `PRODUCTID` CHAR(36) NOT NULL,
                           `NAME` VARCHAR(255) NOT NULL,
                           `DESCRIPTION` TEXT NOT NULL,
                           `PRICE` INT NOT NULL,
                           PRIMARY KEY (`PRODUCTID`)
);
INSERT INTO `PRODUCT` (`PRODUCTID`, `NAME`, `DESCRIPTION`, `PRICE`)
VALUES (UUID(), 'Nike Air Force 1', 'Nike shoes', 100),
       (UUID(), 'New Balance 990', 'New Balance sneaker', 200),
       (UUID(), 'Dr. Martens 5140', 'Mary Jane', 250),
       (UUID(), 'Swarovski Necklace', 'Necklace', 400);