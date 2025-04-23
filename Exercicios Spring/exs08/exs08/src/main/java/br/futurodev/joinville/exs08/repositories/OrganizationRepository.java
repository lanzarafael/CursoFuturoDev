package br.futurodev.joinville.exs08.repositories;


import br.futurodev.joinville.exs08.entities.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
