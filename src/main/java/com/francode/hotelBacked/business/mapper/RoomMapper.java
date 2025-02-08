package com.francode.hotelBacked.business.mapper;

import com.francode.hotelBacked.domain.entity.Room;
import com.francode.hotelBacked.presentation.dto.request.RoomRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.RoomResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface RoomMapper {

    @Mapping(target = "roomType", ignore = true)
    @Mapping(target = "floor", ignore = true)
    Room toEntity(RoomRequestDTO dto);

    @Mapping(target = "roomTypeId", source = "roomType.id")
    @Mapping(target = "roomFloorNumber", source = "floor.number")
    RoomResponseDTO toResponseDTO(Room entity);

    @Mapping(target = "roomType", ignore = true)
    @Mapping(target = "floor", ignore = true)
    void updateEntityFromDTO(RoomRequestDTO dto, @MappingTarget Room entity);
}