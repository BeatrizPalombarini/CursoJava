INSERT INTO cidades (nome, estado_id, area)
VALUES
    ('Campinas', (select id from estados where sigla = 'SP'), 795),
    ('Niterói', (select id from estados where sigla = 'RJ'), 133.9),
    ('Caruaru', (select id from estados where sigla = 'PE'), 920.6),
    ('Juazeiro do Norte', (select id from estados where sigla = 'CE'), 248.2);