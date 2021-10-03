create table empresas (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cnpj VARCHAR(255) NOT NULL,
    UNIQUE KEY (cnpj),
    PRIMARY KEY (id)
);


create table empresas_unidades (
    empresa_id int UNSIGNED NOT NULL,
    cidade_id int UNSIGNED NOT NULL,
     PRIMARY KEY (empresa_id, cidade_id)
);