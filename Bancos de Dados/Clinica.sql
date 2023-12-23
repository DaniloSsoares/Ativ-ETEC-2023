create database clinica;

use clinica;


create table Especializacao(
Cod_ESP int identity,
Descricao_especialização varchar(100),
Tipo_especializacao varchar (100),

primary key (Cod_ESP),
);

create table convenio(
Cod_convenio int identity,
Nome_Convenio varchar (70) Not null,

Primary Key (Cod_convenio)
);

create table paciente(
Numero_paciente int identity,
Cod_convenio int,
Data_nasc date,
Est_civil varchar (20) Not NULL,
Endereco varchar (60) Not NULL,
Nome_Paciente varchar (50)Not NULL,
Sexo varchar (20)Not NULL,
RG VARCHAR (12)Not NULL,
Tel varchar (15)Not NULL,

Primary Key (Numero_paciente),
FOREIGN KEY (Cod_convenio) REFERENCES  convenio(Cod_convenio),
);


create table medico(
Cod_medico int identity,
Cod_ESP int,
Nome_Medico varchar (50) Not Null,
Data_Nasc date,
RG VARCHAR (12),
Sexo Varchar (10),

primary key (Cod_medico),

FOREIGN KEY (Cod_ESP) REFERENCES Especializacao(Cod_ESP)
);



create table consulta(
Numero_paciente int,
Numero_Consulta int identity,
Cod_medico int,
Data_Consulta date,
Nome_medico varchar (50) Not Null,
Diagnostico varchar (100)Not Null,

primary key (Numero_Consulta),

FOREIGN KEY (Numero_paciente) REFERENCES  paciente(Numero_paciente),
FOREIGN KEY (Cod_medico) REFERENCES  medico(Cod_medico)

);

create table exames(
Numero_Consulta int,
Exames varchar (20),
data_Exame date,
Resultados varchar(100),

FOREIGN KEY (Numero_Consulta) REFERENCES  consulta(Numero_Consulta)
);

INSERT INTO convenio (Nome_Convenio)
VALUES
    ('Plano Saúde Plus'),
    ('Vida Segura'),
    ('Saúde Integral'),
    ('Cuidado Total'),
    ('Bem-Estar Familiar');

INSERT INTO Especializacao (Descricao_especialização, Tipo_especializacao)
VALUES
    ('Cardiologia', 'Médica'),
    ('Ortopedia', 'Médica'),
    ('Dermatologia', 'Médica'),
    ('Ginecologia', 'Médica'),
    ('Pediatria', 'Médica');

	INSERT INTO paciente (Cod_convenio, Data_nasc, Est_civil, Endereco, Nome_Paciente, Sexo, RG, Tel)
VALUES
    (1, '1990-01-15', 'Solteiro', 'Rua A, 123', 'João Silva', 'Masculino', '1234567890', '(11) 1234-5678'),
    (2, '1985-05-20', 'Casado', 'Avenida X, 456', 'Maria Santos', 'Feminino', '9876543210', '(11) 9876-5432'),
    (3, '1992-11-30', 'Solteiro', 'Rua B, 789', 'Pedro Oliveira', 'Masculino', '2345678901', '(22) 2345-6789'),
    (1, '1980-08-12', 'Casado', 'Avenida Y, 987', 'Ana Lima', 'Feminino', '3456789012', '(33) 3456-7890');


	INSERT INTO medico (Cod_ESP, Nome_Medico)
VALUES
    (1, 'Dr. Carlos Silva'),
    (2, 'Dra. Ana Oliveira'),
    (3, 'Dr. Maria Santos'),
    (2, 'Dra. Pedro Oliveira');

	

	INSERT INTO consulta (Numero_paciente, Cod_medico, Data_Consulta, Nome_medico, Diagnostico)
VALUES
    (1, 1, '2023-10-22', 'Dr. Carlos Silva', 'Hipertensão'),
    (2, 2, '2023-10-23', 'Dra. Ana Oliveira', 'Fratura no tornozelo'),
    (3, 3, '2023-10-24', 'Dr. Maria Santos', 'Dermatite'),
    (1, 2, '2023-10-25', 'Dra. Pedro Oliveira', 'Febre');


INSERT INTO exames (Numero_Consulta, Exames, data_Exame, Resultados)
VALUES
    (1, 'Pressão Arterial', '2023-10-22', '120/80 mmHg'),
    (2, 'Raio-X', '2023-10-23', 'Fratura confirmada no tornozelo esquerdo'),
    (3, 'Exame de Pele', '2023-10-24', 'Dermatite moderada'),
    (4, 'Exame de Sangue', '2023-10-25', 'Presença de infecção, necessita de antibióticos');

	UPDATE medico
SET RG = '1234567890', Sexo = 'Masculino'
WHERE Cod_medico = 1;

UPDATE medico
SET RG = '2345678901', Sexo = 'Feminino'
WHERE Cod_medico = 2;

UPDATE medico
SET RG = '3456789012', Sexo = 'Masculino'
WHERE Cod_medico = 3;

UPDATE medico
SET RG = '4567890123', Sexo = 'Feminino'
WHERE Cod_medico = 4;



Select * from Especializacao;
Select * from paciente;
Select * from convenio;
Select * from consulta;
Select * from medico;
Select * from exames;

drop TABLE Especializacao;
drop TABLE paciente;
drop TABLE convenio;
drop TABLE consulta;
drop TABLE medico;
drop TABLE exames;

drop database clinica;