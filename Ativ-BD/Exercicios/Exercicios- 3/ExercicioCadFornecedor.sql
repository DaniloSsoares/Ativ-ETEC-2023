CREATE DATABASE CadastroFornecedor
USE  CadastroFornecedor

create table Fornecedor
(
Nome varchar (30) Not null,
ID Int  Identity,
CNPJ VARCHAR Not Null,
Cidade varchar(15) Not null,
Endere�o varchar (15) Not null ,
Estado Varchar (30) Not Null
)