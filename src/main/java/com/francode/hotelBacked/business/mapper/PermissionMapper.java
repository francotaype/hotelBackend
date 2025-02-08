package com.francode.hotelBacked.business.mapper;

import com.francode.hotelBacked.business.mapper.generic.Mapper;
import com.francode.hotelBacked.domain.entity.Permission;
import com.francode.hotelBacked.presentation.dto.request.PermissionRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.PermissionResponseDTO;
import org.mapstruct.MappingTarget;

@org.mapstruct.Mapper(componentModel = "spring")
public interface PermissionMapper extends Mapper<PermissionRequestDTO, PermissionResponseDTO, Permission> {

    @Override
    Permission toEntity(PermissionRequestDTO dto);

    @Override
    PermissionResponseDTO toResponseDTO(Permission entity);

    @Override
    void updateEntityFromDTO(PermissionRequestDTO dto, @MappingTarget Permission entity);
}
