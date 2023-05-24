insert into cozinha (id, nome) values (1, 'Tailandesa');
insert into cozinha (id, nome) values (2, 'Indiana');
insert into cozinha (id, nome) values (3, 'Argentina');
insert into cozinha (id, nome) values (4, 'Brasileira');

insert into estado (id, nome) values (1, 'Minas Gerais');
insert into estado (id, nome) values (2, 'São Paulo');
insert into estado (id, nome) values (3, 'Ceará');

insert into cidade (id, nome, estado_id) values (1, 'Uberlândia', 1); 
insert into cidade (id, nome, estado_id) values (2, 'Belo Horizonte', 1);
insert into cidade (id, nome, estado_id) values (3, 'São Paulo', 2);
insert into cidade (id, nome, estado_id) values (4, 'Campinas', 2);
insert into cidade (id, nome, estado_id) values (5, 'Fortaleza', 3);

insert into restaurante (id, nome, taxa_frete, cozinha_id, endereco_cidade_id, endereco_cep, endereco_logradouro, endereco_numero, endereco_bairro, data_cadastro, data_atualizacao) values (1, 'Thai Gourmet', 10, 1, 1, '38400-999', 'Rua João Pinheiro', '1000',  'Centro', utc_timestamp, utc_timestamp);
insert into restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) values (2, 'Thai Delivery', 9.50, 1, utc_timestamp, utc_timestamp);
insert into restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) values (3, 'Tuk Tuk Comida Indiana', 15.00, 2, utc_timestamp, utc_timestamp);
insert into restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) values (4, 'Java Steakhouse', 12.00, 3, utc_timestamp, utc_timestamp);
insert into restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) values (5, 'Lanchonete do Tio Sam', 11.00, 4, utc_timestamp, utc_timestamp);
insert into restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) values (6, 'Bar da Maria', 6.00, 4, utc_timestamp, utc_timestamp);

insert into forma_pagamento (id, descricao) values (1, 'Cartão de crédito');
insert into forma_pagamento (id, descricao) values (2, 'Cartão de débito');
insert into forma_pagamento (id, descricao) values (3, 'Dinheiro');

insert into permissao (id, nome, descricao) values (1, 'CONSULTAR_COZINHAS','Permite consultar cozinhas');
insert into permissao (id, nome, descricao) values (2, 'EDITAR_COZINHAS','Permite editar cozinhas');

insert into grupo (id, nome) values (1, "ADM");
insert into grupo (id, nome) values (2, "CONSULTOR");

insert into grupo_permissao (permissao_id, grupo_id) values (1, 1), (2,1), (1,2);


insert into restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) values (1, 1), (1, 2), (1, 3), (2, 3), (3, 2), (3, 3);

insert into produto (id, nome, descricao, preco, ativo, restaurante_id) values (1, "Pizza", "Pizza Grande", 49.9, true, 1);
insert into produto (id, nome, descricao, preco, ativo, restaurante_id) values (2, "Thai Hamburguer", "Thai hamburguer", 39.9, true, 1);
insert into produto (id, nome, descricao, preco, ativo, restaurante_id) values (3, "Hamburguer", "Super hamburguer", 19.9, true, 2);
insert into produto (id, nome, descricao, preco, ativo, restaurante_id) values (4, "Comida Indiana", "Arroz Indiano", 39.9, true, 3);

insert into usuario (id, data_cadastro, nome, email, senha) values (1, utc_timestamp, 'Bob', 'bob@gmail.com', '123456');
insert into usuario (id, data_cadastro, nome, email, senha) values (2, utc_timestamp, 'Maria', 'maria@gmail.com', '123456');
insert into usuario (id, data_cadastro, nome, email, senha) values (3, utc_timestamp, 'João', 'joao@gmail.com', '123456');

insert into usuario_grupo (grupo_id, usuario_id) values (1, 1), (2,2), (2,3);




