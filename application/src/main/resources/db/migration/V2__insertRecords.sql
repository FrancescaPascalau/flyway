INSERT INTO customer (id, firstName, lastName, deleted)
VALUES ('28e27159-9eb6-4f77-9641-268eab5eb93c', 'Francesca', 'Platon', 0);

INSERT INTO contract (id, details, customer_id, createdAt, updatedAt)
VALUES ('506c6ced-9075-4c53-89a1-496162aae590', 'Test_1', 'fe76788f-dee9-45e8-a637-122ce75feaba', NOW(), NOW());

INSERT INTO bill (id, type, amount, contract_id, version)
VALUES ('ca2bb089-cb10-462f-a028-b889f2ad316d', 'WATER', 50, '534c792e-cfde-4c2f-8b0e-ecec74c2b927', 0);