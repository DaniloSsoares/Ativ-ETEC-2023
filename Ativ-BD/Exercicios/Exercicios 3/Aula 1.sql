-- criação de banco de dados
create database teste


--Abrindo um banco de dados
use master


--Criando tabela
CREATE TABLE CLIENTE 
(COD_CLI INT PRIMARY KEY NOT NULL,
NOME VARCHAR (50),
SOBRENOME VARCHAR (50),
TELEFONE VARCHAR (15)
)

-- Acrecentando uma nova linha
alter table CLIENTE add TELEFONE varchar (15)
  
  --Excluindo uma tabela
  drop table CLIENTE

  --Excluindo Banco de Dados
 drop database teste