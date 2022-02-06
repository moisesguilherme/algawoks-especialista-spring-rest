insert into cozinha (id, nome) values (1, 'Tailandesa');
insert into cozinha (id, nome) values (2, 'Indiana');

insert into restaurante (nome, taxa_frete, cozinha_id) values ('Thai Gourmet', 10.0, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Thai Delivery', 9.50, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Tuk Tuk Comida Indiana', 15.00, 2);

insert into forma_pagamento (descricao) values ('Dinheiro');

insert into permissao (nome, descricao) values ('RH','Pessoal RH');
insert into permissao (nome, descricao) values ('Admin','Administração');

insert into estado (nome) values ('Minas Gerais');
insert into estado (nome) values ('São Paulo');

insert into cidade (nome, estado_id) values ('Uberlândia', 1); 
insert into cidade (nome, estado_id) values ('São Paulo', 2);
insert into cidade (nome, estado_id) values ('Ribeirão Preto', 2);

