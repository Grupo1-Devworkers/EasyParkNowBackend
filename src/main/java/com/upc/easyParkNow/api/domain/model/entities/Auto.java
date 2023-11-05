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
@Table(name = "auto")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "modelo", nullable = false, length = 50)
    private String modelo;

    @Column(name = "placa", nullable = false, length = 6)
    private String placa;

    @ManyToOne
    @JoinColumn(name = "conductor_id", nullable = false, foreignKey = @ForeignKey(name = "FK_auto_conductor"))
    private Conductor conductor;



}


