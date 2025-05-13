package br.futurodev.joinville.exs10.controllers;

import br.futurodev.joinville.exs10.entity.Usuario;
import br.futurodev.joinville.exs10.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario) {
        return service.salvar(usuario);
    }

    @GetMapping
    public List<Usuario> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> buscarPorId(@PathVariable Integer id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Usuario atualizar(@PathVariable Integer id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        return service.salvar(usuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        service.deletar(id);
    }
}
