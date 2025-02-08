package com.francode.hotelBacked.business.services.impl;

import com.francode.hotelBacked.business.mapper.FloorRoomsMapper;
import com.francode.hotelBacked.business.services.Generic.CrudGenericServiceImpl;
import com.francode.hotelBacked.business.services.interfaces.FloorRoomsService;
import com.francode.hotelBacked.domain.entity.FloorRooms;
import com.francode.hotelBacked.persistence.repository.JpaFloorRoomsRepository;
import com.francode.hotelBacked.presentation.dto.request.FloorRoomsRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.FloorRoomsResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FloorRoomsServiceImpl extends CrudGenericServiceImpl<FloorRooms, FloorRoomsRequestDTO, FloorRoomsResponseDTO, Long> implements FloorRoomsService {

    private final JpaFloorRoomsRepository floorRoomsRepository;
    private final FloorRoomsMapper floorRoomsMapper;

    @Autowired
    public FloorRoomsServiceImpl(JpaFloorRoomsRepository floorRoomsRepository, FloorRoomsMapper floorRoomsMapper) {
        super(floorRoomsRepository, floorRoomsMapper);
        this.floorRoomsRepository = floorRoomsRepository;
        this.floorRoomsMapper = floorRoomsMapper;
    }
}
