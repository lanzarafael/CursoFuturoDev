package br.futurodev.joinville.exs10.service;

import br.futurodev.joinville.exs10.entity.Organizacao;
import br.futurodev.joinville.exs10.repository.OrganizacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizacaoService {
    @Autowired
    private OrganizacaoRepository repository;

    public List<Organizacao> listarTodos() {
        return repository.findAll();
    }

    public Optional<Organizacao> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Organizacao salvar(Organizacao organizacao) {
        return repository.save(organizacao);
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }
}