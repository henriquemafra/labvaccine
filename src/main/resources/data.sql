
-- Inserção de Endereços
INSERT INTO Endereco (id, cep, cidade, estado, logradouro, numero, complemento, bairro, ponto_referencia)
VALUES 
    (1, '12345-678', 'São Paulo', 'SP', 'Rua A', 123, 'Apto 101', 'Centro', 'Próximo ao mercado'),
    (2, '98765-432', 'Rio de Janeiro', 'RJ', 'Avenida B', 456, NULL, 'Copacabana', NULL),
    (3, '54321-098', 'Belo Horizonte', 'MG', 'Rua C', 789, 'Casa 2', 'Savassi', 'Próximo à padaria'),
    (4, '12345-678', 'Salvador', 'BA', 'Rua D', 1011, NULL, 'Barra', NULL),
    (5, '98765-432', 'Fortaleza', 'CE', 'Avenida E', 1213, 'Bloco B', 'Meireles', 'Próximo à praia'),
    (6, '54321-098', 'Recife', 'PE', 'Rua F', 1415, NULL, 'Boa Viagem', NULL),
    (7, '12345-678', 'Porto Alegre', 'RS', 'Avenida G', 1617, 'Sala 3', 'Centro', 'Próximo ao teatro'),
    (8, '98765-432', 'Brasília', 'DF', 'Rua H', 1819, NULL, 'Asa Sul', NULL),
    (9, '54321-098', 'Curitiba', 'PR', 'Avenida I', 2021, NULL, 'Batel', 'Próximo ao shopping'),
    (10, '12345-678', 'Manaus', 'AM', 'Rua J', 2223, 'Bloco C', 'Centro', 'Próximo à estação de ônibus');

-- Inserção de Usuários (Farmacêuticos)
INSERT INTO Usuario (id, nome_completo, genero, data_nascimento, cpf, rg, estado_civil, telefone, email, naturalidade, crf_uf, data_formacao, senha)
VALUES 
    (1, 'Fulano Farmacêutico', 'Masculino', '1990-01-01', '12345678901', '1234567', 'Solteiro', '(11) 91234-5678', 'fulano@example.com', 'São Paulo', 'CRF1234/SP', '2015-01-01', 'senha123'),
    (2, 'Ciclana Farmacêutica', 'Feminino', '1985-05-15', '98765432109', '7654321', 'Casada', '(11) 99876-5432', 'ciclana@example.com', 'Rio de Janeiro', 'CRF5678/RJ', '2010-06-20', 'senha456'),
    (3, 'Beltrano Farmacêutico', 'Masculino', '1980-09-30', '23456789012', '2345678', 'Divorciado', '(21) 98765-4321', 'beltrano@example.com', 'Belo Horizonte', 'CRF91011/MG', '2005-03-10', 'senha789'),
    (4, 'Farmacêutica Teste', 'Feminino', '1995-12-25', '34567890123', '3456789', 'Solteira', '(31) 87654-3210', 'teste@example.com', 'Salvador', 'CRF1213/BA', '2020-08-15', 'senhateste');

-- Inserção de Clientes
INSERT INTO Cliente (id, nome_completo, genero, data_nascimento, cpf, rg, estado_civil, telefone, email, naturalidade, contato_emergencia, alergias, convenio, numero_carteira_convenio, validade_carteira_convenio, endereco_id)
VALUES 
    (1, 'Cliente Um', 'Masculino', '1978-03-12', '11122233344', '123456', 'Casado', '(11) 2345-6789', 'cliente1@example.com', 'São Paulo', 'Fulano Emergência', 'Nenhuma', 'Unimed', '1234567890', '2023-12-31', 1),
    (2, 'Cliente Dois', 'Feminino', '1985-07-25', '22233344455', '234567', 'Solteira', '(21) 3456-7890', 'cliente2@example.com', 'Rio de Janeiro', 'Ciclana Emergência', 'Alergia a penicilina', 'SulAmérica', '0987654321', '2024-06-30', 2),
    (3, 'Cliente Três', 'Masculino', '1990-11-05', '33344455566', '345678', 'Casado', '(31) 4567-8901', 'cliente3@example.com', 'Belo Horizonte', 'Beltrano Emergência', 'Alergia a amendoim', 'Bradesco', '8765432109', '2022-09-30', 3),
    (4, 'Cliente Quatro', 'Feminino', '1998-04-18', '44455566677', '456789', 'Solteira', '(11) 5678-9012', 'cliente4@example.com', 'Salvador', 'Emergência Teste', 'Nenhuma', 'Amil', '7654321098', '2025-03-15', 4),
    (5, 'Cliente Cinco', 'Masculino', '1975-10-30', '55566677788', '567890', 'Viúvo', '(21) 6789-0123', 'cliente5@example.com', 'Fortaleza', 'Emergência Cinco', 'Nenhuma', 'Unimed', '6543210987', '2022-12-31', 5),
    (6, 'Cliente Seis', 'Feminino', '1983-01-05', '66677788899', '678901', 'Solteira', '(31) 7890-1234', 'cliente6@example.com', 'Recife', 'Emergência Seis', 'Alergia a camarão', 'SulAmérica', '5432109876', '2023-06-30', 6),
    (7, 'Cliente Sete', 'Masculino', '1996-07-20', '77788899900', '789012', 'Casado', '(11) 8901-2345', 'cliente7@example.com', 'Porto Alegre', 'Emergência Sete', 'Nenhuma', 'Amil', '4321098765', '2024-09-30', 7),
    (8, 'Cliente Oito', 'Feminino', '1988-12-15', '88899900011', '890123', 'Solteira', '(21) 9012-3456', 'cliente8@example.com', 'Brasília', 'Emergência Oito', 'Nenhuma', 'Bradesco', '3210987654', '2025-12-31', 8);


-- Inserção de Vacinas
INSERT INTO Vacina (id, nome, data_hora_administracao, tipo, quantidade, observacoes, cliente_id, farmaceutico_id)
VALUES 
    (1, 'Vacina Um', '2023-01-15 10:30:00', 'Influenza', 1, 'Dose única', 1, 1),
    (2, 'Vacina Dois', '2023-02-20 11:45:00', 'COVID-19', 2, '1ª dose', 2, 2),
    (3, 'Vacina Três', '2023-03-25 09:15:00', 'Influenza', 1, 'Dose única', 3, 3),
    (4, 'Vacina Quatro', '2023-04-30 14:00:00', 'COVID-19', 1, '2ª dose', 4, 4),
    (5, 'Vacina Cinco', '2023-05-10 08:45:00', 'Hepatite B', 1, NULL, 5, 1),
    (6, 'Vacina Seis', '2023-06-18 16:30:00', 'Tríplice Viral', 1, NULL, 6, 2),
    (7, 'Vacina Sete', '2023-07-20 13:20:00', 'Influenza', 1, 'Dose única', 7, 3),
    (8, 'Vacina Oito', '2023-08-05 10:10:00', 'COVID-19', 2, '1ª dose', 8, 4),
    (9, 'Vacina Nove', '2023-09-10 11:00:00', 'Hepatite B', 1, NULL, 1, 1),
    (10, 'Vacina Dez', '2023-10-15 14:45:00', 'Tríplice Viral', 1, NULL, 2, 2);
