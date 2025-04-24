package br.futurodev.joinville.exs09.dtos.collectionpoints;

import java.util.List;

public record CollectionPointRequestDto(
        String name,
        String address,
        String collectionPeriod,
        List<CollectionPointMaterialRequestDto> materials
) {
}
