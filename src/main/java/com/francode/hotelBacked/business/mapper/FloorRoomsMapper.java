package com.francode.hotelBacked.business.mapper;

import com.francode.hotelBacked.business.mapper.generic.Mapper;
import com.francode.hotelBacked.domain.entity.FloorRooms;
import com.francode.hotelBacked.presentation.dto.request.FloorRoomsRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.FloorRoomsResponseDTO;
import org.mapstruct.MappingTarget;

@org.mapstruct.Mapper(componentModel = "spring")
public interface FloorRoomsMapper extends Mapper<FloorRoomsRequestDTO, FloorRoomsResponseDTO, FloorRooms> {

    @Override
    FloorRooms toEntity(FloorRoomsRequestDTO dto);

    @Override
    FloorRoomsResponseDTO toResponseDTO(FloorRooms entity);

    @Override
    void updateEntityFromDTO(FloorRoomsRequestDTO dto, @MappingTarget FloorRooms entity);
}
