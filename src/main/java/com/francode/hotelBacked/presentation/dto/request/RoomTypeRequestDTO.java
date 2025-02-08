package com.francode.hotelBacked.presentation.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomTypeRequestDTO {

    @NotEmpty(message = "El nombre no puede estar vacío")
    private String name;

    private String description;
}
