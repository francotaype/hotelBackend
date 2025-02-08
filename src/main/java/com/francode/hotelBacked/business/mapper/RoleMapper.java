package com.francode.hotelBacked.business.mapper;

import com.francode.hotelBacked.business.mapper.generic.Mapper;
import com.francode.hotelBacked.domain.entity.Role;
import com.francode.hotelBacked.presentation.dto.request.RoleRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.RoleResponseDTO;
import org.mapstruct.MappingTarget;

@org.mapstruct.Mapper(componentModel = "spring")
public interface RoleMapper extends Mapper<RoleRequestDTO, RoleResponseDTO, Role> {

    @Override
    Role toEntity(RoleRequestDTO dto);

    @Override
    RoleResponseDTO toResponseDTO(Role entity);

    @Override
    void updateEntityFromDTO(RoleRequestDTO dto, @MappingTarget Role entity);
}
