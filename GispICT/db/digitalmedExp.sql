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

-- Dump dei dati della tabella digitalmed.farmaci: ~10 rows (circa)
/*!40000 ALTER TABLE `farmaci` DISABLE KEYS */;
INSERT INTO `farmaci` (`IDPharma`, `Name`, `Conservation`, `Link`, `Reorder`) VALUES
	(1, 'Oki', '20 ', 'https://www.codifa.it/farmaci/o/oki-granulato-ketoprofene-sale-di-lisina-analgesici-fans', NULL),
	(2, 'Plasil', '20', 'https://www.codifa.it/farmaci/p/plasil-compressa-metoclopramide-cloridrato-procinetici', NULL),
	(3, 'Lasix', '20', 'https://www.codifa.it/farmaci/l/lasix-compressa-furosemide-diuretici-dell-ansa', NULL),
	(4, 'Cardura', '20', 'https://www.codifa.it/farmaci/c/cardura-doxazosin-mesilato-alfabloccanti', NULL),
	(5, 'Almarytm', '20', 'https://www.codifa.it/farmaci/a/almarytm-compressa-flecainide-acetato-antiaritmici', NULL),
	(6, 'Deltacortene', '20', 'https://www.codifa.it/farmaci/d/deltacortene-prednisone-corticosteroidi', NULL),
	(7, 'Cetirizina', '20', 'https://www.codifa.it/farmaci/c/cetirizina-abc-cetirizina-dicloridrato-antiallergici-antistaminici', NULL),
	(8, 'Coumadin', '20', 'https://www.codifa.it/farmaci/c/coumadin-warfarin-sodico-anticoagulanti-indiretti', NULL),
	(9, 'Mittoval', '20', 'https://www.codifa.it/farmaci/m/mittoval-compressa-a-rilascio-modificato-alfuzosina-cloridrato-ipertrofia-prostatica-benigna', NULL),
	(10, 'Tachipirina', '20', 'https://www.codifa.it/farmaci/t/tachipirina-compressa-granulato-supposta-paracetamolo-antipiretici-analgesici-fans', NULL);
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

-- Dump dei dati della tabella digitalmed.magazzinoreparti: ~17 rows (circa)
/*!40000 ALTER TABLE `magazzinoreparti` DISABLE KEYS */;
INSERT INTO `magazzinoreparti` (`IDWard`, `NameWard`, `IDPharma`, `NamePharma`, `Quantity`, `ExpDate`) VALUES
	(100, 'Surgery', '1', 'OKI', 1, '2020-07-01'),
	(100, 'Surgery', '1', 'OKI', 20, '2021-04-01'),
	(102, 'Emergency department', '1', 'OKI', 20, '2020-10-01'),
	(103, 'Cardiac Surgery', '1', 'OKI', 10, '2021-03-25'),
	(105, 'Psychiatry', '1', 'OKI', 5, '2021-01-01'),
	(102, 'Emergency department', '10', 'Tachipirina', 10, '2020-04-25'),
	(100, 'Surgery', '3', 'Lasix', 10, '2020-09-01'),
	(106, 'Pneumology', '3', 'Lasix', 10, '2021-04-01'),
	(104, 'Neurology', '4', 'Cardura', 1, '2020-07-01'),
	(106, 'Pneumology', '4', 'Cardura', 5, '2020-10-01'),
	(101, 'Cardiology', '5', 'Almarytm', 10, '2020-09-05'),
	(103, 'Cardiac Surgery', '5', 'Almarytm', 10, '2020-09-01'),
	(104, 'Neurology', '5', 'Almarytm', 10, '2021-01-01'),
	(102, 'Emergency department', '6', 'Deltacortene', 10, '2021-04-01'),
	(103, 'Cardiac Surgery', '8', 'Coumadin', 10, '2021-04-01'),
	(103, 'Cardiac Surgery', '9', 'Mittoval', 2, '2020-07-01'),
	(106, 'Pneumology', '9', 'Mittoval', 3, '2021-04-01');
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
