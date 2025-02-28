package com.francode.hotelBackend.presentation.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeRequestDTO {

    @NotEmpty(message = "El tipo de documento no puede estar vacío")
    private String documentType;

    @NotEmpty(message = "El número de documento no puede estar vacío")
    private String documentNumber;

    @NotEmpty(message = "El nombre no puede estar vacío")
    private String name;

    @NotEmpty(message = "El apellido no puede estar vacío")
    private String lastName;

    @Email(message = "Formato de correo electrónico inválido")
    @NotEmpty(message = "El correo electrónico no puede estar vacío")
    private String contact;

    @Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres")
    @NotEmpty(message = "La contraseña no puede estar vacía")
    private String password;

    @JsonProperty("empresa_id")
    private Long company_id;
}

