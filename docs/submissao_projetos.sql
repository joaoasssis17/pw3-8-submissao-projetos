Create database submissao_projetos
use submissao_projetos;

Create table Projeto(
	id_projeto bigint primary key not null, 
	tx_titulo varchar(200) not null,
	tx_areaConhecimento varchar(200) not null,
	nr_notaInovacao decimal(4,2) not null,
	nr_notaApresentacao decimal(4,2) not null,
	nr_mediaFinal decimal(4,2) not null,
	tp_Status varchar(9) not null 
);

select * from Projeto