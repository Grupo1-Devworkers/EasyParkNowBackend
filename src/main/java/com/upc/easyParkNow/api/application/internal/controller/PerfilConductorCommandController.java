package com.upc.easyParkNow.api.application.internal.controller;

import com.upc.easyParkNow.api.domain.model.commands.CreateAutoCommand;
import com.upc.easyParkNow.api.domain.model.commands.CreateConductorCommand;
import com.upc.easyParkNow.api.domain.model.commands.DeleteAutoCommand;
import com.upc.easyParkNow.api.domain.model.entities.Auto;
import com.upc.easyParkNow.api.domain.model.entities.Conductor;
import com.upc.easyParkNow.api.domain.services.PerfilConductorCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/easyParkNow/perfilConductor")
public class PerfilConductorCommandController {

    @Autowired
    private PerfilConductorCommandService perfilConductorCommandService;

    @Transactional
    @PostMapping("/{idConductor}/autos")
    public ResponseEntity<?> createAuto(@PathVariable Long idConductor, @RequestBody Auto auto){

        return new ResponseEntity<>(perfilConductorCommandService.handle(
                CreateAutoCommand.builder()
                        .idConductor(idConductor)
                        .modelo(auto.getModelo())
                        .placa(auto.getPlaca())
                        .build()
        ), org.springframework.http.HttpStatus.CREATED);
    }

    @Transactional
    @PostMapping("/conductores")
    public ResponseEntity<?> createConductor(@RequestBody Conductor conductor){

        return new ResponseEntity<>(perfilConductorCommandService.handle(
                CreateConductorCommand.builder()
                        .nombre(conductor.getNombre())
                        .edad(conductor.getEdad())
                        .licencia(conductor.getLicencia())
                        .telefono(conductor.getTelefono())
                        .build()
        ), org.springframework.http.HttpStatus.CREATED);
    }

    @Transactional
    @DeleteMapping("/autos/{autoId}")
    public ResponseEntity<?> deleteAuto(@PathVariable Long autoId){

        return new ResponseEntity<>(perfilConductorCommandService.handle(
                DeleteAutoCommand.builder()
                        .idAuto(autoId)
                        .build()
        ),org.springframework.http.HttpStatus.OK);
    }

}
