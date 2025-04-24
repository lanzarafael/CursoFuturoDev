package br.futurodev.joinville.exs09.controllers;


import br.futurodev.joinville.exs09.dtos.eletronicwastes.EletronicWasteRequestDto;
import br.futurodev.joinville.exs09.dtos.eletronicwastes.EletronicWasteResponseDto;
import br.futurodev.joinville.exs09.services.EletronicWasteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("electronic-wastes")
public class EletronicWasteController {

    private final EletronicWasteService service;

    @GetMapping
    public List<EletronicWasteResponseDto> findAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public EletronicWasteResponseDto findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EletronicWasteResponseDto save(@RequestBody EletronicWasteRequestDto dto) {
        return service.create(dto);
    }

    @PutMapping("{id}")
    public EletronicWasteResponseDto update(@PathVariable Long id, @RequestBody EletronicWasteRequestDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}

