package com.upc.easyParkNow.api.infraestructure.persistence.jpa.repositories;

import com.upc.easyParkNow.api.domain.model.entities.HorarioEstacionamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioEstacionamientoRepository extends JpaRepository<HorarioEstacionamiento,Long> {
}
