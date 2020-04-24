-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versione server:              10.4.12-MariaDB - mariadb.org binary distribution
-- S.O. server:                  Win64
-- HeidiSQL Versione:            11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dump della struttura del database digitalmed
CREATE DATABASE IF NOT EXISTS `digitalmed` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `digitalmed`;

-- Dump della struttura di tabella digitalmed.farmaci
CREATE TABLE IF NOT EXISTS `farmaci` (
  `IDPharma` int(11) NOT NULL DEFAULT 0,
  `Name` char(50) DEFAULT NULL,
  `Conservation` text DEFAULT NULL,
  `Link` tinytext DEFAULT NULL,
  `Reorder` int(11) DEFAULT NULL,
  PRIMARY KEY (`IDPharma`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dump dei dati della tabella digitalmed.farmaci: ~3 rows (circa)
/*!40000 ALTER TABLE `farmaci` DISABLE KEYS */;
INSERT INTO `farmaci` (`IDPharma`, `Name`, `Conservation`, `Link`, `Reorder`) VALUES
	(1, 'Oki', '20 C', 'C:\\\\ICT\\Nostro progetto\\Farmaci\\OKI', NULL),
	(2, 'A', '20C', 'C:\\\\ICT\\Nostro progetto\\Farmaci\\AA', NULL),
	(3, 'B', '20C', 'asdfg', NULL);
/*!40000 ALTER TABLE `farmaci` ENABLE KEYS */;

-- Dump della struttura di tabella digitalmed.magazzinoreparti
CREATE TABLE IF NOT EXISTS `magazzinoreparti` (
  `IDWard` int(11) NOT NULL,
  `NameWard` varchar(50) DEFAULT NULL,
  `IDPharma` varchar(50) NOT NULL,
  `NamePharma` varchar(50) DEFAULT NULL,
  `Quantity` int(11) DEFAULT NULL,
  `ExpDate` date NOT NULL,
  PRIMARY KEY (`IDPharma`,`IDWard`,`ExpDate`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dump dei dati della tabella digitalmed.magazzinoreparti: ~4 rows (circa)
/*!40000 ALTER TABLE `magazzinoreparti` DISABLE KEYS */;
INSERT INTO `magazzinoreparti` (`IDWard`, `NameWard`, `IDPharma`, `NamePharma`, `Quantity`, `ExpDate`) VALUES
	(1, 'Terapia', '1', 'OKI', 1, '2020-04-21'),
	(1, 'Terapia', '1', 'OKI', 10, '2020-09-05'),
	(2, 'PS', '1', 'OKI', 20, '2020-10-01'),
	(1, 'Terapia', '2', 'AA', 5, '2021-01-01');
/*!40000 ALTER TABLE `magazzinoreparti` ENABLE KEYS */;

-- Dump della struttura di tabella digitalmed.statistiche
CREATE TABLE IF NOT EXISTS `statistiche` (
  `IDPharma` int(11) NOT NULL,
  `Withdrawal` date NOT NULL,
  `Quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`IDPharma`,`Withdrawal`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dump dei dati della tabella digitalmed.statistiche: ~1 rows (circa)
/*!40000 ALTER TABLE `statistiche` DISABLE KEYS */;
INSERT INTO `statistiche` (`IDPharma`, `Withdrawal`, `Quantity`) VALUES
	(1, '2020-04-21', 4);
/*!40000 ALTER TABLE `statistiche` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
