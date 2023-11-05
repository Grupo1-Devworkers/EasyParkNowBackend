package com.upc.easyParkNow.api.domain.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "conductor")
public class Conductor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "edad", nullable = false, length = 100)
    private Integer edad;

    @Column(name = "licencia", nullable = false, length = 100)
    private String licencia;

    @Column(name = "telefono", nullable = false, length = 10)
    private String telefono;

}
