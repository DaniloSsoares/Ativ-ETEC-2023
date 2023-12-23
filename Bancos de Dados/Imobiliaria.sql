create database Mobiliaria;
use Mobiliaria;


create table Locatorio(
Cod_locatorio int identity,
Nome Varchar (70) Not Null,
CPF varchar(14) Not Null,
RG Varchar(12)Not Null,

Primary Key (Cod_locatorio)

);

create table Proprietario(
Cod_Proprietario int identity,
Nome_Proprietario Varchar(70) Not Null,
CPF_Proprietario Varchar(14) Not Null,

Primary Key (Cod_Proprietario),
);


create table Condominio(
Cod_Condominio int identity,
Local Varchar(50) Not Null,
Numero_Condo varchar(50)Not null,

primary key (Cod_Condominio)
);


CREATE TABLE Propriedade (
    Numero_Propriedade int identity,
    Cod_Condominio  INT,
    Cod_locatorio INT,
    Metragem float NOT NULL,
	Quant_Comodos Int Not null

 	Primary Key (Numero_Propriedade),
	FOREIGN KEY (Cod_Condominio) REFERENCES  Condominio(Cod_Condominio),
    FOREIGN KEY (Cod_locatorio) REFERENCES Locatorio(Cod_locatorio)
);


CREATE TABLE Adquirido(
    Numero_Propriedade INT NOT NULL,
    Cod_Proprietario INT NOT NULL,
    FOREIGN KEY (Numero_Propriedade) REFERENCES Propriedade(Numero_Propriedade),
    FOREIGN KEY (Cod_Proprietario) REFERENCES Proprietario(Cod_Proprietario)
);

--Inserir dados na tabela Condominio
INSERT INTO Condominio (Local, Numero_Condo) VALUES ('Condomínio A', '5');
INSERT INTO Condominio (Local, Numero_Condo) VALUES ('Condomínio B', '7');

-- Inserir dados na tabela Locatario
INSERT INTO Locatorio (Nome, CPF, RG) VALUES ('João Silva', '12345678901', 'AB123456');
INSERT INTO Locatorio (Nome, CPF, RG) VALUES ('Maria Oliveira', '98765432109', 'CD789012');

-- Inserir dados na tabela Proprietario
INSERT INTO Proprietario (Nome_Proprietario, CPF_Proprietario) VALUES ('Carlos Pereira', '11122233344');
INSERT INTO Proprietario (Nome_Proprietario, CPF_Proprietario) VALUES ('Ana Santos', '55566677788');

-- Inserir dados na tabela Propriedade
INSERT INTO Propriedade (Cod_Condominio, Cod_locatorio, Metragem, Quant_Comodos) VALUES (1, 1, 100.5, 4);
INSERT INTO Propriedade (Cod_Condominio, Cod_locatorio, Metragem, Quant_Comodos) VALUES (2, 2, 85.3, 3);

-- Inserir dados na tabela AdquiridoObtem
INSERT INTO Adquirido(Numero_Propriedade, Cod_Proprietario) VALUES (1, 1);
INSERT INTO Adquirido (Numero_Propriedade, Cod_Proprietario) VALUES (2, 2);

Select * from Condominio;
Select * from Propriedade;
Select * from Adquirido;
Select * from Proprietario;
Select * from Locatorio;

drop TABLE Condominio;
drop TABLE Propriedade;
drop TABLE Adquirido;
drop TABLE Proprietario;
drop TABLE Locatorio;