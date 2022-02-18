package com.francesca.pascalau.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Bill extends PostgresUuid {

    @Enumerated(EnumType.STRING)
    private Type type;

    private long amount;

    @ManyToOne
    private Contract contract;

    @Version
    private Long version = 0L;
}
