package br.futurodev.joinville.exs09.dtos.collectionpoints;

import java.util.List;

public record CollectionPointResponseDto(
        Long id,
        String name,
        String address,
        String collectionPeriod,
        List<CollectionPointMaterialResponseDto> materials
) {
}
