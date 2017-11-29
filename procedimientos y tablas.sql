create database Floreria;

use Floreria;

-------CATEGORIAS-------
create table categoriaArreglo(
cod_cat char(4) primary key,
nombre_cat varchar(25),
cant int not null
);

SELECT * FROM categoriaArreglo;

-------ARREGLOS-------
create table Arreglo(
cod char(50),
nombre varchar(100),
descrip varchar(100),
precio float,
stock int,
categ char(4) foreign key references categoriaArreglo(cod_cat)
);

SELECT A.cod, A.nombre, A.descrip, A.precio, A.stock , C.nombre_cat FROM Arreglo A JOIN categoriaArreglo C ON A.categ = C.cod_cat;

------VENTAS---------
create table Ventas(
codVenta numeric,
nombre varchar(30),
codCliente varchar(100),
monto float,
pago float,
tipo varchar
);

------COD--------

create table numeros(
numero varchar(50)
);

select max(numero)from numeros;

--***************************************************************************************************************************--
SELECT A.cod, A.nombre, A.descrip, A.precio, A.stock , C.nombre_cat FROM Arreglo A JOIN categoriaArreglo C ON A.categ = C.cod_cat
ORDER BY A.cod;

---SP_REGISTRAR
create procedure sp_Registrar(
@cod char(100),
@nombre varchar(30),
@descrip varchar(180),
@precio float,
@stock int,
@categ varchar(25)
)
as
begin
declare @Cod_Cat varchar(4)
set @Cod_Cat = (select C.cod_cat from categoriaArreglo C where C.nombre_cat= @categ);
insert into Arreglo
values(@cod,@nombre,@descrip,@precio,@stock,@Cod_Cat)
end
go

--SP_ELIMINAR
create procedure sp_Eliminar(
@cod char(100)
)
as
begin
delete from Arreglo
where cod = @cod
end
go

exec sp_Eliminar 'AMOR11'

Select distinct * from Arreglo A inner join categoriaArreglo C
on(A.categ = C.cod_cat)where c.nombre_cat ='NACIMIENTO';

--SP_MODFICAR
create procedure sp_Modificar(
@cod char(100),
@nombre varchar(30),
@descrip varchar(180),
@precio float,
@stock int,
@categ varchar(25)
)
as
begin
declare @Cod_Cat varchar(4)
delete from Arreglo
where cod = @cod
set @Cod_Cat = (select C.cod_cat from categoriaArreglo C where C.nombre_cat= @categ);
insert into Arreglo
values(@cod,@nombre,@descrip,@precio,@stock,@Cod_Cat)
end
go

exec sp_Modificar 'amor11','afsfg',	'sdgg',	125	,18	,'C001';