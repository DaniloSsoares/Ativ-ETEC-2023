create database zoo;

use zoo;


create table Especializacao(
cod_ESP int identity,
Cargo varchar(50)not null,
CRMV varchar (10) NOT NULL,
desc_Consulta varchar (80) not null,

primary key(cod_ESP),
);

create  table funcionario(
cod_ESP INT,
cod_Func Int identity,
CPF VARCHAR (13) NOT NULL,
Nome varchar (50) not null,
RG varchar (11) not null,
Endereco varchar(60)not null,

primary key(cod_Func),
FOREIGN KEY (Cod_ESP) REFERENCES  Especializacao(Cod_ESP),

);


create table Agenda(
Cod_Func int ,
Cod_Cont_Li int identity,
Data_Limpeza datetime,

primary key(Cod_Cont_Li),

FOREIGN KEY (Cod_Func) REFERENCES  funcionario(Cod_Func),
);


create table Ala(
Cod_Ala int identity,
Ala_Container Varchar (20) not null,
Setor varchar(10) not null,

primary key(Cod_Ala),
); 

create table Container( 
Cod_Cont int identity, 
Cod_Cont_Li int ,
Cod_Ala int,
Tipo_container varchar(20),

primary key(Cod_Cont),

FOREIGN KEY (Cod_Cont_Li) REFERENCES  Agenda(Cod_Cont_Li),
FOREIGN KEY (Cod_Ala) REFERENCES  Ala(Cod_Ala),
);


create table classe(
Cod_Class Int identity,
Classe_animal varchar (50) not null,
Decricao_Anim varchar (60)not null,
Nome_Esp varchar (60)not null,

primary key (Cod_Class),


);

create table Animais(
Cod_Class Int,
Cod_ANI Int identity,
Cod_Cont Int,
Nome varchar(50) not null,
Cor Varchar (60) Not null,
Altura float Not null,

primary key(Cod_ANI),

FOREIGN KEY (Cod_Class) REFERENCES   Classe(Cod_Class),
FOREIGN KEY (Cod_Cont) REFERENCES  Container(Cod_Cont),
);

create table Veterinario(
Cod_Func int,
Cod_Vete int identity,
Nome varchar (60) not null,
Quant_Anim int,

primary key(Cod_vete),

FOREIGN KEY (Cod_Func) REFERENCES funcionario(Cod_Func),
);

create table Consulta(
Cod_ANI int,
Cod_Vete int,
Data_Consu DATETIME,
Desc_Consulta varchar(100) not null,


FOREIGN KEY (Cod_Vete) REFERENCES Veterinario(Cod_Vete),
FOREIGN KEY (Cod_ANI) REFERENCES Animais(Cod_ANI),
);




INSERT INTO Especializacao (Cargo, CRMV, desc_Consulta)
VALUES 
('Veterinário de Mamíferos', 'CRMV123', 'Consulta regular de mamíferos'),
('Veterinário de Aves', 'CRMV456', 'Consulta regular de aves'),
('Veterinário de Répteis', 'CRMV789', 'Consulta regular de répteis');


INSERT INTO Funcionario (cod_ESP, CPF, Nome, RG, Endereco)
VALUES 
(1, '12345678901', 'João Silva', '1234567890', 'Rua A, 123'),
(2, '23456789012', 'Maria Souza', '2345678901', 'Avenida B, 456'),
(3, '34567890123', 'Pedro Santos', '3456789012', 'Praça C, 789');


INSERT INTO Agenda (Cod_Func, Data_Limpeza)
VALUES 
(1, '2023-11-27 09:00:00'),
(2, '2023-11-28 10:30:00'),
(3, '2023-11-29 08:45:00');


INSERT INTO Ala (Ala_Container, Setor)
VALUES 
('Jaula', 'Setor A'),
('Viveiro', 'Setor B'),
('Tanque', 'Setor C');


INSERT INTO Container (Cod_Cont_Li, Cod_Ala, Tipo_container)
VALUES 
(1, 1, 'Pequeno'),
(2, 2, 'Grande'),
(3, 3, 'Médio');


INSERT INTO Classe (Classe_animal, Decricao_Anim, Nome_Esp)
VALUES 
('Mamífero', 'Mamíferos selvagens', 'Espécie X'),
('Ave', 'Aves exóticas', 'Espécie Y'),
('Réptil', 'Répteis aquáticos', 'Espécie Z');


INSERT INTO Animais (Cod_Class, Cod_Cont, Nome, Cor, Altura)
VALUES 
(1, 1, 'Leão', 'Marrom', 1.2),
(2, 2, 'Arara Azul', 'Azul', 0.5),
(3, 3, 'Tartaruga', 'Verde', 0.3);


INSERT INTO Veterinario (Cod_Func, Nome, Quant_Anim)
VALUES 
(1, 'Dr. Carlos', 5),
(2, 'Dra. Ana', 8),
(3, 'Dr. Rafael', 4);


INSERT INTO Consulta (Cod_ANI, Cod_Vete, Data_Consu, Desc_Consulta)
VALUES 
(1, 1, '2023-12-01 10:00:00', 'Consulta de rotina para leão'),
(2, 2, '2023-12-02 11:30:00', 'Exame de saúde para arara azul'),
(3, 3, '2023-12-03 09:45:00', 'Tratamento para tartaruga');


select * from Agenda;
select * from Container;
select * from Especializacao;
select * from funcionario;
select * from Animais;
select * from Veterinario;
select * from Consulta;
select * from Ala;
select * from classe;

drop table  Consulta;
drop table  Veterinario;
drop table  Animais;
drop table  classe;
drop table  Container;
drop table  Ala;
drop table  Agenda;
drop table  funcionario;
drop table  Especializacao;


drop database zoo