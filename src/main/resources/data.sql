-- Endereços
INSERT INTO TB_ENDERECO (cep, cidade, estado, logradouro, numero, complemento, bairro, ponto_referencia)
VALUES 
    ('12345-678', 'Cidade A', 'Estado A', 'Rua A', '123', 'Apto. 101', 'Bairro A', 'Próximo ao Parque A'),
    ('23456-789', 'Cidade B', 'Estado B', 'Rua B', '456', 'Casa', 'Bairro B', 'Próximo à Praça B'),
    ('34567-890', 'Cidade C', 'Estado C', 'Rua C', '789', 'Sala 2', 'Bairro C', 'Próximo ao Hospital C'),
    ('45678-901', 'Cidade D', 'Estado D', 'Rua D', '012', 'Loja 3', 'Bairro D', 'Próximo ao Mercado D'),
    ('56789-012', 'Cidade E', 'Estado E', 'Rua E', '345', 'Apto. 202', 'Bairro E', 'Próximo à Escola E'),
    ('67890-123', 'Cidade F', 'Estado F', 'Rua F', '678', 'Casa 4', 'Bairro F', 'Próximo ao Teatro F'),
    ('78901-234', 'Cidade G', 'Estado G', 'Rua G', '901', 'Sala 5', 'Bairro G', 'Próximo à Biblioteca G'),
    ('89012-345', 'Cidade H', 'Estado H', 'Rua H', '234', 'Apto. 303', 'Bairro H', 'Próximo ao Posto de Gasolina H'),
    ('90123-456', 'Cidade I', 'Estado I', 'Rua I', '567', 'Casa 6', 'Bairro I', 'Próximo à Padaria I'),
    ('01234-567', 'Cidade J', 'Estado J', 'Rua J', '890', 'Loja 7', 'Bairro J', 'Próximo à Farmácia J'),
    ('12345-678', 'Cidade K', 'Estado K', 'Rua K', '123', 'Sala 8', 'Bairro K', 'Próximo ao Parque K'),
    ('23456-789', 'Cidade L', 'Estado L', 'Rua L', '456', 'Apto. 404', 'Bairro L', 'Próximo à Praça L');


-- Usuários (Farmacêuticos)
INSERT INTO TB_USUARIOS (nome_completo, genero, data_nascimento, cpf, rg, estado_civil, telefone, email, naturalidade, crf_uf, data_formacao, senha)
VALUES 
    ('Fulano Farmacêutico 1', 'Masculino', '1990-01-01', '111.111.111-11', '123456789', 'Solteiro', '(11) 1111-1111', 'fulano1@example.com', 'Cidade A', 'CRF1234/UF', '2010-01-01', 'senha123'),
    ('Fulana Farmacêutica 2', 'Feminino', '1992-03-15', '222.222.222-22', '987654321', 'Casado', '(22) 2222-2222', 'fulana2@example.com', 'Cidade B', 'CRF5678/UF', '2012-05-20', 'senha456'),
    ('Beltrano Farmacêutico 3', 'Masculino', '1985-07-20', '333.333.333-33', '333333333', 'Solteiro', '(33) 3333-3333', 'beltrano3@example.com', 'Cidade C', 'CRF9101/UF', '2008-12-10', 'senha789'),
    ('Ciclana Farmacêutica 4', 'Feminino', '1978-11-05', '444.444.444-44', '444444444', 'Divorciado', '(44) 4444-4444', 'ciclana4@example.com', 'Cidade D', 'CRF1121/UF', '2015-09-30', 'senha101112');

-- Clientes
INSERT INTO TB_CLIENTE (nome_completo, genero, data_nascimento, cpf, rg, estado_civil, telefone, email, naturalidade, contato_emergencia, lista_alergias, convenio, numero_carteira_convenio, validade_carteira_convenio, endereco_identificador)
VALUES 
    ('Fulano Cliente 1', 'Masculino', '1990-01-01', '111.111.111-11', '123456789', 'Solteiro', '(11) 1111-1111', 'fulano1@example.com', 'Cidade A', 'Contato Emergência 1', 'Alergia 1, Alergia 2', 'Convenio 1', '1234567890', '2023-01-01', 1),
    ('Fulana Cliente 2', 'Feminino', '1992-03-15', '222.222.222-22', '987654321', 'Casado', '(22) 2222-2222', 'fulana2@example.com', 'Cidade B', 'Contato Emergência 2', 'Alergia 3, Alergia 4', 'Convenio 2', '0987654321', '2022-12-31', 2),
    ('Beltrano Cliente 3', 'Masculino', '1985-07-20', '333.333.333-33', '333333333', 'Solteiro', '(33) 3333-3333', 'beltrano3@example.com', 'Cidade C', 'Contato Emergência 3', 'Alergia 5, Alergia 6', 'Convenio 3', '9876543210', '2024-03-15', 3),
    ('Ciclana Cliente 4', 'Feminino', '1978-11-05', '444.444.444-44', '444444444', 'Divorciado', '(44) 4444-4444', 'ciclana4@example.com', 'Cidade D', 'Contato Emergência 4', 'Alergia 7, Alergia 8', 'Convenio 4', '4567890123', '2025-05-20', 4),
    ('Django Cliente 5', 'Masculino', '1980-05-10', '555.555.555-55', '555555555', 'Casado', '(55) 5555-5555', 'django5@example.com', 'Cidade E', 'Contato Emergência 5', 'Alergia 9, Alergia 10', 'Convenio 5', '3210987654', '2026-08-12', 5),
    ('Elena Cliente 6', 'Feminino', '1982-09-25', '666.666.666-66', '666666666', 'Solteiro', '(66) 6666-6666', 'elena6@example.com', 'Cidade F', 'Contato Emergência 6', 'Alergia 11, Alergia 12', 'Convenio 6', '9870123456', '2027-10-18', 6),
    ('Fernando Cliente 7', 'Masculino', '1984-02-12', '777.777.777-77', '777777777', 'Viúvo', '(77) 7777-7777', 'fernando7@example.com', 'Cidade G', 'Contato Emergência 7', 'Alergia 13, Alergia 14', 'Convenio 7', '6543210987', '2028-12-22', 7),
    ('Giselle Cliente 8', 'Feminino', '1986-06-30', '888.888.888-88', '888888888', 'Casado', '(88) 8888-8888', 'giselle8@example.com', 'Cidade H', 'Contato Emergência 8', 'Alergia 15, Alergia 16', 'Convenio 8', '7890123456', '2029-02-28', 8);

-- Vacinas
INSERT INTO TB_VACINAS (nome_vacina, data_hora_administracao, tipo_vacina, quantidade, observacoes, identificador_cliente, identificador_farmaceutico)
VALUES 
    ('Vacina A', '2023-01-01 08:00:00', 'Viral', 100, 'Observações vacina A', 1, 1),
    ('Vacina B', '2023-01-02 09:30:00', 'Bacteriana', 150, 'Observações vacina B', 2, 2),
    ('Vacina C', '2023-01-03 10:45:00', 'Viral', 120, 'Observações vacina C', 3, 3),
    ('Vacina D', '2023-01-04 11:15:00', 'Bacteriana', 200, 'Observações vacina D', 4, 4),
    ('Vacina E', '2023-01-05 13:20:00', 'Viral', 180, 'Observações vacina E', 5, 5),
    ('Vacina F', '2023-01-06 14:45:00', 'Bacteriana', 130, 'Observações vacina F', 6, 6),
    ('Vacina G', '2023-01-07 16:00:00', 'Viral', 160, 'Observações vacina G', 7, 7),
    ('Vacina H', '2023-01-08 17:30:00', 'Bacteriana', 190, 'Observações vacina H', 8, 8),
    ('Vacina I', '2023-01-09 18:45:00', 'Viral', 140, 'Observações vacina I', 9, 9),
    ('Vacina J', '2023-01-10 20:00:00', 'Bacteriana', 170, 'Observações vacina J', 10, 10);

