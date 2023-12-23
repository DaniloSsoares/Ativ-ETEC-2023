create database petShop;

USE PetShop;

create table RAnim(
NumRegistro INT identity,
Nome_Pet varchar (30) Not Null,
especie varchar(8) not Null,
raca varchar (15) not Null,
Cor Varchar(10) not Null,
nascimento date,
sexo Varchar (2) not Null,

primary key (NumRegistro),
);

-- Gato
INSERT INTO RAnim (Nome_Pet, especie, raca, Cor, nascimento, sexo)
VALUES ('Whiskers', 'Gato', 'Persa', 'Branco', '2020-07-08', 'M');

-- Pássaro
INSERT INTO RAnim (Nome_Pet, especie, raca, Cor, nascimento, sexo)
VALUES ('Polly', 'Pássaro', 'Calopsita', 'Cinza', '2019-12-20', 'F');

-- Peixe
INSERT INTO RAnim (Nome_Pet, especie, raca, Cor, nascimento, sexo)
VALUES ('Bubbles', 'Peixe', 'Betta', 'Azul', '2022-01-05', 'M');

-- cachorro
INSERT INTO RAnim (Nome_Pet, especie, raca, Cor, nascimento, sexo)
VALUES ('Max', 'Cachorro', 'Labrador', 'Marrom', '2019-05-10', 'M');

-- gato
INSERT INTO RAnim (Nome_Pet, especie, raca, Cor, nascimento, sexo)
VALUES ('Luna', 'Gato', 'Siamês', 'Cinza', '2020-02-15', 'F');

-- cachorro
INSERT INTO RAnim (Nome_Pet, especie, raca, Cor, nascimento, sexo)
VALUES ('Bobby', 'Cachorro', 'Bulldog Francês', 'Branco', '2018-11-20', 'M');

-- passaro
INSERT INTO RAnim (Nome_Pet, especie, raca, Cor, nascimento, sexo)
VALUES ('Coco', 'Pássaro', 'Periquito', 'Verde', '2017-08-30', 'M');

select* from  RAnim;

drop table  RAnim;