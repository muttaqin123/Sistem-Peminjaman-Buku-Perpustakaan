-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 04, 2019 at 04:23 PM
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
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `nip` varchar(11) NOT NULL,
  `nama` varchar(40) DEFAULT NULL,
  `username` varchar(25) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`nip`, `nama`, `username`, `password`) VALUES
('0101', 'mangkuto', 'mangkuto', '12345'),
('098908', '098908', '908', '980'),
('123', 'saddsa13', 'dsf', '341'),
('12345', '213', '13', '123'),
('123456', 'chanzu', 'chanzuaja', '123'),
('1234567', 'itera', 'itera2019', '12345'),
('123457', 'telaga', 'telaga', '123'),
('123546', 'otong', 'otongsutontong', '12345'),
('1411', 'faqqih', 'faqqih7', '123'),
('14117095', 'alya', 'alle', '123456'),
('14117111', 'yopan', 'yopaneko', '1234'),
('14117122', 'talitha', 'batari', 'tebe123'),
('14117138', 'Muttaqin', 'muttaqin7', '123456'),
('14117161', 'yopan', 'yopan7', '123456'),
('189218', 'doraemon', 'brand', '123'),
('1999', 'dedewahyuda', 'dedew', '12345'),
('199901', 'doraemon', 'bolaemon', '123456'),
('576', '567567', '675', '123'),
('75', '32', '465', '465');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`nip`),
  ADD UNIQUE KEY `username` (`username`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
