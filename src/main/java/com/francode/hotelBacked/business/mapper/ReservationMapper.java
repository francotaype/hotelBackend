package com.francode.hotelBacked.business.mapper;

import com.francode.hotelBacked.business.mapper.generic.Mapper;
import com.francode.hotelBacked.domain.entity.Reservation;
import com.francode.hotelBacked.presentation.dto.request.ReservationRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.ReservationResponseDTO;
import org.mapstruct.MappingTarget;

@org.mapstruct.Mapper(componentModel = "spring")
public interface ReservationMapper extends Mapper<ReservationRequestDTO, ReservationResponseDTO, Reservation> {

    @Override
    Reservation toEntity(ReservationRequestDTO dto);

    @Override
    ReservationResponseDTO toResponseDTO(Reservation entity);

    @Override
    void updateEntityFromDTO(ReservationRequestDTO dto, @MappingTarget Reservation entity);
}
