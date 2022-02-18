package com.francesca.pascalau.entities;

import org.hibernate.annotations.Type;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public class PostgresUuid {

    @Id
    @Type(type = "pg-uuid")
    private UUID id;

    public PostgresUuid() {
        this.id = UUID.randomUUID();
    }
}
