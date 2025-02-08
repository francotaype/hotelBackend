package com.francode.hotelBacked.business.mapper;

import com.francode.hotelBacked.business.mapper.generic.Mapper;
import com.francode.hotelBacked.domain.entity.Payment;
import com.francode.hotelBacked.presentation.dto.request.PaymentRequestDTO;
import com.francode.hotelBacked.presentation.dto.response.PaymentResponseDTO;
import org.mapstruct.MappingTarget;

@org.mapstruct.Mapper(componentModel = "spring")
public interface PaymentMapper extends Mapper<PaymentRequestDTO, PaymentResponseDTO, Payment> {

    @Override
    Payment toEntity(PaymentRequestDTO dto);

    @Override
    PaymentResponseDTO toResponseDTO(Payment entity);

    @Override
    void updateEntityFromDTO(PaymentRequestDTO dto, @MappingTarget Payment entity);
}
