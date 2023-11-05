package com.upc.easyParkNow.api.domain.model.commands;

import lombok.Builder;
@Builder
public record CreateAutoCommand
        (Long idConductor,String modelo, String placa) {
}
