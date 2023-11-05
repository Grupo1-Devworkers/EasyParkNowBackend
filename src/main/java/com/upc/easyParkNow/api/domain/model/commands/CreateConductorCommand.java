package com.upc.easyParkNow.api.domain.model.commands;

import lombok.Builder;

@Builder
public record CreateConductorCommand(String nombre, Integer edad, String licencia, String telefono) {
}
