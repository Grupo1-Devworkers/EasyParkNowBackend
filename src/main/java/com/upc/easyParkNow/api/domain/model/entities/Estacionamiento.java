package com.upc.easyParkNow.api.domain.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "estacionamiento")
public class Estacionamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "costoXhora", nullable = false, length = 100)
    float costoXhoraEstacionamiento;

    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;

    @Column(name = "cupos", nullable = false, length = 100)
    private Integer cupos;
}
