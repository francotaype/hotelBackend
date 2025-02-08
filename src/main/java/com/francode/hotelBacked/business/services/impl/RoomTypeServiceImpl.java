package com.francode.hotelBacked.business.services.impl;

import com.francode.hotelBacked.business.mapper.RoomTypeMapper;
import com.francode.hotelBacked.business.services.Generic.CrudGenericServiceImpl;
import com.francode.hotelBacked.business.services.interfaces.RoomTypeService;
import com.francode.hotelBacked.domain.entity.RoomType;
import com.francode.hotelBacked.persistence.repository.JpaRoomTypeRepository;
import com.francode.hotelBacked.presentation.dto.request.RoomTypeRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.RoomTypeResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomTypeServiceImpl extends CrudGenericServiceImpl<RoomType, RoomTypeRequestDTO, RoomTypeResponseDTO, Long> implements RoomTypeService {

    private final JpaRoomTypeRepository roomTypeRepository;
    private final RoomTypeMapper roomTypeMapper;

    @Autowired
    public RoomTypeServiceImpl(JpaRoomTypeRepository roomTypeRepository, RoomTypeMapper roomTypeMapper) {
        super(roomTypeRepository, roomTypeMapper);
        this.roomTypeRepository = roomTypeRepository;
        this.roomTypeMapper = roomTypeMapper;
    }
}
