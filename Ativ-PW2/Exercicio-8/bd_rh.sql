-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 24-Abr-2023 às 20:17
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_rh`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cargos`
--

CREATE TABLE `cargos` (
  `Código Cargo` int(11) NOT NULL,
  `Descricao` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `departamento`
--

CREATE TABLE `departamento` (
  `Código depto` int(11) NOT NULL,
  `Descricao` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `dependentes`
--

CREATE TABLE `dependentes` (
  `matricula` int(11) NOT NULL,
  `Nome Dependente` varchar(50) NOT NULL,
  `Dt Nascimento` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionário`
--

CREATE TABLE `funcionário` (
  `Matricula` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Data Nasc` date NOT NULL,
  `Nacionalidade` varchar(40) NOT NULL,
  `Sexo` char(1) NOT NULL,
  `Estado civil` varchar(20) NOT NULL,
  `Rg` int(7) NOT NULL,
  `CPF` int(11) NOT NULL,
  `Endereco` varchar(50) NOT NULL,
  `Telefone` int(13) NOT NULL,
  `Data Admissao` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `lotação`
--

CREATE TABLE `lotação` (
  `matricula` int(11) NOT NULL,
  `Codigo Dept` int(11) NOT NULL,
  `Dt Inicio` date NOT NULL,
  `Dt fim` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `ocupação`
--

CREATE TABLE `ocupação` (
  `Matricula` int(11) NOT NULL,
  `Código Cargo` int(11) NOT NULL,
  `Dt Inicio` date NOT NULL,
  `Dt fim` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cargos`
--
ALTER TABLE `cargos`
  ADD PRIMARY KEY (`Código Cargo`);

--
-- Índices para tabela `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`Código depto`);

--
-- Índices para tabela `funcionário`
--
ALTER TABLE `funcionário`
  ADD PRIMARY KEY (`Matricula`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cargos`
--
ALTER TABLE `cargos`
  MODIFY `Código Cargo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `departamento`
--
ALTER TABLE `departamento`
  MODIFY `Código depto` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `funcionário`
--
ALTER TABLE `funcionário`
  MODIFY `Matricula` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
