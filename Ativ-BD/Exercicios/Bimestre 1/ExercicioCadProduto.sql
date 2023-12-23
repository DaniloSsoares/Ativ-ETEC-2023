--Comando para criar banco de dados
CREATE DATABASE Cadastroprodutos

USE Cadastroprodutos

--Criando tabela
create table produto
(
Nome varchar (30) Not null,--criação do campo Nome
CP INT Identity,--criação do campo de indentificação
cor varchar (10) Not Null,--criação do campo cor
Material varchar (25) Not Null,--criação do campo Material
Quantidade INT Not Null,--criação do campo Quantidade
Marca varchar (20) Not Null,--criação do campo Marca
Fabricante varchar (30) Not Null--criação do campo Fabricante
);
alter table produto add primary key(CP)