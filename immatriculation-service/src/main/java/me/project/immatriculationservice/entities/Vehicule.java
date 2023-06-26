package me.project.immatriculationservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Vehicule {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String matricule;
    private String marque;
    private Integer puissanceFiscale;
    private String modele;
    private Long proprietaireID;
    @ManyToOne
    private Proprietaire proprietaire;
}
