package com.francode.hotelBacked.business.services.interfaces;

import com.francode.hotelBacked.business.services.Generic.CrudGenericService;
import com.francode.hotelBacked.domain.entity.RoomType;
import com.francode.hotelBacked.presentation.dto.request.RoomTypeRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.RoomTypeResponseDTO;

public interface RoomTypeService extends CrudGenericService<RoomType, RoomTypeRequestDTO, RoomTypeResponseDTO, Long> {
}
