create database Cinema;
use Cinema;

create table Salas(
Numero_salas int identity,
Qtd_acentos int Not Null

primary key (Numero_salas)
);

CREATE TABLE Filme(
Cod_Filme int identity,
Categoria_Filme Varchar(50) Not Null,
Nome_Filme Varchar(60)Not Null,
Diretor Varchar (50)Not Null,

Primary Key (Cod_Filme)
);

CREATE TABLE Sessao (
    Numero_salas INT,
    Cod_Filme INT,
    Tipo_Sessao VARCHAR(60) NOT NULL,
    Hora_Sessao TIME NOT NULL,
    Preco_filme FLOAT NOT NULL,   
	
	FOREIGN KEY (Numero_salas) REFERENCES Salas(Numero_salas),
    FOREIGN KEY (Cod_Filme) REFERENCES Filme(Cod_Filme)
);




SET IDENTITY_INSERT Salas ON;

INSERT INTO Salas (Numero_salas, Qtd_acentos)
VALUES ('1', '40');

Insert into Salas (Numero_salas,Qtd_acentos)
Values ('2','35');

Insert into Salas (Numero_salas,Qtd_acentos)
Values ('3','60');

Insert into Salas (Numero_salas,Qtd_acentos)
Values ('4','55');

Insert into Salas (Numero_salas,Qtd_acentos)
Values ('5','55');

Insert into Salas (Numero_salas,Qtd_acentos)
Values ('6','55');

SET IDENTITY_INSERT Salas OFF;

INSERT INTO Filme (Categoria_Filme, Nome_Filme, Diretor)
VALUES 
    ('Ação', 'Vingadores: Ultimato', 'Anthony e Joe Russo'),
    ('Comédia', 'Forrest Gump', 'Robert Zemeckis'),
    ('Drama', 'O Poderoso Chefão', 'Francis Ford Coppola');

Insert into Sessao (Numero_salas, Cod_Filme, Tipo_Sessao, Hora_Sessao, Preco_filme)
Values (1, 1, 'Normal', '14:30:00', 10.50),
       (5, 2, 'VIP', '18:00:00', 15.75),
       (2, 3, '3D', '20:45:00', 20.00),
       (4, 1, 'Normal', '12:00:00', 12.00),
       (6, 2, 'VIP', '16:15:00', 18.50);




Select * from Salas;
Select * from Sessao;
Select * from Filme;

drop TABLE Salas;
drop TABLE Sessao;
drop TABLE Filme;