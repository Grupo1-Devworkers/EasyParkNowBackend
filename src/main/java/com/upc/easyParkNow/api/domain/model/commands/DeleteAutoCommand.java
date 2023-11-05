package com.upc.easyParkNow.api.domain.model.commands;

import lombok.Builder;

@Builder
public record DeleteAutoCommand(Long idAuto) {
}
