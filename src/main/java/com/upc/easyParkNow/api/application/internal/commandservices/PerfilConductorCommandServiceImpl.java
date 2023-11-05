package com.upc.easyParkNow.api.application.internal.commandservices;

import com.upc.easyParkNow.api.domain.exceptions.ConductorNotFoundException;
import com.upc.easyParkNow.api.domain.exceptions.ValidationException;
import com.upc.easyParkNow.api.domain.model.commands.CreateAutoCommand;
import com.upc.easyParkNow.api.domain.model.commands.CreateConductorCommand;
import com.upc.easyParkNow.api.domain.model.commands.DeleteAutoCommand;
import com.upc.easyParkNow.api.domain.model.commands.UpdateModeloAutoCommand;
import com.upc.easyParkNow.api.domain.model.entities.Auto;
import com.upc.easyParkNow.api.domain.model.entities.Conductor;
import com.upc.easyParkNow.api.domain.services.PerfilConductorCommandService;
import com.upc.easyParkNow.api.infraestructure.persistence.jpa.repositories.AutoRepository;
import com.upc.easyParkNow.api.infraestructure.persistence.jpa.repositories.ConductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilConductorCommandServiceImpl implements PerfilConductorCommandService {

    @Autowired
    private AutoRepository autoRepository;

    @Autowired
    private ConductorRepository conductorRepository;

    @Override
    public Auto handle(CreateAutoCommand command) {

        Long idConductor=command.idConductor();

        if(!conductorRepository.existsById(idConductor)){
            throw new ConductorNotFoundException(command.idConductor());
        }

        Auto auto = new Auto();
        auto.setConductor(conductorRepository.findById(idConductor).get());
        auto.setModelo(command.modelo());
        auto.setPlaca(command.placa());

        return autoRepository.save(auto);
    }

    @Override
    public String handle(DeleteAutoCommand command) {

        if(!autoRepository.existsById(command.idAuto())){
            throw new ValidationException( "El auto con el id " + command.idAuto() + " no existe");
        }
        autoRepository.deleteById(command.idAuto());
        return "El auto con el id " + command.idAuto() + " ha sido eliminado";
    }

    @Override
    public Conductor handle(CreateConductorCommand command) {

        Conductor conductor = new Conductor();
        conductor.setNombre(command.nombre());
        conductor.setEdad(command.edad());
        conductor.setLicencia(command.licencia());
        conductor.setTelefono(command.telefono());


        return conductorRepository.save(conductor);
    }

    @Override
    public Auto handle(UpdateModeloAutoCommand command) {

            if(!autoRepository.existsById(command.idAuto())){
                throw new ValidationException( "El auto con el id " + command.idAuto() + " no existe");
            }

            Auto auto = autoRepository.findById(command.idAuto()).get();
            auto.setModelo(command.modelo());

            return autoRepository.save(auto);
    }


}
