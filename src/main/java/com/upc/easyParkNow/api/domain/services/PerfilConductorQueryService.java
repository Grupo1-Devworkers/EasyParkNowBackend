package com.upc.easyParkNow.api.domain.services;

import com.upc.easyParkNow.api.domain.model.entities.Auto;
import com.upc.easyParkNow.api.domain.model.entities.Conductor;
import com.upc.easyParkNow.api.domain.model.queries.GetAllCarsFromConductorIdQuery;
import com.upc.easyParkNow.api.domain.model.queries.GetAllCarsQuery;
import com.upc.easyParkNow.api.domain.model.queries.GetAllConductorsQuery;

import java.util.List;

public interface PerfilConductorQueryService {

    List<Auto> handle(GetAllCarsQuery query);

    List<Conductor> handle(GetAllConductorsQuery query);

    List<Auto> handle(GetAllCarsFromConductorIdQuery query);

}
