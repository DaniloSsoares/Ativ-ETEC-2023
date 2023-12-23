--Comando para criar banco de dados
CREATE DATABASE CadastroDepartamento

USE CadastroDepartamento

create table Departamento
(
Tarefas varchar (200) Not null,--cria��o do campo Tarefas
ID Int  Identity,--cria��o do campo ID
Gasto Int Not Null,--cria��o do campo Gasto
Data_de_Efetivacao Datetime Not null,--cria��o do campo Data de Efetivado
Cargos varchar (50) Not null ,--cria��o do campo Cargo
Salario INT,--cria��o do campo S�lario
Departamento varchar (40)--cria��o do campo Departamento
);

--Chave primaria
alter table Departamento add primary key(ID);

