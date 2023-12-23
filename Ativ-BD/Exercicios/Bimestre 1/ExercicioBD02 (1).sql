--Comando para criar banco de dados
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