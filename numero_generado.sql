-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.5.28 - MySQL Community Server (GPL)
-- SO del servidor:              Win32
-- HeidiSQL Versión:             8.1.0.4545
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
-- Volcando datos para la tabla loteria.numero_generado: ~11 rows (aproximadamente)
/*!40000 ALTER TABLE `numero_generado` DISABLE KEYS */;
INSERT INTO `numero_generado` (`codigo`, `numero`, `fecha`, `repeticion`) VALUES
	(1, '02 - 04 - 17 - 22 - 24 - 30', '2012-05-29 00:00:00', NULL),
	(2, '06 - 09 - 22 - 24 - 31 - 33', '2012-05-29 00:00:00', NULL),
	(3, '01 - 04 - 16 - 19 - 26 - 33', '2012-05-29 00:00:00', NULL),
	(4, '07 - 11 - 25 - 26 - 30 - 32', '2012-06-06 00:00:00', NULL),
	(5, '07 - 13 - 16 - 21 - 24 - 33', '2012-06-06 00:00:00', NULL),
	(6, '15 - 17 - 21 - 22 - 30 - 31', '2012-06-06 00:00:00', NULL),
	(7, '04 - 06 - 08 - 19 - 22 - 29', '2012-06-06 00:00:00', NULL),
	(8, '07 - 09 - 14 - 17 - 26 - 32', '2012-06-06 00:00:00', NULL),
	(9, '05 - 07 - 16 - 20 - 28 - 32', '2012-06-13 00:00:00', NULL),
	(10, '05 - 09 - 12 - 20 - 28 - 32', '2012-06-13 00:00:00', NULL),
	(11, '04 - 12 - 13 - 20 - 27 - 32', '2013-09-25 16:20:55', 0);
/*!40000 ALTER TABLE `numero_generado` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
