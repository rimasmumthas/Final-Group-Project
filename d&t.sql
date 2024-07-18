-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.29 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.0.0.6468
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for d&t_db
CREATE DATABASE IF NOT EXISTS `d&t_db` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `d&t_db`;

-- Dumping structure for table d&t_db.brand
CREATE TABLE IF NOT EXISTS `brand` (
  `b_id` int NOT NULL AUTO_INCREMENT,
  `b_name` varchar(45) NOT NULL,
  PRIMARY KEY (`b_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.brand: ~2 rows (approximately)
INSERT INTO `brand` (`b_id`, `b_name`) VALUES
	(1, 'Nikeeee'),
	(2, 'Addidas');

-- Dumping structure for table d&t_db.category
CREATE TABLE IF NOT EXISTS `category` (
  `c_id` int NOT NULL AUTO_INCREMENT,
  `mc_id` int NOT NULL,
  `sc_id` int NOT NULL,
  PRIMARY KEY (`c_id`),
  KEY `fk_category_main_category1_idx` (`mc_id`),
  KEY `fk_category_sub_category1_idx` (`sc_id`),
  CONSTRAINT `fk_category_main_category1` FOREIGN KEY (`mc_id`) REFERENCES `main_category` (`mc_id`),
  CONSTRAINT `fk_category_sub_category1` FOREIGN KEY (`sc_id`) REFERENCES `sub_category` (`sc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.category: ~4 rows (approximately)
INSERT INTO `category` (`c_id`, `mc_id`, `sc_id`) VALUES
	(1, 1, 1),
	(2, 1, 4),
	(3, 2, 3),
	(4, 3, 2),
	(5, 1, 2),
	(6, 1, 5);

-- Dumping structure for table d&t_db.color
CREATE TABLE IF NOT EXISTS `color` (
  `co_id` int NOT NULL AUTO_INCREMENT,
  `co_name` varchar(45) NOT NULL,
  PRIMARY KEY (`co_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.color: ~4 rows (approximately)
INSERT INTO `color` (`co_id`, `co_name`) VALUES
	(1, 'Black'),
	(2, 'White'),
	(3, 'Brown'),
	(4, 'Red');

-- Dumping structure for table d&t_db.company
CREATE TABLE IF NOT EXISTS `company` (
  `id` int NOT NULL AUTO_INCREMENT,
  `company_name` varchar(45) NOT NULL,
  `contact_no` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.company: ~0 rows (approximately)
INSERT INTO `company` (`id`, `company_name`, `contact_no`) VALUES
	(1, 'Addidas', '0763942267'),
	(2, 'Moose', '0772233445');

-- Dumping structure for table d&t_db.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `mobile` varchar(10) NOT NULL,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  PRIMARY KEY (`mobile`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.customer: ~0 rows (approximately)
INSERT INTO `customer` (`mobile`, `fname`, `lname`) VALUES
	('0702252220', 'Vishmi', 'Gunarathne'),
	('0721122334', 'Sandeep', 'Kavinda'),
	('0786677889', 'Kaushal ', 'Silva'),
	('None', 'None', 'None');

-- Dumping structure for table d&t_db.customer_return
CREATE TABLE IF NOT EXISTS `customer_return` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date_time` datetime NOT NULL,
  `qty` int NOT NULL,
  `invoice_item_init_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_customer_return_invoice_item1_idx` (`invoice_item_init_id`),
  CONSTRAINT `fk_customer_return_invoice_item1` FOREIGN KEY (`invoice_item_init_id`) REFERENCES `invoice_item` (`init_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.customer_return: ~2 rows (approximately)
INSERT INTO `customer_return` (`id`, `date_time`, `qty`, `invoice_item_init_id`) VALUES
	(23, '2024-05-29 04:21:37', 1, 16),
	(24, '2024-05-29 04:26:14', 1, 17),
	(25, '2024-05-29 11:37:09', 1, 24);

-- Dumping structure for table d&t_db.drawer
CREATE TABLE IF NOT EXISTS `drawer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `description` text NOT NULL,
  `amount` double NOT NULL,
  `date_time` datetime NOT NULL,
  `transaction_type_id` int NOT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_drawer_transaction_type1_idx` (`transaction_type_id`),
  KEY `fk_drawer_user1_idx` (`user_id`),
  CONSTRAINT `fk_drawer_transaction_type1` FOREIGN KEY (`transaction_type_id`) REFERENCES `transaction_type` (`id`),
  CONSTRAINT `fk_drawer_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.drawer: ~2 rows (approximately)
INSERT INTO `drawer` (`id`, `description`, `amount`, `date_time`, `transaction_type_id`, `user_id`) VALUES
	(9, 'dfff', 5000, '2024-05-29 05:13:49', 1, 1),
	(10, 'sfgg', 500, '2024-05-28 05:13:57', 2, 1),
	(11, 'yuyu', 1000, '2024-05-29 05:14:07', 2, 1),
	(12, 'lunch', 200, '2024-05-29 02:42:56', 2, 1);

-- Dumping structure for table d&t_db.grn
CREATE TABLE IF NOT EXISTS `grn` (
  `barcode` bigint NOT NULL,
  `date_time` date NOT NULL,
  `total` double NOT NULL,
  `supplier_mobile` varchar(10) NOT NULL,
  PRIMARY KEY (`barcode`),
  KEY `fk_grn_supplier1_idx` (`supplier_mobile`),
  CONSTRAINT `fk_grn_supplier1` FOREIGN KEY (`supplier_mobile`) REFERENCES `supplier` (`mobile`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.grn: ~13 rows (approximately)
INSERT INTO `grn` (`barcode`, `date_time`, `total`, `supplier_mobile`) VALUES
	(12345, '2024-05-23', 12, '0715555555'),
	(12346, '2024-05-23', 10, '0713333333'),
	(1716676385786, '2024-05-10', 0, '0713333333'),
	(1716836073161, '2024-05-10', 10000, '0715555555'),
	(1716838901953, '2024-05-16', 44400, '0715555555'),
	(1716839200376, '2024-05-28', 5000, '0715555555'),
	(1716839286849, '2024-05-27', 0, '0715555555'),
	(1716839966896, '2024-05-01', 125000, '0713333333'),
	(1716846873374, '2024-05-02', 38250, '0715555555'),
	(1716847267159, '2024-05-03', 7500, '0715555555'),
	(1716922244038, '2024-05-01', 250000, '0713333333'),
	(1716922296062, '2024-05-02', 5000, '0715555555'),
	(1716952524139, '2024-05-09', 5040, '0715555555'),
	(1716973134136, '2024-05-29', 9000, '0759988776');

-- Dumping structure for table d&t_db.grn_item
CREATE TABLE IF NOT EXISTS `grn_item` (
  `id` int NOT NULL AUTO_INCREMENT,
  `buying_price` double NOT NULL,
  `qty` int NOT NULL,
  `product_p_id` int NOT NULL,
  `grn_barcode` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_grn_item_product1_idx` (`product_p_id`),
  KEY `fk_grn_item_grn1_idx` (`grn_barcode`),
  CONSTRAINT `fk_grn_item_grn1` FOREIGN KEY (`grn_barcode`) REFERENCES `grn` (`barcode`),
  CONSTRAINT `fk_grn_item_product1` FOREIGN KEY (`product_p_id`) REFERENCES `product` (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.grn_item: ~12 rows (approximately)
INSERT INTO `grn_item` (`id`, `buying_price`, `qty`, `product_p_id`, `grn_barcode`) VALUES
	(1, 2500, 5, 2, 12346),
	(2, 2700, 7, 1, 12345),
	(3, 350, 100, 3, 1716839966896),
	(4, 900, 100, 2, 1716839966896),
	(5, 450, 35, 3, 1716846873374),
	(6, 500, 45, 1, 1716846873374),
	(7, 500, 15, 1, 1716847267159),
	(8, 1000, 100, 3, 1716922244038),
	(9, 1500, 100, 2, 1716922244038),
	(10, 500, 10, 2, 1716922296062),
	(11, 420, 12, 1, 1716952524139),
	(12, 900, 10, 4, 1716973134136);

-- Dumping structure for table d&t_db.invoice
CREATE TABLE IF NOT EXISTS `invoice` (
  `in_id` varchar(20) NOT NULL,
  `in_date_time` datetime NOT NULL,
  `user_id` int NOT NULL,
  `customer_mobile` varchar(10) NOT NULL,
  `pm_id` int NOT NULL,
  `payment` double NOT NULL,
  `discount` double NOT NULL,
  PRIMARY KEY (`in_id`),
  KEY `fk_invoice_user1_idx` (`user_id`),
  KEY `fk_invoice_customer1_idx` (`customer_mobile`),
  KEY `fk_invoice_payment_method1_idx` (`pm_id`),
  CONSTRAINT `fk_invoice_customer1` FOREIGN KEY (`customer_mobile`) REFERENCES `customer` (`mobile`),
  CONSTRAINT `fk_invoice_payment_method1` FOREIGN KEY (`pm_id`) REFERENCES `payment_method` (`id`),
  CONSTRAINT `fk_invoice_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.invoice: ~6 rows (approximately)
INSERT INTO `invoice` (`in_id`, `in_date_time`, `user_id`, `customer_mobile`, `pm_id`, `payment`, `discount`) VALUES
	('1716922313081', '2024-05-28 12:23:01', 1, '0702252220', 1, 3000, 500),
	('1716937785890', '2024-05-29 04:40:15', 1, 'None', 2, 2000, 0),
	('1716946134931', '2024-05-29 06:59:08', 1, '0702252220', 1, 2000, 0),
	('1716946242907', '2024-05-29 07:01:02', 1, 'None', 1, 2400, 0),
	('1716946463520', '2024-05-29 07:04:34', 1, 'None', 1, 2500, 0),
	('1716948012603', '2024-05-29 07:30:36', 1, 'None', 2, 2000, 200),
	('1716952450276', '2024-05-29 08:44:54', 1, 'None', 2, 5000, 500),
	('1716962721573', '2024-05-29 11:36:03', 2, 'None', 2, 2000, 200),
	('1716974025743', '2024-05-29 02:45:03', 1, '0786677889', 1, 4500, 200),
	('1716980434829', '2024-05-29 04:32:55', 1, '0721122334', 1, 3500, 200),
	('1717087299609', '2024-05-30 10:12:11', 1, '0721122334', 1, 2000, 500);

-- Dumping structure for table d&t_db.invoice_item
CREATE TABLE IF NOT EXISTS `invoice_item` (
  `init_id` int NOT NULL AUTO_INCREMENT,
  `qty` int NOT NULL,
  `in_id` varchar(20) NOT NULL,
  `discount` double NOT NULL,
  `st_barcode` bigint NOT NULL,
  PRIMARY KEY (`init_id`),
  KEY `fk_invoice_item_invoice1_idx` (`in_id`),
  KEY `fk_invoice_item_stock1_idx` (`st_barcode`),
  CONSTRAINT `fk_invoice_item_invoice1` FOREIGN KEY (`in_id`) REFERENCES `invoice` (`in_id`),
  CONSTRAINT `fk_invoice_item_stock1` FOREIGN KEY (`st_barcode`) REFERENCES `stock` (`barcode`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.invoice_item: ~8 rows (approximately)
INSERT INTO `invoice_item` (`init_id`, `qty`, `in_id`, `discount`, `st_barcode`) VALUES
	(16, 0, '1716922313081', 100, 1716922251797),
	(17, 0, '1716922313081', 0, 1716922301484),
	(18, 1, '1716937785890', 0, 1716922251797),
	(19, 1, '1716946134931', 0, 1716922251797),
	(20, 1, '1716946242907', 100, 1716922251808),
	(21, 1, '1716946463520', 0, 1716922251808),
	(22, 1, '1716948012603', 0, 1716922251797),
	(23, 2, '1716952450276', 0, 1716922251808),
	(24, 0, '1716962721573', 0, 1716922251797),
	(25, 2, '1716974025743', 0, 1716973140292),
	(26, 1, '1716974025743', 200, 1716922251808),
	(27, 2, '1716980434829', 0, 1716973140292),
	(28, 1, '1716980434829', 0, 1716973140307),
	(29, 1, '1717087299609', 0, 1716973140307),
	(30, 1, '1717087299609', 0, 1716973140292);

-- Dumping structure for table d&t_db.main_category
CREATE TABLE IF NOT EXISTS `main_category` (
  `mc_id` int NOT NULL AUTO_INCREMENT,
  `mc_name` varchar(45) NOT NULL,
  PRIMARY KEY (`mc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.main_category: ~3 rows (approximately)
INSERT INTO `main_category` (`mc_id`, `mc_name`) VALUES
	(1, 'Mens'),
	(2, 'Ladies'),
	(3, 'Kids');

-- Dumping structure for table d&t_db.order_status
CREATE TABLE IF NOT EXISTS `order_status` (
  `id` int NOT NULL AUTO_INCREMENT,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.order_status: ~2 rows (approximately)
INSERT INTO `order_status` (`id`, `status`) VALUES
	(1, 'Recived'),
	(2, 'Delivered');

-- Dumping structure for table d&t_db.other_service
CREATE TABLE IF NOT EXISTS `other_service` (
  `barcode` bigint NOT NULL,
  `description` text NOT NULL,
  `amount` double NOT NULL,
  `qty` int NOT NULL,
  `payment` double NOT NULL,
  `customer_mobile` varchar(10) NOT NULL,
  `order_status_id` int NOT NULL DEFAULT '1',
  `order_date` date NOT NULL,
  `deliver_date` date NOT NULL,
  PRIMARY KEY (`barcode`),
  KEY `fk_other_service_customer1_idx` (`customer_mobile`),
  KEY `fk_other_service_order_status1_idx` (`order_status_id`),
  CONSTRAINT `fk_other_service_customer1` FOREIGN KEY (`customer_mobile`) REFERENCES `customer` (`mobile`),
  CONSTRAINT `fk_other_service_order_status1` FOREIGN KEY (`order_status_id`) REFERENCES `order_status` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.other_service: ~2 rows (approximately)
INSERT INTO `other_service` (`barcode`, `description`, `amount`, `qty`, `payment`, `customer_mobile`, `order_status_id`, `order_date`, `deliver_date`) VALUES
	(1716925360289, 'xxx', 1000, 2, 2000, '0702252220', 2, '2024-05-29', '2024-05-28'),
	(1716928270513, 'sfgsfg', 1500, 2, 3000, '0702252220', 2, '2024-05-29', '2024-05-31');

-- Dumping structure for table d&t_db.payment_method
CREATE TABLE IF NOT EXISTS `payment_method` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pm_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.payment_method: ~2 rows (approximately)
INSERT INTO `payment_method` (`id`, `pm_name`) VALUES
	(1, 'Card'),
	(2, 'Cash');

-- Dumping structure for table d&t_db.product
CREATE TABLE IF NOT EXISTS `product` (
  `p_id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `b_id` int NOT NULL,
  `c_id` int NOT NULL,
  PRIMARY KEY (`p_id`),
  KEY `fk_product_brand1_idx` (`b_id`),
  KEY `fk_product_category1_idx` (`c_id`),
  CONSTRAINT `fk_product_brand1` FOREIGN KEY (`b_id`) REFERENCES `brand` (`b_id`),
  CONSTRAINT `fk_product_category1` FOREIGN KEY (`c_id`) REFERENCES `category` (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.product: ~3 rows (approximately)
INSERT INTO `product` (`p_id`, `title`, `b_id`, `c_id`) VALUES
	(1, 'Mens Shoes', 1, 1),
	(2, 'ladies Heels', 2, 3),
	(3, 'Kids Shoes Party', 1, 4),
	(4, 'Mens Bottom Short', 1, 6);

-- Dumping structure for table d&t_db.repair
CREATE TABLE IF NOT EXISTS `repair` (
  `barcode` bigint NOT NULL,
  `description` text NOT NULL,
  `amount` double NOT NULL,
  `qty` int NOT NULL,
  `payment` double NOT NULL,
  `customer_mobile` varchar(10) NOT NULL,
  `order_status_id` int NOT NULL DEFAULT '1',
  `order_date` date NOT NULL,
  `deliver_date` date NOT NULL,
  PRIMARY KEY (`barcode`),
  KEY `fk_other_service_customer1_idx` (`customer_mobile`),
  KEY `fk_other_service_order_status1_idx` (`order_status_id`),
  CONSTRAINT `fk_other_service_customer10` FOREIGN KEY (`customer_mobile`) REFERENCES `customer` (`mobile`),
  CONSTRAINT `fk_other_service_order_status10` FOREIGN KEY (`order_status_id`) REFERENCES `order_status` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.repair: ~0 rows (approximately)
INSERT INTO `repair` (`barcode`, `description`, `amount`, `qty`, `payment`, `customer_mobile`, `order_status_id`, `order_date`, `deliver_date`) VALUES
	(1716928923634, 'ccccccccccccc', 4000, 4, 1000, '0702252220', 1, '2024-05-28', '2024-05-31');

-- Dumping structure for table d&t_db.size
CREATE TABLE IF NOT EXISTS `size` (
  `s_id` int NOT NULL AUTO_INCREMENT,
  `s_name` varchar(45) NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.size: ~4 rows (approximately)
INSERT INTO `size` (`s_id`, `s_name`) VALUES
	(1, '37'),
	(2, '38'),
	(3, '39'),
	(4, '40');

-- Dumping structure for table d&t_db.status
CREATE TABLE IF NOT EXISTS `status` (
  `id` int NOT NULL AUTO_INCREMENT,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.status: ~2 rows (approximately)
INSERT INTO `status` (`id`, `status`) VALUES
	(1, 'Active'),
	(2, 'Inactive');

-- Dumping structure for table d&t_db.stock
CREATE TABLE IF NOT EXISTS `stock` (
  `barcode` bigint NOT NULL,
  `p_id` int NOT NULL,
  `s_id` int NOT NULL,
  `co_id` int NOT NULL,
  `price` double NOT NULL,
  `available_qty` int NOT NULL,
  PRIMARY KEY (`barcode`),
  KEY `fk_stock_size1_idx` (`s_id`),
  KEY `fk_stock_color1_idx` (`co_id`),
  KEY `fk_stock_product1_idx` (`p_id`),
  CONSTRAINT `fk_stock_color1` FOREIGN KEY (`co_id`) REFERENCES `color` (`co_id`),
  CONSTRAINT `fk_stock_product1` FOREIGN KEY (`p_id`) REFERENCES `product` (`p_id`),
  CONSTRAINT `fk_stock_size1` FOREIGN KEY (`s_id`) REFERENCES `size` (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.stock: ~6 rows (approximately)
INSERT INTO `stock` (`barcode`, `p_id`, `s_id`, `co_id`, `price`, `available_qty`) VALUES
	(1716922251797, 3, 1, 1, 2000, 98),
	(1716922251808, 2, 3, 4, 2500, 95),
	(1716922301484, 2, 2, 2, 600, 0),
	(1716952529045, 1, 2, 2, 720, 0),
	(1716973140292, 4, 4, 1, 1200, 195),
	(1716973140307, 1, 4, 2, 1300, 98);

-- Dumping structure for table d&t_db.sub_category
CREATE TABLE IF NOT EXISTS `sub_category` (
  `sc_id` int NOT NULL AUTO_INCREMENT,
  `sc_name` varchar(45) NOT NULL,
  PRIMARY KEY (`sc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.sub_category: ~4 rows (approximately)
INSERT INTO `sub_category` (`sc_id`, `sc_name`) VALUES
	(1, 'Sneakers'),
	(2, 'Shoes'),
	(3, 'Heels'),
	(4, 'Boots'),
	(5, 'Short');

-- Dumping structure for table d&t_db.supplier
CREATE TABLE IF NOT EXISTS `supplier` (
  `mobile` varchar(10) NOT NULL,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `status_id` int NOT NULL,
  `company_id` int NOT NULL,
  PRIMARY KEY (`mobile`),
  KEY `fk_supplier_status1_idx` (`status_id`),
  KEY `fk_supplier_company1_idx` (`company_id`),
  CONSTRAINT `fk_supplier_company1` FOREIGN KEY (`company_id`) REFERENCES `company` (`id`),
  CONSTRAINT `fk_supplier_status1` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.supplier: ~2 rows (approximately)
INSERT INTO `supplier` (`mobile`, `fname`, `lname`, `status_id`, `company_id`) VALUES
	('0713333333', 'Supun', 'Perera', 1, 1),
	('0715555555', 'Kalindu', 'Bandara', 1, 1),
	('0759988776', 'Shamil', 'Kayil', 1, 2);

-- Dumping structure for table d&t_db.supplier_return
CREATE TABLE IF NOT EXISTS `supplier_return` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date_time` datetime NOT NULL,
  `qty` int NOT NULL,
  `grn_item_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_supplier_return_grn_item1_idx` (`grn_item_id`),
  CONSTRAINT `fk_supplier_return_grn_item1` FOREIGN KEY (`grn_item_id`) REFERENCES `grn_item` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.supplier_return: ~3 rows (approximately)
INSERT INTO `supplier_return` (`id`, `date_time`, `qty`, `grn_item_id`) VALUES
	(1, '2024-05-23 16:30:54', 2, 1),
	(4, '2024-05-24 04:24:58', 4, 2),
	(10, '2024-05-26 03:08:38', 2, 1);

-- Dumping structure for table d&t_db.transaction_type
CREATE TABLE IF NOT EXISTS `transaction_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.transaction_type: ~2 rows (approximately)
INSERT INTO `transaction_type` (`id`, `type`) VALUES
	(1, 'Add'),
	(2, 'Deduct');

-- Dumping structure for table d&t_db.user
CREATE TABLE IF NOT EXISTS `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fname` varchar(45) NOT NULL,
  `lname` varchar(45) NOT NULL,
  `mobile` varchar(10) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `user_type_id` int NOT NULL,
  `status_id` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `fk_user_user_type_idx` (`user_type_id`),
  KEY `fk_user_status1_idx` (`status_id`),
  CONSTRAINT `fk_user_status1` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`),
  CONSTRAINT `fk_user_user_type` FOREIGN KEY (`user_type_id`) REFERENCES `user_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.user: ~4 rows (approximately)
INSERT INTO `user` (`id`, `fname`, `lname`, `mobile`, `username`, `password`, `user_type_id`, `status_id`) VALUES
	(1, 'Daham', 'Bandara', '0702352220', 'Daham Bandara', '123', 1, 1),
	(2, 'Mohamed', 'Rimas', '0763942267', 'Mohamed Rimas', '1234', 1, 2),
	(3, 'Tajith', 'Senura', '0762255667', 'Senura', '123', 2, 1),
	(4, 'Kaushal', 'Silva', '0775566772', 'Kaushal Silva', '9999', 2, 1);

-- Dumping structure for table d&t_db.user_type
CREATE TABLE IF NOT EXISTS `user_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table d&t_db.user_type: ~2 rows (approximately)
INSERT INTO `user_type` (`id`, `type`) VALUES
	(1, 'Admin'),
	(2, 'Cashier');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
