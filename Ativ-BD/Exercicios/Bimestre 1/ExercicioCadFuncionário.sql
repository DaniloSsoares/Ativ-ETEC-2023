--Comando para criar banco de dados
CREATE DATABASE CadastroFuncionario

USE CadastroFuncionario
--Criando tabela
create table Funcionario
(
Nome varchar (30) Not null,--criação do campo Nome
matricula Int  Identity,--criação do campo 
Salario INT Not Null,--criação do campo Salário
cargaHoraria INT Not null,--criação do campo Carga Horaria
CPF Varchar Not Null,--criação do campo CPF
Data_de_nascimento date Not Null,--criação do campo Data de nascimento
Telefone varchar (15) Not null Unique,--criação do campo Telefone
Endereço Varchar (30) Not Null--criação do campo Endereço
);
--Chave primaria
alter table Funcionario add primary key(matricula)