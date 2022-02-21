package com.francesca.pascalau.services;

import com.francesca.pascalau.model.BillDto;
import com.francesca.pascalau.model.ContractDto;
import com.francesca.pascalau.model.CustomerDto;
import com.francesca.pascalau.port.BillServicePort;
import com.francesca.pascalau.port.ContractServicePort;
import com.francesca.pascalau.port.CustomerServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class DataLoaderService {

    private final BillServicePort billServicePort;
    private final ContractServicePort contractServicePort;
    private final CustomerServicePort customerServicePort;

//    @PostConstruct
//    @Transactional
    public void fillData() {
        var customer1 = CustomerDto.builder()
                .id(new Random().nextLong())
                .firstName("Francesca")
                .lastName("Platon")
                .build();
        var customer2 = CustomerDto.builder()
                .id(new Random().nextLong())
                .firstName("Flavius")
                .lastName("Platon")
                .build();

        customerServicePort.save(customer1);
        customerServicePort.save(customer2);

        var contract1 = ContractDto.builder()
                .id(new Random().nextLong())
                .details("Test1")
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .customer(customer1)
                .build();
        var contract2 = ContractDto.builder()
                .id(new Random().nextLong())
                .details("Test2")
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .customer(customer2)
                .build();

        contractServicePort.save(contract1);
        contractServicePort.save(contract2);

        var bill1 = BillDto.builder()
                .id(new Random().nextLong())
                .type(BillDto.Type.ELECTRICITY)
                .amount(new Random().nextLong())
                .contract(contract1)
                .build();
        var bill2 = BillDto.builder()
                .id(new Random().nextLong())
                .type(BillDto.Type.WATER)
                .amount(new Random().nextLong())
                .contract(contract2)
                .build();

        billServicePort.save(bill1);
        billServicePort.save(bill2);
    }
}
