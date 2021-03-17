CREATE SCHEMA ctt_desafio_final;

CREATE TABLE ctt_desafio_final.usuario (
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(60) NOT NULL,
  email VARCHAR(100) NOT NULL,
  senha VARCHAR(15) NOT NULL,
  data_de_cadastro DATE NOT NULL,
  PRIMARY KEY (`id`));
