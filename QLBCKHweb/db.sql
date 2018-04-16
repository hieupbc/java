-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Erstellungszeit: 16. Apr 2018 um 23:28
-- Server-Version: 5.6.35
-- PHP-Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Datenbank: `QuanLyBaoCaoKhoaHoc`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `BaoCao`
--

CREATE TABLE `BaoCao` (
  `IDBaoCao` int(11) NOT NULL,
  `TenBaoCao` varchar(50) NOT NULL,
  `TheLoaiBaoCao` int(11) NOT NULL,
  `DuongDan` varchar(50) NOT NULL,
  `NgayHoanThanh` date NOT NULL,
  `LinhVuc` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `BaoCao`
--

INSERT INTO `BaoCao` (`IDBaoCao`, `TenBaoCao`, `TheLoaiBaoCao`, `DuongDan`, `NgayHoanThanh`, `LinhVuc`) VALUES
(21, 'seafood', 3, 'Bibendum Corp.', '2017-04-28', 2),
(22, 'soups, cereals', 5, 'Auctor Associates', '2018-04-23', 1),
(23, '', 2, 'Tempor Lorem Eget Associates', '2014-12-02', 5),
(24, '', 2, 'Ipsum Primis In Ltd', '2019-03-31', 5),
(25, 'cereals, pasta', 3, 'Arcu Sed Eu Company', '2014-07-21', 6),
(26, '', 6, 'Odio Phasellus At Incorporated', '2017-06-15', 7),
(27, 'sandwiches, pasta, noodles', 5, 'Magnis Dis PC', '2017-09-13', 6),
(28, '', 5, 'Mauris Rhoncus Id PC', '2016-01-13', 5),
(29, '', 3, 'Ligula Nullam Feugiat PC', '2018-05-31', 2),
(30, 'stews, seafood', 3, 'Faucibus Id Inc.', '2016-03-17', 2),
(31, '', 3, 'Vel Convallis LLC', '2015-08-03', 3),
(32, '', 6, 'Non Inc.', '2019-03-26', 2),
(33, 'desserts, pasta', 4, 'Eu Tellus Eu LLP', '2016-01-04', 4),
(34, 'pies', 6, 'Fusce Aliquam Industries', '2017-03-11', 4),
(35, '', 4, 'Tortor Nibh Associates', '2017-10-18', 2),
(36, 'soups, sandwiches, seafood', 4, 'Malesuada Institute', '2019-02-15', 7),
(37, '', 2, 'Quis Urna Nunc Consulting', '2017-05-19', 5),
(38, '', 6, 'Erat Corporation', '2018-03-12', 7),
(39, 'cereals, noodles, pasta', 5, 'Rhoncus Company', '2018-07-11', 3),
(40, 'stews, seafood', 4, 'Semper Auctor Corp.', '2014-10-08', 6),
(41, 'stews', 6, 'Hendrerit Id Ante Associates', '2014-08-03', 3),
(42, '', 5, 'Nunc Institute', '2016-05-06', 6),
(43, 'seafood, pasta', 6, 'Fusce Fermentum Fermentum Inc.', '2014-08-21', 5),
(44, '', 4, 'Faucibus Id Libero Company', '2015-01-19', 4),
(45, '', 5, 'Sagittis Semper Nam Company', '2017-05-07', 1),
(46, 'cereals, pies, seafood', 2, 'Vel Convallis In LLC', '2017-10-24', 1),
(47, 'cereals', 6, 'Diam Pellentesque Habitant Foundation', '2014-12-24', 6),
(48, '', 1, 'Enim Nisl Inc.', '2017-08-20', 6),
(49, 'desserts, noodles, pies', 2, 'Erat Foundation', '2018-06-10', 6),
(50, 'cereals, seafood', 2, 'Semper PC', '2018-04-06', 5),
(51, 'stews, pies, sandwiches', 5, 'Euismod Ac Fermentum Industries', '2015-09-05', 1),
(52, 'pies, noodles', 2, 'Orci Luctus Et Foundation', '2016-02-11', 2),
(53, '', 3, 'Amet Risus Associates', '2017-07-15', 6),
(54, 'cereals, desserts, sandwiches', 5, 'Aliquam Nisl Inc.', '2018-07-26', 6),
(55, '', 4, 'Dui Nec PC', '2016-10-13', 4),
(56, 'pasta', 2, 'Donec Luctus Aliquet LLC', '2017-05-30', 4),
(57, 'soups, seafood, sandwiches', 2, 'Sem Semper Institute', '2014-10-05', 4),
(58, 'salads', 2, 'Orci Adipiscing Non Industries', '2014-07-28', 5),
(59, 'pasta, seafood', 6, 'Donec Limited', '2016-10-01', 3),
(60, 'pies, desserts, sandwiches', 4, 'Nec Euismod Incorporated', '2018-11-06', 7),
(61, 'seafood, soups, cereals', 6, 'Mi Enim Condimentum LLC', '2015-04-04', 3),
(62, 'stews, seafood', 4, 'Ornare In Faucibus Limited', '2017-06-27', 7),
(63, '', 2, 'Ullamcorper Ltd', '2018-01-14', 7),
(64, 'soups, seafood', 1, 'Dolor Quam Elementum Corporation', '2018-10-18', 1),
(65, 'desserts, stews', 4, 'Condimentum Limited', '2014-06-11', 3),
(66, 'desserts, pasta', 3, 'Arcu Vivamus Sit Ltd', '2019-01-27', 1),
(67, 'sandwiches', 1, 'Dictum Placerat Augue Incorporated', '2018-07-28', 5),
(68, 'stews', 5, 'Non Consulting', '2016-06-15', 6),
(69, '', 6, 'Nullam Feugiat Placerat PC', '2015-07-09', 7),
(70, 'salads', 6, 'Nunc Sed Pede Associates', '2014-12-10', 6),
(71, '', 6, 'Eu Nulla At Consulting', '2017-06-22', 4),
(72, '', 3, 'Massa Quisque LLC', '2016-03-08', 5),
(73, 'pasta, pies', 2, 'Et Ipsum Incorporated', '2015-08-22', 2),
(74, '', 4, 'Diam Vel Arcu Inc.', '2017-09-10', 1),
(75, 'soups, pasta', 4, 'Dolor Quisque Tincidunt Incorporated', '2015-08-08', 6),
(76, 'sandwiches, seafood, stews', 6, 'Ante Bibendum Ullamcorper Corporation', '2017-09-02', 1),
(77, '', 4, 'Sed Congue Corp.', '2014-04-11', 6),
(78, 'cereals', 5, 'Libero Dui Nec Incorporated', '2017-07-11', 4),
(79, 'sandwiches', 4, 'Ipsum Primis LLC', '2017-09-20', 7),
(80, '', 2, 'Montes Nascetur Ridiculus Inc.', '2019-01-20', 1),
(81, '', 4, 'Nibh Industries', '2017-06-26', 4),
(82, '', 6, 'Mauris Industries', '2014-09-07', 7),
(83, '', 4, 'Faucibus Ltd', '2017-06-29', 6),
(84, 'cereals', 4, 'At Pede PC', '2018-08-10', 4),
(85, '', 6, 'Est Company', '2019-04-15', 2),
(86, 'pasta, pies', 5, 'Auctor Corp.', '2016-11-09', 4),
(87, '', 3, 'Vulputate Dui Company', '2016-03-27', 1),
(88, 'sandwiches, pies, stews', 2, 'Lectus PC', '2016-07-17', 4),
(89, 'stews, salads, seafood', 4, 'Dolor Tempus LLP', '2017-04-16', 6),
(90, 'cereals', 6, 'Augue LLP', '2019-01-23', 7),
(91, 'pies, sandwiches', 4, 'Ultrices A Auctor Limited', '2014-08-31', 6),
(92, 'sandwiches, noodles, soups', 2, 'Dolor Quam Company', '2017-04-08', 7),
(93, 'seafood, pasta, soups', 4, 'Velit Pellentesque LLP', '2019-01-12', 4),
(94, 'stews, pasta, seafood', 1, 'Lorem Inc.', '2017-03-06', 1),
(95, 'desserts, salads, sandwiches', 3, 'Maecenas Libero Est Inc.', '2019-03-17', 3),
(96, 'pies', 4, 'Mauris Erat Eget Institute', '2015-10-21', 7),
(97, '', 5, 'Leo Morbi PC', '2017-02-23', 3),
(98, '', 5, 'Suscipit Foundation', '2014-07-30', 1),
(99, 'pies, pasta, soups', 3, 'Lorem Ipsum Dolor Corp.', '2016-01-11', 2),
(100, 'noodles', 5, 'Rhoncus Id Mollis Inc.', '2017-05-07', 1),
(101, 'sandwiches, pies', 2, 'Erat Vivamus Nisi Incorporated', '2018-09-18', 2),
(102, 'pasta, stews', 5, 'In Ornare Sagittis LLC', '2017-04-12', 6),
(103, 'noodles', 3, 'Mi Ac Mattis Associates', '2014-12-31', 7),
(104, 'salads, stews', 3, 'Ligula Consectetuer Incorporated', '2016-12-25', 5),
(105, '', 1, 'Placerat Velit LLC', '2018-01-17', 2),
(106, 'soups, noodles, pies', 4, 'Elementum PC', '2018-05-07', 6),
(107, 'pasta, salads, soups', 5, 'Est Mollis Ltd', '2015-06-22', 6),
(108, 'pies, cereals', 2, 'Purus Gravida Institute', '2015-05-16', 3),
(109, 'sandwiches, salads', 6, 'Ut Pellentesque Eget Limited', '2016-08-20', 5),
(110, 'cereals, noodles', 5, 'Amet Ultricies Sem Institute', '2018-09-19', 2),
(111, 'desserts, stews', 2, 'Lorem Donec LLP', '2019-03-04', 5),
(112, 'stews, sandwiches, desserts', 5, 'Ornare Foundation', '2018-07-24', 7),
(113, 'pies, pasta', 6, 'In Consectetuer Ipsum Associates', '2015-03-21', 4),
(114, 'pies, salads, sandwiches', 4, 'Duis At Consulting', '2016-03-12', 2),
(115, '', 5, 'Ligula Aenean Gravida Consulting', '2018-05-01', 3),
(116, '', 3, 'Et Rutrum LLP', '2016-11-02', 1),
(117, 'seafood', 1, 'Consectetuer Ipsum Nunc LLP', '2014-05-01', 4),
(118, 'noodles', 5, 'Est Industries', '2015-08-27', 2),
(119, 'sandwiches, pasta', 5, 'Proin Mi Industries', '2018-01-26', 2),
(120, 'seafood, noodles, soups', 3, 'Sed Industries', '2017-05-04', 6);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `Baocao_Nguoithuchien`
--

CREATE TABLE `Baocao_Nguoithuchien` (
  `IDBaoCao` int(11) NOT NULL,
  `IDNguoiThucHien` int(11) NOT NULL,
  `VaiTro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `ChucDanh`
--

CREATE TABLE `ChucDanh` (
  `MaChucDanh` int(11) NOT NULL,
  `TenChucDanh` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `CoQuan`
--

CREATE TABLE `CoQuan` (
  `MaCoQuan` int(11) NOT NULL,
  `TenCoQuan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
(1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `LinhVuc`
--

CREATE TABLE `LinhVuc` (
  `IdLinhVuc` int(11) NOT NULL,
  `TenLinhVuc` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `LinhVuc`
--

INSERT INTO `LinhVuc` (`IdLinhVuc`, `TenLinhVuc`) VALUES
(1, 'Tin Học'),
(2, 'Nông Nghiệp'),
(3, 'Tự Động Hóa'),
(4, 'Xây Dựng'),
(5, 'Kiến Trúc'),
(6, 'Sinh Học'),
(7, 'Toán Học');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `NguoiSuDung`
--

CREATE TABLE `NguoiSuDung` (
  `UserID` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `QuyenHan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `NguoiSuDung`
--

INSERT INTO `NguoiSuDung` (`UserID`, `Password`, `QuyenHan`) VALUES
('admin', 'admin', 1),
('Aladdin', '121212', 1),
('Francis', '65934', 1),
('hieu', '123456', 1),
('Jared', '76674', 2),
('Jonas', '27019', 2),
('Joshua', '65213daa', 1),
('Kareem', '370190', 2),
('Lee', '96693', 1),
('Martin', '23955', 2),
('phuong', 'bongda', 2),
('Uriel', '68341', 2),
('Zeph', '24550', 2);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `NhaKhoaHoc`
--

CREATE TABLE `NhaKhoaHoc` (
  `MaNhaKhoaHoc` int(11) NOT NULL,
  `Ten` varchar(50) NOT NULL,
  `NgaySinh` date NOT NULL,
  `ChucDanh` int(11) NOT NULL,
  `CoQuan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `QuyenHan`
--

CREATE TABLE `QuyenHan` (
  `IDQuyenHan` int(11) NOT NULL,
  `TenQuyenHan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `QuyenHan`
--

INSERT INTO `QuyenHan` (`IDQuyenHan`, `TenQuyenHan`) VALUES
(1, 'admin'),
(2, 'member');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `TheLoaiBaoCao`
--

CREATE TABLE `TheLoaiBaoCao` (
  `IDLoaiBaoCao` int(11) NOT NULL,
  `TenLoaiBaoCao` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `TheLoaiBaoCao`
--

INSERT INTO `TheLoaiBaoCao` (`IDLoaiBaoCao`, `TenLoaiBaoCao`) VALUES
(1, 'Tham Luận'),
(2, 'Luận Văn Tốt Nghiệp'),
(3, 'Tiểu Luận'),
(4, 'Báo Cáo'),
(5, 'Ngiên Cứu'),
(6, 'Luận Văn Tiến Sĩ');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `VaiTro`
--

CREATE TABLE `VaiTro` (
  `Ma` int(11) NOT NULL,
  `Ten` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `BaoCao`
--
ALTER TABLE `BaoCao`
  ADD PRIMARY KEY (`IDBaoCao`),
  ADD KEY `TheLoaiBaoCao` (`TheLoaiBaoCao`,`LinhVuc`),
  ADD KEY `FK4vpbl5pd77qdnii5th6kvniip` (`LinhVuc`);

--
-- Indizes für die Tabelle `Baocao_Nguoithuchien`
--
ALTER TABLE `Baocao_Nguoithuchien`
  ADD PRIMARY KEY (`IDBaoCao`,`IDNguoiThucHien`),
  ADD KEY `FKja0r8proiih8oo3yto7v308cg` (`IDNguoiThucHien`),
  ADD KEY `FKnjg3gh8t8wllt457oj65qdc0g` (`VaiTro`);

--
-- Indizes für die Tabelle `ChucDanh`
--
ALTER TABLE `ChucDanh`
  ADD PRIMARY KEY (`MaChucDanh`);

--
-- Indizes für die Tabelle `CoQuan`
--
ALTER TABLE `CoQuan`
  ADD PRIMARY KEY (`MaCoQuan`);

--
-- Indizes für die Tabelle `LinhVuc`
--
ALTER TABLE `LinhVuc`
  ADD PRIMARY KEY (`IdLinhVuc`);

--
-- Indizes für die Tabelle `NguoiSuDung`
--
ALTER TABLE `NguoiSuDung`
  ADD PRIMARY KEY (`UserID`),
  ADD KEY `QuyenHan` (`QuyenHan`);

--
-- Indizes für die Tabelle `NhaKhoaHoc`
--
ALTER TABLE `NhaKhoaHoc`
  ADD PRIMARY KEY (`MaNhaKhoaHoc`),
  ADD KEY `ChucDanh` (`ChucDanh`,`CoQuan`),
  ADD KEY `FK1ahwv0nf8uer3in9u3o23l9w` (`CoQuan`);

--
-- Indizes für die Tabelle `QuyenHan`
--
ALTER TABLE `QuyenHan`
  ADD PRIMARY KEY (`IDQuyenHan`);

--
-- Indizes für die Tabelle `TheLoaiBaoCao`
--
ALTER TABLE `TheLoaiBaoCao`
  ADD PRIMARY KEY (`IDLoaiBaoCao`);

--
-- Indizes für die Tabelle `VaiTro`
--
ALTER TABLE `VaiTro`
  ADD PRIMARY KEY (`Ma`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `BaoCao`
--
ALTER TABLE `BaoCao`
  MODIFY `IDBaoCao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=121;
--
-- AUTO_INCREMENT für Tabelle `ChucDanh`
--
ALTER TABLE `ChucDanh`
  MODIFY `MaChucDanh` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `CoQuan`
--
ALTER TABLE `CoQuan`
  MODIFY `MaCoQuan` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `LinhVuc`
--
ALTER TABLE `LinhVuc`
  MODIFY `IdLinhVuc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT für Tabelle `NhaKhoaHoc`
--
ALTER TABLE `NhaKhoaHoc`
  MODIFY `MaNhaKhoaHoc` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT für Tabelle `QuyenHan`
--
ALTER TABLE `QuyenHan`
  MODIFY `IDQuyenHan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT für Tabelle `TheLoaiBaoCao`
--
ALTER TABLE `TheLoaiBaoCao`
  MODIFY `IDLoaiBaoCao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT für Tabelle `VaiTro`
--
ALTER TABLE `VaiTro`
  MODIFY `Ma` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `BaoCao`
--
ALTER TABLE `BaoCao`
  ADD CONSTRAINT `FK4vpbl5pd77qdnii5th6kvniip` FOREIGN KEY (`LinhVuc`) REFERENCES `LinhVuc` (`IdLinhVuc`),
  ADD CONSTRAINT `FKbiuwx99s4mvrc62e90byut264` FOREIGN KEY (`TheLoaiBaoCao`) REFERENCES `TheLoaiBaoCao` (`IDLoaiBaoCao`),
  ADD CONSTRAINT `baocao_ibfk_1` FOREIGN KEY (`LinhVuc`) REFERENCES `LinhVuc` (`IdLinhVuc`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `baocao_ibfk_3` FOREIGN KEY (`TheLoaiBaoCao`) REFERENCES `TheLoaiBaoCao` (`IDLoaiBaoCao`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints der Tabelle `Baocao_Nguoithuchien`
--
ALTER TABLE `Baocao_Nguoithuchien`
  ADD CONSTRAINT `FKja0r8proiih8oo3yto7v308cg` FOREIGN KEY (`IDNguoiThucHien`) REFERENCES `NhaKhoaHoc` (`MaNhaKhoaHoc`),
  ADD CONSTRAINT `FKnjg3gh8t8wllt457oj65qdc0g` FOREIGN KEY (`VaiTro`) REFERENCES `VaiTro` (`Ma`),
  ADD CONSTRAINT `baocao_nguoithuchien_ibfk_1` FOREIGN KEY (`IDNguoiThucHien`) REFERENCES `NhaKhoaHoc` (`MaNhaKhoaHoc`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `baocao_nguoithuchien_ibfk_2` FOREIGN KEY (`VaiTro`) REFERENCES `VaiTro` (`Ma`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `baocao_nguoithuchien_ibfk_3` FOREIGN KEY (`IDBaoCao`) REFERENCES `BaoCao` (`IDBaoCao`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints der Tabelle `NguoiSuDung`
--
ALTER TABLE `NguoiSuDung`
  ADD CONSTRAINT `FKh22evyatpo2pbff4gbix7qeew` FOREIGN KEY (`QuyenHan`) REFERENCES `QuyenHan` (`IDQuyenHan`),
  ADD CONSTRAINT `nguoisudung_ibfk_1` FOREIGN KEY (`QuyenHan`) REFERENCES `QuyenHan` (`IDQuyenHan`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints der Tabelle `NhaKhoaHoc`
--
ALTER TABLE `NhaKhoaHoc`
  ADD CONSTRAINT `FK1ahwv0nf8uer3in9u3o23l9w` FOREIGN KEY (`CoQuan`) REFERENCES `CoQuan` (`MaCoQuan`),
  ADD CONSTRAINT `FKgoenquf7ogjd7d1tauu2evrgb` FOREIGN KEY (`ChucDanh`) REFERENCES `ChucDanh` (`MaChucDanh`),
  ADD CONSTRAINT `nhakhoahoc_ibfk_1` FOREIGN KEY (`ChucDanh`) REFERENCES `ChucDanh` (`MaChucDanh`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `nhakhoahoc_ibfk_2` FOREIGN KEY (`CoQuan`) REFERENCES `CoQuan` (`MaCoQuan`) ON DELETE CASCADE ON UPDATE CASCADE;
