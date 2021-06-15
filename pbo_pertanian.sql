-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 15 Jun 2021 pada 16.12
-- Versi server: 10.4.14-MariaDB
-- Versi PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `pbo_pertanian`
--

CREATE TABLE `pbo_pertanian` (
  `kode` int(10) NOT NULL,
  `nama_barang` varchar(20) DEFAULT NULL,
  `jumlah` int(10) DEFAULT NULL,
  `harga` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pbo_pertanian`
--

INSERT INTO `pbo_pertanian` (`kode`, `nama_barang`, `jumlah`, `harga`) VALUES
(1, 'biji jambu', 10, 15000),
(2, 'kangkung', 20, 50000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `pbo_pertanian`
--
ALTER TABLE `pbo_pertanian`
  ADD PRIMARY KEY (`kode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
