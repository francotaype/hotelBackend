package com.francode.hotelBacked.business.services.interfaces;

import com.francode.hotelBacked.business.services.Generic.CrudGenericService;
import com.francode.hotelBacked.domain.entity.FloorRooms;
import com.francode.hotelBacked.presentation.dto.request.FloorRoomsRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.FloorRoomsResponseDTO;

public interface FloorRoomsService extends CrudGenericService<FloorRooms, FloorRoomsRequestDTO, FloorRoomsResponseDTO, Long> {
}
