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
@Table(name = "horario_estacionamiento")
public class HorarioEstacionamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha", nullable = false, length = 100)
    private String fecha;

    @Column(name = "apertura", nullable = false, length = 100)
    private String apertura;

    @Column(name = "cierre", nullable = false, length = 100)
    private String cierre;

    //Relacion mucho a uno con Estacionamiento


}
