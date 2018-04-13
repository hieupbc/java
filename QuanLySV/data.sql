-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Erstellungszeit: 13. Apr 2018 um 12:38
-- Server-Version: 5.6.35
-- PHP-Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Datenbank: `MVC2`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `class`
--

CREATE TABLE `class` (
  `classId` int(11) NOT NULL,
  `className` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `class`
--

INSERT INTO `class` (`classId`, `className`) VALUES
(1, 'Lớp 1'),
(2, 'Lớp 2'),
(3, 'Lớp 3');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1),
(1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `Role`
--

CREATE TABLE `Role` (
  `RoleID` int(11) NOT NULL,
  `rolename` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `Role`
--

INSERT INTO `Role` (`RoleID`, `rolename`) VALUES
(1, 'Admin'),
(2, 'Mod'),
(3, 'User');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `Student`
--

CREATE TABLE `Student` (
  `studentId` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  `class` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `Student`
--

INSERT INTO `Student` (`studentId`, `name`, `age`, `class`) VALUES
(1, 'Trần Văn Anh', 22, 1),
(2, 'Phạm Vinh', 24, 2),
(3, 'Trần Văn Anh', 22, 1),
(4, 'Phạm Hải Yến', 24, 2),
(5, 'Nguyễn Văn Phúc', 21, 3),
(6, 'Trần Phương ', 2, 3),
(7, 'Phạm Hương', 24, 1),
(8, 'Phạm C', 24, 2),
(9, 'Phạm D', 24, 2),
(10, 'Nguyễn Hà', 24, 2),
(11, 'Trần E', 2, 3),
(12, 'Trần F', 2, 3),
(13, 'Trần G', 2, 3),
(14, 'Nguyễn A', 22, 1),
(15, 'Trần X', 22, 1),
(16, 'Trần Z', 22, 1),
(17, 'Trần S', 22, 1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `User`
--

CREATE TABLE `User` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `role` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `User`
--

INSERT INTO `User` (`username`, `password`, `role`) VALUES
('admin', 'admin', 1),
('long', '111111', 3),
('mod', '111111', 2),
('quy', '111111', 3),
('rebel', '111111', 2),
('thinh', '111111', 3);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `class`
--
ALTER TABLE `class`
  ADD PRIMARY KEY (`classId`);

--
-- Indizes für die Tabelle `Role`
--
ALTER TABLE `Role`
  ADD PRIMARY KEY (`RoleID`);

--
-- Indizes für die Tabelle `Student`
--
ALTER TABLE `Student`
  ADD PRIMARY KEY (`studentId`),
  ADD KEY `class` (`class`);

--
-- Indizes für die Tabelle `User`
--
ALTER TABLE `User`
  ADD PRIMARY KEY (`username`),
  ADD KEY `role` (`role`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `class`
--
ALTER TABLE `class`
  MODIFY `classId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT für Tabelle `Role`
--
ALTER TABLE `Role`
  MODIFY `RoleID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT für Tabelle `Student`
--
ALTER TABLE `Student`
  MODIFY `studentId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `Student`
--
ALTER TABLE `Student`
  ADD CONSTRAINT `FKc46f56vqf7nvpiw5d8f6wgtfa` FOREIGN KEY (`class`) REFERENCES `class` (`classId`),
  ADD CONSTRAINT `student_ibfk_1` FOREIGN KEY (`class`) REFERENCES `class` (`classId`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints der Tabelle `User`
--
ALTER TABLE `User`
  ADD CONSTRAINT `FKfxvts538kdsdnyj96b808ojwh` FOREIGN KEY (`role`) REFERENCES `Role` (`RoleID`),
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`role`) REFERENCES `Role` (`RoleID`) ON DELETE CASCADE ON UPDATE CASCADE;
