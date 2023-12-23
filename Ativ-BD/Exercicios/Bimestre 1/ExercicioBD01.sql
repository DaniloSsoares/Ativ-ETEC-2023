--Comando para criar banco de dados
CREATE DATABASE ExercBD01

USE ExercBD01
--Criando tabela
CREATE TABLE pet
(
NumRegistro int, --criando campo para a inser��o do registro
Nome varchar (80), --cria��o do campo Nome
Especie varchar (25), --cria��o do campo Especie
Raca Varchar (30),--cria��o do campo Ra�a
Cor Varchar (40),-- cria��o do campo cor 
Nascimento datetime ,--cria��o do campo Nascimento
Sexo Varchar (9) -- cria��o do campo Sexo
);

-- Colocando valor na tabela
Insert into pet (NumRegistro, Nome ,Especie, Raca , Cor, Nascimento,Sexo)
Values
(1 ,'Kaizer',' Gato','Vira-Lata','Preto','08/03/2020','Masculino');

Insert into pet (NumRegistro, Nome ,Especie, Raca , Cor, Nascimento,Sexo)
Values
(2 ,'Boby',' Cachorro','Dogue alem�o','dourado','02/06/2018','Masculino');

Insert into pet (NumRegistro, Nome ,Especie, Raca , Cor, Nascimento,Sexo)
Values
(3 ,'Belina',' Cachorro','pinscher','perto','07/01/2019','Ferminino');

Insert into pet (NumRegistro, Nome ,Especie, Raca , Cor, Nascimento,Sexo)
Values
(4 ,'angelo',' Passaro','papagaio','verde','01/03/2012','Masculino');

Insert into pet (NumRegistro, Nome ,Especie, Raca , Cor, Nascimento,Sexo)
Values
(5 ,'billy',' Cachorro','Beagle','Branco e Marron','15/03/2021','Masculino');

Insert into pet (NumRegistro, Nome ,Especie, Raca , Cor, Nascimento,Sexo)
Values
(6 ,'Zeus','Tartaruga','tigre da �gua','verde com rajados em amarelo','17/09/2020','Masculino');

Insert into pet (NumRegistro, Nome ,Especie, Raca , Cor, Nascimento,Sexo)
Values
(7 ,'Mel',' Hamster',' hamster russo an�o','PUDDING / ARGENTE MANDARIM
','02/06/2018','Ferminino');

Insert into pet (NumRegistro, Nome ,Especie, Raca , Cor, Nascimento,Sexo)
Values
(8 ,'Maya',' Cachorro','Husky Siberiano','Branco e cinza','22/09/2020','Masculino');

Insert into pet (NumRegistro, Nome ,Especie, Raca , Cor, Nascimento,Sexo)
Values
(9 ,'Luna',' Gato','Sagrado da Birm�nia',' creme e chocolate','25/11/2022','Ferminino');

Insert into pet (NumRegistro, Nome ,Especie, Raca , Cor, Nascimento,Sexo)
Values
(10 ,'Bunny',' coelho','Rex','branco','020/12/2019','Ferminino');

 
 SELECT *from pet;

