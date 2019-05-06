-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 04, 2019 at 04:24 PM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 7.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `rakbuku`
--

CREATE TABLE `rakbuku` (
  `kodebuku` varchar(20) DEFAULT NULL,
  `rakprodi` varchar(10) DEFAULT NULL,
  `jumlahbuku` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rakbuku`
--

INSERT INTO `rakbuku` (`kodebuku`, `rakprodi`, `jumlahbuku`) VALUES
('IF212', 'IF', 15),
('IF-213', 'IF', 10);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `rakbuku`
--
ALTER TABLE `rakbuku`
  ADD KEY `kodebuku` (`kodebuku`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `rakbuku`
--
ALTER TABLE `rakbuku`
  ADD CONSTRAINT `rakbuku_ibfk_1` FOREIGN KEY (`kodebuku`) REFERENCES `buku` (`kodebuku`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
