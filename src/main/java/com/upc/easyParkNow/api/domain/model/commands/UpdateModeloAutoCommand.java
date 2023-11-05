package com.upc.easyParkNow.api.domain.model.commands;

import lombok.Builder;

@Builder
public record UpdateModeloAutoCommand (Long idAuto, String modelo) {
}
