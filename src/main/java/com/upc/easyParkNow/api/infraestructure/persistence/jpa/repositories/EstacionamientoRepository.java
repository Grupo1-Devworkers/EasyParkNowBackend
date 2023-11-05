package com.upc.easyParkNow.api.infraestructure.persistence.jpa.repositories;

import com.upc.easyParkNow.api.domain.model.entities.Estacionamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstacionamientoRepository extends JpaRepository<Estacionamiento,Long> {

    //List<Estacionamiento> getAllByDireccion(Long idEstacionamiento, String direccion);

}
