package br.futurodev.joinville.exs09.services;

import br.futurodev.joinville.exs09.dtos.eletronicwastes.EletronicWasteRequestDto;
import br.futurodev.joinville.exs09.dtos.eletronicwastes.EletronicWasteResponseDto;
import br.futurodev.joinville.exs09.errors.exceptions.EletronicWasteNotFoundException;
import br.futurodev.joinville.exs09.entities.EletronicWaste;
import br.futurodev.joinville.exs09.mappers.EletronicWasteMapper;
import br.futurodev.joinville.exs09.repositories.EletronicWasteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EletronicWasteServiceImpl implements EletronicWasteService {

    private final EletronicWasteRepository repository;

    @Override
    public List<EletronicWasteResponseDto> findAll() {
        List<EletronicWaste> entities = repository.findAll();
        return EletronicWasteMapper.toResponseDtos(entities);
    }

    @Override
    public EletronicWasteResponseDto findById(Long id) {
        EletronicWaste entity = findEntityById(id);
        return EletronicWasteMapper.toResponseDto(entity);
    }

    @Override
    public EletronicWasteResponseDto create(EletronicWasteRequestDto dto) {
        EletronicWaste ew = EletronicWasteMapper.toEntity(new EletronicWaste(), dto);
        return EletronicWasteMapper.toResponseDto(repository.save(ew));
    }

    @Override
    public EletronicWasteResponseDto update(Long id, EletronicWasteRequestDto dto) {
        EletronicWaste ew = findEntityById(id);
        EletronicWasteMapper.toEntity(ew, dto);
        return EletronicWasteMapper.toResponseDto(repository.save(ew));
    }

    @Override
    public void delete(Long id) {
        EletronicWaste ew = findEntityById(id);
        repository.delete(ew);
    }

    @Override
    public EletronicWaste findEntityById(Long id) {
        return repository.findById(id).orElseThrow(() -> new EletronicWasteNotFoundException(id));
    }

}

