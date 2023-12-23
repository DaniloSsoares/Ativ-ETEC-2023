--Comando para criar banco de dados
CREATE DATABASE CadastroFuncionario

USE CadastroFuncionario
--Criando tabela
create table Funcionario
(
Nome varchar (30) Not null,--cria��o do campo Nome
matricula Int  Identity,--cria��o do campo 
Salario INT Not Null,--cria��o do campo Sal�rio
cargaHoraria INT Not null,--cria��o do campo Carga Horaria
CPF Varchar Not Null,--cria��o do campo CPF
Data_de_nascimento date Not Null,--cria��o do campo Data de nascimento
Telefone varchar (15) Not null Unique,--cria��o do campo Telefone
Endere�o Varchar (30) Not Null--cria��o do campo Endere�o
);
--Chave primaria
alter table Funcionario add primary key(matricula)