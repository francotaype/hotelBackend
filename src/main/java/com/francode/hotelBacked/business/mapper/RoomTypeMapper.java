package com.francode.hotelBacked.business.mapper;

import com.francode.hotelBacked.business.mapper.generic.Mapper;
import com.francode.hotelBacked.domain.entity.RoomType;
import com.francode.hotelBacked.presentation.dto.request.RoomTypeRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.RoomTypeResponseDTO;
import org.mapstruct.MappingTarget;

@org.mapstruct.Mapper(componentModel = "spring")
public interface RoomTypeMapper extends Mapper<RoomTypeRequestDTO, RoomTypeResponseDTO, RoomType> {

    @Override
    RoomType toEntity(RoomTypeRequestDTO dto);

    @Override
    RoomTypeResponseDTO toResponseDTO(RoomType entity);

    @Override
    void updateEntityFromDTO(RoomTypeRequestDTO dto, @MappingTarget RoomType entity);
}
