--Comando para criar banco de dados
CREATE DATABASE Cadastroprodutos

USE Cadastroprodutos

--Criando tabela
create table produto
(
Nome varchar (30) Not null,--cria��o do campo Nome
CP INT Identity,--cria��o do campo de indentifica��o
cor varchar (10) Not Null,--cria��o do campo cor
Material varchar (25) Not Null,--cria��o do campo Material
Quantidade INT Not Null,--cria��o do campo Quantidade
Marca varchar (20) Not Null,--cria��o do campo Marca
Fabricante varchar (30) Not Null--cria��o do campo Fabricante
);
alter table produto add primary key(CP)