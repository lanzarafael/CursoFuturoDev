package br.futurodev.joinville.exs10.service;

import br.futurodev.joinville.exs10.entity.Usuario;
import br.futurodev.joinville.exs10.enums.Perfil;
import br.futurodev.joinville.exs10.repository.UsuarioRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostConstruct
    public void criarAdminPadrao() {
        Optional<Usuario> usuarioExistente = repository.findByUsername("admin");
        if (usuarioExistente.isEmpty()) {
            Usuario admin = Usuario.builder()
                    .nome("Administrador")
                    .username("admin")
                    .senha(passwordEncoder.encode("admin123"))
                    .perfil(Perfil.ADMIN)
                    .build();
            repository.save(admin);
        }
    }

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Optional<Usuario> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Usuario salvar(Usuario usuario) {
        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        return repository.save(usuario);
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public Optional<Usuario> buscarPorUsername(String username) {
        return repository.findByUsername(username);
    }
}