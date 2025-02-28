package com.francode.hotelBackend.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Empleados")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_documento", nullable = false, length = 20)
    private String documentType;

    @Column(name = "numero_documento", nullable = false, length = 20)
    private String documentNumber;

    @Column(name = "nombre", nullable = false, length = 100)
    private String name;

    @Column(name = "apellido", nullable = false, length = 100)
    private String lastName;

    @Column(name = "contacto", nullable = false, unique = true, length = 150)
    private String contact;

    @Column(name = "contrasena", nullable = false, length = 100)
    private String password;

    @ManyToOne
    @JoinColumn(name = "empresa_id", nullable = false)
    private Company company;
}

