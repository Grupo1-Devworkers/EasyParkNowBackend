package com.upc.easyParkNow.api.application.internal.queryservices;

import com.upc.easyParkNow.api.domain.model.entities.Auto;
import com.upc.easyParkNow.api.domain.model.entities.Conductor;
import com.upc.easyParkNow.api.domain.model.queries.GetAllCarsFromConductorIdQuery;
import com.upc.easyParkNow.api.domain.model.queries.GetAllCarsQuery;
import com.upc.easyParkNow.api.domain.model.queries.GetAllConductorsQuery;
import com.upc.easyParkNow.api.domain.services.PerfilConductorQueryService;
import com.upc.easyParkNow.api.infraestructure.persistence.jpa.repositories.AutoRepository;
import com.upc.easyParkNow.api.infraestructure.persistence.jpa.repositories.ConductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilConductorQueryServiceImpl implements PerfilConductorQueryService {

    @Autowired
    private AutoRepository autoRepository;
    @Autowired
    private ConductorRepository conductorRepository;
    @Override
    public List<Auto> handle(GetAllCarsQuery query) {
        return autoRepository.findAll();
    }

    @Override
    public List<Conductor> handle(GetAllConductorsQuery query) {
        return conductorRepository.findAll();
    }

    @Override
    public List<Auto> handle(GetAllCarsFromConductorIdQuery query) {
        return autoRepository.findByConductorId(query.IdConductor());
    }
}
