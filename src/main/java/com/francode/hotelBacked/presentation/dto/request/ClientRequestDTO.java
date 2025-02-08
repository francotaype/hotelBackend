package com.francode.hotelBacked.presentation.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientRequestDTO {

    @NotEmpty(message = "El tipo de cliente no puede estar vacío")
    private String clientType;

    @NotEmpty(message = "El tipo de documento no puede estar vacío")
    private String documentType;

    @Size(min = 8, max = 20, message = "El número de documento debe tener entre 8 y 20 caracteres")
    @NotEmpty(message = "El número de documento no puede estar vacío")
    private String documentNumber;

    @NotEmpty(message = "El nombre no puede estar vacío")
    private String name;

    @Email(message = "Formato de correo electrónico inválido")
    @NotEmpty(message = "El correo electrónico no puede estar vacío")
    private String email;
}

