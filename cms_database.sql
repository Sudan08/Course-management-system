-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: Feb 08, 2023 at 09:04 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cms`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `AdminID` int(11) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`AdminID`, `Username`, `Password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `admindetails`
--

CREATE TABLE `admindetails` (
  `AdminID` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `DOB` date NOT NULL,
  `PhoneNumber` bigint(10) NOT NULL,
  `EmailAddress` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admindetails`
--

INSERT INTO `admindetails` (`AdminID`, `Name`, `DOB`, `PhoneNumber`, `EmailAddress`) VALUES
(1, 'Sudan Shakya', '2002-08-22', 9861495575, 'sudanshakya08@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `assigment`
--

CREATE TABLE `assigment` (
  `AssignmentID` int(11) NOT NULL,
  `Question` varchar(255) NOT NULL,
  `Module` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `assigment`
--

INSERT INTO `assigment` (`AssignmentID`, `Question`, `Module`) VALUES
(2, 'What is Data?', 'AI'),
(4, 'What is OOP?', 'OOP'),
(5, 'What is Inheritance?', 'OOP'),
(9, 'What is concurrency?', 'NMC');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `Courseid` int(10) NOT NULL,
  `CourseName` varchar(255) NOT NULL,
  `CourseDescription` varchar(255) NOT NULL,
  `NoofModules` int(10) NOT NULL,
  `Status` varchar(255) NOT NULL,
  `Duration` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`Courseid`, `CourseName`, `CourseDescription`, `NoofModules`, `Status`, `Duration`) VALUES
(1, 'BIT', 'ComputerScience', 8, 'Enabled', 3),
(4, 'IMBA', 'mastersinbusiness', 10, 'Disabled', 3),
(11, 'Bibm', 'Business', 6, 'Enabled', 8),
(15, 'MIT', 'masters in technology', 8, 'Disabled', 2);

-- --------------------------------------------------------

--
-- Table structure for table `module`
--

CREATE TABLE `module` (
  `ModuleID` int(10) NOT NULL,
  `CourseID` int(10) NOT NULL,
  `ModuleName` varchar(255) NOT NULL,
  `Module Leader` varchar(255) NOT NULL,
  `Level` varchar(255) NOT NULL,
  `Semester` varchar(255) NOT NULL,
  `Credithour` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `module`
--

INSERT INTO `module` (`ModuleID`, `CourseID`, `ModuleName`, `Module Leader`, `Level`, `Semester`, `Credithour`) VALUES
(1, 1, 'OOP', 'Raj Shrestha', '5', '3', '60'),
(3, 4, 'Business Administration', 'Sakar Shrestha123', '5', '3', '30');

-- --------------------------------------------------------

--
-- Table structure for table `stdsubmission`
--

CREATE TABLE `stdsubmission` (
  `SubmissionID` int(11) NOT NULL,
  `AssignmentID` int(11) NOT NULL,
  `Module` varchar(255) NOT NULL,
  `StudentID` int(11) NOT NULL,
  `UniID` int(11) NOT NULL,
  `StudentName` varchar(255) NOT NULL,
  `Question` varchar(255) NOT NULL,
  `Answer` varchar(255) NOT NULL,
  `Marks` varchar(255) NOT NULL,
  `Published` varchar(255) NOT NULL,
  `Status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stdsubmission`
--

INSERT INTO `stdsubmission` (`SubmissionID`, `AssignmentID`, `Module`, `StudentID`, `UniID`, `StudentName`, `Question`, `Answer`, `Marks`, `Published`, `Status`) VALUES
(1, 2, 'AI', 8, 2226422, 'Sudan', 'What is Data?', 'Data is sth that has value and represents sth significant', '80', 'true', 'passed'),
(5, 4, 'OOP', 8, 2226422, 'Sudan', 'What is OOP?', 'Oop is object oriented programming', '98', 'true', 'passed'),
(6, 5, 'OOP', 8, 2226422, 'Sudan', 'What is Inheritance?', 'Inheritance is a concept in OOP', '45', 'true', 'passed'),
(9, 9, 'NMC', 8, 2226422, 'Sudan', 'What is concurrency?', 'Concurrency is using one thread to do multiple work in rapid speed ', '35', 'true', 'failed'),
(10, 9, 'NMC', 14, 22234, 'ElonMusk', 'What is concurrency?', 'Concurrency is one of the method of doing task where the task seems to being handled parallely but not.', '', 'false', 'failed');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `StudentID` bigint(100) NOT NULL,
  `UniID` bigint(100) NOT NULL,
  `Username` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`StudentID`, `UniID`, `Username`, `Password`) VALUES
(8, 2226422, 'Sudan08', 'nicenice'),
(14, 22234, 'Elon123', '123');

-- --------------------------------------------------------

--
-- Table structure for table `studentdetails`
--

CREATE TABLE `studentdetails` (
  `StudentDetailsId` int(100) NOT NULL,
  `StudentID` bigint(100) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Phonenumber` bigint(100) NOT NULL,
  `Emailaddress` varchar(255) NOT NULL,
  `DOB` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `Level` int(100) NOT NULL,
  `Semester` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `studentdetails`
--

INSERT INTO `studentdetails` (`StudentDetailsId`, `StudentID`, `Name`, `Phonenumber`, `Emailaddress`, `DOB`, `Address`, `Gender`, `Level`, `Semester`) VALUES
(1, 8, 'Sudan', 9861495575, 'sudanshakya08@gmail.com', 'Tue Jan 17 00:00:00 NPT 2023', 'Boudha', 'Male', 6, 3),
(6, 14, 'ElonMusk', 12312, 'elonmusk@gmail.com', 'Wed Feb 15 13:22:04 NPT 2023', 'Silicon Valley', 'Male', 5, 4);

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `TeacherID` int(11) NOT NULL,
  `Username` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`TeacherID`, `Username`, `Password`) VALUES
(23, 'Yukta123', '12345'),
(28, 'Raj123', '12345678');

-- --------------------------------------------------------

--
-- Table structure for table `teacherdetails`
--

CREATE TABLE `teacherdetails` (
  `TeacherDetailsID` int(11) NOT NULL,
  `TeacherID` int(11) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `DOB` varchar(255) NOT NULL,
  `Phonenumber` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `EmailAddress` varchar(255) NOT NULL,
  `Module` varchar(255) NOT NULL,
  `Qualification` varchar(255) NOT NULL,
  `Position` varchar(255) NOT NULL,
  `Gender` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacherdetails`
--

INSERT INTO `teacherdetails` (`TeacherDetailsID`, `TeacherID`, `Name`, `DOB`, `Phonenumber`, `Address`, `EmailAddress`, `Module`, `Qualification`, `Position`, `Gender`) VALUES
(18, 23, 'Yukta', 'Tue Jan 03 00:00:00 NPT 2023', '12312412', 'patan', 'yuki@gmail.com', 'AI', 'Bachelor', 'Leturer', 'Female'),
(23, 28, 'Raj Shrestha', 'Mon Feb 05 13:44:24 NPT 1996', '9823345678', 'Kathmandu', 'raj@gmail.com', 'OOP', 'Masters in IT', 'Tutor', 'Male');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`AdminID`);

--
-- Indexes for table `admindetails`
--
ALTER TABLE `admindetails`
  ADD KEY `AdminID` (`AdminID`);

--
-- Indexes for table `assigment`
--
ALTER TABLE `assigment`
  ADD PRIMARY KEY (`AssignmentID`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`Courseid`);

--
-- Indexes for table `module`
--
ALTER TABLE `module`
  ADD PRIMARY KEY (`ModuleID`),
  ADD KEY `CourseID` (`CourseID`);

--
-- Indexes for table `stdsubmission`
--
ALTER TABLE `stdsubmission`
  ADD PRIMARY KEY (`SubmissionID`),
  ADD KEY `AssignmentID` (`AssignmentID`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`StudentID`);

--
-- Indexes for table `studentdetails`
--
ALTER TABLE `studentdetails`
  ADD PRIMARY KEY (`StudentDetailsId`),
  ADD KEY `StudentID` (`StudentID`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`TeacherID`);

--
-- Indexes for table `teacherdetails`
--
ALTER TABLE `teacherdetails`
  ADD PRIMARY KEY (`TeacherDetailsID`),
  ADD KEY `TeacherID` (`TeacherID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `AdminID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `assigment`
--
ALTER TABLE `assigment`
  MODIFY `AssignmentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `course`
--
ALTER TABLE `course`
  MODIFY `Courseid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `module`
--
ALTER TABLE `module`
  MODIFY `ModuleID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `stdsubmission`
--
ALTER TABLE `stdsubmission`
  MODIFY `SubmissionID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `StudentID` bigint(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `studentdetails`
--
ALTER TABLE `studentdetails`
  MODIFY `StudentDetailsId` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `teacher`
--
ALTER TABLE `teacher`
  MODIFY `TeacherID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `teacherdetails`
--
ALTER TABLE `teacherdetails`
  MODIFY `TeacherDetailsID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `admindetails`
--
ALTER TABLE `admindetails`
  ADD CONSTRAINT `AdminID` FOREIGN KEY (`AdminID`) REFERENCES `admin` (`AdminID`);

--
-- Constraints for table `module`
--
ALTER TABLE `module`
  ADD CONSTRAINT `CourseID` FOREIGN KEY (`CourseID`) REFERENCES `course` (`Courseid`);

--
-- Constraints for table `stdsubmission`
--
ALTER TABLE `stdsubmission`
  ADD CONSTRAINT `AssignmentID` FOREIGN KEY (`AssignmentID`) REFERENCES `assigment` (`AssignmentID`);

--
-- Constraints for table `studentdetails`
--
ALTER TABLE `studentdetails`
  ADD CONSTRAINT `StudentID` FOREIGN KEY (`StudentID`) REFERENCES `student` (`StudentID`);

--
-- Constraints for table `teacherdetails`
--
ALTER TABLE `teacherdetails`
  ADD CONSTRAINT `TeacherID` FOREIGN KEY (`TeacherID`) REFERENCES `teacher` (`TeacherID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
