package br.futurodev.joinville.exs09.dtos.collectionpoints;

import java.math.BigDecimal;

public record CollectionPointMaterialRequestDto(
        Long electronicWasteId,
        BigDecimal maxCapacity
) {
}
