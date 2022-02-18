package com.francesca.pascalau.adapters;

import com.francesca.pascalau.mapper.ContractMapper;
import com.francesca.pascalau.model.ContractDto;
import com.francesca.pascalau.port.ContractServicePort;
import com.francesca.pascalau.repository.ContractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ContractRepositoryAdapter implements ContractServicePort {

    private final ContractRepository contractRepository;

    @Override
    public void save(ContractDto contractDto) {
        contractRepository.save(ContractMapper.INSTANCE.mapFromDto(contractDto));
    }
}
