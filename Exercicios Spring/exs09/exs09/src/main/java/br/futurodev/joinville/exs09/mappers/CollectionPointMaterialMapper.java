package br.futurodev.joinville.exs09.mappers;

import br.futurodev.joinville.exs09.dtos.collectionpoints.CollectionPointMaterialResponseDto;
import br.futurodev.joinville.exs09.entities.CollectionPointMaterial;

import java.util.List;

public class CollectionPointMaterialMapper {

    private CollectionPointMaterialMapper() {}

    public static CollectionPointMaterialResponseDto toResponseDto(CollectionPointMaterial entity) {
        return new CollectionPointMaterialResponseDto(
                entity.getId(),
                EletronicWasteMapper.toResponseDto(entity.getEletronicWasteget()),
                entity.getMaxCapacity()
        );
    }

    public static List<CollectionPointMaterialResponseDto> toResponseDtos(List<CollectionPointMaterial> entities) {
        return entities.stream().map(CollectionPointMaterialMapper::toResponseDto).toList();
    }

}

