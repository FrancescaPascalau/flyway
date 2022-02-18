package com.francesca.pascalau.port;

import com.francesca.pascalau.model.CustomerDto;

public interface CustomerServicePort {

    void save(CustomerDto customerDto);
}
