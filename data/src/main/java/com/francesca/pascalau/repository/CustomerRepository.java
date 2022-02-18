package com.francesca.pascalau.repository;

import com.francesca.pascalau.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
