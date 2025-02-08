package com.francode.hotelBacked.business.services.interfaces;

import com.francode.hotelBacked.business.services.Generic.CrudGenericService;
import com.francode.hotelBacked.domain.entity.Room;
import com.francode.hotelBacked.presentation.dto.request.RoomRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.RoomResponseDTO;

public interface RoomService extends CrudGenericService<Room, RoomRequestDTO, RoomResponseDTO, Long> {
}
