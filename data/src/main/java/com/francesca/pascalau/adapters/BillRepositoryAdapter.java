package com.francesca.pascalau.adapters;

import com.francesca.pascalau.repository.BillRepository;
import com.francesca.pascalau.mapper.BillMapper;
import com.francesca.pascalau.model.BillDto;
import com.francesca.pascalau.port.BillServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BillRepositoryAdapter implements BillServicePort {

    private final BillRepository billRepository;

    @Override
    public BillDto save(BillDto bill) {
        var billFound = billRepository.save(BillMapper.INSTANCE.mapFromDto(bill));

        return BillMapper.INSTANCE.mapToDto(billFound);
    }

    @Override
    public BillDto findBill(Long billId) {
        return BillMapper.INSTANCE.mapToDto(billRepository.findById(billId).get());
    }
}
