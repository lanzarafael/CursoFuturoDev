package br.futurodev.joinville.exs10.controllers;

import br.futurodev.joinville.exs10.entity.Organizacao;
import br.futurodev.joinville.exs10.service.OrganizacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/organizations")
public class OrganizacaoController {
    @Autowired
    private OrganizacaoService service;

    @PostMapping
    public Organizacao criar(@RequestBody Organizacao organizacao) {
        return service.salvar(organizacao);
    }

    @GetMapping
    public List<Organizacao> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Organizacao> buscarPorId(@PathVariable Integer id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Organizacao atualizar(@PathVariable Integer id, @RequestBody Organizacao organizacao) {
        organizacao.setId(id);
        return service.salvar(organizacao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        service.deletar(id);
    }
}