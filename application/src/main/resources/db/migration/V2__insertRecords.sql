INSERT INTO customer (id, first_name, last_name, deleted)
VALUES ('28e27159-9eb6-4f77-9641-268eab5eb93c', 'Francesca', 'Platon', '0');

INSERT INTO contract (id, details, customer_id, created_at, updated_at)
VALUES ('506c6ced-9075-4c53-89a1-496162aae590', 'Test_1', '28e27159-9eb6-4f77-9641-268eab5eb93c', NOW(), NOW());

INSERT INTO bill (id, type, amount, contract_id, version)
VALUES ('ca2bb089-cb10-462f-a028-b889f2ad316d', 'WATER', 50, '506c6ced-9075-4c53-89a1-496162aae590', 0);