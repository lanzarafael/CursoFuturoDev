package br.futurodev.joinville.exs09.mappers;

import br.futurodev.joinville.exs09.dtos.eletronicwastes.EletronicWasteRequestDto;
import br.futurodev.joinville.exs09.dtos.eletronicwastes.EletronicWasteResponseDto;
import br.futurodev.joinville.exs09.entities.EletronicWaste;

import java.util.List;

public class EletronicWasteMapper {

    private EletronicWasteMapper() {}

    public static EletronicWaste toEntity(EletronicWaste entity, EletronicWasteRequestDto dto) {
        entity.setType(dto.type());
        entity.setDescription(dto.description());
        return entity;
    }

    public static EletronicWasteResponseDto toResponseDto(EletronicWaste entity) {
        return new EletronicWasteResponseDto(
                entity.getId(),
                entity.getType(),
                entity.getDescription()
        );
    }

    public static List<EletronicWasteResponseDto> toResponseDtos(List<EletronicWaste> entities) {
        return entities.stream().map(EletronicWasteMapper::toResponseDto).toList();
    }

}

