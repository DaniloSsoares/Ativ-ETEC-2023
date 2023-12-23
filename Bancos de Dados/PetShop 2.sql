CREATE DATABASE IF NOT EXISTS PetShop;
USE PetShop;

CREATE TABLE RAnim (
    NumRegistro INT AUTO_INCREMENT PRIMARY KEY,
    Nome_Pet VARCHAR(30) NOT NULL,
    especie VARCHAR(8) NOT NULL,
    raca VARCHAR(15) NOT NULL,
    Cor VARCHAR(10) NOT NULL,
    nascimento DATE,
    sexo VARCHAR(2) NOT NULL
);

INSERT INTO RAnim (Nome_Pet, especie, raca, Cor, nascimento, sexo)
VALUES ('Whiskers', 'Gato', 'Persa', 'Branco', '2020-07-08', 'M'),
       ('Polly', 'Pássaro', 'Calopsita', 'Cinza', '2019-12-20', 'F'),
       ('Bubbles', 'Peixe', 'Betta', 'Azul', '2022-01-05', 'M'),
       ('Max', 'Cachorro', 'Labrador', 'Marrom', '2019-05-10', 'M'),
       ('Luna', 'Gato', 'Siamês', 'Cinza', '2020-02-15', 'F'),
       ('Bobby', 'Cachorro', 'Bulldog Francês', 'Branco', '2018-11-20', 'M'),
       ('Coco', 'Pássaro', 'Periquito', 'Verde', '2017-08-30', 'M');


CREATE TABLE Usuarios (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Nome VARCHAR(50) NOT NULL,
    Email VARCHAR(100) NOT NULL UNIQUE,
    Senha VARCHAR(20) NOT NULL
);

 insert Into Usuarios(Nome,Email,Senha)
 Values('Danilo','Danilo.@gmail.com','123');

Select * FROM Usuarios;
SELECT * FROM RAnim;