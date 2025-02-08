package com.francode.hotelBacked.presentation.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRoomRequestDTO {

    @NotEmpty(message = "El nombre no puede estar vacío")
    private String name;

    private String description;

    @NotNull(message = "El precio no puede ser nulo")
    private Double price;

    @NotNull(message = "La cantidad no puede ser nula")
    private Integer quantity;
}

