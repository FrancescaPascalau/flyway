CREATE TABLE customer
(
    id         char(36) NOT NULL,
    first_name VARCHAR(255) NULL,
    last_name  VARCHAR(255) NULL,
    deleted    BIT(1) NULL,
    CONSTRAINT pk_customer PRIMARY KEY (id)
);

CREATE TABLE contract
(
    id          char(36) NOT NULL,
    details     VARCHAR(255) NULL,
    customer_id char(36) NULL,
    created_at  timestamp NULL,
    updated_at  timestamp NULL,
    CONSTRAINT pk_contract PRIMARY KEY (id)
);

ALTER TABLE contract
    ADD CONSTRAINT FK_CONTRACT_ON_CUSTOMER FOREIGN KEY (customer_id) REFERENCES customer (id);

CREATE TABLE bill
(
    id          char(36) NOT NULL,
    type        VARCHAR(255) NULL,
    amount      BIGINT NULL,
    contract_id char(36) NULL,
    version     BIGINT NULL,
    CONSTRAINT pk_bill PRIMARY KEY (id)
);

ALTER TABLE bill
    ADD CONSTRAINT FK_BILL_ON_CONTRACT FOREIGN KEY (contract_id) REFERENCES contract (id);
