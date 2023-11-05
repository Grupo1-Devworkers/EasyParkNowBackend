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
@Table(name = "registro_reserva_cupo")
public class RegistroReservaCupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "inicio_reserva", nullable = false, length = 100)
    private String inicioReserva;

    @Column(name = "fin_reserva", nullable = false, length = 100)
    private String finReserva;

    @Column(name = "costo_reserva", nullable = false, length = 100)
    private float costoReserva;


    //Relacion uno a muchos con conductor

    //Relacion muchos a uno con historial ingresos de estacionamiento


}
