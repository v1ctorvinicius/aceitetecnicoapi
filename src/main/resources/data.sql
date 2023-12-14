INSERT INTO pedidodeatracacao (navio_id, aceito, revisado, cancelado, data_inicio, data_fim)
VALUES (1, true, false, false, '2023-01-01', '2023-01-03');

INSERT INTO pedidodeatracacao (navio_id, aceito, revisado, cancelado, data_inicio, data_fim)
VALUES (2, true, true, false, '2023-02-15', '2023-02-18');

INSERT INTO pedidodeatracacao (navio_id, aceito, revisado, cancelado, data_inicio, data_fim)
VALUES (3, false, true, false, '2023-04-10', '2023-04-14');

INSERT INTO pedidodeatracacao (navio_id, aceito, revisado, cancelado, data_inicio, data_fim)
VALUES (4, true, false, true, '2023-06-05', '2023-06-09');

INSERT INTO pedidodeatracacao (navio_id, aceito, revisado, cancelado, data_inicio, data_fim)
VALUES (5, false, true, true, '2023-08-20', '2023-08-25');

INSERT INTO pedidodeatracacao (navio_id, aceito, revisado, cancelado, data_inicio, data_fim)
VALUES (6, true, true, false, '2023-10-15', '2023-10-20');

INSERT INTO pedidodeatracacao (navio_id, aceito, revisado, cancelado, data_inicio, data_fim)
VALUES (7, false, false, true, '2023-12-01', '2023-12-08');

INSERT INTO pedidodeatracacao (navio_id, aceito, revisado, cancelado, data_inicio, data_fim)
VALUES (8, true, false, false, '2024-02-12', '2024-02-15');

INSERT INTO pedidodeatracacao (navio_id, aceito, revisado, cancelado, data_inicio, data_fim)
VALUES (9, true, true, false, '2024-04-25', '2024-04-30');

INSERT INTO pedidodeatracacao (navio_id, aceito, revisado, cancelado, data_inicio, data_fim)
VALUES (10, false, false, false, '2024-07-30', '2024-08-06');

INSERT INTO pedidodeatracacao (navio_id, aceito, revisado, cancelado, data_inicio, data_fim)
VALUES (11, true, true, true, '2024-11-05', '2024-11-12');

INSERT INTO pedidodeatracacao (navio_id, aceito, revisado, cancelado, data_inicio, data_fim)
VALUES (12, false, false, true, '2025-02-20', '2025-02-27');

INSERT INTO pedidodeatracacao (navio_id, aceito, revisado, cancelado, data_inicio, data_fim)
VALUES (13, true, true, true, '2025-06-15', '2025-06-22');

INSERT INTO pedidodeatracacao (navio_id, aceito, revisado, cancelado, data_inicio, data_fim)
VALUES (14, false, true, false, '2025-10-28', '2025-11-04');

INSERT INTO pedidodeatracacao (navio_id, aceito, revisado, cancelado, data_inicio, data_fim)
VALUES (15, true, false, true, '2026-03-05', '2026-03-12');


INSERT INTO navio (cod_navio, nome, bandeira, comprimento, largura, carga_max, em_operacao, plano_de_amarracao)
VALUES ('123', 'Navio', 'BR', 100.5, 25.0, 5000.0, true, 'Plano A'),
       ('456', 'Ship', 'EUA', 120.0, 30.0, 6000.0, false, 'Plano B'),
       ('789', 'корабль', 'RUS', 90.0, 20.0, 4000.0, true, 'Plano C'),
       ('101', 'Oceanic', 'UK', 150.0, 40.0, 8000.0, true, 'Plano D'),
       ('202', 'Seafarer', 'CAN', 110.0, 28.0, 5500.0, false, 'Plano E'),
       ('303', 'Marítimo', 'ESP', 95.0, 22.0, 4200.0, true, 'Plano F'),
       ('404', 'Pacifico', 'AUS', 135.0, 35.0, 7500.0, false, 'Plano G'),
       ('505', 'Pacifico', 'AUS', 135.0, 35.0, 7500.0, false, 'Plano G'),
       ('505', 'Pacifico', 'AUS', 135.0, 35.0, 7500.0, false, 'Plano G'),
       ('505', 'Pacifico', 'AUS', 135.0, 35.0, 7500.0, false, 'Plano G'),
       ('505', 'Pacifico', 'AUS', 135.0, 35.0, 7500.0, false, 'Plano G'),
       ('505', 'Pacifico', 'AUS', 135.0, 35.0, 7500.0, false, 'Plano G'),
       ('505', 'Pacifico', 'AUS', 135.0, 35.0, 7500.0, false, 'Plano G'),
       ('505', 'Pacifico', 'AUS', 135.0, 35.0, 7500.0, false, 'Plano G'),
       ('505', 'Pacifico', 'AUS', 135.0, 35.0, 7500.0, false, 'Plano G');

INSERT INTO plano_de_carga (template_id, vencimento) VALUES (1, '2023-12-31');
INSERT INTO plano_de_carga (template_id, vencimento) VALUES (2, '2023-12-01');

INSERT INTO template (pedido_id, plano_de_carga_id, navio_id, status) VALUES (1, 1 , 1, "valido");
INSERT INTO template (pedido_id, plano_de_carga_id, navio_id, status) VALUES (1, 2, 1, "invalido");
INSERT INTO template (pedido_id, plano_de_carga_id, navio_id, status) VALUES (2, 3, 1, "espera");
INSERT INTO template (pedido_id, plano_de_carga_id, navio_id, status) VALUES (3, 4, 2, "valido");

