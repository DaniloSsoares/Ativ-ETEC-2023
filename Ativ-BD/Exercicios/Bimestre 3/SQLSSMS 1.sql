create database Pharcom;
use Pharcom;

create table Nivel_Restricao(
Nivel_id int identity,
Descricao varchar (80) Not Null,

primary key (Nivel_id)
)

create table Funcionario(
id_Func int identity ,
Nome_Func varchar(50) Not Null,
Usuario varchar(20) Unique Not Null,
Nivel_Id int,
Senha varchar(30) Not Null,
Email varchar(50) Unique Not Null,
Nasc date Not Null,
CPF varchar(14) Unique Not Null,

primary key (id_Func),
foreign key (Nivel_Id) references Nivel_Restricao
)


create  table Categoria (
	Id_Categoria int Identity,
	Descricao varchar(300) Not Null,
	primary key (Id_Categoria)
)


create table Remedio(
Nome_Rem varchar(50) Not Null, 
id_Reme int identity ,
categoria_Num int  ,
Preco float Not Null ,
Estoque int Not Null,
Descricao varchar(80) Not Null,

primary key (id_Reme),
foreign key (categoria_Num) references Categoria
)




create table Cliente(
	Nome varchar(50) Not Null,
	Id_Cliente int Identity,
	DataNasc date Not Null,
	Usuario varchar(20) Unique Not Null,
	Senha varchar(30) Not Null,
	Email varchar(50) Unique Not Null,
	CPF varchar(16) Unique Not Null,

	primary key (Id_Cliente),
	
)

create table Registro_Compra(
	Id_Remedio int,
	Id_Cliente int,
	DataCompra date Not Null,

	foreign key (Id_Remedio) references Remedio,
	foreign key (Id_Cliente) references Cliente

)


create table  Controle(
id_Func int,
id_Remedio int,

foreign key (id_Func) references Funcionario,
foreign key (id_Remedio) references Remedio
)


Insert into Nivel_Restricao (Descricao)
Values ('Administrador Geral');

Insert into Nivel_Restricao (Descricao)
Values ('Repositor');

Insert into Nivel_Restricao (Descricao)
Values ('Gerente de Clientes');

Select * from Nivel_Restricao;

Insert into Funcionario (Nome_Func, Usuario, Nivel_Id, Senha, Email, Nasc, CPF)
Values ('Alex Expedito','SatoruGojo',1,'TheStrongest','alex@gmail.com','20/09/2007','4564654');

Insert into Funcionario (Nome_Func, Usuario, Nivel_Id, Senha, Email, Nasc, CPF)
Values ('Danilo Soares','SuguruGeto',2,'The2�Strongest','Danilo@gmail.com','05/06/2003','213132');

Insert into Funcionario (Nome_Func, Usuario, Nivel_Id, Senha, Email, Nasc, CPF)
Values ('Endrigo Gustavo','RyomenSukuna',1,'Theking','Endrigo@gmail.com','15/06/2006','79879879789');

Select * from Funcionario;

Insert into Categoria (Descricao)
Values ('Bacteriano');

Insert into Categoria (Descricao)
Values ('AntiFungo');

Insert into Categoria (Descricao)
Values ('Antivírus');

Select * from Categoria;

Insert into Remedio (Nome_Rem,categoria_Num,Preco,Estoque,Descricao)
Values ('Methiolate',2,10.0,100,'O Melhor pros machucados');

Insert into Remedio (Nome_Rem,categoria_Num,Preco,Estoque,Descricao)
Values ('Asperina',1,6.0,50,'Respire bem');

Insert into Remedio (Nome_Rem,categoria_Num,Preco,Estoque,Descricao)
Values ('Dipirona',3,2.0,200,'Resfriado,Gripe tudo no bolso');

Select * from Remedio;


Insert into Cliente (Nome,DataNasc,Usuario,Senha,Email,CPF)
Values ('Bruno Aparecido','20/12/2006','MeninoReluzente','Despareceu123','neonblade@gmail.com','564564564');

Insert into Cliente (Nome,DataNasc,Usuario,Senha,Email,CPF)
Values ('Guilherme Felix','26/12/2006','Bolivianomaldito','Gayzin46','felixbarreto@gmail.com','1321321233');

Insert into Cliente (Nome,DataNasc,Usuario,Senha,Email,CPF)
Values ('Igor Nogueira','10/02/2006','RedDeadBoy','MorteVermelha2','erenyeagger@gmail.com','789789789');

Select * from Cliente;



Insert into Registro_Compra (Id_Remedio,Id_Cliente,DataCompra)
Values (2,1,'10/03/2019');

Insert into Registro_Compra (Id_Remedio,Id_Cliente,DataCompra)
Values (3,2,'02/06/2022');

Insert into Registro_Compra (Id_Remedio,Id_Cliente,DataCompra)
Values (1,1,'22/08/2023');

Select * from Registro_Compra;

Insert into Controle (id_Func,id_Remedio)
Values (1,3);

Insert into Controle (id_Func,id_Remedio)
Values (3,1);

Insert into Controle (id_Func,id_Remedio)
Values (4,2);

Select * from Controle;