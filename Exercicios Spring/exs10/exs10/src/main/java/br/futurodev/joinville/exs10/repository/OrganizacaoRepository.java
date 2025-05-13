package br.futurodev.joinville.exs10.repository;

import br.futurodev.joinville.exs10.entity.Organizacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizacaoRepository extends JpaRepository<Organizacao, Integer> {
}