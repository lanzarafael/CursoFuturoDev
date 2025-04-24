package br.futurodev.joinville.exs09.repositories;

import br.futurodev.joinville.exs09.entities.CollectionPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionPointRepository extends JpaRepository<CollectionPoint, Long> {
}