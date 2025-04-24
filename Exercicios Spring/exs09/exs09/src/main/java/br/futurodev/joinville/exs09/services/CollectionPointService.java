package br.futurodev.joinville.exs09.services;

import br.futurodev.joinville.exs09.dtos.collectionpoints.CollectionPointRequestDto;
import br.futurodev.joinville.exs09.dtos.collectionpoints.CollectionPointResponseDto;

import java.util.List;

public interface CollectionPointService {

    List<CollectionPointResponseDto> findAll();
    CollectionPointResponseDto findById(Long id);
    CollectionPointResponseDto create(CollectionPointRequestDto dto);
    CollectionPointResponseDto update(Long id, CollectionPointRequestDto dto);
    void delete(Long id);

}
