
CREATE TABLE IF NOT EXISTS Endereco (
    id SERIAL PRIMARY KEY,
    cep VARCHAR(10),
    cidade VARCHAR(100),
    estado VARCHAR(50),
    logradouro VARCHAR(100),
    numero INT,
    complemento VARCHAR(100),
    bairro VARCHAR(100),
    ponto_referencia TEXT
);

CREATE TABLE IF NOT EXISTS Usuario (
    id SERIAL PRIMARY KEY,
    nome_completo VARCHAR(100),
    genero VARCHAR(20),
    data_nascimento DATE,
    cpf VARCHAR(11),
    rg VARCHAR(20),
    estado_civil VARCHAR(20),
    telefone VARCHAR(20),
    email VARCHAR(100),
    naturalidade VARCHAR(50),
    crf_uf VARCHAR(20),
    data_formacao DATE,
    senha VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS Cliente (
    id SERIAL PRIMARY KEY,
    nome_completo VARCHAR(100),
    genero VARCHAR(20),
    data_nascimento DATE,
    cpf VARCHAR(11),
    rg VARCHAR(20),
    estado_civil VARCHAR(20),
    telefone VARCHAR(20),
    email VARCHAR(100),
    naturalidade VARCHAR(50),
    contato_emergencia VARCHAR(100),
    alergias TEXT,
    convenio VARCHAR(50),
    numero_carteira_convenio VARCHAR(50),
    validade_carteira_convenio DATE,
    endereco_id INT,
    FOREIGN KEY (endereco_id) REFERENCES Endereco(id)
);


CREATE TABLE IF NOT EXISTS Vacina (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    data_hora_administracao TIMESTAMP,
    tipo VARCHAR(50),
    quantidade INT,
    observacoes TEXT,
    cliente_id INT,
    farmaceutico_id INT,
    FOREIGN KEY (cliente_id) REFERENCES Cliente(id),
    FOREIGN KEY (farmaceutico_id) REFERENCES Usuario(id)
);
