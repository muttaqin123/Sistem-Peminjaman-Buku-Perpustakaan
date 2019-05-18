-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 16, 2019 at 03:45 AM
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
('121212', 'tebe', 'tebetebe', '1234'),
('123456', 'chanzu', 'chanzuaja', '123'),
('123457', 'telaga', 'telaga', '123'),
('14117095', 'alya', 'alle', '123456'),
('14117111', 'yopan', 'yopaneko', '1234'),
('14117122', 'talitha', 'batari', 'tebe123'),
('14117138', 'Muttaqin', 'muttaqin7', '123456'),
('14117161', 'yopan', 'yopan7', '123456'),
('1716031083', 'Rahmad Septiadi', 'zypper_roo', '123');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `kodebuku` varchar(20) NOT NULL,
  `judulbuku` varchar(50) DEFAULT NULL,
  `pengarang` varchar(30) DEFAULT NULL,
  `penerbit` varchar(30) DEFAULT NULL,
  `tahunterbit` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`kodebuku`, `judulbuku`, `pengarang`, `penerbit`, `tahunterbit`) VALUES
('OOP-04', 'Pemrograman Berbasis Objek', 'Ahmad Luky Ramdani', 'Informatika Itera', 2015),
('TBFO-02', 'Teori Bahasa Formal dan Otomata', 'Rahman Indra Kesuma', 'Informatika Itera', 2016);

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `NIP` int(11) NOT NULL,
  `nama` varchar(40) DEFAULT NULL,
  `prodi` varchar(20) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `telepon` varchar(13) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dosen`
--

INSERT INTO `dosen` (`NIP`, `nama`, `prodi`, `alamat`, `telepon`, `status`) VALUES
(19202345, 'Rajif Agung', 'IF', 'Way Huwi', '08994264065', 'Dosen');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `NIM` int(11) NOT NULL,
  `nama` varchar(40) DEFAULT NULL,
  `prodi` varchar(40) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `telepon` varchar(13) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`NIM`, `nama`, `prodi`, `alamat`, `telepon`, `status`) VALUES
(14117122, 'Talitha Batari', 'IF', 'Way Kandis', '085279665114', 'Mahasiswa'),
(14117138, 'Muhammad Muttaqin', 'IF', 'Kemiling', '089626613284', 'Mahasiswa'),
(14117151, 'Muhammad Yusuf Rizaldi', 'IF', 'Natar', '085279967705', 'Mahasiswa'),
(14117161, 'Yopan Eko Situmorang', 'IF', 'Way Huwi', '089615669326', 'Mahasiswa');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id_peminjaman` varchar(10) NOT NULL,
  `kodebuku` varchar(20) DEFAULT NULL,
  `NIM` int(11) DEFAULT NULL,
  `NIP` int(11) DEFAULT NULL,
  `tgl_pinjam` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`id_peminjaman`, `kodebuku`, `NIM`, `NIP`, `tgl_pinjam`) VALUES
('1', 'TBFO-02', 14117138, NULL, '2019-05-11');

-- --------------------------------------------------------

--
-- Table structure for table `rakbuku`
--

CREATE TABLE `rakbuku` (
  `idrak` varchar(20) NOT NULL,
  `kodebuku` varchar(20) DEFAULT NULL,
  `tipebuku` varchar(15) DEFAULT NULL,
  `jumlahbuku` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rakbuku`
--

INSERT INTO `rakbuku` (`idrak`, `kodebuku`, `tipebuku`, `jumlahbuku`) VALUES
('IF-001', 'OOP-04', 'IF', 10),
('IF-002', 'TBFO-02', 'IF', 15);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`nip`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`kodebuku`);

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`NIP`),
  ADD UNIQUE KEY `telepon` (`telepon`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`NIM`),
  ADD UNIQUE KEY `telepon` (`telepon`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`id_peminjaman`),
  ADD KEY `kodebuku` (`kodebuku`),
  ADD KEY `NIM` (`NIM`),
  ADD KEY `NIP` (`NIP`);

--
-- Indexes for table `rakbuku`
--
ALTER TABLE `rakbuku`
  ADD PRIMARY KEY (`idrak`),
  ADD KEY `kodebuku` (`kodebuku`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `peminjaman_ibfk_1` FOREIGN KEY (`kodebuku`) REFERENCES `buku` (`kodebuku`),
  ADD CONSTRAINT `peminjaman_ibfk_2` FOREIGN KEY (`NIM`) REFERENCES `mahasiswa` (`NIM`),
  ADD CONSTRAINT `peminjaman_ibfk_3` FOREIGN KEY (`NIP`) REFERENCES `dosen` (`NIP`);

--
-- Constraints for table `rakbuku`
--
ALTER TABLE `rakbuku`
  ADD CONSTRAINT `rakbuku_ibfk_1` FOREIGN KEY (`kodebuku`) REFERENCES `buku` (`kodebuku`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
