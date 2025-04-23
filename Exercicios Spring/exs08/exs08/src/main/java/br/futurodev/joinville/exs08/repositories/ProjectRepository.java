package br.futurodev.joinville.exs08.repositories;


import br.futurodev.joinville.exs08.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
