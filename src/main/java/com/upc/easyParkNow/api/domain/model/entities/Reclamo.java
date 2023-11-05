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
@Table(name = "reclamo")
public class Reclamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mensaje", nullable = false, length = 500)
    private String mensaje;

    //Relación muchos a uno con el conductor

    @ManyToOne
    @JoinColumn(name = "conductor_id", nullable = false,foreignKey = @ForeignKey(name = "FK_reclamo_conductor"))
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Conductor conductor;

}
