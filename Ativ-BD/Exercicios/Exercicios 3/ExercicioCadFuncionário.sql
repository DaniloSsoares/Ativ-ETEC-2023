CREATE DATABASE CadastroFuncionario

USE CadastroFuncionario

create table Funcionario
(
Nome varchar (30) Not null,
matricula Int  Identity,
Salario INT Not Null,
cargaHoraria INT Not null,
CPF Varchar Not Null,
Data_de_nascimento date Not Null,
Telefone varchar (15) Not null Unique,
Endereço Varchar (30) Not Null
)