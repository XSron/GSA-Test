-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Feb 26, 2020 at 05:26 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `HCMC`
--

-- --------------------------------------------------------

--
-- Table structure for table `Patients`
--

CREATE TABLE `Patients` (
  `id` int(11) NOT NULL,
  `patientnumber` varchar(100) NOT NULL,
  `isanoutpatient` tinyint(1) NOT NULL,
  `fullname` varchar(100) NOT NULL,
  `emailaddress` varchar(100) NOT NULL,
  `contact` varchar(20) NOT NULL,
  `dob` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Patients`
--

INSERT INTO `Patients` (`id`, `patientnumber`, `isanoutpatient`, `fullname`, `emailaddress`, `contact`, `dob`) VALUES
(4, 'EP1000002', 0, 'Ann-Marie Washington', 'aswashington@hcmc.org', '(641) 002-0034', '1949-12-03'),
(5, 'EP1000003', 1, 'Diego A. Ortiz', '', '', '1950-01-31'),
(6, 'P1000001', 1, 'John H. Smith', 'jhsmith@globalmail.net', '(641) 001-0012', '1959-05-21'),
(7, 'EP1000004', 0, 'Rebecca Jane Andrews', '', '(123)001-1234', '1945-03-18'),
(8, 'P1000005', 1, 'Richard \"Dooley\" K. Albertson', 'richie.albertson@gmail.com', '', '1954-11-07');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Patients`
--
ALTER TABLE `Patients`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Patients`
--
ALTER TABLE `Patients`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
