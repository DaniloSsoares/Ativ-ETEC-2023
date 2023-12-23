-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 29/05/2023 às 03:50
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_autoria`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `autor`
--
create database bd_autoria;
USE bd_autoria;
CREATE TABLE `autor` (
  `Cod_Autor` int(11) NOT NULL,
  `NomeAutor` varchar(50) NOT NULL,
  `Sobrenome` varchar(100) NOT NULL,
  `Email` varchar(60) NOT NULL,
  `Nasc` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `autor`
--

INSERT INTO `autor` (`Cod_Autor`, `NomeAutor`, `Sobrenome`, `Email`, `Nasc`) VALUES
(1212, 'Junior ', ' Rostirola', 'JuniorRostirola@gmail.com', '1980-12-08'),
(1313, 'Colleen ', 'Hoover', 'ColleenHoover@gmail.com', '1979-12-11'),
(1414, 'Edward ', 'Powys Mathers ', ' EdwardPowys@gmail.com', '1945-08-28'),
(1515, 'Carlos', 'Torres Pastorino', 'CarlosTorres@gmail.com', '1910-11-04'),
(1616, 'Napoleon', ' Hill', 'NapoleonHill@gmail.com', '1883-10-26'),
(1717, 'Joanne', '\"Jo\" Rowling', 'J.K.Rowling@gmail.com', '1965-07-31'),
(1818, 'Ernest', 'Hemingway', 'ErnestHemingway@gmail.com', '1899-07-21');

-- --------------------------------------------------------

--
-- Estrutura para tabela `autoria`
--

CREATE TABLE `autoria` (
  `Cod_autor` int(11) NOT NULL,
  `Cod_Livro` int(11) NOT NULL,
  `DataLancamento` date NOT NULL,
  `Editora` varchar(150) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `autoria`
--

INSERT INTO `autoria` (`Cod_autor`, `Cod_Livro`, `DataLancamento`, `Editora`) VALUES
(1212, 1111, '2022-08-01', 'Editora Vida'),
(1313, 2222, '2018-01-18', 'Galera'),
(1414, 3333, '2022-12-01', 'Intrínseca'),
(1515, 4444, '2008-01-01', 'Editora Vozes\r\n'),
(1616, 5555, '2018-05-28', 'Citadel'),
(1717, 6666, '2017-08-19', 'Rocco'),
(1818, 7777, '2013-09-02', 'Bertrand Brasil'),
(1717, 8888, '2017-08-19', 'Rocco');

-- --------------------------------------------------------

--
-- Estrutura para tabela `livro`
--

CREATE TABLE `livro` (
  `Cod_Livro` int(11) NOT NULL,
  `Tiíulo` varchar(30) NOT NULL,
  `Categoria` varchar(200) NOT NULL,
  `ISBN` varchar(18) NOT NULL,
  `Idioma` varchar(50) NOT NULL,
  `Qtdepag` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `livro`
--

INSERT INTO `livro` (`Cod_Livro`, `Tiíulo`, `Categoria`, `ISBN`, `Idioma`, `Qtdepag`) VALUES
(1111, 'Café Com Deus Pai', 'Não ficção', ' 978-65-55843-14-9', 'Português', 424),
(2222, ' É Assim Que Acaba', ' Ficção', ' 978-85-01112-51-4', 'Português', 368),
(3333, 'A mandíbula de Caim', 'Ficção', '978-65-55604-42-9', 'Português', 216),
(4444, 'Minutos de sabedoria', ' Autoajuda', '978-85-32604-91-0', 'Português', 288),
(5555, 'Quem pensa enriquece: o legado', 'Negócios', '978-85-68014-54-7', 'Português', 364),
(6666, ' Harry Potter e a Pedra Filoso', 'Ficção', '978-8532530783', 'Português', 208),
(7777, 'O velho e o mar', 'Ficção Literária Literatura e Ficção', '978-8528617986', 'Português', 126),
(8888, ' Harry Potter e a Câmara Secre', 'Ficção', '978-8532530790', 'Português', 224);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `autor`
--
ALTER TABLE `autor`
  ADD PRIMARY KEY (`Cod_Autor`);

--
-- Índices de tabela `livro`
--
ALTER TABLE `livro`
  ADD PRIMARY KEY (`Cod_Livro`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `autor`
--
ALTER TABLE `autor`
  MODIFY `Cod_Autor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1819;

--
-- AUTO_INCREMENT de tabela `livro`
--
ALTER TABLE `livro`
  MODIFY `Cod_Livro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8889;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
