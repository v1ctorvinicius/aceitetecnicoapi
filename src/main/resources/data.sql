INSERT INTO pedidodeatracacao (aceito, revisado, cancelado, data) VALUES (true, false, false, '2023-01-01');
INSERT INTO pedidodeatracacao (aceito, revisado, cancelado, data) VALUES (true, true, false, '2023-02-15');
INSERT INTO pedidodeatracacao (aceito, revisado, cancelado, data) VALUES (false, true, false, '2023-04-10');
INSERT INTO pedidodeatracacao (aceito, revisado, cancelado, data) VALUES (true, false, true, '2023-06-05');
INSERT INTO pedidodeatracacao (aceito, revisado, cancelado, data) VALUES (false, true, true, '2023-08-20');
INSERT INTO pedidodeatracacao (aceito, revisado, cancelado, data) VALUES (true, true, false, '2023-10-15');
INSERT INTO pedidodeatracacao (aceito, revisado, cancelado, data) VALUES (false, false, true, '2023-12-01');
INSERT INTO pedidodeatracacao (aceito, revisado, cancelado, data) VALUES (true, false, false, '2024-02-12');
INSERT INTO pedidodeatracacao (aceito, revisado, cancelado, data) VALUES (true, true, false, '2024-04-25');
INSERT INTO pedidodeatracacao (aceito, revisado, cancelado, data) VALUES (false, false, false, '2024-07-30');
INSERT INTO pedidodeatracacao (aceito, revisado, cancelado, data) VALUES (true, true, true, '2024-11-05');
INSERT INTO pedidodeatracacao (aceito, revisado, cancelado, data) VALUES (false, false, true, '2025-02-20');
INSERT INTO pedidodeatracacao (aceito, revisado, cancelado, data) VALUES (true, true, true, '2025-06-15');
INSERT INTO pedidodeatracacao (aceito, revisado, cancelado, data) VALUES (false, true, false, '2025-10-28');
INSERT INTO pedidodeatracacao (aceito, revisado, cancelado, data) VALUES (true, false, true, '2026-03-05');

INSERT INTO navio (cod_navio, nome, bandeira, comprimento, largura, carga_max, em_operacao, plano_de_amarracao) VALUES
    ('123', 'Navio1', 'Bandeira1', 100.5, 25.0, 5000.0, true, 'Plano1'),
    ('456', 'Navio2', 'Bandeira2', 120.0, 30.0, 6000.0, false, 'Plano2'),
    ('789', 'Navio3', 'Bandeira3', 90.0, 20.0, 4000.0, true, 'Plano3');
