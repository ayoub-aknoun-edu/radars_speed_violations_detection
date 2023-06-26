package me.project.radarservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Vehicule {
    private Long id;
    private String matricule;
    private String marque;
    private Integer puissanceFiscale;
    private String modele;
    private Long proprietaireID;
    private Proprietaire proprietaire;
}
