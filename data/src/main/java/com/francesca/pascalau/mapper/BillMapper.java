package com.francesca.pascalau.mapper;

import com.francesca.pascalau.entities.Bill;
import com.francesca.pascalau.model.BillDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BillMapper {

    BillMapper INSTANCE = Mappers.getMapper(BillMapper.class);

    BillDto mapToDto(Bill bill);

    Bill mapFromDto(BillDto billDto);
}
