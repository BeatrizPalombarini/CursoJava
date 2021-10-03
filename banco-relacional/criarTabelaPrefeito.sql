create table prefeitos (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cidade_id int unsigned NOT NULL,
    UNIQUE KEY (cidade_id),
    PRIMARY KEY (id),
    FOREIGN KEY (cidade_id) REFERENCES cidades (id)
);