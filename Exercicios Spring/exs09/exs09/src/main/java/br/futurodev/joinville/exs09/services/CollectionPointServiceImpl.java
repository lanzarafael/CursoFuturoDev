package br.futurodev.joinville.exs09.services;

import br.futurodev.joinville.exs09.dtos.collectionpoints.CollectionPointMaterialRequestDto;
import br.futurodev.joinville.exs09.dtos.collectionpoints.CollectionPointRequestDto;
import br.futurodev.joinville.exs09.dtos.collectionpoints.CollectionPointResponseDto;
import br.futurodev.joinville.exs09.errors.exceptions.CollectionPointNotFoundException;
import br.futurodev.joinville.exs09.entities.CollectionPoint;
import br.futurodev.joinville.exs09.entities.CollectionPointMaterial;
import br.futurodev.joinville.exs09.entities.EletronicWaste;
import br.futurodev.joinville.exs09.mappers.CollectionPointMapper;
import br.futurodev.joinville.exs09.repositories.CollectionPointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CollectionPointServiceImpl implements CollectionPointService {

    private final CollectionPointRepository repository;
    private final EletronicWasteService electronicWasteService;

    @Override
    public List<CollectionPointResponseDto> findAll() {
        List<CollectionPoint> entities = repository.findAll();
        return CollectionPointMapper.toResponseDtos(entities);
    }

    @Override
    public CollectionPointResponseDto findById(Long id) {
        CollectionPoint entity = findEntityById(id);
        return CollectionPointMapper.toResponseDto(entity);
    }

    @Override
    public CollectionPointResponseDto create(CollectionPointRequestDto dto) {
        return save(new CollectionPoint(), dto);
    }

    @Override
    public CollectionPointResponseDto update(Long id, CollectionPointRequestDto dto) {
        CollectionPoint cp = findEntityById(id);
        return save(cp, dto);
    }

    @Override
    public void delete(Long id) {
        CollectionPoint cp = findEntityById(id);
        repository.delete(cp);
    }

    private CollectionPoint findEntityById(Long id) {
        return repository.findById(id).orElseThrow(() -> new CollectionPointNotFoundException(id));
    }

    private CollectionPointResponseDto save(CollectionPoint cp, CollectionPointRequestDto dto) {
        CollectionPointMapper.toEntity(cp, dto);

        for (CollectionPointMaterialRequestDto materialDto : dto.materials()) {
            CollectionPointMaterial material = new CollectionPointMaterial();
            material.setCollectionPoint(cp);
            material.setMaxCapacity(materialDto.maxCapacity());

            EletronicWaste ew = EletronicWasteService.findEntityById(materialDto.electronicWasteId());
            material.setEletronicWaste(ew);

            cp.getMaterials().add(material);
        }

        return CollectionPointMapper.toResponseDto(repository.save(cp));
    }
}
