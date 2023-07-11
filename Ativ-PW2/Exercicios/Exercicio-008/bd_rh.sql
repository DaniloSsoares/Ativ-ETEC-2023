-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 07/05/2023 às 19:25
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
-- Banco de dados: `bd_rh`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `cargos`
--
create database bd_rh;
USE bd_rh;
CREATE TABLE `cargos` (
  `Código Cargo` int(11) NOT NULL,
  `Descricao` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cargos`
--

INSERT INTO `cargos` (`Código Cargo`, `Descricao`) VALUES
(1, 'Analista de Recursos Humanos - Responsável por desenvolver e implementar programas de treinamento e desenvolvimento para os funcionários da empresa, além de coordenar processos seletivos e fazer a ges'),
(2, ' Assistente de Recrutamento e Seleção - Responsável por apoiar o processo de recrutamento e seleção de candidatos para as diversas vagas da empresa, realizando triagem de currículos, agendamento de en'),
(3, 'Coordenador de Benefícios - Responsável por coordenar e gerir os benefícios oferecidos pela empresa aos seus funcionários, tais como plano de saúde, vale-alimentação, seguro de vida, entre outros.'),
(4, 'Analista de Cargos e Salários - Responsável por analisar e definir a estrutura salarial da empresa, realizando pesquisas de mercado e levantando informações sobre as funções e responsabilidades de cad'),
(5, 'Gerente de Recursos Humanos - Responsável por liderar a equipe de RH, definir estratégias e direcionar as atividades do setor, além de atuar como consultor interno para a alta direção da empresa.'),
(6, 'Especialista em Desenvolvimento Organizacional - Responsável por desenvolver e implementar programas de desenvolvimento organizacional, com o objetivo de melhorar a eficiência e o desempenho da empres'),
(7, 'Analista de Treinamento - Responsável por desenvolver e implementar programas de treinamento e desenvolvimento para os colaboradores da empresa, avaliando as necessidades de capacitação e propondo sol'),
(8, 'Assistente de Departamento Pessoal - Responsável por auxiliar no processamento da folha de pagamento, realizar o controle de ponto dos funcionários, gerenciar benefícios e atuar em atividades relacion'),
(9, ' Coordenador de Recrutamento e Seleção - Responsável por coordenar o processo seletivo de novos colaboradores, gerenciar as equipes de recrutamento e seleção e assegurar a efetividade do processo.'),
(10, 'Analista de Benefícios - Responsável por desenvolver e gerenciar programas de benefícios, tais como assistência médica, odontológica, seguro de vida e previdência privada.');

-- --------------------------------------------------------

--
-- Estrutura para tabela `departamento`
--

CREATE TABLE `departamento` (
  `Código depto` int(11) NOT NULL,
  `Descricao` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `departamento`
--

INSERT INTO `departamento` (`Código depto`, `Descricao`) VALUES
(1, 'Departamento de Treinamento e Desenvolvimento - Responsável por desenvolver e implementar programas de treinamento e desenvolvimento para os funcionários da empresa, visando a melhoria contínua das ha'),
(2, 'Departamento de Recrutamento e Seleção - Responsável por realizar o processo seletivo de candidatos para as vagas disponíveis na empresa, por meio de análise de currículos, entrevistas e outras ativid'),
(3, ' Departamento de Benefícios - Responsável por gerenciar os benefícios oferecidos pela empresa aos seus colaboradores, tais como plano de saúde, vale-alimentação, seguro de vida, entre outros.'),
(4, ' Departamento de Cargos e Salários - Responsável por definir a estrutura salarial da empresa, levando em consideração o mercado e as funções e responsabilidades de cada cargo, além de gerenciar os pro'),
(5, 'Departamento de Recursos Humanos - Responsável por gerir as atividades relacionadas aos recursos humanos da empresa, tais como recrutamento e seleção, treinamento e desenvolvimento, benefícios, cargos'),
(6, 'Departamento de Desenvolvimento Organizacional - Responsável por implementar mudanças estruturais e culturais na empresa, visando a melhoria da eficiência e desempenho organizacional, por meio de prog'),
(7, ' Departamento de Treinamento Especializado - Responsável por desenvolver e implementar programas de treinamento especializado para os colaboradores da empresa, visando a melhoria contínua das habilida'),
(8, 'Departamento de Departamento Pessoal - Responsável por gerenciar as atividades relacionadas ao controle de ponto, folha de pagamento, benefícios e legislação trabalhista dos colaboradores da empresa.'),
(9, ' Departamento de Recrutamento Interno - Responsável por coordenar o processo de recrutamento interno de colaboradores para as vagas disponíveis na empresa, visando a valorização e retenção dos talento'),
(10, ' Departamento de Benefícios Flexíveis - Responsável por gerenciar programas de benefícios flexíveis, tais como assistência médica, odontológica, previdência privada, entre outros, visando a satisfação');

-- --------------------------------------------------------

--
-- Estrutura para tabela `dependentes`
--

CREATE TABLE `dependentes` (
  `matricula` int(11) NOT NULL,
  `Nome Dependente` varchar(50) NOT NULL,
  `Dt Nascimento` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `dependentes`
--

INSERT INTO `dependentes` (`matricula`, `Nome Dependente`, `Dt Nascimento`) VALUES
(481036, 'Ana Luiza Silva', '1980-04-24'),
(524190, 'Lucas Santos Oliveira', '1990-03-07'),
(786935, 'Beatriz Souza Rodrigues', '1985-02-26'),
(958401, 'Matheus Mendes Santos', '1951-04-15'),
(689213, 'Fernanda Oliveira Silva', '1957-11-28'),
(612487, 'Gustavo Alves Costa', '2001-05-13'),
(875342, 'Mariana Santos Pereira', '2000-04-12'),
(546218, 'Henrique Lima Ferreira', '1973-10-17'),
(349270, 'Gabriela Almeida Cardoso', '1971-06-18'),
(215764, 'Bruno Oliveira Martins', '2002-01-20');

-- --------------------------------------------------------

--
-- Estrutura para tabela `funcionário`
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
  `Telefone` varchar(13) NOT NULL,
  `Data Admissao` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `funcionário`
--

INSERT INTO `funcionário` (`Matricula`, `Nome`, `Data Nasc`, `Nacionalidade`, `Sexo`, `Estado civil`, `Rg`, `CPF`, `Endereco`, `Telefone`, `Data Admissao`) VALUES
(467821, 'Elizabeth Albuquerque Manhães', '1094-04-04', 'SP', 'F', 'Casada', 100202408, 416831884, 'Rua Coronel Moura', '2173-6315', '2017-04-04'),
(132459, 'Filipe Melo Vilela', '1960-01-01', 'RS', 'M', 'solteiro', 214463618, 872171810, 'Rua Manoel Rodrigues Gomes', '99382-1327', '1991-03-25'),
(875342, 'Palmira Folly Peixoto', '1980-12-01', 'MS', 'F', 'Solteira', 327573703, 467474471, 'Rua Simão Abrão', '3972-6762', '2017-12-02'),
(546218, 'Emanuelle Carminatti Cruz', '2000-02-01', 'GO', 'F', 'Separada', 346222370, 261734511, 'Rua 203', '3591-2171', '2019-10-12'),
(973861, 'José Luis de Oliveira Monnerat', '1970-02-13', 'PA', 'M', 'Divorciado(a)', 449344423, 721223372, 'Passagem Ana Cristina', '3812-7264', '2000-05-12'),
(215764, 'Ariana Amancio Vitorino', '1980-05-25', 'BA', 'F', 'Viúva', 253160790, 848253365, 'Rua dos Vaga-lumes', '3529-2612', '2014-04-29'),
(689213, 'Kaique Gonçalves Antunes', '1999-07-03', 'MG', 'M', 'Casado', 165205465, 267554316, 'Alameda das Tulipas', '32142-7946', '2020-01-30'),
(524190, 'Stefany Corrêa Bragança', '1960-04-21', 'SP', 'F', 'Casada', 415927523, 869125758, 'Rua Comendador Agostinho Prada', '24189-9334', '2018-05-15'),
(786935, 'Augusto Estellet Machado', '2000-12-12', 'PA', 'M', 'Solteiro', 135650938, 367889152, 'Avenida Gh', '21039-9338', '2020-09-13'),
(349270, 'Charles Manhães Limeira', '1971-11-11', 'RO', 'M', 'Casado', 383807414, 726413902, 'Rua Valmar Meira', '27013-2745', '1999-12-20'),
(612487, 'Suenia Magalhães Barthon', '1987-03-19', 'RJ', 'F', 'Solteira', 439557471, 702238247, 'Rua Luciano de Moraes', '23599-5236', '2023-06-28'),
(958401, 'Raimundo Annunziato Billé', '1998-09-08', 'PA', 'M', 'Casado', 174342548, 548167162, 'Rua Guanabara', '25332-1327', '2023-11-12'),
(720354, 'Islayne Geraldo Amorin', '2003-06-19', 'MA', 'F', 'Noiva', 221922088, 732746813, 'Residencial Itapiracó', '35430-4427', '2023-04-08'),
(481036, 'Antônia Candido Aguiar', '2005-06-01', 'GO', 'M', 'Solteiro', 118413314, 416813661, 'Rua R 14', '31861-2373', '2019-08-12'),
(639871, 'Roberta Barroso Esteves', '1984-07-14', 'AP', 'F', 'Casada', 488336272, 637630432, 'ﾠTravessa 03', '33133-5006', '2008-04-19');

-- --------------------------------------------------------

--
-- Estrutura para tabela `lotação`
--

CREATE TABLE `lotação` (
  `matricula` int(11) NOT NULL,
  `Codigo Dept` int(11) NOT NULL,
  `Dt Inicio` date NOT NULL,
  `Dt fim` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `lotação`
--

INSERT INTO `lotação` (`matricula`, `Codigo Dept`, `Dt Inicio`, `Dt fim`) VALUES
(467821, 1, '2022-07-08', '2023-06-30'),
(132459, 1, '2023-02-17', '2023-07-09'),
(875342, 2, '2023-01-06', '2023-08-19'),
(546218, 2, '2019-10-12', '2023-09-23'),
(973861, 3, '2022-11-03', '2023-11-07'),
(215764, 3, '2023-05-01', '2023-12-04'),
(689213, 4, '2023-04-02', '2024-01-04'),
(524190, 4, '2022-12-22', '2024-02-17'),
(786935, 10, '2022-09-30', '2024-03-25'),
(349270, 5, '2023-01-18', '2024-04-25'),
(612487, 9, '2022-10-20', '2024-05-23'),
(958401, 7, '2022-06-24', '2024-06-27'),
(720354, 8, '2023-03-10', '2024-07-22'),
(481036, 6, '2023-05-27', '2024-09-05'),
(639871, 8, '2022-12-03', '2024-09-18');

-- --------------------------------------------------------

--
-- Estrutura para tabela `ocupação`
--

CREATE TABLE `ocupação` (
  `Matricula` int(11) NOT NULL,
  `Código Cargo` int(11) NOT NULL,
  `Dt Inicio` date NOT NULL,
  `Dt fim` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `ocupação`
--

INSERT INTO `ocupação` (`Matricula`, `Código Cargo`, `Dt Inicio`, `Dt fim`) VALUES
(467821, 1, '2017-04-04', '2023-06-30'),
(132459, 1, '1991-03-25', '2023-07-09'),
(875342, 2, '2017-12-02', '2023-08-19'),
(546218, 2, '2019-10-12', '2023-09-23'),
(973861, 3, '2000-05-12', '2023-11-07'),
(215764, 3, '2014-04-29', '2023-12-04'),
(689213, 4, '2020-01-30', '2024-01-04'),
(524190, 4, '2018-05-15', '2024-02-17'),
(786935, 10, '2020-09-13', '2024-03-25'),
(349270, 5, '1999-12-20', '2024-04-25'),
(612487, 9, '2023-06-28', '2024-05-23'),
(958401, 7, '2023-11-12', '2024-06-27'),
(720354, 8, '2023-04-08', '2024-07-22'),
(481036, 6, '2019-08-12', '2024-09-05'),
(639871, 8, '2008-04-19', '2024-09-18');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `cargos`
--
ALTER TABLE `cargos`
  ADD PRIMARY KEY (`Código Cargo`);

--
-- Índices de tabela `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`Código depto`);

--
-- Índices de tabela `funcionário`
--
ALTER TABLE `funcionário`
  ADD PRIMARY KEY (`Matricula`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cargos`
--
ALTER TABLE `cargos`
  MODIFY `Código Cargo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `departamento`
--
ALTER TABLE `departamento`
  MODIFY `Código depto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=632;

--
-- AUTO_INCREMENT de tabela `funcionário`
--
ALTER TABLE `funcionário`
  MODIFY `Matricula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=973862;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
