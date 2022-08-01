create database cuentas;
use cuentas;

create table Login ( 
	nombre varchar(100) not null,
    clave varchar(20) not null
);

insert into Login(nombre,clave)
values ("mariosuarez","3103");

create table plataformas(
	id int auto_increment,
    plataforma varchar(50) not null,
    correo varchar (200) not null,
    clave varchar(50) not null
);

insert into plataformas (plataforma,correo,clave) values(
	"Google","l.mario.cs31@gmail.com","mario_cs3103"
);