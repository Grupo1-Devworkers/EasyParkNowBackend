package com.upc.easyParkNow.api.domain.model.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.upc.easyParkNow.api.domain.model.entities.Conductor;
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
@Table(name = "alquiler")
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_pago", nullable = false, length = 50)
    private String tipoPago;

    @Column(name = "monto", nullable = false, length = 50)
    private float monto;

    //Relacion muchos a uno con Conductor
    @ManyToOne
    @JoinColumn(name = "conductor_id", nullable = false, foreignKey = @ForeignKey(name = "FK_alquileres_conductor"))
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Conductor conductor;

}
