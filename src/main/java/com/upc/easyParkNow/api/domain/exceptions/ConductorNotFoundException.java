package com.upc.easyParkNow.api.domain.exceptions;

public class ConductorNotFoundException extends RuntimeException{
    public ConductorNotFoundException(Long idConductor) {
        super("Conductor con el id " + idConductor + " no ha sido encontrado");
    }
}
