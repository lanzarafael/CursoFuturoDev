package br.futurodev.joinville.exs09.mappers;

import br.futurodev.joinville.exs09.dtos.collectionpoints.CollectionPointRequestDto;
import br.futurodev.joinville.exs09.dtos.collectionpoints.CollectionPointResponseDto;
import br.futurodev.joinville.exs09.entities.CollectionPoint;

import java.util.List;

public class CollectionPointMapper {

    private CollectionPointMapper() {}

    public static CollectionPoint toEntity(CollectionPoint entity, CollectionPointRequestDto dto) {
        entity.setName(dto.name());
        entity.setAddress(dto.address());
        entity.setCollectionPeriod(dto.collectionPeriod());
        return entity;
    }

    public static CollectionPointResponseDto toResponseDto(CollectionPoint entity) {
        return new CollectionPointResponseDto(
                entity.getId(),
                entity.getName(),
                entity.getAddress(),
                entity.getCollectionPeriod(),
                CollectionPointMaterialMapper.toResponseDtos(entity.getMaterials())
        );
    }

    public static List<CollectionPointResponseDto> toResponseDtos(List<CollectionPoint> entities) {
        return entities.stream().map(CollectionPointMapper::toResponseDto).toList();
    }

}
