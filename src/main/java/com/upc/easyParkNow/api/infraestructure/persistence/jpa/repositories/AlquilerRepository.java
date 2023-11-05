package com.upc.easyParkNow.api.infraestructure.persistence.jpa.repositories;

import com.upc.easyParkNow.api.domain.model.entities.Alquiler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlquilerRepository extends JpaRepository<Alquiler,Long> {

}
