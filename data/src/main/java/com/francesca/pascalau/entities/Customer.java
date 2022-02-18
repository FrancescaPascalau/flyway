package com.francesca.pascalau.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Customer extends PostgresUuid {

    private String firstName;
    private String lastName;
    private Boolean deleted = Boolean.FALSE;
}
