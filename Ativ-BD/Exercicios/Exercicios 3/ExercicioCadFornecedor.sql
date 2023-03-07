CREATE DATABASE CadastroFornecedor
USE  CadastroFornecedor

create table Fornecedor
(
Nome varchar (30) Not null,
ID Int  Identity,
CNPJ VARCHAR Not Null,
Cidade varchar(15) Not null,
Endereço varchar (15) Not null ,
Estado Varchar (30) Not Null
)