# sistema-de-pecas

create table sys.produto(
id int auto_increment primary key,
tipo varchar(100) not null, 
descricao varchar(100) not null, 
detalhes varchar(100) not null,
marca varchar(100) not null,
origem varchar(100) not null, 
codigo_de_barras varchar(100) not null, 
fabricante varchar(100) not null, 
setor varchar(100) not null, 
unidade_medida varchar(100) not null, 
peso double(8, 2) not null, 
medidas varchar(100) not null, 
foto varchar(100) not null, 
estoque int(10) not null, 
ativo boolean not null
)
