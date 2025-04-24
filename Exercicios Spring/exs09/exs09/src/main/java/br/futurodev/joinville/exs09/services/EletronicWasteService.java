package br.futurodev.joinville.exs09.services;

import br.futurodev.joinville.exs09.dtos.eletronicwastes.EletronicWasteRequestDto;
import br.futurodev.joinville.exs09.dtos.eletronicwastes.EletronicWasteResponseDto;
import br.futurodev.joinville.exs09.entities.EletronicWaste;

import java.util.List;

public interface EletronicWasteService {

    List<EletronicWasteResponseDto> findAll();
    EletronicWasteResponseDto findById(Long id);
    EletronicWasteResponseDto create(EletronicWasteRequestDto dto);
    EletronicWasteResponseDto update(Long id, EletronicWasteRequestDto dto);
    void delete(Long id);

    static EletronicWaste findEntityById(Long id) {
        return null;
    }

}
