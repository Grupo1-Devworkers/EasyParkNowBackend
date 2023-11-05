package com.upc.easyParkNow.api.domain.services;

import com.upc.easyParkNow.api.domain.model.commands.CreateAutoCommand;
import com.upc.easyParkNow.api.domain.model.commands.CreateConductorCommand;
import com.upc.easyParkNow.api.domain.model.commands.DeleteAutoCommand;
import com.upc.easyParkNow.api.domain.model.commands.UpdateModeloAutoCommand;
import com.upc.easyParkNow.api.domain.model.entities.Auto;
import com.upc.easyParkNow.api.domain.model.entities.Conductor;

public interface PerfilConductorCommandService {

        Auto handle(CreateAutoCommand command);

        String handle(DeleteAutoCommand command);

        Conductor handle(CreateConductorCommand command);

        Auto handle(UpdateModeloAutoCommand command);
}
