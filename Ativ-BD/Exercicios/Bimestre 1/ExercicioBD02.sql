
--Comando para criar banco de dados
CREATE DATABASE ExercBD02

USE ExercBD02

create table Departamento
(
Codfunc int,
NomeDepto varchar(50)
);


Insert into Departamento (Codfunc, NomeDepto)
Values ('2930278' ,'Analista de Marketing');
Insert into Departamento (Codfunc, NomeDepto)
Values ('4673821' ,'Designer');
Insert into Departamento (Codfunc, NomeDepto)
Values ('3273862' ,'Departamento Financeiro');
Insert into Departamento (Codfunc, NomeDepto)
Values ('3526152' ,'Recursos Humanos');
Insert into Departamento (Codfunc, NomeDepto)
Values ('4542747' ,'produção');


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
Insert into Funcionario (CodFunc, NomeFunc ,CodDepto, Ramal, Salario, DataAdmissao,DataCadastro,Sexo)
Values
(2930278 ,'Endrigo',' 12234','2616724','2200.00','14/02/2023','01/03/2023','M');

Insert into Funcionario (CodFunc, NomeFunc ,CodDepto, Ramal, Salario, DataAdmissao,DataCadastro,Sexo)
Values
(4673821,'Danilo','45365 ','6276818','2300.00','28/02/2022','03/03/2022','M');

Insert into Funcionario (CodFunc, NomeFunc ,CodDepto, Ramal, Salario, DataAdmissao,DataCadastro,Sexo)
Values
(3273862 ,'Bia','73872','6378177','2200.00','07/01/2019','06/01/2019','F');

Insert into Funcionario (CodFunc, NomeFunc ,CodDepto, Ramal, Salario, DataAdmissao,DataCadastro,Sexo)
Values
(3526152 ,'angelo','13245','1267817','1700.00','01/03/2023','06/12/2022','M');

Insert into Funcionario (CodFunc, NomeFunc ,CodDepto, Ramal, Salario, DataAdmissao,DataCadastro,Sexo)
Values
(4542747,'Alex','73367','1728178','1780.00','15/08/2021','10/08/2021','M');

Insert into Funcionario (CodFunc, NomeFunc ,CodDepto, Ramal, Salario, DataAdmissao,DataCadastro,Sexo)
Values
(4673821 ,'Alice','45365 ','6276818','2500.00','08/11/2021','18/10/2021','F');

Insert into Funcionario (CodFunc, NomeFunc ,CodDepto, Ramal, Salario, DataAdmissao,DataCadastro,Sexo)
Values
(2930278,'Lúcio','12234 ','2616724','2200.00','23/03/2023','27/02/2023','M');

Insert into Funcionario (CodFunc, NomeFunc ,CodDepto, Ramal, Salario, DataAdmissao,DataCadastro,Sexo)
Values
(3526152 ,'Soraya','13245','1267817','2000.00','07/06/2022','01/06/2022','F');

Insert into Funcionario (CodFunc, NomeFunc ,CodDepto, Ramal, Salario, DataAdmissao,DataCadastro,Sexo)
Values
(3273862 ,'Emilly',' 73872','6378177','2100.00','11/02/2019','07/02/2019','F');

Insert into Funcionario (CodFunc, NomeFunc ,CodDepto, Ramal, Salario, DataAdmissao,DataCadastro,Sexo)
Values
(4542747,'Pedro','73367','1728178','1700.00','03/03/2023','06/12/2022','M');

Select * from Departamento;
Select * from  Funcionario;

