CREATE DATABASE ExercBD01



USE ExercBD01

CREATE TABLE pet

(
NumRegistro int,
Nome varchar (80),
Especie varchar (25),
Raca Varchar (30),
Cor Varchar (40),
Nascimento datetime ,
Sexo Varchar (9)
);


CREATE DATABASE ExercBD02

USE ExercBD02

--criando campo codfunc
Create table Funcionario
(
CodFunc int, --criando campo codfunc
NomeFunc varchar (50), --criando campo nomefunc,
CodDepto int , --Criando campo coddepto
Ramal int null, --criando campo ramal
Salario float,
DataAdmissao datetime, --criando campo dataadmissao
DataCadastro datetime, --criando campo datacadastro
Sexo char(1)
); 

CREATE DATABASE ExercBD02

USE ExercBD02

Create table Funcionario