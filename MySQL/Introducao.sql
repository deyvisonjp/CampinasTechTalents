CREATE DATABASE ctt_assertiva;

USE ctt_assertiva;

CREATE TABLE user (
	id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(60),
    data_nascimento DATE,
    Telefone CHAR(8),
    PRIMARY KEY (id)
);

SELECT * FROM user;
DESC user;

INSERT INTO ctt_assertiva.user (nome, data_nascimento, Telefone) 
VALUES ('Giovana', '2017-01-14', '85412658');



