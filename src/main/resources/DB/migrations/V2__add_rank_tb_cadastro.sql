-- v2: Migrations para adicionar a coluna Rank na tabela de cadastroas

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);