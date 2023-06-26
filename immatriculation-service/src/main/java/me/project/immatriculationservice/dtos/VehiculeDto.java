package me.project.immatriculationservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class VehiculeDto{
        String marque;
        String modele;
        String matricule;
        Integer puissanceFiscale;
        Long proprietaireID;

}