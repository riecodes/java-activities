-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 03, 2024 at 01:58 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `laundrydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `drydetails`
--

CREATE TABLE `drydetails` (
  `dry_id` int(11) NOT NULL,
  `transaction_id` int(11) DEFAULT NULL,
  `opted_for_dry` tinyint(1) DEFAULT 0,
  `dry_cost` decimal(10,2) DEFAULT 0.00,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE `transactions` (
  `transaction_id` int(11) NOT NULL,
  `wash_amount` decimal(10,2) DEFAULT 0.00,
  `dry_amount` decimal(10,2) DEFAULT 0.00,
  `total_amount` decimal(10,2) DEFAULT 0.00,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `washdetails`
--

CREATE TABLE `washdetails` (
  `wash_id` int(11) NOT NULL,
  `transaction_id` int(11) DEFAULT NULL,
  `weight_kg` int(11) DEFAULT NULL CHECK (`weight_kg` between 1 and 8),
  `detergent` enum('Ariel','Pride') DEFAULT NULL,
  `fabric_conditioner` enum('Downy','Surf') DEFAULT NULL,
  `detergent_cost` decimal(10,2) DEFAULT 11.00,
  `fabric_conditioner_cost` decimal(10,2) DEFAULT 16.00,
  `total_wash_amount` decimal(10,2) DEFAULT 60.00,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `drydetails`
--
ALTER TABLE `drydetails`
  ADD PRIMARY KEY (`dry_id`),
  ADD KEY `transaction_id` (`transaction_id`);

--
-- Indexes for table `transactions`
--
ALTER TABLE `transactions`
  ADD PRIMARY KEY (`transaction_id`);

--
-- Indexes for table `washdetails`
--
ALTER TABLE `washdetails`
  ADD PRIMARY KEY (`wash_id`),
  ADD KEY `transaction_id` (`transaction_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `drydetails`
--
ALTER TABLE `drydetails`
  MODIFY `dry_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `transactions`
--
ALTER TABLE `transactions`
  MODIFY `transaction_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `washdetails`
--
ALTER TABLE `washdetails`
  MODIFY `wash_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `drydetails`
--
ALTER TABLE `drydetails`
  ADD CONSTRAINT `drydetails_ibfk_1` FOREIGN KEY (`transaction_id`) REFERENCES `transactions` (`transaction_id`) ON DELETE CASCADE;

--
-- Constraints for table `washdetails`
--
ALTER TABLE `washdetails`
  ADD CONSTRAINT `washdetails_ibfk_1` FOREIGN KEY (`transaction_id`) REFERENCES `transactions` (`transaction_id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
