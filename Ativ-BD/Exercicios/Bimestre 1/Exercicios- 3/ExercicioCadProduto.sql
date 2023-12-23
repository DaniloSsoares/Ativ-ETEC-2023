CREATE DATABASE Cadastroprodutos

USE Cadastroprodutos

create table produto
(
Nome varchar (30) Not null,
CP INT Identity,
cor varchar (10) Not Null,
Material varchar (25) Not Null,
Quantidade INT Not Null,
Marca varchar (20) Not Null,
Fabricante varchar (30) Not Null
)