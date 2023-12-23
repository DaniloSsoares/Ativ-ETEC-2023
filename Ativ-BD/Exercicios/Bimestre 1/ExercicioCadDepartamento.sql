--Comando para criar banco de dados
CREATE DATABASE CadastroDepartamento

USE CadastroDepartamento

create table Departamento
(
Tarefas varchar (200) Not null,--criação do campo Tarefas
ID Int  Identity,--criação do campo ID
Gasto Int Not Null,--criação do campo Gasto
Data_de_Efetivacao Datetime Not null,--criação do campo Data de Efetivado
Cargos varchar (50) Not null ,--criação do campo Cargo
Salario INT,--criação do campo Sálario
Departamento varchar (40)--criação do campo Departamento
);

--Chave primaria
alter table Departamento add primary key(ID);

