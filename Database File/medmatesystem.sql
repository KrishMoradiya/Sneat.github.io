-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 16, 2022 at 04:39 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `medmatesystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `medinfo`
--

CREATE TABLE `medinfo` (
  `MedID` int(5) NOT NULL,
  `MedName` varchar(50) NOT NULL,
  `MedQt` int(11) NOT NULL,
  `inStockQty` int(11) NOT NULL,
  `MedCP` int(11) NOT NULL,
  `MedSP` int(11) NOT NULL,
  `MedExDate` datetime NOT NULL,
  `MedType` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `medinfo`
--

INSERT INTO `medinfo` (`MedID`, `MedName`, `MedQt`, `inStockQty`, `MedCP`, `MedSP`, `MedExDate`, `MedType`) VALUES
(5, 'Ecosprine', 10, 30, 32, 40, '2023-06-30 00:00:00', 'Capsule'),
(6, 'LTK-AM', 50, 50, 30, 35, '2023-04-13 00:00:00', 'Pills'),
(7, 'Recodus-X', 25, 25, 45, 55, '2025-12-25 00:00:00', 'Syrup'),
(8, 'Azithromicin-500', 50, 50, 55, 70, '2025-02-19 00:00:00', 'Pills'),
(9, 'Disprin', 100, 100, 15, 22, '2024-02-15 00:00:00', 'Pills'),
(10, 'Ecosprine-Gold', 60, 60, 40, 50, '2024-01-26 00:00:00', 'Capsule'),
(11, 'Codeine 15', 50, 50, 56, 72, '2024-11-28 00:00:00', 'Syrup'),
(12, 'DOLO', 50, 50, 85, 95, '2023-06-15 00:00:00', 'Pills');

-- --------------------------------------------------------

--
-- Table structure for table `userinfo`
--

CREATE TABLE `userinfo` (
  `ID` int(4) NOT NULL,
  `Name` varchar(60) NOT NULL,
  `UserName` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userinfo`
--

INSERT INTO `userinfo` (`ID`, `Name`, `UserName`, `Password`) VALUES
(1, 'Krish Moradiya', 'Krish', '123'),
(2, 'DARSHAN Pansuriya', 'Darshan', '321'),
(6, 'Het Joshi', 'Het', '321'),
(7, 'Divy Jain', 'Divy', '123'),
(8, 'Dev J', 'Dev', '123'),
(11, 'Darshan Pansuriya', 'Darshan123', 'd123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `medinfo`
--
ALTER TABLE `medinfo`
  ADD PRIMARY KEY (`MedID`),
  ADD UNIQUE KEY `MedName` (`MedName`);

--
-- Indexes for table `userinfo`
--
ALTER TABLE `userinfo`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `UserName` (`UserName`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `medinfo`
--
ALTER TABLE `medinfo`
  MODIFY `MedID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `userinfo`
--
ALTER TABLE `userinfo`
  MODIFY `ID` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

