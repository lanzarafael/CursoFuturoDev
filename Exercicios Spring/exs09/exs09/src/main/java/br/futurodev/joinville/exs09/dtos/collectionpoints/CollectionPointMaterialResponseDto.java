package br.futurodev.joinville.exs09.dtos.collectionpoints;

import br.futurodev.joinville.exs09.dtos.eletronicwastes.EletronicWasteResponseDto;

import java.math.BigDecimal;

public record CollectionPointMaterialResponseDto(
        Long id,
        EletronicWasteResponseDto eletronicWaste,
        BigDecimal maxCapacity
) {
}
