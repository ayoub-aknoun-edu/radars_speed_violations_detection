package me.project.radarservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data @AllArgsConstructor
@NoArgsConstructor
@ToString
public class Infraction {
    private Long id;
    private Date date;
    private Long numeroRadar;
    private String matriculeVehicule;
    private Double vitesseVehicule;
    private Double vitesseMaximaleRadar;
    private Double montantInfraction;

}
