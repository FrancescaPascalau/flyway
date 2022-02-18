package com.francesca.pascalau.repository;

import com.francesca.pascalau.entities.Bill;
import org.springframework.data.repository.CrudRepository;

public interface BillRepository extends CrudRepository<Bill, Long> {
}
