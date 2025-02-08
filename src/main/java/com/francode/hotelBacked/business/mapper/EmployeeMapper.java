package com.francode.hotelBacked.business.mapper;

import com.francode.hotelBacked.business.mapper.generic.Mapper;
import com.francode.hotelBacked.domain.entity.Employee;
import com.francode.hotelBacked.presentation.dto.request.EmployeeRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.EmployeeResponseDTO;
import org.mapstruct.MappingTarget;

@org.mapstruct.Mapper(componentModel = "spring")
public interface EmployeeMapper extends Mapper<EmployeeRequestDTO, EmployeeResponseDTO, Employee> {

    @Override
    Employee toEntity(EmployeeRequestDTO dto);

    @Override
    EmployeeResponseDTO toResponseDTO(Employee entity);

    @Override
    void updateEntityFromDTO(EmployeeRequestDTO dto, @MappingTarget Employee entity);
}
