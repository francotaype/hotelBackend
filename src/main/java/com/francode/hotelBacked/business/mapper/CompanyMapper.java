package com.francode.hotelBacked.business.mapper;

import com.francode.hotelBacked.business.mapper.generic.Mapper;
import com.francode.hotelBacked.domain.entity.Company;
import com.francode.hotelBacked.presentation.dto.request.CompanyRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.CompanyResponseDTO;
import org.mapstruct.MappingTarget;

@org.mapstruct.Mapper(componentModel = "spring")
public interface CompanyMapper extends Mapper<CompanyRequestDTO, CompanyResponseDTO, Company> {

    @Override
    Company toEntity(CompanyRequestDTO dto);

    @Override
    CompanyResponseDTO toResponseDTO(Company entity);

    @Override
    void updateEntityFromDTO(CompanyRequestDTO dto, @MappingTarget Company entity);
}
