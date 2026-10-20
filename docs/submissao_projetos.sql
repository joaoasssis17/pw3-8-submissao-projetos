Create database submissao_projetos
use submissao_projetos;

Create table Projeto(
	id bigint primary key not null, 
	titulo varchar(200) not null,
	areaConhecimento varchar(200) not null,
	notaInovacao decimal(4,2) not null,
	notaApresentacao decimal(4,2) not null,
	mediaFinal decimal(4,2) not null,
	tpStatus varchar(9) not null 
);

select * from Projeto