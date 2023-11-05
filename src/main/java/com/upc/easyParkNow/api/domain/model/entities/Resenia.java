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
@Table(name = "resenia")
public class Resenia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cantidad_estrellas", nullable = false, length = 6)
    private float cantidadEstrellas;

    @Column(name = "fecha_publicacion", nullable = false, length = 100)
    private String fechaPublicacion;

    @Column(name = "mensaje", nullable = false, length = 300)
    private String mensaje;

    //Relacion muchos a uno con conductor
    @ManyToOne
    @JoinColumn(name = "conductor_id", nullable = false,foreignKey = @ForeignKey(name = "FK_resenia_conductor"))
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Conductor conductor;
}
