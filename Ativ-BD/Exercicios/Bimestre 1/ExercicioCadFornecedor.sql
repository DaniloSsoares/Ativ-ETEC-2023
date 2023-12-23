--Comando para criar banco de dados
CREATE DATABASE CadastroFornecedor

USE  CadastroFornecedor
--Criando tabela
create table Fornecedor
(
Nome varchar (30) Not null,--criação do campo Nome
ID Int  Identity,--criação do campo ID
CNPJ VARCHAR Not Null,--criação do campo CNPJ
Cidade varchar(15) Not null,--criação do campo Cidade
Endereço varchar (15) Not null ,--criação do campo Endereço
Estado Varchar (30) Not Null--criação do campo Estado
);
--Chave primaria
alter table Fornecedor add primary key(ID)