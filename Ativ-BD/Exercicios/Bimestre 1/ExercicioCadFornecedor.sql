--Comando para criar banco de dados
CREATE DATABASE CadastroFornecedor

USE  CadastroFornecedor
--Criando tabela
create table Fornecedor
(
Nome varchar (30) Not null,--cria��o do campo Nome
ID Int  Identity,--cria��o do campo ID
CNPJ VARCHAR Not Null,--cria��o do campo CNPJ
Cidade varchar(15) Not null,--cria��o do campo Cidade
Endere�o varchar (15) Not null ,--cria��o do campo Endere�o
Estado Varchar (30) Not Null--cria��o do campo Estado
);
--Chave primaria
alter table Fornecedor add primary key(ID)