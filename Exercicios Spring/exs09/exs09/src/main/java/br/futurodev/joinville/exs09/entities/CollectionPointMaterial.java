package br.futurodev.joinville.exs09.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "collection_point_materials")
public class CollectionPointMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "collection_point_id", nullable = false)
    private CollectionPoint collectionPoint;

    @ManyToOne
    @JoinColumn(name = "eletronic_waste_id", nullable = false)
    private EletronicWaste eletronicWasteget;

    @Column(nullable = false)
    private BigDecimal maxCapacity;

    public void setEletronicWaste(EletronicWaste ew) {
    }
}
