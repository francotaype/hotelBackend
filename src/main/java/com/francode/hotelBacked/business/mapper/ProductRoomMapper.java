package com.francode.hotelBacked.business.mapper;

import com.francode.hotelBacked.business.mapper.generic.Mapper;
import com.francode.hotelBacked.domain.entity.ProductRoom;
import com.francode.hotelBacked.presentation.dto.request.ProductRoomRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.ProductRoomResponseDTO;
import org.mapstruct.MappingTarget;

@org.mapstruct.Mapper(componentModel = "spring")
public interface ProductRoomMapper extends Mapper<ProductRoomRequestDTO, ProductRoomResponseDTO, ProductRoom> {

    @Override
    ProductRoom toEntity(ProductRoomRequestDTO dto);

    @Override
    ProductRoomResponseDTO toResponseDTO(ProductRoom entity);

    @Override
    void updateEntityFromDTO(ProductRoomRequestDTO dto, @MappingTarget ProductRoom entity);
}
