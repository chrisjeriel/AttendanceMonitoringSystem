-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 19, 2017 at 02:03 AM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `amsys`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendances`
--

CREATE TABLE `attendances` (
  `ATTENDANCE_ID` int(7) NOT NULL,
  `SESSION_ID` int(11) NOT NULL,
  `ID_NUMBER` varchar(11) NOT NULL,
  `TIME_IN` datetime DEFAULT NULL,
  `TIME_OUT` datetime DEFAULT NULL,
  `FULL_NAME` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendances`
--

INSERT INTO `attendances` (`ATTENDANCE_ID`, `SESSION_ID`, `ID_NUMBER`, `TIME_IN`, `TIME_OUT`, `FULL_NAME`) VALUES
(1, 10003, 'OLA00088', '2017-05-07 00:29:10', '2017-05-07 09:59:27', 'ABAS, SHERRYL CAÑAVERAL'),
(2, 10003, '11309541', '2017-05-07 09:59:09', '2017-05-07 09:59:37', 'ABCEDE, MARY ANN UGAT'),
(3, 10003, '11109139', '2017-05-07 09:59:14', '2017-05-07 09:59:43', 'ABELLA, ARMA MENDOZA'),
(4, 10003, '11102980', '2017-05-07 09:59:19', '2017-05-07 09:59:51', 'ABELLA, URGIE BLANCAS'),
(5, 10000, '11413581', '2017-05-17 23:43:27', '2017-05-17 23:43:38', 'ABANCIA, SAMUEL NICK TRAVELLA'),
(6, 10000, 'OLA00088', '2017-05-17 23:44:00', '2017-05-17 23:44:08', 'ABAS, SHERRYL CAÑAVERAL'),
(7, 10000, 'ME300234', '2017-05-17 23:46:07', NULL, 'ABUEG, CELYN  YEN CAMARGO'),
(8, 10000, '11416519', '2017-05-17 23:50:27', '2017-05-17 23:50:48', 'ABLANG, ALBERT PAZ'),
(9, 10000, '11309541', '2017-05-17 23:52:07', '2017-05-17 23:52:14', 'ABCEDE, MARY ANN UGAT'),
(10, 10000, '11214590', '2017-05-17 23:52:21', NULL, 'ABAS, MOISES '),
(11, 10000, '11206511', '2017-05-17 23:52:26', NULL, 'ABKILAN, JOHN  PHILLIP GERALDO'),
(12, 10000, '11109139', '2017-05-17 23:52:32', NULL, 'ABELLA, ARMA MENDOZA'),
(13, 10000, '11102980', '2017-05-17 23:52:38', NULL, 'ABELLA, URGIE BLANCAS'),
(14, 10000, '11005324', '2017-05-17 23:52:45', NULL, 'ABION, JESUSA MADRIGAL'),
(15, 10000, '11001067', '2017-05-17 23:52:54', '2017-05-17 23:53:01', 'ADARLO, MARTY  KARL LANTICSE');

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE `members` (
  `ID` int(11) NOT NULL,
  `ID_NUMBER` varchar(8) DEFAULT NULL,
  `LAST_NAME` varchar(25) DEFAULT NULL,
  `FIRST_NAME` varchar(25) DEFAULT NULL,
  `MIDDLE_NAME` varchar(25) DEFAULT NULL,
  `SEX` varchar(6) DEFAULT NULL,
  `CIVIL_STATUS` varchar(20) DEFAULT NULL,
  `BLOOD_TYPE` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`ID`, `ID_NUMBER`, `LAST_NAME`, `FIRST_NAME`, `MIDDLE_NAME`, `SEX`, `CIVIL_STATUS`, `BLOOD_TYPE`) VALUES
(1, '11413581', 'ABANCIA', 'SAMUEL NICK', 'TRAVELLA', 'MALE', 'SINGLE', 'O'),
(2, '11214590', 'ABAS', 'MOISES', '', 'MALE', 'MARRIED', 'O'),
(3, 'OLA00088', 'ABAS', 'SHERRYL', 'CAÑAVERAL', 'FEMALE', 'MARRIED', 'O'),
(4, '11309541', 'ABCEDE', 'MARY', 'ANN UGAT', 'FEMALE', 'MARRIED', 'O'),
(5, '11109139', 'ABELLA', 'ARMA', 'MENDOZA', 'FEMALE', 'SINGLE', 'O'),
(6, '11102980', 'ABELLA', 'URGIE', 'BLANCAS', 'FEMALE', 'MARRIED', 'O'),
(7, '11005324', 'ABION', 'JESUSA', 'MADRIGAL', 'FEMALE', 'MARRIED', 'O'),
(8, '11206511', 'ABKILAN', 'JOHN', ' PHILLIP GERALDO', 'MALE', 'SINGLE', 'O'),
(9, '11416519', 'ABLANG', 'ALBERT', 'PAZ', 'MALE', 'MARRIED', 'O'),
(10, '00703896', 'ABORIDO', 'MORETO', 'FLORES', 'MALE', 'MARRIED', 'O'),
(11, '11402642', 'ABAUAG', 'EDWIN', 'BUAN', 'MALE', 'SINGLE', 'O'),
(12, 'ME300234', 'ABUEG', 'CELYN', ' YEN CAMARGO', 'FEMALE', 'MARRIED', 'O'),
(13, '11407137', 'ABUYAN', 'RAMIL', 'LAGANG', 'MALE', 'MARRIED', 'O'),
(14, 'CUB00639', 'ADARLO', 'MICHAEL', 'LANTICSE', 'MALE', 'MARRIED', 'O'),
(15, '00900854', 'ACUYONG', 'CYNTHIA', 'ESPINOSA', 'FEMALE', 'MARRIED', 'O'),
(16, '11001067', 'ADARLO', 'MARTY', ' KARL LANTICSE', 'MALE', 'SINGLE', 'O'),
(17, '11492633', 'ADARLO', 'MARIE', ' ELYZA LANTICSE', 'FEMALE', 'SINGLE', 'O');

-- --------------------------------------------------------

--
-- Table structure for table `sessions`
--

CREATE TABLE `sessions` (
  `SESSION_ID` int(5) NOT NULL,
  `SESSION_TYPE` varchar(5) NOT NULL,
  `TITLE` varchar(100) NOT NULL,
  `START` datetime NOT NULL,
  `END` datetime NOT NULL,
  `VIEW_TYPE` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sessions`
--

INSERT INTO `sessions` (`SESSION_ID`, `SESSION_TYPE`, `TITLE`, `START`, `END`, `VIEW_TYPE`) VALUES
(10000, '1', 'Thanksgiving', '2017-05-17 06:00:00', '2017-05-17 09:00:00', 'Live'),
(10001, '1', 'Thanksgiving', '2017-04-30 17:00:00', '2017-04-30 20:00:00', 'Viewing'),
(10002, '1', 'Thanksgiving', '2017-05-01 08:30:00', '2017-05-01 10:30:00', 'Viewing'),
(10003, '1', 'Thanksgiving', '2017-05-07 08:30:00', '2017-05-07 10:30:00', 'Viewing'),
(10004, '1', 'Thanksgiving', '2017-05-02 18:00:00', '2017-05-02 20:00:00', 'Viewing'),
(10005, '1', 'Thanksgiving', '2017-04-05 08:30:00', '2017-04-05 10:30:00', 'Viewing'),
(10006, '1', 'Thanksgiving', '2017-04-07 08:30:00', '2017-04-07 10:30:00', 'Viewing'),
(10007, '2', 'Worship Service', '2017-05-17 04:30:00', '2017-05-17 06:30:00', 'Live'),
(10008, '2', 'Worship Service', '2017-04-01 06:30:00', '2017-04-01 08:30:00', 'Live'),
(10009, '2', 'Worship Service', '2017-04-01 08:30:00', '2017-04-01 10:30:00', 'Live'),
(10010, '2', 'Worship Service', '2017-04-01 10:30:00', '2017-04-01 12:30:00', 'Live'),
(10011, '2', 'Worship Service', '2017-04-01 12:30:00', '2017-04-01 14:30:00', 'Live'),
(10012, '2', 'Worship Service', '2017-04-01 14:30:00', '2017-04-01 17:30:00', 'Live'),
(10013, '2', 'Worship Service', '2017-04-01 17:30:00', '2017-04-01 19:30:00', 'Live'),
(10014, '2', 'Worship Service', '2017-04-01 19:30:00', '2017-04-01 21:30:00', 'Live'),
(10015, '2', 'Worship Service', '2017-04-01 21:30:00', '2017-04-01 23:30:00', 'Viewing'),
(10016, '2', 'Worship Service', '2017-03-31 14:30:00', '2017-03-31 16:30:00', 'Viewing'),
(10017, '3', 'Prayer Meeting', '2017-05-17 04:30:00', '2017-05-17 06:30:00', 'Viewing'),
(10018, '3', 'Prayer Meeting', '2017-05-17 06:30:00', '2017-05-17 08:30:00', 'Viewing'),
(10019, '3', 'Prayer Meeting', '2017-04-05 08:30:00', '2017-04-05 10:30:00', 'Viewing'),
(10020, '3', 'Prayer Meeting', '2017-04-05 10:30:00', '2017-04-05 12:30:00', 'Viewing'),
(10021, '3', 'Prayer Meeting', '2017-04-05 12:30:00', '2017-04-05 14:30:00', 'Viewing'),
(10022, '3', 'Prayer Meeting', '2017-04-05 14:30:00', '2017-04-05 17:30:00', 'Viewing'),
(10023, '3', 'Prayer Meeting', '2017-04-05 17:30:00', '2017-04-05 19:30:00', 'Viewing'),
(10024, '3', 'Prayer Meeting', '2017-04-05 19:30:00', '2017-04-05 21:30:00', 'Viewing'),
(10025, '3', 'Prayer Meeting', '2017-04-05 21:30:00', '2017-04-05 23:30:00', 'Viewing');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendances`
--
ALTER TABLE `attendances`
  ADD PRIMARY KEY (`ATTENDANCE_ID`);

--
-- Indexes for table `members`
--
ALTER TABLE `members`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `sessions`
--
ALTER TABLE `sessions`
  ADD PRIMARY KEY (`SESSION_ID`) KEY_BLOCK_SIZE=5;

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `attendances`
--
ALTER TABLE `attendances`
  MODIFY `ATTENDANCE_ID` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `members`
--
ALTER TABLE `members`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT for table `sessions`
--
ALTER TABLE `sessions`
  MODIFY `SESSION_ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10026;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
